package types.value;

import org.antlr.v4.runtime.ParserRuleContext;

public class ValIdent extends ValNumber {
    String identifier;
    ParserRuleContext ctx;

    public ValIdent(String identifier, ParserRuleContext ctx) {
        this.identifier = identifier;
        this.ctx = ctx;
    }

    public String getIdentifier() {
        return identifier;
    }

    public ParserRuleContext getCtx() {
        return ctx;
    }
}
