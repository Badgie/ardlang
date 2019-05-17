package types.prettyprint;

import dk.aau.cs.sw411.antlr.TaskuinoBaseVisitor;
import dk.aau.cs.sw411.antlr.TaskuinoParser;
import types.AST;
import types.BoolCondition;
import types.Param;
import types.Prog;
import types.blockstmts.BlockStmtsDcl;
import types.blockstmts.BlockStmtsExpr;
import types.blockstmts.BlockStmtsStmt;
import types.expr.AssignExpr;
import types.expr.BoolExpr;
import types.expr.CalcExpr;
import types.operator.Operator;
import types.stmt.EifStmt;
import types.stmt.ForStmt;
import types.stmt.FuncStmt;
import types.stmt.IfStmt;
import types.stmts.Stmts;
import types.stmts.StmtsBlockStmts;
import types.stmts.StmtsFunc;
import types.stmts.StmtsTask;
import types.value.*;
import visitor.ASTVisitor;

public class PrettyPrint extends ASTVisitor<AST> {
    private StringBuilder string = new StringBuilder();

    public void print(AST ast) {

    }

    @Override
    public AST visit(Prog node) {

        return null;
    }

    @Override
    public AST visit(Stmts node) {
        return null;
    }

    @Override
    public AST visit(StmtsTask node) {
        return null;
    }

    @Override
    public AST visit(StmtsFunc node) {
        return null;
    }

    @Override
    public AST visit(StmtsBlockStmts node) {
        return null;
    }

    @Override
    public AST visit(BlockStmtsDcl node) {
        return null;
    }

    @Override
    public AST visit(BlockStmtsExpr node) {
        return null;
    }

    @Override
    public AST visit(BlockStmtsStmt node) {
        return null;
    }

    @Override
    public AST visit(IfStmt node) {
        return null;
    }

    @Override
    public AST visit(EifStmt node) {
        return null;
    }

    @Override
    public AST visit(ForStmt node) {
        return null;
    }

    @Override
    public AST visit(FuncStmt node) {
        return null;
    }

    @Override
    public AST visit(AssignExpr node) {
        return null;
    }

    @Override
    public AST visit(BoolExpr node) {
        return null;
    }

    @Override
    public AST visit(CalcExpr node) {
        return null;
    }

    @Override
    public AST visit(BoolCondition node) {
        return null;
    }

    @Override
    public AST visit(Param node) {
        return null;
    }

    @Override
    public AST visit(Val node) {
        return null;
    }

    @Override
    public AST visit(ValBool node) {
        return null;
    }

    @Override
    public AST visit(ValFunc node) {
        return null;
    }

    @Override
    public AST visit(ValIdent node) {
        return null;
    }

    @Override
    public AST visit(ValLiteral node) {
        return null;
    }

    @Override
    public AST visit(ValString node) {
        return null;
    }

    @Override
    public AST visit(ValNumber node) {
        return null;
    }

    @Override
    public AST visit(NumberIval node) {
        return null;
    }

    @Override
    public AST visit(NumberFval node) {
        return null;
    }

    @Override
    public AST visit(NumberArrayIndex node) {
        return null;
    }

    @Override
    public AST visit(Operator node) {
        return null;
    }

    @Override
    public AST visit(Operator.Decr node) {
        return null;
    }

    @Override
    public AST visit(Operator.Incr node) {
        return null;
    }

    @Override
    public AST visit(Operator.Assign node) {
        return null;
    }

    @Override
    public AST visit(Operator.GreaterEqual node) {
        return null;
    }

    @Override
    public AST visit(Operator.Not node) {
        return null;
    }

    @Override
    public AST visit(Operator.Div node) {
        return null;
    }

    @Override
    public AST visit(Operator.Mult node) {
        return null;
    }

    @Override
    public AST visit(Operator.LesserEqual node) {
        return null;
    }

    @Override
    public AST visit(Operator.Greater node) {
        return null;
    }

    @Override
    public AST visit(Operator.Sub node) {
        return null;
    }

    @Override
    public AST visit(Operator.Mod node) {
        return null;
    }

    @Override
    public AST visit(Operator.And node) {
        return null;
    }

    @Override
    public AST visit(Operator.Or node) {
        return null;
    }

    @Override
    public AST visit(Operator.Add node) {
        return null;
    }

    @Override
    public AST visit(Operator.Lesser node) {
        return null;
    }

    @Override
    public AST visit(Operator.Xor node) {
        return null;
    }

    @Override
    public AST visit(Operator.Equal node) {
        return null;
    }
}
