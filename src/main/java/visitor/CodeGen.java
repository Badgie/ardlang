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
import java.util.List;

public class CodeGen extends ASTVisitor {
    private StringBuilder code = new StringBuilder();
    private int taskCount = 0;
    private List<StmtsTask> taskList;

    public String gen(AST node) {
        setupScheduler();
        visit(node);
        return code.toString();
    }

    @Override
    public void visit(Prog node) {
        List<StmtsTask> tasks = new ArrayList<>();
        List<StmtsFunc> funcs = new ArrayList<>();
        List<Stmts> stmts = new ArrayList<>();

        for (Stmts s : node.getStmts()) {
            if (s instanceof StmtsTask) {
                tasks.add((StmtsTask) s);
            } else if (s instanceof StmtsFunc) {
                funcs.add((StmtsFunc) s);
            } else {
                stmts.add(s);
            }
        }

        taskList = tasks;

        for (StmtsTask s : tasks) {
            visit(s);
            taskCount++;
        }

        for (Stmts s : stmts) {
            visit(s);
        }

        for (StmtsFunc s : funcs) {
            visit(s);
        }
    }

    @Override
    public void visit(Stmts node) {

    }

    @Override
    public void visit(StmtsTask node) {
        code.append("void task")
                .append(taskCount)
                .append("() {");
        for (StmtsBlockStmts s : node.getStmts()) {
            visit(s);
        }
        code.append("}");
    }

    @Override
    public void visit(StmtsFunc node) {
        visit((AST) node.getType());
        code.append(node.getIdentifier())
                .append("(");
        for (Param p : node.getParams()) {
            visit(p);
        }
        code.append(") {");
        for (StmtsBlockStmts s : node.getStmts()) {
            visit(s);
        }
        code.append("}");
    }

    @Override
    public void visit(StmtsBlockStmts node) {
        super.visit((AST) node);
    }

    @Override
    public void visit(BlockStmtsDcl node) {
        //TODO: implement ino behavior
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
        code.append("if (");
        visit(node.getCondition());
        code.append(") {");
        for (StmtsBlockStmts s : node.getStmts()) {
            visit(s);
        }
        code.append("}");
        for (EifStmt e : node.getEifStmts()) {
            visit(e);
        }
    }

    @Override
    public void visit(EifStmt node) {
        if (node.getCondition() != null) {
            code.append("else if (");
            visit(node.getCondition());
            code.append(") {");
        } else {
            code.append("else {");
        }
        for (StmtsBlockStmts s : node.getStmts()) {
            visit(s);
        }
    }

    @Override
    public void visit(ForStmt node) {
        code.append("for (");
        if (node.getDcl() != null) {
            visit(node.getDcl());
        } else {
            visit(node.getNum());
        }
        code.append(";");
        visit(node.getCond());
        code.append(";");
        visit(node.getcExpr());
        code.append(") {");
        for (StmtsBlockStmts s : node.getStmts()) {
            visit(s);
        }
        code.append("}");
    }

    @Override
    public void visit(FuncStmt node) {
        //TODO: implement ino behavior
    }

    @Override
    public void visit(AssignExpr node) {
        //TODO: implement ino behavior
    }

    @Override
    public void visit(BoolExpr node) {
        //TODO: implement ino behavior
    }

    @Override
    public void visit(CalcExpr node) {
        //TODO: implement ino behavior
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
        //TODO: implement ino behavior
    }

    @Override
    public void visit(Val node) {
        super.visit((AST) node);
    }

    @Override
    public void visit(ValBool node) {
        //TODO: implement ino behavior
    }

    @Override
    public void visit(ValFunc node) {
        //TODO: implement ino behavior
    }

    @Override
    public void visit(ValIdent node) {
        //TODO: implement ino behavior
    }

    @Override
    public void visit(ValLiteral node) {
        //TODO: implement ino behavior
    }

    @Override
    public void visit(ValString node) {
        //TODO: implement ino behavior
    }

    @Override
    public void visit(ValNumber node) {
        super.visit((AST) node);
    }

    @Override
    public void visit(NumberIval node) {
        //TODO: implement ino behavior
    }

    @Override
    public void visit(NumberFval node) {
        //TODO: implement ino behavior
    }

    @Override
    public void visit(NumberArrayIndex node) {
        //TODO: implement ino behavior
    }

    @Override
    public void visit(Operator node) {
        super.visit((AST) node);
    }

    @Override
    public void visit(Operator.Decr node) {
        //TODO: implement ino behavior
    }

