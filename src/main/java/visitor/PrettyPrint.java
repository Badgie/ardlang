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

public class PrettyPrint extends ASTVisitor {
    private StringBuilder string = new StringBuilder();

    public void print(AST ast) {
        visit(ast);
        System.out.println(string);
    }

    @Override
    public void visit(Prog node) {
        for (Stmts s : node.getStmts()) {
            visit(s);
            string.append("\n");
        }
    }

    @Override
    public void visit(Stmts node) {
        visit((AST) node);
    }

    @Override
    public void visit(StmtsTask node) {
        string.append("task ")
                .append(node.getIdentifier())
                .append("(")
                .append(node.getInterval())
                .append(") {");
        for (StmtsBlockStmts s : node.getStmts()) {
            visit(s);
        }
        string.append("}");

    }

    @Override
    public void visit(StmtsFunc node) {
        string.append("func ")
                .append(node.getIdentifier())
                .append("(");
        for (Param p : node.getParams()) {
            visit(p);
            string.append(",");
        }
        if (string.charAt(string.length() - 1) == ',') {
            string.deleteCharAt(string.length() - 1);
        }
        string.append(") {");
        for (StmtsBlockStmts s : node.getStmts()) {
            visit(s);
        }
        string.append("}");
    }

    @Override
    public void visit(StmtsBlockStmts node) {
        visit((AST) node);
    }

