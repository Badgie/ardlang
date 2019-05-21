package types;

import types.expr.BoolExpr;
import types.stmt.FuncStmt;
import util.SourceContext;

public class BoolCondition extends AST {
    BoolExpr boolExpr;
    FuncStmt funcStmt;
    SourceContext ctx;

    public BoolCondition(BoolExpr boolExpr, SourceContext ctx) {
        this.boolExpr = boolExpr;
        this.ctx = ctx;
    }

    public BoolCondition(FuncStmt funcStmt, SourceContext ctx) {
        this.funcStmt = funcStmt;
        this.ctx = ctx;
    }

    public BoolExpr getBoolExpr() {
        return boolExpr;
    }

    public FuncStmt getFuncStmt() {
        return funcStmt;
    }

    public SourceContext getCtx() {
        return ctx;
    }
}
