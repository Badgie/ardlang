package types.stmt;

import org.antlr.v4.runtime.ParserRuleContext;
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
    ParserRuleContext ctx;

    public ForStmt(ValNumber num, BoolCondition cond, CalcExpr cExpr, List<StmtsBlockStmts> stmts, ParserRuleContext ctx) {
        this.num = num;
        this.cond = cond;
        this.cExpr = cExpr;
        this.stmts = stmts;
        this.ctx = ctx;
    }

    public ForStmt(BlockStmtsDcl dcl, BoolCondition cond, CalcExpr cExpr, List<StmtsBlockStmts> stmts, ParserRuleContext ctx) {
        this.dcl = dcl;
        this.cond = cond;
        this.cExpr = cExpr;
        this.stmts = stmts;
        this.ctx = ctx;
    }
}
