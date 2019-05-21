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

public class TypeCheck extends ASTVisitor {

    public void check(AST node) {
        visit(node);
    }

    @Override
    public void visit(Prog node) {
        for (Stmts s : node.getStmts()) {
            visit(s);
        }
    }

    @Override
    public void visit(Stmts node) {
        super.visit((AST) node);
    }

    @Override
    public void visit(StmtsTask node) {
        for (StmtsBlockStmts s : node.getStmts()) {
            visit(s);
        }
    }

    @Override
    public void visit(StmtsFunc node) {
        for (StmtsBlockStmts s : node.getStmts()) {
            visit(s);
        }
    }

    @Override
    public void visit(StmtsBlockStmts node) {
        super.visit((AST) node);
    }

    @Override
    public void visit(BlockStmtsDcl node) {
        if (node.isArray()) {
            for (Param p : node.getParams()) {
                checkType(node.getType(), p.getValue());
            }
        } else {
            checkType(node.getType(), node.getValue());
        }
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
        for (StmtsBlockStmts s : node.getStmts()) {
            visit(s);
        }
        for (EifStmt e : node.getEifStmts()) {
            visit(e);
        }
    }

    @Override
    public void visit(EifStmt node) {
        for (StmtsBlockStmts s : node.getStmts()) {
            visit(s);
        }
    }

    @Override
    public void visit(ForStmt node) {
        if (node.getDcl() != null) {
            visit(node.getDcl());
        }
        for (StmtsBlockStmts s : node.getStmts()) {
            visit(s);
        }
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
        //each operand is a number, if not it is caught in AST construction
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
        super.visit((AST) node);
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
    public void visit(Type.TypeVoid node) {
        //do nothing
    }

    @Override
    public void visit(AST node) {
        super.visit(node);
    }

    private void checkType(Type type, Val value) {
        if (type instanceof Type.TypeInt) {
            if (value instanceof NumberIval) {
                System.out.println("Type integer has integer value");
            } else {
                throw new Error("Type integer has incorrect value");
            }
        } else if (type instanceof Type.TypeString) {
            if (value instanceof ValString) {
                System.out.println("Type string has string value");
            } else {
                throw new Error("Type string has incorrect value");
            }
        } else if (type instanceof Type.TypeBool) {
            if (value instanceof ValBool) {
                System.out.println("Type boolean has bool value");
            } else {
                throw new Error("Type boolean has incorrect value");
            }
        } else if (type instanceof Type.TypeDouble) {
            if (value instanceof NumberIval || value instanceof NumberFval) {
                System.out.println("Type double has floating-point value");
            } else {
                throw new Error("Type double has incorrect value");
            }
        } else {
            throw new Error("type not recognized");
        }
    }
}
