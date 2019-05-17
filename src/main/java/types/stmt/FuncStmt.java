package types.stmt;

import org.antlr.v4.runtime.ParserRuleContext;
import types.Param;
import types.blockstmts.BlockStmtsStmt;

import java.util.List;

public class FuncStmt extends BlockStmtsStmt {
    String identifier;
    List<Param> params;
    ParserRuleContext ctx;

    public FuncStmt(String identifier, List<Param> params, ParserRuleContext ctx) {
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
}
