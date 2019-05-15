// Generated from /home/badgy/Desktop/ardlang/Taskuino.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TaskuinoParser}.
 */
public interface TaskuinoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TaskuinoParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(TaskuinoParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskuinoParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(TaskuinoParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskuinoParser#stmts}.
	 * @param ctx the parse tree
	 */
	void enterStmts(TaskuinoParser.StmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskuinoParser#stmts}.
	 * @param ctx the parse tree
	 */
	void exitStmts(TaskuinoParser.StmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskuinoParser#block_stmts}.
	 * @param ctx the parse tree
	 */
	void enterBlock_stmts(TaskuinoParser.Block_stmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskuinoParser#block_stmts}.
	 * @param ctx the parse tree
	 */
	void exitBlock_stmts(TaskuinoParser.Block_stmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskuinoParser#task}.
	 * @param ctx the parse tree
	 */
	void enterTask(TaskuinoParser.TaskContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskuinoParser#task}.
	 * @param ctx the parse tree
	 */
	void exitTask(TaskuinoParser.TaskContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskuinoParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(TaskuinoParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskuinoParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(TaskuinoParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskuinoParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(TaskuinoParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskuinoParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(TaskuinoParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskuinoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(TaskuinoParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskuinoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(TaskuinoParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskuinoParser#dcl}.
	 * @param ctx the parse tree
	 */
	void enterDcl(TaskuinoParser.DclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskuinoParser#dcl}.
	 * @param ctx the parse tree
	 */
	void exitDcl(TaskuinoParser.DclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskuinoParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(TaskuinoParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskuinoParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(TaskuinoParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskuinoParser#calc_expr}.
	 * @param ctx the parse tree
	 */
	void enterCalc_expr(TaskuinoParser.Calc_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskuinoParser#calc_expr}.
	 * @param ctx the parse tree
	 */
	void exitCalc_expr(TaskuinoParser.Calc_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskuinoParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr(TaskuinoParser.Bool_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskuinoParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr(TaskuinoParser.Bool_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskuinoParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(TaskuinoParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskuinoParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(TaskuinoParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskuinoParser#eif_stmt}.
	 * @param ctx the parse tree
	 */
	void enterEif_stmt(TaskuinoParser.Eif_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskuinoParser#eif_stmt}.
	 * @param ctx the parse tree
	 */
	void exitEif_stmt(TaskuinoParser.Eif_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskuinoParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(TaskuinoParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskuinoParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(TaskuinoParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskuinoParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(TaskuinoParser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskuinoParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(TaskuinoParser.Func_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskuinoParser#calc_expr_one}.
	 * @param ctx the parse tree
	 */
	void enterCalc_expr_one(TaskuinoParser.Calc_expr_oneContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskuinoParser#calc_expr_one}.
	 * @param ctx the parse tree
	 */
	void exitCalc_expr_one(TaskuinoParser.Calc_expr_oneContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskuinoParser#calc_expr_two}.
	 * @param ctx the parse tree
	 */
	void enterCalc_expr_two(TaskuinoParser.Calc_expr_twoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskuinoParser#calc_expr_two}.
	 * @param ctx the parse tree
	 */
	void exitCalc_expr_two(TaskuinoParser.Calc_expr_twoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskuinoParser#calc_expr_three}.
	 * @param ctx the parse tree
	 */
	void enterCalc_expr_three(TaskuinoParser.Calc_expr_threeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskuinoParser#calc_expr_three}.
	 * @param ctx the parse tree
	 */
	void exitCalc_expr_three(TaskuinoParser.Calc_expr_threeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskuinoParser#bool_condition}.
	 * @param ctx the parse tree
	 */
	void enterBool_condition(TaskuinoParser.Bool_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskuinoParser#bool_condition}.
	 * @param ctx the parse tree
	 */
	void exitBool_condition(TaskuinoParser.Bool_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskuinoParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(TaskuinoParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskuinoParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(TaskuinoParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskuinoParser#op_pres_one}.
	 * @param ctx the parse tree
	 */
	void enterOp_pres_one(TaskuinoParser.Op_pres_oneContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskuinoParser#op_pres_one}.
	 * @param ctx the parse tree
	 */
	void exitOp_pres_one(TaskuinoParser.Op_pres_oneContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskuinoParser#op_pres_two}.
	 * @param ctx the parse tree
	 */
	void enterOp_pres_two(TaskuinoParser.Op_pres_twoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskuinoParser#op_pres_two}.
	 * @param ctx the parse tree
	 */
	void exitOp_pres_two(TaskuinoParser.Op_pres_twoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskuinoParser#bool_op}.
	 * @param ctx the parse tree
	 */
	void enterBool_op(TaskuinoParser.Bool_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskuinoParser#bool_op}.
	 * @param ctx the parse tree
	 */
	void exitBool_op(TaskuinoParser.Bool_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskuinoParser#mod_op}.
	 * @param ctx the parse tree
	 */
	void enterMod_op(TaskuinoParser.Mod_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskuinoParser#mod_op}.
	 * @param ctx the parse tree
	 */
	void exitMod_op(TaskuinoParser.Mod_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskuinoParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(TaskuinoParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskuinoParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(TaskuinoParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskuinoParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(TaskuinoParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskuinoParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(TaskuinoParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskuinoParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(TaskuinoParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskuinoParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(TaskuinoParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskuinoParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(TaskuinoParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskuinoParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(TaskuinoParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskuinoParser#ival}.
	 * @param ctx the parse tree
	 */
	void enterIval(TaskuinoParser.IvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskuinoParser#ival}.
	 * @param ctx the parse tree
	 */
	void exitIval(TaskuinoParser.IvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskuinoParser#fval}.
	 * @param ctx the parse tree
	 */
	void enterFval(TaskuinoParser.FvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskuinoParser#fval}.
	 * @param ctx the parse tree
	 */
	void exitFval(TaskuinoParser.FvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskuinoParser#literals}.
	 * @param ctx the parse tree
	 */
	void enterLiterals(TaskuinoParser.LiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskuinoParser#literals}.
	 * @param ctx the parse tree
	 */
	void exitLiterals(TaskuinoParser.LiteralsContext ctx);
}