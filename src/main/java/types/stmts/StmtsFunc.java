package types.stmts;

import types.Param;
import types.Type;
import util.SourceContext;

import java.util.List;

public class StmtsFunc extends Stmts {
    String identifier;
    List<Param> params;
    List<StmtsBlockStmts> stmts;
    SourceContext ctx;
    Type type;

    public StmtsFunc(String identifier, List<Param> params, List<StmtsBlockStmts> stmts, Type type, SourceContext ctx) {
        this.type = type;
        this.identifier = identifier;
        this.params = params;
        this.stmts = stmts;
        this.ctx = ctx;
    }

    public String getIdentifier() {
        return identifier;
    }

    public List<Param> getParams() {
        return params;
    }

    public List<StmtsBlockStmts> getStmts() {
        return stmts;
    }

    public SourceContext getCtx() {
        return ctx;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "StmtsFunc{" +
                "identifier='" + identifier + '\'' +
                '}';
    }
}
