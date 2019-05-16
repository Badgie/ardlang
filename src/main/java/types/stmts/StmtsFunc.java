package types.stmts;

import types.AST;
import types.Param;

import java.util.List;

public class StmtsFunc extends Stmts {
    String identifier;
    List<Param> params;
    List<StmtsBlockStmts> stmts;

    public StmtsFunc(String identifier, List<Param> params, List<StmtsBlockStmts> stmts) {
        this.identifier = identifier;
        this.params = params;
        this.stmts = stmts;
    }

    @Override
    public String toString() {
        return "StmtsFunc{" +
                "identifier='" + identifier + '\'' +
                '}';
    }
}
