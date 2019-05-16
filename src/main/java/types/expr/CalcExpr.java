package types.expr;

import types.blockstmts.BlockStmtsExpr;
import types.operator.Operator;
import types.value.ValNumber;

import java.util.List;

public class CalcExpr extends BlockStmtsExpr {
    ValNumber num;
    ValNumber numRight;
    Operator op;
    String identifier;
    CalcExpr expr;

    public CalcExpr(ValNumber num) {
        this.num = num;
    }

    public CalcExpr(ValNumber num, Operator op) {
        this.num = num;
        this.op = op;
    }

    public CalcExpr(String identifier, Operator op, ValNumber num) {
        this.identifier = identifier;
        this.op = op;
        this.num = num;
    }

    public CalcExpr(ValNumber num, Operator op, CalcExpr expr) {
        this.num = num;
        this.op = op;
        this.expr = expr;
    }

    public CalcExpr(CalcExpr expr) {
        this.expr = expr;
    }
}
