package types.value;

import types.Param;
import util.SourceContext;

import java.util.List;

public class ValFunc extends Val {
    String identifier;
    List<Param> params;
    SourceContext ctx;

    public ValFunc(String identifier, List<Param> params, SourceContext ctx) {
        this.identifier = identifier;
        this.params = params;
        this.ctx = ctx;
    }

    public String getIdentifier() {
        return identifier;
    }

    public List<Param> getParams() {
        return params;
    }

    public SourceContext getCtx() {
        return ctx;
    }
}
