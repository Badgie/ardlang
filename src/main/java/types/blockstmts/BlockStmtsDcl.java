package types.blockstmts;

import types.Param;
import types.expr.CalcExpr;
import types.stmt.FuncStmt;
import types.stmts.StmtsBlockStmts;
import types.value.NumberIval;
import types.value.Val;

import java.util.List;

public class BlockStmtsDcl extends StmtsBlockStmts {
    String type;
    String identifier;
    boolean isArray;
    Val value;
    CalcExpr cExpr;
    FuncStmt fStmt;
    List<Param> params;
    int arraySize;

    public BlockStmtsDcl(String type, String identifier) {
        this.type = type;
        this.identifier = identifier;
    }

    public BlockStmtsDcl(String type, String identifier, Val value) {
        this.type = type;
        this.identifier = identifier;
        this.value = value;
    }

    public BlockStmtsDcl(String type, String identifier, CalcExpr cExpr) {
        this.type = type;
        this.identifier = identifier;
        this.cExpr = cExpr;
    }

    public BlockStmtsDcl(String type, String identifier, FuncStmt fStmt) {
        this.type = type;
        this.identifier = identifier;
        this.fStmt = fStmt;
    }

    public BlockStmtsDcl(String type, String identifier, boolean isArray, int arraySize) {
        this.type = type;
        this.identifier = identifier;
        this.isArray = isArray;
        this.arraySize = arraySize;
    }

    public BlockStmtsDcl(String type, String identifier, List<Param> params, int arraySize) {
        this.type = type;
        this.identifier = identifier;
        this.isArray = true;
        this.params = params;
        this.arraySize = arraySize;
    }

    public BlockStmtsDcl(String type, String identifier, List<Param> params) {
        this.type = type;
        this.identifier = identifier;
        this.params = params;
    }

    @Override
    public String toString() {
        return "BlockStmtsDcl{" +
                "type='" + type + '\'' +
                '}';
    }
}
