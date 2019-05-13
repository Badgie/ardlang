
import org.antlr.runtime.CharStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import types.Prog;
import types.Stmt;
import types.Stmts;

import java.io.IOException;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class TaskuinoCustomVisitor {
    public Prog parse(String source) {
        ANTLRInputStream charStream = new ANTLRInputStream(source);
        TaskuinoLexer lexer = new TaskuinoLexer(charStream);
        TokenStream tokens = new CommonTokenStream(lexer);
        TaskuinoParser parser = new TaskuinoParser(tokens);

        ProgVisitor visitor = new ProgVisitor();
        Prog result = visitor.visit(parser.prog());

        return result;
    }

    private static class ProgVisitor extends TaskuinoBaseVisitor<Prog> {
        @Override
        public Prog visitProg(TaskuinoParser.ProgContext ctx) {
            String className = ctx.getClass().getName();
            StmtsVisitor stmtsVisitor = new StmtsVisitor();
            List<Stmts> stmtsList = ctx.stmts()
                    .stream()
                    .map(stmts -> stmts.accept(stmtsVisitor))
                    .collect(toList());
            return new Prog(className, stmtsList);
        }
    }

    private static class StmtsVisitor extends TaskuinoBaseVisitor<Stmts> {

    }

    private static class TaskVisitor extends TaskuinoBaseVisitor<Task> {

    }

    private static class FuncVisitor extends TaskuinoBaseVisitor<Func> {

    }

    private static class StmtVisitor extends TaskuinoBaseVisitor<Stmt> {

    }

    private static class AssignStmtVisitor extends TaskuinoBaseVisitor<AssignStmt> {

    }

    private static class CalcStmtVisitor extends TaskuinoBaseVisitor<CalcStmt> {

    }

    private static class BoolStmtVisitor extends TaskuinoBaseVisitor<BoolStmt> {

    }

    private static class IfStmtVisitor extends TaskuinoBaseVisitor<IfStmt> {

    }

    private static class ForStmtVisitor extends TaskuinoBaseVisitor<ForStmt> {

    }

    private static class FuncStmtVisitor extends TaskuinoBaseVisitor<FuncStmt> {

    }
}
