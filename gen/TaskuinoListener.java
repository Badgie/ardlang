// Generated from C:/Users/Bruger/IdeaProjects/Taskuino\Taskuino.g4 by ANTLR 4.7.2
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
	 * Enter a parse tree produced by {@link TaskuinoParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(TaskuinoParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskuinoParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(TaskuinoParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskuinoParser#assign_comp_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_comp_stmt(TaskuinoParser.Assign_comp_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskuinoParser#assign_comp_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_comp_stmt(TaskuinoParser.Assign_comp_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskuinoParser#calc_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCalc_stmt(TaskuinoParser.Calc_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskuinoParser#calc_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCalc_stmt(TaskuinoParser.Calc_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskuinoParser#bool_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBool_stmt(TaskuinoParser.Bool_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskuinoParser#bool_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBool_stmt(TaskuinoParser.Bool_stmtContext ctx);
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
	 * Enter a parse tree produced by {@link TaskuinoParser#dcl_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDcl_stmt(TaskuinoParser.Dcl_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskuinoParser#dcl_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDcl_stmt(TaskuinoParser.Dcl_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskuinoParser#method_stmt}.
	 * @param ctx the parse tree
	 */
	void enterMethod_stmt(TaskuinoParser.Method_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskuinoParser#method_stmt}.
	 * @param ctx the parse tree
	 */
	void exitMethod_stmt(TaskuinoParser.Method_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskuinoParser#func_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFunc_stmt(TaskuinoParser.Func_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskuinoParser#func_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFunc_stmt(TaskuinoParser.Func_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskuinoParser#type_assign}.
	 * @param ctx the parse tree
	 */
	void enterType_assign(TaskuinoParser.Type_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskuinoParser#type_assign}.
	 * @param ctx the parse tree
	 */
	void exitType_assign(TaskuinoParser.Type_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskuinoParser#typeless_assign}.
	 * @param ctx the parse tree
	 */
	void enterTypeless_assign(TaskuinoParser.Typeless_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskuinoParser#typeless_assign}.
	 * @param ctx the parse tree
	 */
	void exitTypeless_assign(TaskuinoParser.Typeless_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskuinoParser#calc_stmt_one}.
	 * @param ctx the parse tree
	 */
	void enterCalc_stmt_one(TaskuinoParser.Calc_stmt_oneContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskuinoParser#calc_stmt_one}.
	 * @param ctx the parse tree
	 */
	void exitCalc_stmt_one(TaskuinoParser.Calc_stmt_oneContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskuinoParser#calc_stmt_two}.
	 * @param ctx the parse tree
	 */
	void enterCalc_stmt_two(TaskuinoParser.Calc_stmt_twoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskuinoParser#calc_stmt_two}.
	 * @param ctx the parse tree
	 */
	void exitCalc_stmt_two(TaskuinoParser.Calc_stmt_twoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskuinoParser#if_cond}.
	 * @param ctx the parse tree
	 */
	void enterIf_cond(TaskuinoParser.If_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskuinoParser#if_cond}.
	 * @param ctx the parse tree
	 */
	void exitIf_cond(TaskuinoParser.If_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskuinoParser#comp_param}.
	 * @param ctx the parse tree
	 */
	void enterComp_param(TaskuinoParser.Comp_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskuinoParser#comp_param}.
	 * @param ctx the parse tree
	 */
	void exitComp_param(TaskuinoParser.Comp_paramContext ctx);
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
	 * Enter a parse tree produced by {@link TaskuinoParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(TaskuinoParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskuinoParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(TaskuinoParser.VarContext ctx);
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
	 * Enter a parse tree produced by {@link TaskuinoParser#lconst}.
	 * @param ctx the parse tree
	 */
	void enterLconst(TaskuinoParser.LconstContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskuinoParser#lconst}.
	 * @param ctx the parse tree
	 */
	void exitLconst(TaskuinoParser.LconstContext ctx);
}