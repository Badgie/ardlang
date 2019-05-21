package types.stmt;

import types.BoolCondition;
import types.blockstmts.BlockStmtsStmt;
import types.stmts.StmtsBlockStmts;
import util.SourceContext;

import java.util.List;

public class IfStmt extends BlockStmtsStmt {
    BoolCondition condition;
    List<StmtsBlockStmts> stmts;
    List<EifStmt> eifStmts;
    SourceContext ctx;

    public IfStmt(BoolCondition condition, List<StmtsBlockStmts> stmts, List<EifStmt> eifStmts, SourceContext ctx) {
        this.condition = condition;
        this.stmts = stmts;
        this.eifStmts = eifStmts;
        this.ctx = ctx;
    }

    public BoolCondition getCondition() {
        return condition;
    }

    public List<StmtsBlockStmts> getStmts() {
        return stmts;
    }

    public List<EifStmt> getEifStmts() {
        return eifStmts;
    }

    public SourceContext getCtx() {
        return ctx;
    }
}
