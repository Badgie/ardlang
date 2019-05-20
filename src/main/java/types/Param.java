package types;

import org.antlr.v4.runtime.ParserRuleContext;
import types.value.Val;

import java.util.List;

public class Param extends AST {
    Val value;
    Param param;
    ParserRuleContext ctx;

    public Param(Val value, ParserRuleContext ctx) {
        this.value = value;
        this.ctx = ctx;
    }

    public Param(Val value, Param param, ParserRuleContext ctx) {
        this.value = value;
        this.param = param;
        this.ctx = ctx;
    }

    public Val getValue() {
        return value;
    }

    public Param getParam() {
        return param;
    }

    public ParserRuleContext getCtx() {
        return ctx;
    }
}
