package types.value;

import org.antlr.v4.runtime.ParserRuleContext;

public class NumberIval extends ValNumber {
    int value;
    ParserRuleContext ctx;

    public NumberIval(int value, ParserRuleContext ctx) {
        this.value = value;
        this.ctx = ctx;
    }
}
