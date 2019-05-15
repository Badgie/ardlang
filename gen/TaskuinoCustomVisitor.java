
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import types.*;
import types.stmts.*;


import java.io.IOException;
import java.util.ArrayList;
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
            StmtsVisitor stmtsVisitor = new StmtsVisitor();
            List<Stmts> stmtsList = ctx.stmts()
                    .stream()
                    .map(stmts -> stmts.accept(stmtsVisitor))
                    .collect(toList());
            System.out.println(stmtsList);
            return new Prog(stmtsList);
        }
    }

    private static class StmtsVisitor extends TaskuinoBaseVisitor<Stmts> {
        @Override
        public Stmts visitStmts(TaskuinoParser.StmtsContext ctx) {
            Stmts stmt = null;
            if (ctx.dcl() != null) {
                StmtsDclVisitor visitor = new StmtsDclVisitor();
                stmt = visitor.visitDcl(ctx.dcl());
            } else if (ctx.expr() != null) {
                StmtsExprVisitor visitor = new StmtsExprVisitor();
                stmt = visitor.visitExpr(ctx.expr());
            } else if (ctx.function() != null) {
                StmtsFuncVisitor visitor = new StmtsFuncVisitor();
                stmt = visitor.visitFunction(ctx.function());
            } else if (ctx.stmt() != null) {
                StmtsStmtVisitor visitor = new StmtsStmtVisitor();
                stmt = visitor.visitStmt(ctx.stmt());
            } else if (ctx.task() != null) {
                StmtsTaskVisitor visitor = new StmtsTaskVisitor();
                stmt = visitor.visitTask(ctx.task());
            }
            return stmt;
        }
    }

    private static class StmtsDclVisitor extends TaskuinoBaseVisitor<StmtsDcl> {
        @Override
        public StmtsDcl visitDcl(TaskuinoParser.DclContext ctx) {

            return new StmtsDcl();
        }
    }

    private static class StmtsExprVisitor extends TaskuinoBaseVisitor<StmtsExpr> {
        @Override
        public StmtsExpr visitExpr(TaskuinoParser.ExprContext ctx) {
            StmtsExpr expr = null;

            return expr;
        }
    }

    private static class StmtsFuncVisitor extends TaskuinoBaseVisitor<StmtsFunc> {
        @Override
        public StmtsFunc visitFunction(TaskuinoParser.FunctionContext ctx) {
            String func = ctx.getRuleContext().getText();

            return new StmtsFunc();
        }
    }

    private static class StmtsStmtVisitor extends TaskuinoBaseVisitor<StmtsStmt> {
        @Override
        public StmtsStmt visitStmt(TaskuinoParser.StmtContext ctx) {
            StmtsStmt stmt = null;

            return null;
        }
    }

    private static class StmtsTaskVisitor extends TaskuinoBaseVisitor<StmtsTask> {
        @Override
        public StmtsTask visitTask(TaskuinoParser.TaskContext ctx) {
            String task = ctx.getRuleContext().getText();

            return new StmtsTask("yeet", 3, new ArrayList<>());
        }
    }
}
