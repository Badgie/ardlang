package types.expr;

import types.blockstmts.BlockStmtsExpr;
import types.operator.Operator;
import types.value.Val;
import types.value.ValBool;
import util.SourceContext;

public class BoolExpr extends BlockStmtsExpr {
    ValBool bool;
    ValBool leftBool;
    ValBool rightBool;
    BoolExpr rightBoolExpr;
    Operator op;
    Val leftVal;
    Val rightVal;
    Operator.Not negation;
    SourceContext ctx;

    public BoolExpr(ValBool leftBool, BoolExpr rightBoolExpr, Operator op, SourceContext ctx) {
        this.leftBool = leftBool;
        this.rightBoolExpr = rightBoolExpr;
        this.op = op;
        this.ctx = ctx;
    }

    public BoolExpr(ValBool bool, SourceContext ctx) {
        this.bool = bool;
        this.ctx = ctx;
    }

    public BoolExpr(Operator op, Val leftVal, Val rightVal, SourceContext ctx) {
        this.op = op;
        this.leftVal = leftVal;
        this.rightVal = rightVal;
        this.ctx = ctx;
    }

    public BoolExpr(ValBool bool, Operator.Not negation, SourceContext ctx) {
        this.bool = bool;
        this.negation = negation;
        this.ctx = ctx;
    }

    public ValBool getBool() {
        return bool;
    }

    public ValBool getLeftBool() {
        return leftBool;
    }

    public ValBool getRightBool() {
        return rightBool;
    }

    public BoolExpr getRightBoolExpr() {
        return rightBoolExpr;
    }

    public Operator getOp() {
        return op;
    }

    public Val getLeftVal() {
        return leftVal;
    }

    public Val getRightVal() {
        return rightVal;
    }

    public Operator.Not getNegation() {
        return negation;
    }

    public SourceContext getCtx() {
        return ctx;
    }
}
