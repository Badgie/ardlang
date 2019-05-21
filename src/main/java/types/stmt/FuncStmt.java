package types.stmt;

import types.Param;
import types.blockstmts.BlockStmtsStmt;
import util.SourceContext;

import java.util.List;

public class FuncStmt extends BlockStmtsStmt {
    String identifier;
    List<Param> params;
    SourceContext ctx;

    public FuncStmt(String identifier, List<Param> params, SourceContext ctx) {
        this.identifier = identifier;
        this.params = params;
        this.ctx = ctx;
    }

    public SourceContext getCtx() {
        return ctx;
    }

    public String getIdentifier() {
        return identifier;
    }

    public List<Param> getParams() {
        return params;
    }
}
