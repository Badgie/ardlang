package types;

import types.value.Val;
import util.SourceContext;

public class Param extends AST {
    Val value;
    Param param;
    SourceContext ctx;

    public Param(Val value, SourceContext ctx) {
        this.value = value;
        this.ctx = ctx;
    }

    public Param(Val value, Param param, SourceContext ctx) {
        this.value = value;
        this.param = param;
        this.ctx = ctx;
    }

    public Val getValue() {
        return value;
    }

    public Param getParam() {
        return param;
    }

    public SourceContext getCtx() {
        return ctx;
    }
}
