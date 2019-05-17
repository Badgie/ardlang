package visitor;

import dk.aau.cs.sw411.antlr.TaskuinoBaseVisitor;
import dk.aau.cs.sw411.antlr.TaskuinoParser;
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
import visitor.ASTVisitor;

public class PrettyPrint extends ASTVisitor<AST> {
    private StringBuilder string = new StringBuilder();

    public void print(AST ast) {
        visit(ast);
    }

    @Override
    public AST visit(Prog node) {
        for (Stmts s : node.getStmts()) {
            visit(s);
            string.append("\n");
        }
        return null;
    }

    @Override
    public AST visit(Stmts node) {
        visit((AST) node);
        return null;
    }

    @Override
    public AST visit(StmtsTask node) {
        string.append("task ")
                .append(node.getIdentifier())
                .append("(")
                .append(node.getInterval())
                .append(") {");
        for (StmtsBlockStmts s : node.getStmts()) {
            visit(s);
        }
        string.append("}");

        return null;
    }

    @Override
    public AST visit(StmtsFunc node) {
        string.append("func ")
                .append(node.getIdentifier())
                .append("(");
        for (Param p : node.getParams()) {
            visit(p);
        }
        string.append(") {");
        for (StmtsBlockStmts s : node.getStmts()) {
            visit(s);
        }
        string.append("}");
        return null;
    }

    @Override
    public AST visit(StmtsBlockStmts node) {
        visit((AST) node);
        return null;
    }

    @Override
    public AST visit(BlockStmtsDcl node) {
        visit(node.getType());
        if (!node.isArray()) {
            string.append(node.getIdentifier())
                    .append(" = ");
            if (node.getValue() != null) {
                string.append(node.getValue());
            } else if (node.getcExpr() != null) {
                visit(node.getcExpr());
            } else {
                visit(node.getfStmt());
            }
        } else {
            string.append("[")
                    .append(node.getArraySize())
                    .append("]")
                    .append(node.getIdentifier());
            if (node.getParams() != null) {
                string.append(" = ")
                        .append("{");
                for (Param p : node.getParams()) {
                    visit(p);
                }
                string.append("}");
            }
        }
        return null;
    }

    @Override
    public AST visit(BlockStmtsExpr node) {
        visit((AST) node);
        return null;
    }

    @Override
    public AST visit(BlockStmtsStmt node) {
        visit((AST) node);
        return null;
    }

    @Override
    public AST visit(IfStmt node) {
        string.append("if (");
        visit(node.getCondition());
        string.append(") {");
        for (StmtsBlockStmts s : node.getStmts()) {
            visit(s);
        }
        string.append("}");
        for (EifStmt e : node.getEifStmts()) {
            visit(e);
        }
        return null;
    }

    @Override
    public AST visit(EifStmt node) {
        if (node.getCondition() != null) {
            string.append("else if (");
            visit(node.getCondition());
            string.append(") {");
        } else {
            string.append("else {");
        }
        for (StmtsBlockStmts s : node.getStmts()) {
            visit(s);
        }
        string.append("}");
        return null;
    }

    @Override
    public AST visit(ForStmt node) {
        string.append("for (");
        if (node.getDcl() != null) {
            visit(node.getDcl());
        } else {
            visit(node.getNum());
        }
        string.append(";");
        visit(node.getCond());
        string.append(";");
        visit(node.getcExpr());
        string.append(") {");
        for (StmtsBlockStmts s : node.getStmts()) {
            visit(s);
        }
        string.append("}");
        return null;
    }

    @Override
    public AST visit(FuncStmt node) {
        string.append(node.getIdentifier())
                .append("(");
        if (node.getParams() != null) {
            for (Param p : node.getParams()) {
                visit(p);
            }
        }
        string.append(")");
        return null;
    }

    @Override
    public AST visit(AssignExpr node) {
        string.append(node.getIdentifier())
                .append(" = ");
        if (node.getfStmt() != null) {
            visit(node.getfStmt());
        } else if (node.getcExpr() != null) {
            visit(node.getcExpr());
        } else {
            visit(node.getValue());
        }
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

    @Override
    public AST visit(Type node) {
        return null;
    }

    @Override
    public AST visit(Type.TypeInt node) {
        return null;
    }

    @Override
    public AST visit(Type.TypeString node) {
        return null;
    }

    @Override
    public AST visit(Type.TypeDouble node) {
        return null;
    }

    @Override
    public AST visit(Type.TypeBool node) {
        return null;
    }

    @Override
    public AST visit(AST node) {
        return super.visit(node);
    }
}
