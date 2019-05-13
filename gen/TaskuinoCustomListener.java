// Generated from C:/Users/Bruger/IdeaProjects/Taskuino\Taskuino.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;

public class TaskuinoCustomListener extends TaskuinoBaseListener {
	//Hashmap to store our fucking variables!
	HashMap<String, Integer> variableMap = new HashMap<>();

	//List of current tasks
	HashMap<String, Integer> taskMap = new HashMap<>();

	@Override public void enterStmts(TaskuinoParser.StmtsContext ctx) {
		//Add scope rules, as wee need to have a bookmark of the global scope.
	}

	@Override public void exitStmts(TaskuinoParser.StmtsContext ctx) {
		//Delete the now unused scope
	}

	@Override public void enterTask(TaskuinoParser.TaskContext ctx) {
		//Something about starting the scheduler / adding to the queue

	}

	@Override public void exitTask(TaskuinoParser.TaskContext ctx) {
		//Remove the task from the queue
	}




}