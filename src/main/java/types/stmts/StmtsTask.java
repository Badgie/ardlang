package types.stmts;

import types.Type;
import util.SourceContext;

import java.util.List;

public class StmtsTask extends Stmts {
    String identifier;
    int interval;
    List<StmtsBlockStmts> stmts;
    SourceContext ctx;
    Type type;

    public StmtsTask(String identifier, int interval, List<StmtsBlockStmts> stmts, SourceContext ctx) {
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

    public SourceContext getCtx() {
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
