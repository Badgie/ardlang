/*
import dk.aau.cs.sw411.antlr.TaskuinoBaseVisitor;
import dk.aau.cs.sw411.antlr.TaskuinoParser;
import org.antlr.v4.runtime.ParserRuleContext;
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
import visitor.SymbolTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static java.util.stream.Collectors.toList;

@Deprecated
public class TaskuinoCustomVisitor {

    public Prog parse(ParserRuleContext ctx) {
        ProgVisitor visitor = new ProgVisitor();

        return visitor.visit(ctx);
    }

    private static class ProgVisitor extends TaskuinoBaseVisitor<Prog> {
        @Override
        public Prog visitProg(TaskuinoParser.ProgContext ctx) {
            StmtsVisitor stmtsVisitor = new StmtsVisitor();
            List<Stmts> stmtsList = ctx.stmts()
                    .stream()
                    .map(stmts -> stmts.accept(stmtsVisitor))
                    .collect(toList());

            return new Prog(stmtsList, ctx);
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
            ParamVisitor pVisitor = new ParamVisitor();
            BlockStmtsVisitor bVisitor = new BlockStmtsVisitor();
            TypeVisitor tVisitor = new TypeVisitor();

            List<StmtsBlockStmts> blockStmts = ctx.block_stmts()
                    .stream()
                    .map(blockstmt -> blockstmt.accept(bVisitor))
                    .collect(toList());

            Type type = ctx.type() != null ?
                        tVisitor.visitType(ctx.type()) :
                        new Type.TypeVoid();

            return new StmtsFunc(
                    ctx.IDENT().getText(),
                    pVisitor.visitParam(ctx.param()),
                    blockStmts,
                    type,
                    ctx
            );
        }
    }

    private static class StmtsTaskVisitor extends TaskuinoBaseVisitor<StmtsTask> {
        @Override
        public StmtsTask visitTask(TaskuinoParser.TaskContext ctx) {
            BlockStmtsVisitor bVisitor = new BlockStmtsVisitor();

            List<StmtsBlockStmts> blockStmts = ctx.block_stmts()
                    .stream()
                    .map(blockstmt -> blockstmt.accept(bVisitor))
                    .collect(toList());

            return new StmtsTask(
                    ctx.IDENT().getText(),
                    Integer.parseInt(ctx.ival().getText()),
                    blockStmts,
                    ctx
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
            TypeVisitor visitor = new TypeVisitor();
            if (ctx.ASSIGN() == null) {
                if (ctx.ARRAY_START() == null) {
                    return new BlockStmtsDcl(
                            visitor.visitType(ctx.type()),
                            ctx.IDENT().getText(),
                            ctx
                    );
                } else {
                    return new BlockStmtsDcl(
                            visitor.visitType(ctx.type()),
                            ctx.IDENT().getText(),
                            true,
                            Integer.parseInt(ctx.ival().getText()),
                            ctx
                    );
                }
            } else if (ctx.ARRAY_START() != null) {
                ParamVisitor pVisitor = new ParamVisitor();

                if (ctx.ival() != null) {
                    return new BlockStmtsDcl(
                            visitor.visitType(ctx.type()),
                            ctx.IDENT().getText(),
                            pVisitor.visitParam(ctx.param()),
                            Integer.parseInt(ctx.ival().getText()),
                            ctx
                    );
                } else {
                    return new BlockStmtsDcl(
                            visitor.visitType(ctx.type()),
                            true,
                            ctx.IDENT().getText(),
                            pVisitor.visitParam(ctx.param()),
                            ctx
                    );
                }
            } else {
                if (ctx.val() != null) {
                    ValVisitor vVisitor = new ValVisitor();
                    return new BlockStmtsDcl(
                            visitor.visitType(ctx.type()),
                            ctx.IDENT().getText(),
                            vVisitor.visitVal(ctx.val()),
                            ctx
                    );
                } else if (ctx.calc_expr() != null) {
                    CalcExprVisitor cVisitor = new CalcExprVisitor();
                    return new BlockStmtsDcl(
                            visitor.visitType(ctx.type()),
                            ctx.IDENT().getText(),
                            cVisitor.visitCalc_expr(ctx.calc_expr()),
                            ctx
                    );
                } else if (ctx.func_call() != null) {
                    FuncStmtVisitor fVisitor = new FuncStmtVisitor();
                    return new BlockStmtsDcl(
                            visitor.visitType(ctx.type()),
                            ctx.IDENT().getText(),
                            fVisitor.visitFunc_call(ctx.func_call()),
                            ctx
                    );
                }
            }
            return null;
        }
    }

    private static class IfStmtVisitor extends TaskuinoBaseVisitor<IfStmt> {
        @Override
        public IfStmt visitIf_stmt(TaskuinoParser.If_stmtContext ctx) {
            BoolConditionVisitor condVisitor = new BoolConditionVisitor();
            BlockStmtsVisitor stmtsVisitor = new BlockStmtsVisitor();
            EifStmtVisitor eifVisitor = new EifStmtVisitor();

            List<StmtsBlockStmts> stmts = ctx.block_stmts()
                    .stream()
                    .map(blockstmt -> blockstmt.accept(stmtsVisitor))
                    .collect(toList());
            List<EifStmt> eifStmts = ctx.eif_stmt()
                    .stream()
                    .map(eif -> eif.accept(eifVisitor))
                    .collect(toList());

            return new IfStmt(
                    condVisitor.visitBool_condition(ctx.bool_condition()),
                    stmts,
                    eifStmts,
                    ctx
            );
        }
    }

    private static class EifStmtVisitor extends TaskuinoBaseVisitor<EifStmt> {
        @Override
        public EifStmt visitEif_stmt(TaskuinoParser.Eif_stmtContext ctx) {
            BlockStmtsVisitor blockVisitor = new BlockStmtsVisitor();
            BoolConditionVisitor boolVisitor = new BoolConditionVisitor();

            List<StmtsBlockStmts> stmts = ctx.block_stmts()
                    .stream()
                    .map(stmt -> stmt.accept(blockVisitor))
                    .collect(toList());

            if (ctx.bool_condition() == null) {
                return new EifStmt(stmts, ctx);
            } else {
                return new EifStmt(
                        boolVisitor.visitBool_condition(ctx.bool_condition()),
                        stmts,
                        ctx
                );
            }
        }
    }

    private static class ForStmtVisitor extends TaskuinoBaseVisitor<ForStmt> {
        @Override
        public ForStmt visitFor_stmt(TaskuinoParser.For_stmtContext ctx) {
            BlockStmtsVisitor blockVisitor = new BlockStmtsVisitor();
            BoolConditionVisitor boolVisitor = new BoolConditionVisitor();
            CalcExprVisitor calcVisitor = new CalcExprVisitor();
            BlockStmtsDclVisitor dclVisitor = new BlockStmtsDclVisitor();
            ValNumberVisitor numVisitor = new ValNumberVisitor();

            List<StmtsBlockStmts> stmts = ctx.block_stmts()
                    .stream()
                    .map(stmt -> stmt.accept(blockVisitor))
                    .collect(toList());

            if (ctx.dcl() != null) {
                return new ForStmt(
                        dclVisitor.visitDcl(ctx.dcl()),
                        boolVisitor.visitBool_condition(ctx.bool_condition()),
                        calcVisitor.visitCalc_expr(ctx.calc_expr()),
                        stmts,
                        ctx
                );
            } else {
                return new ForStmt(
                        numVisitor.visitNumber(ctx.number()),
                        boolVisitor.visitBool_condition(ctx.bool_condition()),
                        calcVisitor.visitCalc_expr(ctx.calc_expr()),
                        stmts,
                        ctx
                );
            }
        }
    }

    private static class FuncStmtVisitor extends TaskuinoBaseVisitor<FuncStmt> {
        @Override
        public FuncStmt visitFunc_call(TaskuinoParser.Func_callContext ctx) {
            ParamVisitor pVisitor = new ParamVisitor();

            return new FuncStmt(
                    ctx.IDENT().getText(),
                    pVisitor.visitParam(ctx.param()),
                    ctx
            );
        }
    }

    private static class AssignVisitor extends TaskuinoBaseVisitor<AssignExpr> {
        @Override
        public AssignExpr visitAssign(TaskuinoParser.AssignContext ctx) {
            if (ctx.val() != null) {
                ValVisitor vVisitor = new ValVisitor();
                return new AssignExpr(
                        ctx.IDENT().getText(),
                        vVisitor.visitVal(ctx.val()),
                        ctx
                );
            } else if (ctx.calc_expr() != null) {
                CalcExprVisitor cVisitor = new CalcExprVisitor();
                return new AssignExpr(
                        ctx.IDENT().getText(),
                        cVisitor.visitCalc_expr(ctx.calc_expr()),
                        ctx
                );
            } else {
                FuncStmtVisitor fVisitor = new FuncStmtVisitor();
                return new AssignExpr(
                        ctx.IDENT().getText(),
                        fVisitor.visitFunc_call(ctx.func_call()),
                        ctx
                );
            }
        }
    }

    private static class BoolExprVisitor extends TaskuinoBaseVisitor<BoolExpr> {
        @Override
        public BoolExpr visitBool_expr(TaskuinoParser.Bool_exprContext ctx) {
            BoolOpVisitor boolOpVisitor = new BoolOpVisitor();
            if (ctx.bool() != null) {
                ValBoolVisitor boolVisitor = new ValBoolVisitor();
                if (ctx.bool_op() != null) {
                    return new BoolExpr(
                            boolVisitor.visitBool(ctx.bool()),
                            visitBool_expr(ctx.bool_expr()),
                            boolOpVisitor.visitBool_op(ctx.bool_op()),
                            ctx
                    );
                } else {
                    if (ctx.NOT() != null) {
                        return new BoolExpr(
                                boolVisitor.visitBool(ctx.bool()),
                                new Operator.Not(),
                                ctx
                        );
                    } else {
                        return new BoolExpr(
                                boolVisitor.visitBool(ctx.bool()),
                                ctx
                        );
                    }
                }
            } else {
                ValVisitor vVisitor = new ValVisitor();
                return new BoolExpr(
                        boolOpVisitor.visitBool_op(ctx.bool_op()),
                        vVisitor.visitVal(ctx.val(0)),
                        vVisitor.visitVal(ctx.val(1)),
                        ctx
                );
            }
        }
    }

    private static class CalcExprVisitor extends TaskuinoBaseVisitor<CalcExpr> {
        @Override
        public CalcExpr visitCalc_expr(TaskuinoParser.Calc_exprContext ctx) {
            CalcExpr calcExpr = null;
            ValNumberVisitor nVisitor = new ValNumberVisitor();

            if (ctx.calc_expr_one() != null) {
                CalcExprOneVisitor cOVisitor = new CalcExprOneVisitor();
                calcExpr = cOVisitor.visitCalc_expr_one(ctx.calc_expr_one());
            } else if (ctx.calc_expr_two() != null) {
                CalcExprTwoVisitor cTVisitor = new CalcExprTwoVisitor();
                calcExpr = cTVisitor.visitCalc_expr_two(ctx.calc_expr_two());
            } else if (ctx.mod_op() != null) {
                ModOpVisitor mVisitor = new ModOpVisitor();
                calcExpr = new CalcExpr(
                        nVisitor.visitNumber(ctx.number()),
                        mVisitor.visitMod_op(ctx.mod_op()),
                        ctx
                );
            } else {
                OpPresTwoVisitor opVisitor = new OpPresTwoVisitor();
                calcExpr = new CalcExpr(
                        ctx.IDENT().getText(),
                        opVisitor.visitOp_pres_two(ctx.op_pres_two()),
                        nVisitor.visitNumber(ctx.number()),
                        ctx
                );
            }

            return calcExpr;
        }
    }

    private static class CalcExprOneVisitor extends TaskuinoBaseVisitor<CalcExpr> {
        @Override
        public CalcExpr visitCalc_expr_one(TaskuinoParser.Calc_expr_oneContext ctx) {
            ValNumberVisitor nVisitor = new ValNumberVisitor();
            OpPresOneVisitor oVisitor = new OpPresOneVisitor();
            CalcExprThreeVisitor threeVisitor = new CalcExprThreeVisitor();

            if (ctx.op_pres_one() == null) {
                return new CalcExpr(
                        nVisitor.visitNumber(ctx.number()),
                        ctx
                );
            } else {
                return new CalcExpr(
                        nVisitor.visitNumber(ctx.number()),
                        oVisitor.visitOp_pres_one(ctx.op_pres_one()),
                        threeVisitor.visitCalc_expr_three(ctx.calc_expr_three()),
                        ctx
                );
            }
        }
    }

    private static class CalcExprTwoVisitor extends TaskuinoBaseVisitor<CalcExpr> {
        @Override
        public CalcExpr visitCalc_expr_two(TaskuinoParser.Calc_expr_twoContext ctx) {
            ValNumberVisitor nVisitor = new ValNumberVisitor();
            OpPresTwoVisitor oVisitor = new OpPresTwoVisitor();
            CalcExprOneVisitor oneVisitor = new CalcExprOneVisitor();

            if (ctx.op_pres_two() == null) {
                return new CalcExpr(
                        nVisitor.visitNumber(ctx.number()),
                        ctx
                );
            } else {
                return new CalcExpr(
                        nVisitor.visitNumber(ctx.number()),
                        oVisitor.visitOp_pres_two(ctx.op_pres_two()),
                        oneVisitor.visitCalc_expr_one(ctx.calc_expr_one()),
                        ctx
                );
            }
        }
    }

    private static class CalcExprThreeVisitor extends TaskuinoBaseVisitor<CalcExpr> {
        @Override
        public CalcExpr visitCalc_expr_three(TaskuinoParser.Calc_expr_threeContext ctx) {
            ValNumberVisitor nVisitor = new ValNumberVisitor();
            CalcExprTwoVisitor twoVisitor = new CalcExprTwoVisitor();

            if (ctx.number() != null) {
                return new CalcExpr(
                        nVisitor.visitNumber(ctx.number()),
                        ctx
                );
            } else {
                return new CalcExpr(
                        twoVisitor.visitCalc_expr_two(ctx.calc_expr_two()),
                        ctx
                );
            }
        }
    }

    private static class ParamVisitor extends TaskuinoBaseVisitor<List<Param>> {
        @Override
        public List<Param> visitParam(TaskuinoParser.ParamContext ctx) {
            List<Param> params = new ArrayList<>();
            if (ctx != null) {
                if (ctx.val().size() != 0) {
                    ValVisitor vVisitor = new ValVisitor();
                    params.add(new Param(
                            vVisitor.visitVal(ctx.val(0)),
                            ctx
                    ));
                    if (ctx.PARAM_DELIM() != null) {
                        int delim = ctx.PARAM_DELIM().size();

                        for (int i = 0; i < delim; i++) {
                            params.add(new Param(
                                    vVisitor.visitVal(ctx.val(i + 1)),
                                    ctx
                            ));
                        }
                    }
                }
            }

            return params;
        }
    }

    private static class BoolConditionVisitor extends TaskuinoBaseVisitor<BoolCondition> {
        @Override
        public BoolCondition visitBool_condition(TaskuinoParser.Bool_conditionContext ctx) {
            if (ctx.bool_expr() != null) {
                BoolExprVisitor bVisitor = new BoolExprVisitor();
                return new BoolCondition(bVisitor.visitBool_expr(ctx.bool_expr()), ctx);
            } else {
                FuncStmtVisitor fVisitor = new FuncStmtVisitor();
                return new BoolCondition(fVisitor.visitFunc_call(ctx.func_call()), ctx);
            }
        }
    }

    private static class OpPresOneVisitor extends TaskuinoBaseVisitor<Operator> {
        @Override
        public Operator visitOp_pres_one(TaskuinoParser.Op_pres_oneContext ctx) {
            if (ctx.MULT() != null) {
                return new Operator.Mult();
            } else if (ctx.DIV() != null) {
                return new Operator.Div();
            } else {
                return new Operator.Mod();
            }
        }
    }

    private static class OpPresTwoVisitor extends TaskuinoBaseVisitor<Operator> {
        @Override
        public Operator visitOp_pres_two(TaskuinoParser.Op_pres_twoContext ctx) {
            if (ctx.PLUS() != null) {
                return new Operator.Add();
            } else {
                return new Operator.Sub();
            }
        }
    }

    private static class ModOpVisitor extends TaskuinoBaseVisitor<Operator> {
        @Override
        public Operator visitMod_op(TaskuinoParser.Mod_opContext ctx) {
            if (ctx.INCR() != null) {
                return new Operator.Incr();
            } else {
                return new Operator.Decr();
            }
        }
    }

    private static class BoolOpVisitor extends TaskuinoBaseVisitor<Operator> {
        @Override
        public Operator visitBool_op(TaskuinoParser.Bool_opContext ctx) {
            if (ctx.EQ() != null) {
                return new Operator.Equal();
            } else if (ctx.GRT() != null) {
                return new Operator.Greater();
            } else if (ctx.LESS() != null) {
                return new Operator.Lesser();
            } else if (ctx.GRT_EQ() != null) {
                return new Operator.GreaterEqual();
            } else if (ctx.LESS_EQ() != null) {
                return new Operator.LesserEqual();
            } else if (ctx.OR() != null) {
                return new Operator.Or();
            } else if (ctx.XOR() != null) {
                return new Operator.Xor();
            } else {
                return new Operator.And();
            }
        }
    }

    private static class ValVisitor extends TaskuinoBaseVisitor<Val> {
        @Override
        public Val visitVal(TaskuinoParser.ValContext ctx) {
            Val val = null;
            if (ctx.number() != null) {
                ValNumberVisitor nVisitor = new ValNumberVisitor();
                val = nVisitor.visitNumber(ctx.number());
            } else if (ctx.STRING() != null) {
                val = new ValString(ctx.STRING().getText(), ctx);
            } else if (ctx.bool() != null) {
                ValBoolVisitor bVisitor = new ValBoolVisitor();
                val = bVisitor.visitBool(ctx.bool());
            } else if (ctx.literals() != null) {
                ValLiteralVisitor lVisitor = new ValLiteralVisitor();
                val = lVisitor.visitLiterals(ctx.literals());
            } else if (ctx.func_call() != null) {
                FuncStmtVisitor fVisitor = new FuncStmtVisitor();
                FuncStmt func = fVisitor.visitFunc_call(ctx.func_call());
                val = new ValFunc(
                        func.getIdentifier(),
                        func.getParams(),
                        ctx
                );
            } else {
                throw new Error("Val not recognized");
            }
            return val;
        }
    }

    private static class ValBoolVisitor extends TaskuinoBaseVisitor<ValBool> {
        @Override
        public ValBool visitBool(TaskuinoParser.BoolContext ctx) {
            if (ctx.TRUE() != null) {
                return new ValBool(true, ctx);
            } else if (ctx.FALSE() != null) {
                return new ValBool(false, ctx);
            } else {
                return new ValBool(ctx.IDENT().getText(), ctx);
            }
        }
    }

    private static class ValLiteralVisitor extends TaskuinoBaseVisitor<ValLiteral> {
        @Override
        public ValLiteral visitLiterals(TaskuinoParser.LiteralsContext ctx) {
            if (ctx.OUTPUT() != null) {
                return new ValLiteral("OUTPUT", ctx);
            } else if (ctx.INPUT() != null) {
                return new ValLiteral("INPUT", ctx);
            } else if (ctx.HIGH() != null) {
                return new ValLiteral("HIGH", ctx);
            } else if (ctx.LOW() != null) {
                return new ValLiteral("LOW", ctx);
            } else if (ctx.VOID() != null) {
                return new ValLiteral("void", ctx);
            } else {
                return new ValLiteral("null", ctx);
            }
        }
    }

    private static class ValNumberVisitor extends TaskuinoBaseVisitor<ValNumber> {
        @Override
        public ValNumber visitNumber(TaskuinoParser.NumberContext ctx) {
            ValNumber num;
            if (ctx.ival() != null) {
                num = new NumberIval(Integer.parseInt(ctx.ival().getText()), ctx);
            } else if (ctx.fval() != null) {
                num = new NumberFval(Double.parseDouble(ctx.fval().getText()), ctx);
            } else if (ctx.ARRAY_START() != null) {
                num = new NumberArrayIndex(
                        ctx.IDENT().getText(),
                        visitNumber(ctx.number()),
                        ctx
                );
            } else if (ctx.IDENT() != null) {
                num = new ValIdent(ctx.IDENT().getText(), ctx);
            } else {
                throw new Error("value not recognized");
            }
            return num;
        }
    }

    private static class TypeVisitor extends TaskuinoBaseVisitor<Type> {
        @Override
        public Type visitType(TaskuinoParser.TypeContext ctx) {
            if (ctx.TYPE_INT() != null) {
                return new Type.TypeInt();
            } else if (ctx.TYPE_STRING() != null) {
                return new Type.TypeString();
            } else if (ctx.TYPE_DOUBLE() != null) {
                return new Type.TypeDouble();
            } else {
                return new Type.TypeBool();
            }
        }
    }
}

*/