package types.expr;

import types.Type;
import types.blockstmts.BlockStmtsExpr;
import types.operator.Operator;
import types.value.Val;
import types.value.ValBool;

public class BoolExpr extends BlockStmtsExpr {
    ValBool bool;
    ValBool leftBool;
    ValBool rightBool;
    BoolExpr rightBoolExpr;
    Operator op;
    Val leftVal;
    Val rightVal;
    Operator.Not negation;

    public BoolExpr(ValBool leftBool, BoolExpr rightBoolExpr, Operator op) {
        this.leftBool = leftBool;
        this.rightBoolExpr = rightBoolExpr;
        this.op = op;
    }

    public BoolExpr(ValBool bool) {
        this.bool = bool;
    }

    public BoolExpr(Operator op, Val leftVal, Val rightVal) {
        this.op = op;
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    public BoolExpr(ValBool bool, Operator.Not negation) {
        this.bool = bool;
        this.negation = negation;
    }
}
