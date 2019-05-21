package types.value;

import util.SourceContext;

public class ValIdent extends ValNumber {
    String identifier;
    SourceContext ctx;

    public ValIdent(String identifier, SourceContext ctx) {
        this.identifier = identifier;
        this.ctx = ctx;
    }

    public String getIdentifier() {
        return identifier;
    }

    public SourceContext getCtx() {
        return ctx;
    }
}
