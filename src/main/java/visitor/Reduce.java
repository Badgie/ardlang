package visitor;

import dk.aau.cs.sw411.antlr.TaskuinoBaseVisitor;
import dk.aau.cs.sw411.antlr.TaskuinoParser;
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
import types.stmts.Stmts;
import types.stmts.StmtsBlockStmts;
import types.stmts.StmtsFunc;
import types.stmts.StmtsTask;
import types.value.*;
import util.SourceContext;

import java.util.ArrayList;
import java.util.List;

public class Reduce extends TaskuinoBaseVisitor<AST> {
    private List<String> sourceList;

    public AST reduce(TaskuinoParser.ProgContext ctx, List<String> source) {
        sourceList = source;
        return visitProg(ctx);
    }

    @Override
    public AST visitProg(TaskuinoParser.ProgContext ctx) {
        List<Stmts> stmts = new ArrayList<>();

        for (TaskuinoParser.StmtsContext s : ctx.stmts()) {
            stmts.add((Stmts) visitStmts(s));
        }
        return new Prog(stmts, new SourceContext(ctx.getText(), sourceList));
    }

    @Override
    public AST visitStmts(TaskuinoParser.StmtsContext ctx) {
        Stmts stmt = null;

        if (ctx.function() != null) {
            stmt = (Stmts) visit(ctx.function());
        } else if (ctx.block_stmts() != null) {
            stmt = (Stmts) visit(ctx.block_stmts());
        } else if (ctx.task() != null) {
            stmt = (Stmts) visit(ctx.task());
        } else {
            throw new Error("Statement not recognized: " + ctx.getText());
        }

        return stmt;
    }

    @Override
    public AST visitBlock_stmts(TaskuinoParser.Block_stmtsContext ctx) {
        StmtsBlockStmts stmt = null;

        if (ctx.stmt() != null) {
            stmt = (StmtsBlockStmts) visit(ctx.stmt());
        } else if (ctx.expr() != null) {
            stmt = (StmtsBlockStmts) visit(ctx.expr());
        } else if (ctx.dcl() != null) {
            stmt = (StmtsBlockStmts) visit(ctx.dcl());
        } else {
            throw new Error("Statement not recognized: " + ctx.getText());
        }

        return stmt;
    }

    @Override
    public AST visitTask(TaskuinoParser.TaskContext ctx) {
        List<StmtsBlockStmts> stmts = new ArrayList<>();

        for (TaskuinoParser.Block_stmtsContext b : ctx.block_stmts()) {
            stmts.add((StmtsBlockStmts) visit(b));
        }

        return new StmtsTask(
                ctx.IDENT().getText(),
                Integer.parseInt(ctx.ival().getText()),
                stmts,
                new SourceContext(ctx.getText(), sourceList)
        );
    }

    @Override
    public AST visitFunction(TaskuinoParser.FunctionContext ctx) {
        List<StmtsBlockStmts> stmts = new ArrayList<>();

        for (TaskuinoParser.Block_stmtsContext b : ctx.block_stmts()) {
            stmts.add((StmtsBlockStmts) visit(b));
        }

        Type type = ctx.type() != null ?
                (Type) visit(ctx.type()) :
                new Type.TypeVoid();

        return new StmtsFunc(
                ctx.IDENT().getText(),
                getParams(ctx.param()),
                stmts,
                type,
                new SourceContext(ctx.getText(), sourceList)
        );
    }

    @Override
    public AST visitStmt(TaskuinoParser.StmtContext ctx) {
        BlockStmtsStmt stmt = null;

        if (ctx.if_stmt() != null) {
            stmt = (BlockStmtsStmt) visit(ctx.if_stmt());
        } else if (ctx.for_stmt() != null) {
            stmt = (BlockStmtsStmt) visit(ctx.for_stmt());
        } else if (ctx.func_call() != null) {
            stmt = (BlockStmtsStmt) visit(ctx.func_call());
        } else {
            throw new Error("Statement not recognized: " + ctx.getText());
        }

        return stmt;
    }

