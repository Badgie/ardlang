package visitor;

import types.*;
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

public class ScopeCheck extends ASTVisitor {
    @Override
    public void visit(Prog node) {

    }

    @Override
    public void visit(Stmts node) {

    }

    @Override
    public void visit(StmtsTask node) {

    }

    @Override
    public void visit(StmtsFunc node) {

    }

    @Override
    public void visit(StmtsBlockStmts node) {

    }

    @Override
    public void visit(BlockStmtsDcl node) {

    }

    @Override
    public void visit(BlockStmtsExpr node) {

    }

    @Override
    public void visit(BlockStmtsStmt node) {

    }

    @Override
    public void visit(IfStmt node) {

    }

    @Override
    public void visit(EifStmt node) {

    }

    @Override
    public void visit(ForStmt node) {

    }

    @Override
    public void visit(FuncStmt node) {

    }

    @Override
    public void visit(AssignExpr node) {

    }

    @Override
    public void visit(BoolExpr node) {

    }

    @Override
    public void visit(CalcExpr node) {

    }

    @Override
    public void visit(BoolCondition node) {

    }

    @Override
    public void visit(Param node) {

    }

    @Override
    public void visit(Val node) {

    }

    @Override
    public void visit(ValBool node) {

    }

    @Override
    public void visit(ValFunc node) {

    }

    @Override
    public void visit(ValIdent node) {

    }

    @Override
    public void visit(ValLiteral node) {

    }

    @Override
    public void visit(ValString node) {

    }

    @Override
    public void visit(ValNumber node) {

    }

    @Override
    public void visit(NumberIval node) {

    }

    @Override
    public void visit(NumberFval node) {

    }

    @Override
    public void visit(NumberArrayIndex node) {

    }

    @Override
    public void visit(Operator node) {

    }

    @Override
    public void visit(Operator.Decr node) {

    }

    @Override
    public void visit(Operator.Incr node) {

    }

    @Override
    public void visit(Operator.Assign node) {

    }

    @Override
    public void visit(Operator.GreaterEqual node) {

    }

    @Override
    public void visit(Operator.Not node) {

    }

    @Override
    public void visit(Operator.Div node) {

    }

    @Override
    public void visit(Operator.Mult node) {

    }

    @Override
    public void visit(Operator.LesserEqual node) {

    }

    @Override
    public void visit(Operator.Greater node) {

    }

    @Override
    public void visit(Operator.Sub node) {

    }

    @Override
    public void visit(Operator.Mod node) {

    }

    @Override
    public void visit(Operator.And node) {

    }

    @Override
    public void visit(Operator.Or node) {

    }

    @Override
    public void visit(Operator.Add node) {

    }

    @Override
    public void visit(Operator.Lesser node) {

    }

    @Override
    public void visit(Operator.Xor node) {

    }

    @Override
    public void visit(Operator.Equal node) {

    }

    @Override
    public void visit(Type node) {

    }

    @Override
    public void visit(Type.TypeInt node) {

    }

    @Override
    public void visit(Type.TypeString node) {

    }

    @Override
    public void visit(Type.TypeDouble node) {

    }

    @Override
    public void visit(Type.TypeBool node) {

    }

    @Override
    public void visit(AST node) {
        super.visit(node);
    }
}
