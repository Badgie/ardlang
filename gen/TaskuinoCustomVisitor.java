
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
import types.operator.Operator;
import types.stmt.EifStmt;
import types.stmt.ForStmt;
import types.stmt.FuncStmt;
import types.stmt.IfStmt;
import types.stmts.*;
import types.value.*;


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

    private static class CalcExprOneVisitor extends TaskuinoBaseVisitor<CalcExpr> {
        @Override
        public CalcExpr visitCalc_expr_one(TaskuinoParser.Calc_expr_oneContext ctx) {
            return super.visitCalc_expr_one(ctx);
        }
    }

    private static class CalcExprTwoVisitor extends TaskuinoBaseVisitor<CalcExpr> {
        @Override
        public CalcExpr visitCalc_expr_two(TaskuinoParser.Calc_expr_twoContext ctx) {
            return super.visitCalc_expr_two(ctx);
        }
    }

    private static class ParamVisitor extends TaskuinoBaseVisitor<Param> {
        @Override
        public Param visitParam(TaskuinoParser.ParamContext ctx) {
            return super.visitParam(ctx);
        }
    }

    private static class BoolConditionVisitor extends TaskuinoBaseVisitor<BoolCondition> {
        @Override
        public BoolCondition visitBool_condition(TaskuinoParser.Bool_conditionContext ctx) {
            return super.visitBool_condition(ctx);
        }
    }

    private static class OpPresOneVisitor extends TaskuinoBaseVisitor<Operator> {
        @Override
        public Operator visitOp_pres_one(TaskuinoParser.Op_pres_oneContext ctx) {
            return super.visitOp_pres_one(ctx);
        }
    }

    private static class OpPresTwoVisitor extends TaskuinoBaseVisitor<Operator> {
        @Override
        public Operator visitOp_pres_two(TaskuinoParser.Op_pres_twoContext ctx) {
            return super.visitOp_pres_two(ctx);
        }
    }

    private static class ModOpVisitor extends TaskuinoBaseVisitor<Operator> {
        @Override
        public Operator visitMod_op(TaskuinoParser.Mod_opContext ctx) {
            return super.visitMod_op(ctx);
        }
    }

    private static class BoolOpVisitor extends TaskuinoBaseVisitor<Operator> {
        @Override
        public Operator visitBool_op(TaskuinoParser.Bool_opContext ctx) {
            return super.visitBool_op(ctx);
        }
    }

    private static class TypeVisitor extends TaskuinoBaseVisitor<Type> {
        @Override
        public Type visitType(TaskuinoParser.TypeContext ctx) {
            return super.visitType(ctx);
        }
    }

    private static class ValVisitor extends TaskuinoBaseVisitor<Val> {
        @Override
        public Val visitVal(TaskuinoParser.ValContext ctx) {
            return super.visitVal(ctx);
        }
    }

    private static class ValBoolVisitor extends TaskuinoBaseVisitor<ValBool> {
        @Override
        public ValBool visitBool(TaskuinoParser.BoolContext ctx) {
            return super.visitBool(ctx);
        }
    }

    private static class ValLiteralVisitor extends TaskuinoBaseVisitor<ValLiteral> {
        @Override
        public ValLiteral visitLiterals(TaskuinoParser.LiteralsContext ctx) {
            return super.visitLiterals(ctx);
        }
    }

    private static class ValNumberVisitor extends TaskuinoBaseVisitor<ValNumber> {
        @Override
        public ValNumber visitNumber(TaskuinoParser.NumberContext ctx) {
            return super.visitNumber(ctx);
        }
    }

    private static class NumberIvalVisitor extends TaskuinoBaseVisitor<NumberIval> {
        @Override
        public NumberIval visitIval(TaskuinoParser.IvalContext ctx) {
            return super.visitIval(ctx);
        }
    }

    private static class NumberFvalVisitor extends TaskuinoBaseVisitor<NumberFval> {
        @Override
        public NumberFval visitFval(TaskuinoParser.FvalContext ctx) {
            return super.visitFval(ctx);
        }
    }
}