    @Override
    public AST visitExpr(TaskuinoParser.ExprContext ctx) {
        BlockStmtsExpr expr = null;

        if (ctx.assign() != null) {
            expr = (BlockStmtsExpr) visit(ctx.assign());
        } else if (ctx.bool_expr() != null) {
            expr = (BlockStmtsExpr) visit(ctx.bool_expr());
        } else if (ctx.calc_expr() != null) {
            expr = (BlockStmtsExpr) visit(ctx.calc_expr());
        } else {
            throw new Error("Expression not recognized: " + ctx.getText());
        }

        return expr;
    }

    @Override
    public AST visitDcl(TaskuinoParser.DclContext ctx) {
        if (ctx.ASSIGN() == null) {
            if (ctx.ARRAY_START() == null) {
                return new BlockStmtsDcl(
                        (Type) visit(ctx.type()),
                        ctx.IDENT().getText(),
                        new SourceContext(ctx.getText(), sourceList)
                );
            } else {
                return new BlockStmtsDcl(
                        (Type) visit(ctx.type()),
                        ctx.IDENT().getText(),
                        true,
                        Integer.parseInt(ctx.ival().getText()),
                        new SourceContext(ctx.getText(), sourceList)
                );
            }
        } else if (ctx.ARRAY_START() != null) {
            if (ctx.ival() != null) {
                return new BlockStmtsDcl(
                        (Type) visit(ctx.type()),
                        ctx.IDENT().getText(),
                        getParams(ctx.param()),
                        Integer.parseInt(ctx.ival().getText()),
                        new SourceContext(ctx.getText(), sourceList)
                );
            } else {
                return new BlockStmtsDcl(
                        (Type) visit(ctx.type()),
                        true,
                        ctx.IDENT().getText(),
                        getParams(ctx.param()),
                        new SourceContext(ctx.getText(), sourceList)
                );
            }
        } else {
            if (ctx.val() != null) {
                return new BlockStmtsDcl(
                        (Type) visit(ctx.type()),
                        ctx.IDENT().getText(),
                        (Val) visit(ctx.val()),
                        new SourceContext(ctx.getText(), sourceList)
                );
            } else if (ctx.calc_expr() != null) {
                return new BlockStmtsDcl(
                        (Type) visit(ctx.type()),
                        ctx.IDENT().getText(),
                        (CalcExpr) visit(ctx.calc_expr()),
                        new SourceContext(ctx.getText(), sourceList)
                );
            } else if (ctx.func_call() != null) {
                return new BlockStmtsDcl(
                        (Type) visit(ctx.type()),
                        ctx.IDENT().getText(),
                        (FuncStmt) visit(ctx.func_call()),
                        new SourceContext(ctx.getText(), sourceList)
                );
            } else {
                throw new Error("Declaration not recognized: " + ctx.getText());
            }
        }
    }

    @Override
    public AST visitAssign(TaskuinoParser.AssignContext ctx) {
        if (ctx.val() != null) {
            return new AssignExpr(
                    ctx.IDENT().getText(),
                    (Val) visit(ctx.val()),
                    new SourceContext(ctx.getText(), sourceList)
            );
        } else if (ctx.calc_expr() != null) {
            return new AssignExpr(
                    ctx.IDENT().getText(),
                    (CalcExpr) visit(ctx.calc_expr()),
                    new SourceContext(ctx.getText(), sourceList)
            );
        } else if (ctx.func_call() != null) {
            return new AssignExpr(
                    ctx.IDENT().getText(),
                    (FuncStmt) visit(ctx.func_call()),
                    new SourceContext(ctx.getText(), sourceList)
            );
        } else {
            throw new Error("Assignment not recognized: " + ctx.getText());
        }
    }

    @Override
    public AST visitCalc_expr(TaskuinoParser.Calc_exprContext ctx) {
        CalcExpr expr = null;

        if (ctx.calc_expr_one() != null) {
            expr = (CalcExpr) visit(ctx.calc_expr_one());
        } else if (ctx.calc_expr_two() != null) {
            expr = (CalcExpr) visit(ctx.calc_expr_two());
        } else if (ctx.mod_op() != null) {
            expr = new CalcExpr(
                    (ValNumber) visit(ctx.number()),
                    (Operator) visit(ctx.mod_op()),
                    new SourceContext(ctx.getText(), sourceList)
            );
        } else {
            expr = new CalcExpr(
                    ctx.IDENT().getText(),
                    (Operator) visit(ctx.op_pres_two()),
                    (ValNumber) visit(ctx.number()),
                    new SourceContext(ctx.getText(), sourceList)
            );
        }

        return expr;
    }

