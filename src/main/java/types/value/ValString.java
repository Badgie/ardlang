package types.value;

import util.SourceContext;

public class ValString extends Val {
    String value;
    SourceContext ctx;

    public ValString(String value, SourceContext ctx) {
        this.value = value;
        this.ctx = ctx;
    }

    public String getValue() {
        return value;
    }

    public SourceContext getCtx() {
        return ctx;
    }
}
