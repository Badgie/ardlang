package types.stmt;

import org.antlr.v4.runtime.ParserRuleContext;
import types.BoolCondition;
import types.stmts.StmtsBlockStmts;

import java.util.List;

public class EifStmt {
    BoolCondition condition;
    List<StmtsBlockStmts> stmts;
    ParserRuleContext ctx;

    public EifStmt(BoolCondition condition, List<StmtsBlockStmts> stmts, ParserRuleContext ctx) {
        this.condition = condition;
        this.stmts = stmts;
        this.ctx = ctx;
    }

    public EifStmt(List<StmtsBlockStmts> stmts, ParserRuleContext ctx) {
        this.stmts = stmts;
        this.ctx = ctx;
    }
}
