package types.expr;

import dk.aau.cs.sw411.antlr.TaskuinoParser;
import org.antlr.v4.runtime.ParserRuleContext;
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
    ParserRuleContext ctx;

    public CalcExpr(ValNumber num, ParserRuleContext ctx) {
        this.num = num;
        this.ctx = ctx;
    }

    public CalcExpr(ValNumber num, Operator op, ParserRuleContext ctx) {
        this.num = num;
        this.op = op;
        this.ctx = ctx;
    }

    public CalcExpr(String identifier, Operator op, ValNumber num, ParserRuleContext ctx) {
        this.identifier = identifier;
        this.op = op;
        this.num = num;
        this.ctx = ctx;
    }

    public CalcExpr(ValNumber num, Operator op, CalcExpr expr, ParserRuleContext ctx) {
        this.num = num;
        this.op = op;
        this.expr = expr;
        this.ctx = ctx;
    }

    public CalcExpr(CalcExpr expr, ParserRuleContext ctx) {
        this.expr = expr;
        this.ctx = ctx;
    }
}