    @Override
    public AST visitBool_expr(TaskuinoParser.Bool_exprContext ctx) {
        if (ctx.bool() != null) {
            if (ctx.bool_op() != null) {
                return new BoolExpr(
                        (ValBool) visit(ctx.bool()),
                        (BoolExpr) visit(ctx.bool_expr()),
                        (Operator) visit(ctx.bool_op()),
                        new SourceContext(ctx.getText(), sourceList)
                );
            } else {
                if (ctx.NOT() != null) {
                    return new BoolExpr(
                            (ValBool) visit(ctx.bool()),
                            new Operator.Not(),
                            new SourceContext(ctx.getText(), sourceList)
                    );
                } else {
                    return new BoolExpr(
                            (ValBool) visit(ctx.bool()),
                            new SourceContext(ctx.getText(), sourceList)
                    );
                }
            }
        } else {
            return new BoolExpr(
                    (Operator) visit(ctx.bool_op()),
                    (Val) visit(ctx.val(0)),
                    (Val) visit(ctx.val(1)),
                    new SourceContext(ctx.getText(), sourceList)
            );
        }
    }

    @Override
    public AST visitIf_stmt(TaskuinoParser.If_stmtContext ctx) {
        List<StmtsBlockStmts> stmts = new ArrayList<>();
        List<EifStmt> eifStmts = new ArrayList<>();

        for (TaskuinoParser.Block_stmtsContext s : ctx.block_stmts()) {
            stmts.add((StmtsBlockStmts) visit(s));
        }

        for (TaskuinoParser.Eif_stmtContext e : ctx.eif_stmt()) {
            eifStmts.add((EifStmt) visit(e));
        }

        return new IfStmt(
                (BoolCondition) visit(ctx.bool_condition()),
                stmts,
                eifStmts,
                new SourceContext(ctx.getText(), sourceList)
        );
    }

    @Override
    public AST visitEif_stmt(TaskuinoParser.Eif_stmtContext ctx) {
        List<StmtsBlockStmts> stmts = new ArrayList<>();

        for (TaskuinoParser.Block_stmtsContext s : ctx.block_stmts()) {
            stmts.add((StmtsBlockStmts) visit(s));
        }

        if (ctx.bool_condition() == null) {
            return new EifStmt(
                    stmts,
                    new SourceContext(ctx.getText(), sourceList)
            );
        } else {
            return new EifStmt(
                    (BoolCondition) visit(ctx.bool_condition()),
                    stmts,
                    new SourceContext(ctx.getText(), sourceList)
            );
        }
    }

    @Override
    public AST visitFor_stmt(TaskuinoParser.For_stmtContext ctx) {
        List<StmtsBlockStmts> stmts = new ArrayList<>();

        for (TaskuinoParser.Block_stmtsContext s : ctx.block_stmts()) {
            stmts.add((StmtsBlockStmts) visit(s));
        }

        if (ctx.dcl() != null) {
            return new ForStmt(
                    (BlockStmtsDcl) visit(ctx.dcl()),
                    (BoolCondition) visit(ctx.bool_condition()),
                    (CalcExpr) visit(ctx.calc_expr()),
                    stmts,
                    new SourceContext(ctx.getText(), sourceList)
            );
        } else {
            return new ForStmt(
                    (ValNumber) visit(ctx.number()),
                    (BoolCondition) visit(ctx.bool_condition()),
                    (CalcExpr) visit(ctx.calc_expr()),
                    stmts,
                    new SourceContext(ctx.getText(), sourceList)
            );
        }
    }

    @Override
    public AST visitFunc_call(TaskuinoParser.Func_callContext ctx) {
        return new FuncStmt(
                ctx.IDENT().getText(),
                getParams(ctx.param()),
                new SourceContext(ctx.getText(), sourceList)
        );
    }

    @Override
    public AST visitCalc_expr_one(TaskuinoParser.Calc_expr_oneContext ctx) {
        if (ctx.op_pres_one() == null) {
            return new CalcExpr(
                    (ValNumber) visit(ctx.number()),
                    new SourceContext(ctx.getText(), sourceList)
            );
        } else {
            return new CalcExpr(
                    (ValNumber) visit(ctx.number()),
                    (Operator) visit(ctx.op_pres_one()),
                    (CalcExpr) visit(ctx.calc_expr_three()),
                    new SourceContext(ctx.getText(), sourceList)
            );
        }
    }

