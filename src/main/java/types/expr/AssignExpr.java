package types.expr;

import types.blockstmts.BlockStmtsExpr;
import types.stmt.FuncStmt;
import types.value.Val;
import util.SourceContext;

public class AssignExpr extends BlockStmtsExpr {
    String identifier;
    Val value;
    CalcExpr cExpr;
    FuncStmt fStmt;
    SourceContext ctx;

    public AssignExpr(String identifier, Val value, SourceContext ctx) {
        this.identifier = identifier;
        this.value = value;
        this.ctx = ctx;
    }

    public AssignExpr(String identifier, CalcExpr cExpr, SourceContext ctx) {
        this.identifier = identifier;
        this.cExpr = cExpr;
        this.ctx = ctx;
    }

    public AssignExpr(String identifier, FuncStmt fStmt, SourceContext ctx) {
        this.identifier = identifier;
        this.fStmt = fStmt;
        this.ctx = ctx;
    }

    public String getIdentifier() {
        return identifier;
    }

    public Val getValue() {
        return value;
    }

    public CalcExpr getcExpr() {
        return cExpr;
    }

    public FuncStmt getfStmt() {
        return fStmt;
    }

    public SourceContext getCtx() {
        return ctx;
    }
}
