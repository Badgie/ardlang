package types.stmt;

import types.Param;
import types.blockstmts.BlockStmtsStmt;

import java.util.List;

public class FuncStmt extends BlockStmtsStmt {
    String identifier;
    List<Param> params;

    public FuncStmt(String identifier, List<Param> params) {
        this.identifier = identifier;
        this.params = params;
    }
}