    @Override
    public AST visitCalc_expr_two(TaskuinoParser.Calc_expr_twoContext ctx) {
        if (ctx.op_pres_two() == null) {
            return new CalcExpr(
                    (ValNumber) visit(ctx.number()),
                    new SourceContext(ctx.getText(), sourceList)
            );
        } else {
            return new CalcExpr(
                    (ValNumber) visit(ctx.number()),
                    (Operator) visit(ctx.op_pres_two()),
                    (CalcExpr) visit(ctx.calc_expr_one()),
                    new SourceContext(ctx.getText(), sourceList)
            );
        }
    }

    @Override
    public AST visitCalc_expr_three(TaskuinoParser.Calc_expr_threeContext ctx) {
        if (ctx.number() != null) {
            return new CalcExpr(
                    (ValNumber) visit(ctx.number()),
                    new SourceContext(ctx.getText(), sourceList)
            );
        } else {
            return new CalcExpr(
                    (CalcExpr) visit(ctx.calc_expr_two()),
                    new SourceContext(ctx.getText(), sourceList)
            );
        }
    }

    @Override
    public AST visitBool_condition(TaskuinoParser.Bool_conditionContext ctx) {
        if (ctx.bool_expr() != null) {
            return new BoolCondition(
                    (BoolExpr) visit(ctx.bool_expr()),
                    new SourceContext(ctx.getText(), sourceList)
            );
        } else if (ctx.func_call() != null) {
            return new BoolCondition(
                    (FuncStmt) visit(ctx.func_call()),
                    new SourceContext(ctx.getText(), sourceList)
            );
        } else {
            throw new Error("Boolean condition not recognized: " + ctx.getText());
        }
    }

    @Override
    public AST visitParam(TaskuinoParser.ParamContext ctx) {
        //list required, as such this is done through getParams() method
        return null;
    }

    @Override
    public AST visitOp_pres_one(TaskuinoParser.Op_pres_oneContext ctx) {
        if (ctx.MULT() != null) {
            return new Operator.Mult();
        } else if (ctx.DIV() != null) {
            return new Operator.Div();
        } else if (ctx.MOD() != null) {
            return new Operator.Mod();
        } else {
            throw new Error("Operator not recognized: " + ctx.getText());
        }
    }

    @Override
    public AST visitOp_pres_two(TaskuinoParser.Op_pres_twoContext ctx) {
        if (ctx.PLUS() != null) {
            return new Operator.Add();
        } else if (ctx.MINUS() != null) {
            return new Operator.Sub();
        } else {
            throw new Error("Operator not recognized: " + ctx.getText());
        }
    }

