package types.stmt;

import org.antlr.v4.runtime.ParserRuleContext;
import types.BoolCondition;
import types.blockstmts.BlockStmtsStmt;
import types.stmts.StmtsBlockStmts;

import java.util.List;

public class IfStmt extends BlockStmtsStmt {
    BoolCondition condition;
    List<StmtsBlockStmts> stmts;
    List<EifStmt> eifStmts;
    ParserRuleContext ctx;

    public IfStmt(BoolCondition condition, List<StmtsBlockStmts> stmts, List<EifStmt> eifStmts, ParserRuleContext ctx) {
        this.condition = condition;
        this.stmts = stmts;
        this.eifStmts = eifStmts;
        this.ctx = ctx;
    }
}
