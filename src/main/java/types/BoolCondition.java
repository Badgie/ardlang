package types;

import types.expr.BoolExpr;
import types.stmt.FuncStmt;

public class BoolCondition extends AST {
    BoolExpr boolExpr;
    FuncStmt funcStmt;

    public BoolCondition(BoolExpr boolExpr) {
        this.boolExpr = boolExpr;
    }

    public BoolCondition(FuncStmt funcStmt) {
        this.funcStmt = funcStmt;
    }
}
