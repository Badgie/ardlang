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

import java.util.ArrayList;

public class ScopeCheck extends ASTVisitor {
    private final SymbolTable symbolTable = new SymbolTable(new ArrayList<>());

    public void check(AST node) {
        visit(node);
    }

    @Override
    public void visit(Prog node) {
        symbolTable.enterScope(node);
        for (Stmts s : node.getStmts()) {
            visit(s);
        }
        symbolTable.exitScope();
    }

    @Override
    public void visit(Stmts node) {
        super.visit((AST) node);
    }

    @Override
    public void visit(StmtsTask node) {
        symbolTable.enterScope(node);
        symbolTable.checkDeclaration(node.getIdentifier(), node.getType());
        for (StmtsBlockStmts s : node.getStmts()) {
            visit(s);
        }
        symbolTable.exitScope();
    }

    @Override
    public void visit(StmtsFunc node) {
        symbolTable.enterScope(node);
        symbolTable.checkDeclaration(node.getIdentifier(), node.getType());
        for (StmtsBlockStmts s : node.getStmts()) {
            visit(s);
        }
        symbolTable.exitScope();
    }

    @Override
    public void visit(StmtsBlockStmts node) {
        super.visit((AST) node);
    }

    @Override
    public void visit(BlockStmtsDcl node) {
        symbolTable.checkDeclaration(node.getIdentifier(), node.getType());
    }

    @Override
    public void visit(BlockStmtsExpr node) {
        super.visit((AST) node);
    }

    @Override
    public void visit(BlockStmtsStmt node) {
        super.visit((AST) node);
    }

    @Override
    public void visit(IfStmt node) {
        symbolTable.enterScope(node);
        for (StmtsBlockStmts s : node.getStmts()) {
            visit(s);
        }
        for (EifStmt e : node.getEifStmts()) {
            visit(e);
        }
        symbolTable.exitScope();
    }

    @Override
    public void visit(EifStmt node) {
        symbolTable.enterScope(node);
        for (StmtsBlockStmts s : node.getStmts()) {
            visit(s);
        }
        symbolTable.exitScope();
    }

    @Override
    public void visit(ForStmt node) {
        symbolTable.enterScope(node);
        if (node.getDcl() != null) {
            symbolTable.checkDeclaration(
                    node.getDcl().getIdentifier(),
                    node.getDcl().getType()
            );
        }
        for (StmtsBlockStmts s : node.getStmts()) {
            visit(s);
        }
        symbolTable.exitScope();
    }

    @Override
    public void visit(FuncStmt node) {
        //do nothing
    }

    @Override
    public void visit(AssignExpr node) {
        //do nothing
    }

    @Override
    public void visit(BoolExpr node) {
        //do nothing
    }

    @Override
    public void visit(CalcExpr node) {
        //do nothing
    }

    @Override
    public void visit(BoolCondition node) {
        //do nothing
    }

    @Override
    public void visit(Param node) {
        //do nothing
    }

    @Override
    public void visit(Val node) {
        //do nothing
    }

    @Override
    public void visit(ValBool node) {
        //do nothing
    }

    @Override
    public void visit(ValFunc node) {
        //do nothing
    }

    @Override
    public void visit(ValIdent node) {
        //do nothing
    }

    @Override
    public void visit(ValLiteral node) {
        //do nothing
    }

    @Override
    public void visit(ValString node) {
        //do nothing
    }

    @Override
    public void visit(ValNumber node) {
        //do nothing
    }

    @Override
    public void visit(NumberIval node) {
        //do nothing
    }

    @Override
    public void visit(NumberFval node) {
        //do nothing
    }

    @Override
    public void visit(NumberArrayIndex node) {
        //do nothing
    }

    @Override
    public void visit(Operator node) {
        //do nothing
    }

    @Override
    public void visit(Operator.Decr node) {
        //do nothing
    }

    @Override
    public void visit(Operator.Incr node) {
        //do nothing
    }

    @Override
    public void visit(Operator.Assign node) {
        //do nothing
    }

    @Override
    public void visit(Operator.GreaterEqual node) {
        //do nothing
    }

    @Override
    public void visit(Operator.Not node) {
        //do nothing
    }

    @Override
    public void visit(Operator.Div node) {
        //do nothing
    }

    @Override
    public void visit(Operator.Mult node) {
        //do nothing
    }

    @Override
    public void visit(Operator.LesserEqual node) {
        //do nothing
    }

    @Override
    public void visit(Operator.Greater node) {
        //do nothing
    }

    @Override
    public void visit(Operator.Sub node) {
        //do nothing
    }

    @Override
    public void visit(Operator.Mod node) {
        //do nothing
    }

    @Override
    public void visit(Operator.And node) {
        //do nothing
    }

    @Override
    public void visit(Operator.Or node) {
        //do nothing
    }

    @Override
    public void visit(Operator.Add node) {
        //do nothing
    }

    @Override
    public void visit(Operator.Lesser node) {
        //do nothing
    }

    @Override
    public void visit(Operator.Xor node) {
        //do nothing
    }

    @Override
    public void visit(Operator.Equal node) {
        //do nothing
    }

    @Override
    public void visit(Type node) {
        //do nothing
    }

    @Override
    public void visit(Type.TypeInt node) {
        //do nothing
    }

    @Override
    public void visit(Type.TypeString node) {
        //do nothing
    }

    @Override
    public void visit(Type.TypeDouble node) {
        //do nothing
    }

    @Override
    public void visit(Type.TypeBool node) {
        //do nothing
    }

    @Override
    public void visit(AST node) {
        super.visit(node);
    }
}
