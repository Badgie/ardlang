
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import types.*;
import types.stmts.Stmts;


import java.io.IOException;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class TaskuinoCustomVisitor {
    public Prog parse(CharStream source) {
        TaskuinoLexer lexer = new TaskuinoLexer(source);
        TokenStream tokens = new CommonTokenStream(lexer);
        TaskuinoParser parser = new TaskuinoParser(tokens);

        ProgVisitor visitor = new ProgVisitor();

        return visitor.visit(parser.prog());
    }

    private static class ProgVisitor extends TaskuinoBaseVisitor<Prog> {
        @Override
        public Prog visitProg(TaskuinoParser.ProgContext ctx) {
            String prog = ctx.getRuleContext().getText();
            StmtsVisitor stmtsVisitor = new StmtsVisitor();
            List<Stmts> stmtsList = ctx.stmts()
                    .stream()
                    .map(stmts -> stmts.accept(stmtsVisitor))
                    .collect(toList());
            return new Prog(prog, stmtsList);
        }
    }

    private static class StmtsVisitor extends TaskuinoBaseVisitor<Stmts> {
        @Override
        public Stmts visitStmts(TaskuinoParser.StmtsContext ctx) {
            String stmts = ctx.getRuleContext().getText();
            return null;
        }
    }
}
