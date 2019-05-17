package types;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.List;

public class Param extends AST {
    String value;
    Param param;
    ParserRuleContext ctx;

    public Param(String value, ParserRuleContext ctx) {
        this.value = value;
        this.ctx = ctx;
    }

    public Param(String value, Param param, ParserRuleContext ctx) {
        this.value = value;
        this.param = param;
        this.ctx = ctx;
    }
}
