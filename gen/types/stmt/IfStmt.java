package types.stmt;

import types.BoolCondition;
import types.blockstmts.BlockStmtsStmt;
import types.stmts.StmtsBlockStmts;

import java.util.List;

public class IfStmt extends BlockStmtsStmt {
    BoolCondition condition;
    List<StmtsBlockStmts> stmts;
    List<EifStmt> eifStmts;

    public IfStmt(BoolCondition condition, List<StmtsBlockStmts> stmts, List<EifStmt> eifStmts) {
        this.condition = condition;
        this.stmts = stmts;
        this.eifStmts = eifStmts;
    }
}
