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
