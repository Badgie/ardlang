package types.expr;

import types.blockstmts.BlockStmtsExpr;
import types.operator.Operator;
import types.value.ValNumber;
import util.SourceContext;

public class CalcExpr extends BlockStmtsExpr {
    ValNumber num;
    ValNumber numRight;
    Operator op;
    String identifier;
    CalcExpr expr;
    SourceContext ctx;

    public CalcExpr(ValNumber num, SourceContext ctx) {
        this.num = num;
        this.ctx = ctx;
    }

    public CalcExpr(ValNumber num, Operator op, SourceContext ctx) {
        this.num = num;
        this.op = op;
        this.ctx = ctx;
    }

    public CalcExpr(String identifier, Operator op, ValNumber num, SourceContext ctx) {
        this.identifier = identifier;
        this.op = op;
        this.num = num;
        this.ctx = ctx;
    }

    public CalcExpr(ValNumber num, Operator op, CalcExpr expr, SourceContext ctx) {
        this.num = num;
        this.op = op;
        this.expr = expr;
        this.ctx = ctx;
    }

    public CalcExpr(CalcExpr expr, SourceContext ctx) {
        this.expr = expr;
        this.ctx = ctx;
    }

    public ValNumber getNum() {
        return num;
    }

    public ValNumber getNumRight() {
        return numRight;
    }

    public Operator getOp() {
        return op;
    }

    public String getIdentifier() {
        return identifier;
    }

    public CalcExpr getExpr() {
        return expr;
    }

    public SourceContext getCtx() {
        return ctx;
    }
}
