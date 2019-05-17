package types.value;

import org.antlr.v4.runtime.ParserRuleContext;

public class ValString extends Val {
    String value;
    ParserRuleContext ctx;

    public ValString(String value, ParserRuleContext ctx) {
        this.value = value;
        this.ctx = ctx;
    }

    public String getValue() {
        return value;
    }

    public ParserRuleContext getCtx() {
        return ctx;
    }
}
