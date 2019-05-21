package types;

import java.util.List;

import types.stmts.Stmts;
import util.SourceContext;

public class Prog extends AST {
    List<Stmts> stmts;
    SourceContext ctx;

    public Prog(List<Stmts> stmts, SourceContext ctx) {
        this.stmts = stmts;
        this.ctx = ctx;
    }

    public List<Stmts> getStmts() {
        return stmts;
    }

    public SourceContext getCtx() {
        return ctx;
    }
}
