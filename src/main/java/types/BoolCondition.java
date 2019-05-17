package types;

import org.antlr.v4.runtime.ParserRuleContext;
import types.expr.BoolExpr;
import types.stmt.FuncStmt;

public class BoolCondition extends AST {
    BoolExpr boolExpr;
    FuncStmt funcStmt;
    ParserRuleContext ctx;

    public BoolCondition(BoolExpr boolExpr, ParserRuleContext ctx) {
        this.boolExpr = boolExpr;
        this.ctx = ctx;
    }

    public BoolCondition(FuncStmt funcStmt, ParserRuleContext ctx) {
        this.funcStmt = funcStmt;
        this.ctx = ctx;
    }

    public BoolExpr getBoolExpr() {
        return boolExpr;
    }

    public FuncStmt getFuncStmt() {
        return funcStmt;
    }

    public ParserRuleContext getCtx() {
        return ctx;
    }
}
