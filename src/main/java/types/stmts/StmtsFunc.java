package types.stmts;

import org.antlr.v4.runtime.ParserRuleContext;
import types.AST;
import types.Param;

import java.util.List;

public class StmtsFunc extends Stmts {
    String identifier;
    List<Param> params;
    List<StmtsBlockStmts> stmts;
    ParserRuleContext ctx;

    public StmtsFunc(String identifier, List<Param> params, List<StmtsBlockStmts> stmts, ParserRuleContext ctx) {
        this.identifier = identifier;
        this.params = params;
        this.stmts = stmts;
        this.ctx = ctx;
    }

    @Override
    public String toString() {
        return "StmtsFunc{" +
                "identifier='" + identifier + '\'' +
                '}';
    }
}
