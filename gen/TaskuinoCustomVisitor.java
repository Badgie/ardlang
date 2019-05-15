
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import types.*;
import types.blockstmts.BlockStmtsDcl;
import types.blockstmts.BlockStmtsExpr;
import types.blockstmts.BlockStmtsStmt;
import types.expr.AssignExpr;
import types.expr.BoolExpr;
import types.expr.CalcExpr;
import types.stmt.EifStmt;
import types.stmt.ForStmt;
import types.stmt.FuncStmt;
import types.stmt.IfStmt;
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

            if (ctx.if_stmt() != null) {
                IfStmtVisitor visitor = new IfStmtVisitor();
                stmt = visitor.visitIf_stmt(ctx.if_stmt());
            } else if (ctx.for_stmt() != null) {
                ForStmtVisitor visitor = new ForStmtVisitor();
                stmt = visitor.visitFor_stmt(ctx.for_stmt());
            } else if (ctx.func_call() != null) {
                FuncStmtVisitor visitor = new FuncStmtVisitor();
                stmt = visitor.visitFunc_call(ctx.func_call());
            }

            return stmt;
        }
    }

    private static class BlockStmtsExprVisitor extends TaskuinoBaseVisitor<BlockStmtsExpr> {
        @Override
        public BlockStmtsExpr visitExpr(TaskuinoParser.ExprContext ctx) {
            BlockStmtsExpr expr = null;

            if (ctx.assign() != null) {
                AssignVisitor visitor = new AssignVisitor();
                expr = visitor.visitAssign(ctx.assign());
            } else if (ctx.bool_expr() != null) {
                BoolExprVisitor visitor = new BoolExprVisitor();
                expr = visitor.visitBool_expr(ctx.bool_expr());
            } else if (ctx.calc_expr() != null) {
                CalcExprVisitor visitor = new CalcExprVisitor();
                expr = visitor.visitCalc_expr(ctx.calc_expr());
            }

            return expr;
        }
    }

    private static class BlockStmtsDclVisitor extends TaskuinoBaseVisitor<BlockStmtsDcl> {
        @Override
        public BlockStmtsDcl visitDcl(TaskuinoParser.DclContext ctx) {

            return new BlockStmtsDcl();
        }
    }

    private static class IfStmtVisitor extends TaskuinoBaseVisitor<IfStmt> {
        @Override
        public IfStmt visitIf_stmt(TaskuinoParser.If_stmtContext ctx) {
            return super.visitIf_stmt(ctx);
        }
    }

    private static class EifStmtVisitor extends TaskuinoBaseVisitor<EifStmt> {
        @Override
        public EifStmt visitEif_stmt(TaskuinoParser.Eif_stmtContext ctx) {
            return super.visitEif_stmt(ctx);
        }
    }

    private static class ForStmtVisitor extends TaskuinoBaseVisitor<ForStmt> {
        @Override
        public ForStmt visitFor_stmt(TaskuinoParser.For_stmtContext ctx) {
            return super.visitFor_stmt(ctx);
        }
    }

    private static class FuncStmtVisitor extends TaskuinoBaseVisitor<FuncStmt> {
        @Override
        public FuncStmt visitFunc_call(TaskuinoParser.Func_callContext ctx) {
            return super.visitFunc_call(ctx);
        }
    }

    private static class AssignVisitor extends TaskuinoBaseVisitor<AssignExpr> {
        @Override
        public AssignExpr visitAssign(TaskuinoParser.AssignContext ctx) {
            return super.visitAssign(ctx);
        }
    }

    private static class BoolExprVisitor extends TaskuinoBaseVisitor<BoolExpr> {
        @Override
        public BoolExpr visitBool_expr(TaskuinoParser.Bool_exprContext ctx) {
            return super.visitBool_expr(ctx);
        }
    }

    private static class CalcExprVisitor extends TaskuinoBaseVisitor<CalcExpr> {
        @Override
        public CalcExpr visitCalc_expr(TaskuinoParser.Calc_exprContext ctx) {
            return super.visitCalc_expr(ctx);
        }
    }
}
