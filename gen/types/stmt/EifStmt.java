package types.stmt;

import types.BoolCondition;
import types.stmts.StmtsBlockStmts;

import java.util.List;

public class EifStmt {
    BoolCondition condition;
    List<StmtsBlockStmts> stmts;

    public EifStmt(BoolCondition condition, List<StmtsBlockStmts> stmts) {
        this.condition = condition;
        this.stmts = stmts;
    }

    public EifStmt(List<StmtsBlockStmts> stmts) {
        this.stmts = stmts;
    }
}
