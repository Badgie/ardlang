package types.stmt;

import types.BoolCondition;
import types.blockstmts.BlockStmtsDcl;
import types.blockstmts.BlockStmtsStmt;
import types.expr.CalcExpr;
import types.stmts.StmtsBlockStmts;
import types.value.ValNumber;

import java.util.List;

public class ForStmt extends BlockStmtsStmt {
    BlockStmtsDcl dcl;
    ValNumber num;
    BoolCondition cond;
    CalcExpr cExpr;
    List<StmtsBlockStmts> stmts;

    public ForStmt(ValNumber num, BoolCondition cond, CalcExpr cExpr, List<StmtsBlockStmts> stmts) {
        this.num = num;
        this.cond = cond;
        this.cExpr = cExpr;
        this.stmts = stmts;
    }

    public ForStmt(BlockStmtsDcl dcl, BoolCondition cond, CalcExpr cExpr, List<StmtsBlockStmts> stmts) {
        this.dcl = dcl;
        this.cond = cond;
        this.cExpr = cExpr;
        this.stmts = stmts;
    }
}
