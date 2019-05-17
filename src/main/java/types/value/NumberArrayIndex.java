package types.value;

import org.antlr.v4.runtime.ParserRuleContext;

public class NumberArrayIndex extends ValNumber {
    String identifier;
    ValNumber index;
    ParserRuleContext ctx;

    public NumberArrayIndex(String identifier, ValNumber index, ParserRuleContext ctx) {
        this.identifier = identifier;
        this.index = index;
        this.ctx = ctx;
    }

    public String getIdentifier() {
        return identifier;
    }

    public ValNumber getIndex() {
        return index;
    }

    public ParserRuleContext getCtx() {
        return ctx;
    }
}
