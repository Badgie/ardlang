package types.value;

import org.antlr.v4.runtime.ParserRuleContext;
import types.Param;

import java.util.List;

public class ValFunc extends Val {
    String identifier;
    List<Param> params;
    ParserRuleContext ctx;

    public ValFunc(String identifier, List<Param> params, ParserRuleContext ctx) {
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

    public ParserRuleContext getCtx() {
        return ctx;
    }
}
