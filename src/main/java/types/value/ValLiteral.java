package types.value;

import org.antlr.v4.runtime.ParserRuleContext;

public class ValLiteral extends Val {
    String value;
    ParserRuleContext ctx;

    public ValLiteral(String value, ParserRuleContext ctx) {
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
