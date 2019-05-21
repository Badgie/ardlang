package types.value;

import util.SourceContext;

public class ValBool extends Val {
    boolean value;
    String identifier;
    SourceContext ctx;

    public ValBool(boolean value, SourceContext ctx) {
        this.value = value;
        this.ctx = ctx;
    }

    public ValBool(String identifier, SourceContext ctx) {
        this.identifier = identifier;
        this.ctx = ctx;
    }

    public boolean isValue() {
        return value;
    }

    public String getIdentifier() {
        return identifier;
    }

    public SourceContext getCtx() {
        return ctx;
    }
}
