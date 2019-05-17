package types.expr;

import dk.aau.cs.sw411.antlr.TaskuinoParser;
import org.antlr.v4.runtime.ParserRuleContext;
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
    ParserRuleContext ctx;

    public BoolExpr(ValBool leftBool, BoolExpr rightBoolExpr, Operator op, ParserRuleContext ctx) {
        this.leftBool = leftBool;
        this.rightBoolExpr = rightBoolExpr;
        this.op = op;
        this.ctx = ctx;
    }

    public BoolExpr(ValBool bool, ParserRuleContext ctx) {
        this.bool = bool;
        this.ctx = ctx;
    }

    public BoolExpr(Operator op, Val leftVal, Val rightVal, ParserRuleContext ctx) {
        this.op = op;
        this.leftVal = leftVal;
        this.rightVal = rightVal;
        this.ctx = ctx;
    }

    public BoolExpr(ValBool bool, Operator.Not negation, ParserRuleContext ctx) {
        this.bool = bool;
        this.negation = negation;
        this.ctx = ctx;
    }
}
