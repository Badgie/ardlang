package types.expr;

import dk.aau.cs.sw411.antlr.TaskuinoParser;
import org.antlr.v4.runtime.ParserRuleContext;
import types.blockstmts.BlockStmtsExpr;
import types.stmt.FuncStmt;
import types.value.Val;

public class AssignExpr extends BlockStmtsExpr {
    String identifier;
    Val value;
    CalcExpr cExpr;
    FuncStmt fStmt;
    ParserRuleContext ctx;

    public AssignExpr(String identifier, Val value, ParserRuleContext ctx) {
        this.identifier = identifier;
        this.value = value;
        this.ctx = ctx;
    }

    public AssignExpr(String identifier, CalcExpr cExpr, ParserRuleContext ctx) {
        this.identifier = identifier;
        this.cExpr = cExpr;
        this.ctx = ctx;
    }

    public AssignExpr(String identifier, FuncStmt fStmt, ParserRuleContext ctx) {
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

    public ParserRuleContext getCtx() {
        return ctx;
    }
}
