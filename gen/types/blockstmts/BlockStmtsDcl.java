package types.blockstmts;

import types.stmts.StmtsBlockStmts;

public class BlockStmtsDcl extends StmtsBlockStmts {
    String type;
    String identifier;
    boolean isArray;
    //value


    @Override
    public String toString() {
        return "BlockStmtsDcl{" +
                "type='" + type + '\'' +
                '}';
    }
}