    @Override
    public void visit(BlockStmtsDcl node) {
        visit(node.getType());
        if (!node.isArray()) {
            string.append(node.getIdentifier())
                    .append(" = ");
            if (node.getValue() != null) {
                visit(node.getValue());
            } else if (node.getcExpr() != null) {
                visit(node.getcExpr());
            } else if (node.getfStmt() != null) {
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
                    string.append(",");
                }
                if (string.charAt(string.length() - 1) == ',') {
                    string.deleteCharAt(string.length() - 1);
                }
                string.append("}");
            }
        }
    }

    @Override
    public void visit(BlockStmtsExpr node) {
        visit((AST) node);
    }

    @Override
    public void visit(BlockStmtsStmt node) {
        visit((AST) node);
    }

    @Override
    public void visit(IfStmt node) {
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
    }

    @Override
    public void visit(EifStmt node) {
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
    }

    @Override
    public void visit(ForStmt node) {
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
    }

    @Override
    public void visit(FuncStmt node) {
        string.append(node.getIdentifier());
        string.append("(");
        if (node.getParams() != null) {
            for (Param p : node.getParams()) {
                visit(p);
                string.append(",");
            }
            // delete last comma separator
            if (string.charAt(string.length() - 1) == ',') {
                string.deleteCharAt(string.length() - 1);
            }
        }
        string.append(")");
    }

    @Override
    public void visit(AssignExpr node) {
        string.append(node.getIdentifier())
                .append(" = ");
        if (node.getfStmt() != null) {
            visit(node.getfStmt());
        } else if (node.getcExpr() != null) {
            visit(node.getcExpr());
        } else {
            visit(node.getValue());
        }
    }

    @Override
    public void visit(BoolExpr node) {
        if (node.getLeftBool() != null || node.getBool() != null) {
            if (node.getOp() != null) {
                visit(node.getLeftBool());
                visit(node.getOp());
                visit(node.getRightBoolExpr());
            } else {
                if (node.getNegation() != null) {
                    string.append("!");
                }
                visit(node.getBool());
            }
        } else {
            visit(node.getLeftVal());
            visit(node.getOp());
            visit(node.getRightVal());
        }
    }

    @Override
    public void visit(CalcExpr node) {
        if (node.getOp() instanceof Operator.Incr ||
                node.getOp() instanceof Operator.Decr) {
            visit(node.getNum());
            visit(node.getOp());
        } else if (node.getIdentifier() != null) {
            string.append(node.getIdentifier());
            visit(node.getOp());
            string.append("= ");
            visit(node.getNum());
        } else {
            visit(node.getNum());
            if (node.getOp() != null) {
                visit(node.getOp());
                if (node.getExpr() != null) {
                    visit(node.getExpr());
                } else {
                    visit(node.getNumRight());
                }
            }
        }
    }

    @Override
    public void visit(BoolCondition node) {
        if (node.getBoolExpr() != null) {
            visit(node.getBoolExpr());
        } else {
            visit(node.getFuncStmt());
        }
    }

    @Override
    public void visit(Param node) {
        string.append(node.getValue());
    }

    @Override
    public void visit(Val node) {
        super.visit((AST) node);
    }

    @Override
    public void visit(ValBool node) {
        if (node.getIdentifier() != null) {
            string.append(node.getIdentifier());
        } else {
            if (node.isValue()) {
                string.append("true");
            } else {
                string.append("false");
            }
        }
    }

    @Override
    public void visit(ValFunc node) {
        string.append(node.getIdentifier())
                .append("(");
        if (node.getParams() != null) {
            for (Param p : node.getParams()) {
                visit(p);
                string.append(",");
            }
            // delete last comma separator
            if (string.charAt(string.length() - 1) == ',') {
                string.deleteCharAt(string.length() - 1);
            }
        }
        string.append(")");
    }

    @Override
    public void visit(ValIdent node) {
        string.append(node.getIdentifier());
    }

    @Override
    public void visit(ValLiteral node) {
        string.append(node.getValue());
    }

    @Override
    public void visit(ValString node) {
        string.append("\"")
                .append(node.getValue())
                .append("\"");
    }

    @Override
    public void visit(ValNumber node) {
        super.visit((AST) node);
    }

    @Override
    public void visit(NumberIval node) {
        string.append(String.valueOf(node.getValue()));
    }

    @Override
    public void visit(NumberFval node) {
        string.append(String.valueOf(node.getValue()));
    }

    @Override
    public void visit(NumberArrayIndex node) {
        string.append(node.getIdentifier())
                .append("[");
        visit(node.getIndex());
        string.append("]");
    }

    @Override
    public void visit(Operator node) {
        super.visit((AST) node);
    }

    @Override
    public void visit(Operator.Decr node) {
        string.append("--");
    }

    @Override
    public void visit(Operator.Incr node) {
        string.append("++");
    }

    @Override
    public void visit(Operator.Assign node) {
        string.append("=");
    }

    @Override
    public void visit(Operator.GreaterEqual node) {
        string.append(">=");
    }

    @Override
    public void visit(Operator.Not node) {
        string.append("!");
    }

    @Override
    public void visit(Operator.Div node) {
        string.append("/");
    }

    @Override
    public void visit(Operator.Mult node) {
        string.append("*");
    }

    @Override
    public void visit(Operator.LesserEqual node) {
        string.append("<=");
    }

    @Override
    public void visit(Operator.Greater node) {
        string.append(">");
    }

    @Override
    public void visit(Operator.Sub node) {
        string.append("-");
    }

    @Override
    public void visit(Operator.Mod node) {
        string.append("%");
    }

    @Override
    public void visit(Operator.And node) {
        string.append("and");
    }

    @Override
    public void visit(Operator.Or node) {
        string.append("or");
    }

    @Override
    public void visit(Operator.Add node) {
        string.append("+");
    }

    @Override
    public void visit(Operator.Lesser node) {
        string.append("<");
    }

    @Override
    public void visit(Operator.Xor node) {
        string.append("xor");
    }

    @Override
    public void visit(Operator.Equal node) {
        string.append("is");
    }

    @Override
    public void visit(Type node) {
        super.visit((AST) node);
    }

    @Override
    public void visit(Type.TypeInt node) {
        string.append("int");
    }

    @Override
    public void visit(Type.TypeString node) {
        string.append("str");
    }

    @Override
    public void visit(Type.TypeDouble node) {
        string.append("dbl");
    }

    @Override
    public void visit(Type.TypeBool node) {
        string.append("bool");
    }

    @Override
    public void visit(AST node) {
        super.visit(node);
    }
}
