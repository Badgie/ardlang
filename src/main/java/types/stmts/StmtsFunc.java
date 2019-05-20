package types.stmts;

import org.antlr.v4.runtime.ParserRuleContext;
import types.AST;
import types.Param;
import types.Type;

import java.util.List;

public class StmtsFunc extends Stmts {
    String identifier;
    List<Param> params;
    List<StmtsBlockStmts> stmts;
    ParserRuleContext ctx;
    Type type;

    public StmtsFunc(String identifier, List<Param> params, List<StmtsBlockStmts> stmts, ParserRuleContext ctx) {
        this.type = new Type.TypeFunc();
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

    public ParserRuleContext getCtx() {
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
