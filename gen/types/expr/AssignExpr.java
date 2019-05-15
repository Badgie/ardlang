package types.expr;

import types.blockstmts.BlockStmtsExpr;
import types.stmt.FuncStmt;
import types.value.Val;

public class AssignExpr extends BlockStmtsExpr {
    String identifier;
    Val value;
    CalcExpr cExpr;
    FuncStmt fStmt;

    public AssignExpr(String identifier, Val value) {
        this.identifier = identifier;
        this.value = value;
    }

    public AssignExpr(String identifier, CalcExpr cExpr) {
        this.identifier = identifier;
        this.cExpr = cExpr;
    }

    public AssignExpr(String identifier, FuncStmt fStmt) {
        this.identifier = identifier;
        this.fStmt = fStmt;
    }
}
