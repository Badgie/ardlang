package types.value;

import util.SourceContext;

public class NumberArrayIndex extends ValNumber {
    String identifier;
    ValNumber index;
    SourceContext ctx;

    public NumberArrayIndex(String identifier, ValNumber index, SourceContext ctx) {
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

    public SourceContext getCtx() {
        return ctx;
    }
}