    @Override
    public void visit(Operator.Incr node) {
        //TODO: implement ino behavior
    }

    @Override
    public void visit(Operator.Assign node) {
        //TODO: implement ino behavior
    }

    @Override
    public void visit(Operator.GreaterEqual node) {
        //TODO: implement ino behavior
    }

    @Override
    public void visit(Operator.Not node) {
        //TODO: implement ino behavior
    }

    @Override
    public void visit(Operator.Div node) {
        //TODO: implement ino behavior
    }

    @Override
    public void visit(Operator.Mult node) {
        //TODO: implement ino behavior
    }

    @Override
    public void visit(Operator.LesserEqual node) {
        //TODO: implement ino behavior
    }

    @Override
    public void visit(Operator.Greater node) {
        //TODO: implement ino behavior
    }

    @Override
    public void visit(Operator.Sub node) {
        //TODO: implement ino behavior
    }

    @Override
    public void visit(Operator.Mod node) {
        //TODO: implement ino behavior
    }

    @Override
    public void visit(Operator.And node) {
        //TODO: implement ino behavior
    }

    @Override
    public void visit(Operator.Or node) {
        //TODO: implement ino behavior
    }

    @Override
    public void visit(Operator.Add node) {
        //TODO: implement ino behavior
    }

    @Override
    public void visit(Operator.Lesser node) {
        //TODO: implement ino behavior
    }

    @Override
    public void visit(Operator.Xor node) {
        //TODO: implement ino behavior
    }

    @Override
    public void visit(Operator.Equal node) {
        //TODO: implement ino behavior
    }

    @Override
    public void visit(Type node) {
        //TODO: implement ino behavior
    }

    @Override
    public void visit(Type.TypeInt node) {
        //TODO: implement ino behavior
    }

    @Override
    public void visit(Type.TypeString node) {
        //TODO: implement ino behavior
    }

    @Override
    public void visit(Type.TypeDouble node) {
        //TODO: implement ino behavior
    }

    @Override
    public void visit(Type.TypeBool node) {
        //TODO: implement ino behavior
    }

    @Override
    public void visit(Type.TypeVoid node) {
        //TODO: implement ino behavior
    }

    @Override
    public void visit(AST node) {
        super.visit(node);
    }

    public void setupScheduler() {
        code.append("class Task { \n" +
                "private: \n" +
                "  int _runInterval, \n" +
                "    _timeTilNextRun; \n" +
                "  \n" +
                "public: \n" +
                "  // Parameterized Constructor \n" +
                "  void RunInterval(int runInterval) \n" +
                "  { \n" +
                "      _runInterval = runInterval; \n" +
                "      _timeTilNextRun = 0;\n" +
                "  }\n" +
                "  void countDown() {\n" +
                "    if(_timeTilNextRun > 0) {\n" +
                "      _timeTilNextRun--;\n" +
                "    }\n" +
                "  }\n" +
                "  bool Ready() {\n" +
                "    return (_timeTilNextRun < 1);\n" +
                "  }\n" +
                "};");
        code.append("void CountDownTasks(Task tasks[], int numberOfTasks) {\n" +
                "  for (int i = 0; i < numberOfTasks; i++)\n" +
                "  {\n" +
                "    tasks[i].countDown();\n" +
                "  }\n" +
                "}\n" +
                "\n" +
                "int getNumberOfReadyTasks(Task tasks[], int numberOfTasks) {\n" +
                "  int count = 0;\n" +
                "  for (int i = 0; i < numberOfTasks; i++) {\n" +
                "    if(tasks[i].Ready()) {\n" +
                "      count++;\n" +
                "    }\n" +
                "  }\n" +
                "  return count;\n" +
                "}");
        code.append("int getNextTask(Task tasks[], int numberOfTasks) {\n" +
                "  int selectedTask = -1;\n" +
                "  while(selectedTask = -1) {\n" +
                "    int numberOfReadyTasks = getNumberOfReadyTasks(tasks, numberOfTasks);\n" +
                "    if(numberOfReadyTasks > 0) {\n" +
                "      int checkTask = random(0,numberOfTasks);\n" +
                "      if(tasks[checkTask].Ready()) {\n" +
                "        selectedTask = checkTask;\n" +
                "      } \n" +
                "    } else {\n" +
                "      delay(1000);\n" +
                "      CountDownTasks(tasks, numberOfTasks);\n" +
                "    }\n" +
                "  }\n" +
                "  return selectedTask;\n" +
                "}");
    }
}
