package types.stmts;

import org.antlr.v4.runtime.ParserRuleContext;
import types.AST;
import types.Type;

import java.util.List;

public class StmtsTask extends Stmts {
    String identifier;
    int interval;
    List<StmtsBlockStmts> stmts;
    ParserRuleContext ctx;
    Type type;

    public StmtsTask(String identifier, int interval, List<StmtsBlockStmts> stmts, ParserRuleContext ctx) {
        this.type = new Type.TypeTask();
        this.identifier = identifier;
        this.interval = interval;
        this.stmts = stmts;
        this.ctx = ctx;
    }

    public String getIdentifier() {
        return identifier;
    }

    public int getInterval() {
        return interval;
    }

    public List<StmtsBlockStmts> getStmts() {
        return stmts;
    }

    public ParserRuleContext getCtx() {
        return ctx;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "StmtsTask{" +
                "identifier='" + identifier + '\'' +
                '}';
    }
}
