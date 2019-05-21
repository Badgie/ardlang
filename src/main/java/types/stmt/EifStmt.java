package types.stmt;

import types.BoolCondition;
import types.blockstmts.BlockStmtsStmt;
import types.stmts.StmtsBlockStmts;
import util.SourceContext;

import java.util.List;

public class EifStmt extends BlockStmtsStmt {
    BoolCondition condition;
    List<StmtsBlockStmts> stmts;
    SourceContext ctx;

    public EifStmt(BoolCondition condition, List<StmtsBlockStmts> stmts, SourceContext ctx) {
        this.condition = condition;
        this.stmts = stmts;
        this.ctx = ctx;
    }

    public EifStmt(List<StmtsBlockStmts> stmts, SourceContext ctx) {
        this.stmts = stmts;
        this.ctx = ctx;
    }

    public BoolCondition getCondition() {
        return condition;
    }

    public List<StmtsBlockStmts> getStmts() {
        return stmts;
    }

    public SourceContext getCtx() {
        return ctx;
    }
}
