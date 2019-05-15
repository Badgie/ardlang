
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import types.*;
import types.blockstmts.BlockStmtsDcl;
import types.blockstmts.BlockStmtsExpr;
import types.blockstmts.BlockStmtsStmt;
import types.stmts.*;


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
            if (ctx.function() != null) {
                StmtsFuncVisitor visitor = new StmtsFuncVisitor();
                stmt = visitor.visitFunction(ctx.function());
            } else if (ctx.block_stmts() != null) {
                BlockStmtsVisitor visitor = new BlockStmtsVisitor();
                stmt = visitor.visitBlock_stmts(ctx.block_stmts());
            } else if (ctx.task() != null) {
                StmtsTaskVisitor visitor = new StmtsTaskVisitor();
                stmt = visitor.visitTask(ctx.task());
            }
            return stmt;
        }
    }

    private static class StmtsFuncVisitor extends TaskuinoBaseVisitor<StmtsFunc> {
        @Override
        public StmtsFunc visitFunction(TaskuinoParser.FunctionContext ctx) {
            String func = ctx.getRuleContext().getText();

            return new StmtsFunc();
        }
    }

    private static class StmtsTaskVisitor extends TaskuinoBaseVisitor<StmtsTask> {
        @Override
        public StmtsTask visitTask(TaskuinoParser.TaskContext ctx) {
            String task = ctx.getRuleContext().getText();

            return new StmtsTask(
                    ctx.IDENT().getText(),
                    Integer.parseInt(ctx.ival().getText()),
                    new ArrayList<>()
            );
        }
    }

    private static class BlockStmtsVisitor extends TaskuinoBaseVisitor<StmtsBlockStmts> {
        @Override
        public StmtsBlockStmts visitBlock_stmts(TaskuinoParser.Block_stmtsContext ctx) {
            StmtsBlockStmts blockStmts = null;

            if (ctx.stmt() != null) {
                BlockStmtsStmtVisitor visitor = new BlockStmtsStmtVisitor();
                blockStmts = visitor.visitStmt(ctx.stmt());
            } else if (ctx.expr() != null) {
                BlockStmtsExprVisitor visitor = new BlockStmtsExprVisitor();
                blockStmts = visitor.visitExpr(ctx.expr());
            } else if (ctx.dcl() != null) {
                BlockStmtsDclVisitor visitor = new BlockStmtsDclVisitor();
                blockStmts = visitor.visitDcl(ctx.dcl());
            }

            return blockStmts;
        }
    }

    private static class BlockStmtsStmtVisitor extends TaskuinoBaseVisitor<BlockStmtsStmt> {
        @Override
        public BlockStmtsStmt visitStmt(TaskuinoParser.StmtContext ctx) {
            BlockStmtsStmt stmt = null;

            return null;
        }
    }

    private static class BlockStmtsDclVisitor extends TaskuinoBaseVisitor<BlockStmtsDcl> {
        @Override
        public BlockStmtsDcl visitDcl(TaskuinoParser.DclContext ctx) {

            return new BlockStmtsDcl();
        }
    }

    private static class BlockStmtsExprVisitor extends TaskuinoBaseVisitor<BlockStmtsExpr> {
        @Override
        public BlockStmtsExpr visitExpr(TaskuinoParser.ExprContext ctx) {
            BlockStmtsExpr expr = null;

            return expr;
        }
    }
}
