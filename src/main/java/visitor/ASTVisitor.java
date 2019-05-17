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

public abstract class ASTVisitor<T> {
    public abstract T visit(Prog node);
    public abstract T visit(Stmts node);
    public abstract T visit(StmtsTask node);
    public abstract T visit(StmtsFunc node);
    public abstract T visit(StmtsBlockStmts node);
    public abstract T visit(BlockStmtsDcl node);
    public abstract T visit(BlockStmtsExpr node);
    public abstract T visit(BlockStmtsStmt node);
    public abstract T visit(IfStmt node);
    public abstract T visit(EifStmt node);
    public abstract T visit(ForStmt node);
    public abstract T visit(FuncStmt node);
    public abstract T visit(AssignExpr node);
    public abstract T visit(BoolExpr node);
    public abstract T visit(CalcExpr node);
    public abstract T visit(BoolCondition node);
    public abstract T visit(Param node);
    public abstract T visit(Val node);
    public abstract T visit(ValBool node);
    public abstract T visit(ValFunc node);
    public abstract T visit(ValIdent node);
    public abstract T visit(ValLiteral node);
    public abstract T visit(ValString node);
    public abstract T visit(ValNumber node);
    public abstract T visit(NumberIval node);
    public abstract T visit(NumberFval node);
    public abstract T visit(NumberArrayIndex node);
    public abstract T visit(Operator node);
    public abstract T visit(Operator.Decr node);
    public abstract T visit(Operator.Incr node);
    public abstract T visit(Operator.Assign node);
    public abstract T visit(Operator.GreaterEqual node);
    public abstract T visit(Operator.Not node);
    public abstract T visit(Operator.Div node);
    public abstract T visit(Operator.Mult node);
    public abstract T visit(Operator.LesserEqual node);
    public abstract T visit(Operator.Greater node);
    public abstract T visit(Operator.Sub node);
    public abstract T visit(Operator.Mod node);
    public abstract T visit(Operator.And node);
    public abstract T visit(Operator.Or node);
    public abstract T visit(Operator.Add node);
    public abstract T visit(Operator.Lesser node);
    public abstract T visit(Operator.Xor node);
    public abstract T visit(Operator.Equal node);
    public abstract T visit(Type node);
    public abstract T visit(Type.TypeInt node);
    public abstract T visit(Type.TypeString node);
    public abstract T visit(Type.TypeDouble node);
    public abstract T visit(Type.TypeBool node);

    public T visit(AST node) {
        if (node instanceof Prog) {
            return visit((Prog) node);
        } else if (node instanceof Stmts) {
            if (node instanceof StmtsTask) {
                return visit((StmtsTask) node);
            } else if (node instanceof StmtsBlockStmts) {
                if (node instanceof BlockStmtsExpr) {
                    if (node instanceof BoolExpr) {
                        return visit((BoolExpr) node);
                    } else if (node instanceof AssignExpr) {
                        return visit((AssignExpr) node);
                    } else if (node instanceof CalcExpr) {
                        return visit((CalcExpr) node);
                    } else {
                        throw new Error("node not recognized");
                    }
                } else if (node instanceof BlockStmtsDcl) {
                    return visit((BlockStmtsDcl) node);
                } else if (node instanceof BlockStmtsStmt) {
                    if (node instanceof IfStmt) {
                        return visit((IfStmt) node);
                    } else if (node instanceof FuncStmt) {
                        return visit((FuncStmt) node);
                    } else if (node instanceof EifStmt) {
                        return visit((EifStmt) node);
                    } else if (node instanceof ForStmt) {
                        return visit((ForStmt) node);
                    } else {
                        throw new Error("node not recognized");
                    }
                } else {
                    throw new Error("node not recognized");
                }
            } else if (node instanceof StmtsFunc) {
                return visit((StmtsFunc) node);
            } else {
                throw new Error("node not recognized");
            }
        } else if (node instanceof BoolCondition) {
            return visit((BoolCondition) node);
        } else if (node instanceof Param) {
            return visit((Param) node);
        } else if (node instanceof Operator) {
            if (node instanceof Operator.Decr) {
                return visit((Operator.Decr) node);
            } else if (node instanceof Operator.Incr) {
                return visit((Operator.Incr) node);
            } else if (node instanceof Operator.Assign) {
                return visit((Operator.Assign) node);
            } else if (node instanceof Operator.GreaterEqual) {
                return visit((Operator.GreaterEqual) node);
            } else if (node instanceof Operator.Not) {
                return visit((Operator.Not) node);
            } else if (node instanceof Operator.Div) {
                return visit((Operator.Div) node);
            } else if (node instanceof Operator.Mult) {
                return visit((Operator.Mult) node);
            } else if (node instanceof Operator.LesserEqual) {
                return visit((Operator.LesserEqual) node);
            } else if (node instanceof Operator.Greater) {
                return visit((Operator.Greater) node);
            } else if (node instanceof Operator.Sub) {
                return visit((Operator.Sub) node);
            } else if (node instanceof Operator.Mod) {
                return visit((Operator.Mod) node);
            } else if (node instanceof Operator.And) {
                return visit((Operator.And) node);
            } else if (node instanceof Operator.Or) {
                return visit((Operator.Or) node);
            } else if (node instanceof Operator.Add) {
                return visit((Operator.Add) node);
            } else if (node instanceof Operator.Lesser) {
                return visit((Operator.Lesser) node);
            } else if (node instanceof Operator.Xor) {
                return visit((Operator.Xor) node);
            } else if (node instanceof Operator.Equal) {
                return visit((Operator.Equal) node);
            } else {
                throw new Error("node not recognized");
            }
        } else if (node instanceof Val) {
            if (node instanceof ValNumber) {
                if (node instanceof NumberFval) {
                    return visit((NumberFval) node);
                } else if (node instanceof NumberIval) {
                    return visit((NumberIval) node);
                } else if (node instanceof ValIdent) {
                    return visit((ValIdent) node);
                } else if (node instanceof NumberArrayIndex) {
                    return visit((NumberArrayIndex) node);
                } else {
                    throw new Error("node not recognized");
                }
            } else if (node instanceof ValString) {
                return visit((ValString) node);
            } else if (node instanceof ValFunc) {
                return visit((ValFunc) node);
            } else if (node instanceof ValLiteral) {
                return visit((ValLiteral) node);
            } else if (node instanceof ValBool) {
                return visit((ValBool) node);
            } else {
                throw new Error("node not recognized");
            }
        } else if (node instanceof Type) {
            if (node instanceof Type.TypeInt) {
                return visit((Type.TypeInt) node);
            } else if (node instanceof Type.TypeString) {
                return visit((Type.TypeString) node);
            } else if (node instanceof Type.TypeDouble) {
                return visit((Type.TypeDouble) node);
            } else if (node instanceof Type.TypeBool) {
                return visit((Type.TypeBool) node);
            } else {
                throw new Error("node not recognized");
            }
        } else {
            throw new Error("node not recognized");
        }
    }
}
