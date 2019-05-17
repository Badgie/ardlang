package types;

import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import types.stmts.Stmts;

//TODO: note that stmts are actually a list of stmt - FIX!

public class Prog extends AST {
    List<Stmts> stmts;
    ParserRuleContext ctx;

    public Prog(List<Stmts> stmts, ParserRuleContext ctx) {
        this.stmts = stmts;
        this.ctx = ctx;
    }

    public List<Stmts> getStmts() {
        return stmts;
    }

    public ParserRuleContext getCtx() {
        return ctx;
    }
}
