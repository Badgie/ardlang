package types.value;

import org.antlr.v4.runtime.ParserRuleContext;

public class ValBool extends Val {
    boolean value;
    String identifier;
    ParserRuleContext ctx;

    public ValBool(boolean value, ParserRuleContext ctx) {
        this.value = value;
        this.ctx = ctx;
    }

    public ValBool(String identifier, ParserRuleContext ctx) {
        this.identifier = identifier;
        this.ctx = ctx;
    }
}