    @Override
    public AST visitBool_op(TaskuinoParser.Bool_opContext ctx) {
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
        } else if (ctx.AND() != null) {
            return new Operator.And();
        } else {
            throw new Error("Operator not recognized: " + ctx.getText());
        }
    }

    @Override
    public AST visitMod_op(TaskuinoParser.Mod_opContext ctx) {
        if (ctx.INCR() != null) {
            return new Operator.Incr();
        } else if (ctx.DECR() != null) {
            return new Operator.Decr();
        } else {
            throw new Error("Operator not recognized: " + ctx.getText());
        }
    }

    @Override
    public AST visitType(TaskuinoParser.TypeContext ctx) {
        if (ctx.TYPE_INT() != null) {
            return new Type.TypeInt();
        } else if (ctx.TYPE_STRING() != null) {
            return new Type.TypeString();
        } else if (ctx.TYPE_DOUBLE() != null) {
            return new Type.TypeDouble();
        } else if (ctx.TYPE_BOOL() != null) {
            return new Type.TypeBool();
        } else {
            throw new Error("Type not recognized: " + ctx.getText());
        }
    }

    @Override
    public AST visitVal(TaskuinoParser.ValContext ctx) {
        Val val = null;

        if (ctx.number() != null) {
            val = (ValNumber) visit(ctx.number());
        } else if (ctx.STRING() != null) {
            val = (ValString) visit(ctx.STRING());
        } else if (ctx.bool() != null) {
            val = (ValBool) visit(ctx.bool());
        } else if (ctx.literals() != null) {
            val = (ValLiteral) visit(ctx.literals());
        } else if (ctx.func_call() != null) {
            FuncStmt func = (FuncStmt) visit(ctx.func_call());
            val = new ValFunc(
                    func.getIdentifier(),
                    func.getParams(),
                    new SourceContext(ctx.getText(), sourceList)
            );
        } else {
            throw new Error("Value not recognized: " + ctx.getText());
        }

        return val;
    }

    @Override
    public AST visitBool(TaskuinoParser.BoolContext ctx) {
        if (ctx.TRUE() != null) {
            return new ValBool(
                    true,
                    new SourceContext(ctx.getText(), sourceList)
            );
        } else if (ctx.FALSE() != null) {
            return new ValBool(
                    false,
                    new SourceContext(ctx.getText(), sourceList)
            );
        } else if (ctx.IDENT() != null) {
            return new ValBool(
                    ctx.IDENT().getText(),
                    new SourceContext(ctx.getText(), sourceList)
            );
        } else {
            throw new Error("Boolean not recognized: " + ctx.getText());
        }
    }

    @Override
    public AST visitNumber(TaskuinoParser.NumberContext ctx) {
        if (ctx.ival() != null) {
            return (NumberIval) visit(ctx.ival());
        } else if (ctx.fval() != null) {
            return (NumberFval) visit(ctx.fval());
        } else if (ctx.ARRAY_START() != null) {
            return new NumberArrayIndex(
                    ctx.IDENT().getText(),
                    (ValNumber) visit(ctx.number()),
                    new SourceContext(ctx.getText(), sourceList)
            );
        } else if (ctx.IDENT() != null) {
            return new ValIdent(
                    ctx.IDENT().getText(),
                    new SourceContext(ctx.getText(), sourceList)
            );
        } else {
            throw new Error("Value not recognized: " + ctx.getText());
        }
    }

    @Override
    public AST visitIval(TaskuinoParser.IvalContext ctx) {
        return new NumberIval(
                Integer.parseInt(ctx.getText()),
                new SourceContext(ctx.getText(), sourceList)
        );
    }

    @Override
    public AST visitFval(TaskuinoParser.FvalContext ctx) {
        return new NumberFval(
                Double.parseDouble(ctx.getText()),
                new SourceContext(ctx.getText(), sourceList)
        );
    }

    @Override
    public AST visitLiterals(TaskuinoParser.LiteralsContext ctx) {
        if (ctx.OUTPUT() != null) {
            return new ValLiteral(
                    "OUTPUT",
                    new SourceContext(ctx.getText(), sourceList)
            );
        } else if (ctx.INPUT() != null) {
            return new ValLiteral(
                    "INPUT",
                    new SourceContext(ctx.getText(), sourceList)
            );
        } else if (ctx.HIGH() != null) {
            return new ValLiteral(
                    "HIGH",
                    new SourceContext(ctx.getText(), sourceList)
            );
        } else if (ctx.LOW() != null) {
            return new ValLiteral(
                    "LOW",
                    new SourceContext(ctx.getText(), sourceList)
            );
        } else if (ctx.VOID() != null) {
            return new ValLiteral(
                    "void",
                    new SourceContext(ctx.getText(), sourceList)
            );
        } else if (ctx.NULL() != null) {
            return new ValLiteral(
                    "null",
                    new SourceContext(ctx.getText(), sourceList)
            );
        } else {
            throw new Error("Literal not recognized: " + ctx.getText());
        }
    }

    private List<Param> getParams(TaskuinoParser.ParamContext ctx) {
        List<Param> params = new ArrayList<>();
        if (ctx != null) {
            if (ctx.val().size() != 0) {
                params.add(new Param(
                        (Val) visit(ctx.val(0)),
                        new SourceContext(ctx.getText(), sourceList)
                ));
                if (ctx.PARAM_DELIM() != null) {
                    int delim = ctx.PARAM_DELIM().size();

                    for (int i = 0; i < delim; i++) {
                        params.add(new Param(
                                (Val) visit(ctx.val(i + 1)),
                                new SourceContext(ctx.getText(), sourceList)
                        ));
                    }
                }
            }
        }
        return params;
    }
}
