package types.value;

import org.antlr.v4.runtime.ParserRuleContext;

public class NumberFval extends ValNumber {
    double value;
    ParserRuleContext ctx;

    public NumberFval(double value, ParserRuleContext ctx) {
        this.value = value;
        this.ctx = ctx;
    }
}
