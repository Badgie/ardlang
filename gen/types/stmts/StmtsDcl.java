package types.stmts;

import types.AST;

public class StmtsDcl extends Stmts {
    String type;
    String identifier;
    boolean isArray;
    //value


    @Override
    public String toString() {
        return "StmtsDcl{" +
                "type='" + type + '\'' +
                '}';
    }
}
