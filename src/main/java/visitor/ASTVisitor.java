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

public abstract class ASTVisitor {
    public abstract void visit(Prog node);
    public abstract void visit(Stmts node);
    public abstract void visit(StmtsTask node);
    public abstract void visit(StmtsFunc node);
    public abstract void visit(StmtsBlockStmts node);
    public abstract void visit(BlockStmtsDcl node);
    public abstract void visit(BlockStmtsExpr node);
    public abstract void visit(BlockStmtsStmt node);
    public abstract void visit(IfStmt node);
    public abstract void visit(EifStmt node);
    public abstract void visit(ForStmt node);
    public abstract void visit(FuncStmt node);
    public abstract void visit(AssignExpr node);
    public abstract void visit(BoolExpr node);
    public abstract void visit(CalcExpr node);
    public abstract void visit(BoolCondition node);
    public abstract void visit(Param node);
    public abstract void visit(Val node);
    public abstract void visit(ValBool node);
    public abstract void visit(ValFunc node);
    public abstract void visit(ValIdent node);
    public abstract void visit(ValLiteral node);
    public abstract void visit(ValString node);
    public abstract void visit(ValNumber node);
    public abstract void visit(NumberIval node);
    public abstract void visit(NumberFval node);
    public abstract void visit(NumberArrayIndex node);
    public abstract void visit(Operator node);
    public abstract void visit(Operator.Decr node);
    public abstract void visit(Operator.Incr node);
    public abstract void visit(Operator.Assign node);
    public abstract void visit(Operator.GreaterEqual node);
    public abstract void visit(Operator.Not node);
    public abstract void visit(Operator.Div node);
    public abstract void visit(Operator.Mult node);
    public abstract void visit(Operator.LesserEqual node);
    public abstract void visit(Operator.Greater node);
    public abstract void visit(Operator.Sub node);
    public abstract void visit(Operator.Mod node);
    public abstract void visit(Operator.And node);
    public abstract void visit(Operator.Or node);
    public abstract void visit(Operator.Add node);
    public abstract void visit(Operator.Lesser node);
    public abstract void visit(Operator.Xor node);
    public abstract void visit(Operator.Equal node);
    public abstract void visit(Type node);
    public abstract void visit(Type.TypeInt node);
    public abstract void visit(Type.TypeString node);
    public abstract void visit(Type.TypeDouble node);
    public abstract void visit(Type.TypeBool node);

    public void visit(AST node) {
        if (node instanceof Prog) {
            visit((Prog) node);
        } else if (node instanceof Stmts) {
            if (node instanceof StmtsTask) {
                visit((StmtsTask) node);
            } else if (node instanceof StmtsBlockStmts) {
                if (node instanceof BlockStmtsExpr) {
                    if (node instanceof BoolExpr) {
                        visit((BoolExpr) node);
                    } else if (node instanceof AssignExpr) {
                        visit((AssignExpr) node);
                    } else if (node instanceof CalcExpr) {
                        visit((CalcExpr) node);
                    } else {
                        throw new Error("node not recognized");
                    }
                } else if (node instanceof BlockStmtsDcl) {
                    visit((BlockStmtsDcl) node);
                } else if (node instanceof BlockStmtsStmt) {
                    if (node instanceof IfStmt) {
                        visit((IfStmt) node);
                    } else if (node instanceof FuncStmt) {
                        visit((FuncStmt) node);
                    } else if (node instanceof EifStmt) {
                        visit((EifStmt) node);
                    } else if (node instanceof ForStmt) {
                        visit((ForStmt) node);
                    } else {
                        throw new Error("node not recognized");
                    }
                } else {
                    throw new Error("node not recognized");
                }
            } else if (node instanceof StmtsFunc) {
                visit((StmtsFunc) node);
            } else {
                throw new Error("node not recognized");
            }
        } else if (node instanceof BoolCondition) {
            visit((BoolCondition) node);
        } else if (node instanceof Param) {
            visit((Param) node);
        } else if (node instanceof Operator) {
            if (node instanceof Operator.Decr) {
                visit((Operator.Decr) node);
            } else if (node instanceof Operator.Incr) {
                visit((Operator.Incr) node);
            } else if (node instanceof Operator.Assign) {
                visit((Operator.Assign) node);
            } else if (node instanceof Operator.GreaterEqual) {
                visit((Operator.GreaterEqual) node);
            } else if (node instanceof Operator.Not) {
                visit((Operator.Not) node);
            } else if (node instanceof Operator.Div) {
                visit((Operator.Div) node);
            } else if (node instanceof Operator.Mult) {
                visit((Operator.Mult) node);
            } else if (node instanceof Operator.LesserEqual) {
                visit((Operator.LesserEqual) node);
            } else if (node instanceof Operator.Greater) {
                visit((Operator.Greater) node);
            } else if (node instanceof Operator.Sub) {
                visit((Operator.Sub) node);
            } else if (node instanceof Operator.Mod) {
                visit((Operator.Mod) node);
            } else if (node instanceof Operator.And) {
                visit((Operator.And) node);
            } else if (node instanceof Operator.Or) {
                visit((Operator.Or) node);
            } else if (node instanceof Operator.Add) {
                visit((Operator.Add) node);
            } else if (node instanceof Operator.Lesser) {
                visit((Operator.Lesser) node);
            } else if (node instanceof Operator.Xor) {
                visit((Operator.Xor) node);
            } else if (node instanceof Operator.Equal) {
                visit((Operator.Equal) node);
            } else {
                throw new Error("node not recognized");
            }
        } else if (node instanceof Val) {
            if (node instanceof ValNumber) {
                if (node instanceof NumberFval) {
                    visit((NumberFval) node);
                } else if (node instanceof NumberIval) {
                    visit((NumberIval) node);
                } else if (node instanceof ValIdent) {
                    visit((ValIdent) node);
                } else if (node instanceof NumberArrayIndex) {
                    visit((NumberArrayIndex) node);
                } else {
                    throw new Error("node not recognized");
                }
            } else if (node instanceof ValString) {
                visit((ValString) node);
            } else if (node instanceof ValFunc) {
                visit((ValFunc) node);
            } else if (node instanceof ValLiteral) {
                visit((ValLiteral) node);
            } else if (node instanceof ValBool) {
                visit((ValBool) node);
            } else {
                throw new Error("node not recognized");
            }
        } else if (node instanceof Type) {
            if (node instanceof Type.TypeInt) {
                visit((Type.TypeInt) node);
            } else if (node instanceof Type.TypeString) {
                visit((Type.TypeString) node);
            } else if (node instanceof Type.TypeDouble) {
                visit((Type.TypeDouble) node);
            } else if (node instanceof Type.TypeBool) {
                visit((Type.TypeBool) node);
            } else {
                throw new Error("node not recognized");
            }
        } else {
            throw new Error("node not recognized");
        }
    }
}
