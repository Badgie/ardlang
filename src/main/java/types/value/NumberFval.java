package types.value;

import util.SourceContext;

public class NumberFval extends ValNumber {
    double value;
    SourceContext ctx;

    public NumberFval(double value, SourceContext ctx) {
        this.value = value;
        this.ctx = ctx;
    }

    public double getValue() {
        return value;
    }

    public SourceContext getCtx() {
        return ctx;
    }
}
