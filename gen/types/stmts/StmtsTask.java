package types.stmts;

import types.AST;

import java.util.List;

public class StmtsTask extends Stmts {
    String identifier;
    int interval;
    List<Stmts> stmts;

    public StmtsTask(String identifier, int interval, List<Stmts> stmts) {
        this.identifier = identifier;
        this.interval = interval;
        this.stmts = stmts;
    }
}
