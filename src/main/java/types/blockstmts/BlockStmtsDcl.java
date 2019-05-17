package types.blockstmts;

import dk.aau.cs.sw411.antlr.TaskuinoParser;
import org.antlr.v4.runtime.ParserRuleContext;
import types.Param;
import types.Type;
import types.expr.CalcExpr;
import types.stmt.FuncStmt;
import types.stmts.StmtsBlockStmts;
import types.value.NumberIval;
import types.value.Val;

import java.util.List;

public class BlockStmtsDcl extends StmtsBlockStmts {
    Type type;
    String identifier;
    boolean isArray;
    Val value;
    CalcExpr cExpr;
    FuncStmt fStmt;
    List<Param> params;
    int arraySize;
    ParserRuleContext ctx;

    public BlockStmtsDcl(Type type, String identifier, ParserRuleContext ctx) {
        this.type = type;
        this.identifier = identifier;
        this.ctx = ctx;
    }

    public BlockStmtsDcl(Type type, String identifier, Val value, ParserRuleContext ctx) {
        this.type = type;
        this.identifier = identifier;
        this.value = value;
        this.ctx = ctx;
    }

    public BlockStmtsDcl(Type type, String identifier, CalcExpr cExpr, ParserRuleContext ctx) {
        this.type = type;
        this.identifier = identifier;
        this.cExpr = cExpr;
        this.ctx = ctx;
    }

    public BlockStmtsDcl(Type type, String identifier, FuncStmt fStmt, ParserRuleContext ctx) {
        this.type = type;
        this.identifier = identifier;
        this.fStmt = fStmt;
        this.ctx = ctx;
    }

    public BlockStmtsDcl(Type type, String identifier, boolean isArray, int arraySize, ParserRuleContext ctx) {
        this.type = type;
        this.identifier = identifier;
        this.isArray = isArray;
        this.arraySize = arraySize;
        this.ctx = ctx;
    }

    public BlockStmtsDcl(Type type, String identifier, List<Param> params, int arraySize, ParserRuleContext ctx) {
        this.type = type;
        this.identifier = identifier;
        this.isArray = true;
        this.params = params;
        this.arraySize = arraySize;
        this.ctx = ctx;
    }

    public BlockStmtsDcl(Type type, String identifier, List<Param> params, ParserRuleContext ctx) {
        this.type = type;
        this.identifier = identifier;
        this.params = params;
        this.ctx = ctx;
    }

    public Type getType() {
        return type;
    }

    public String getIdentifier() {
        return identifier;
    }

    public boolean isArray() {
        return isArray;
    }

    public Val getValue() {
        return value;
    }

    public CalcExpr getcExpr() {
        return cExpr;
    }

    public FuncStmt getfStmt() {
        return fStmt;
    }

    public List<Param> getParams() {
        return params;
    }

    public int getArraySize() {
        return arraySize;
    }

    public ParserRuleContext getCtx() {
        return ctx;
    }

    @Override
    public String toString() {
        return "BlockStmtsDcl{" +
                "type='" + type + '\'' +
                '}';
    }
}
