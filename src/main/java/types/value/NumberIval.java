package types.value;

import util.SourceContext;

public class NumberIval extends ValNumber {
    int value;
    SourceContext ctx;

    public NumberIval(int value, SourceContext ctx) {
        this.value = value;
        this.ctx = ctx;
    }

    public int getValue() {
        return value;
    }

    public SourceContext getCtx() {
        return ctx;
    }
}
