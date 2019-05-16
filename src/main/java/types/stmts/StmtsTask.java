package types.stmts;

import types.AST;

import java.util.List;

public class StmtsTask extends Stmts {
    String identifier;
    int interval;
    List<StmtsBlockStmts> stmts;

    public StmtsTask(String identifier, int interval, List<StmtsBlockStmts> stmts) {
        this.identifier = identifier;
        this.interval = interval;
        this.stmts = stmts;
    }

    @Override
    public String toString() {
        return "StmtsTask{" +
                "identifier='" + identifier + '\'' +
                '}';
    }
}
