// Generated from C:/Users/Bruger/IdeaProjects/meh/ardlang\Taskuino.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TaskuinoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TaskuinoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TaskuinoParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(TaskuinoParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskuinoParser#stmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmts(TaskuinoParser.StmtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskuinoParser#task}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask(TaskuinoParser.TaskContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskuinoParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(TaskuinoParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskuinoParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(TaskuinoParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskuinoParser#assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stmt(TaskuinoParser.Assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskuinoParser#assign_comp_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_comp_stmt(TaskuinoParser.Assign_comp_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskuinoParser#calc_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalc_stmt(TaskuinoParser.Calc_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskuinoParser#bool_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_stmt(TaskuinoParser.Bool_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskuinoParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(TaskuinoParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskuinoParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(TaskuinoParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskuinoParser#dcl_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcl_stmt(TaskuinoParser.Dcl_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskuinoParser#method_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_stmt(TaskuinoParser.Method_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskuinoParser#func_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_stmt(TaskuinoParser.Func_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskuinoParser#type_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_assign(TaskuinoParser.Type_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskuinoParser#typeless_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeless_assign(TaskuinoParser.Typeless_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskuinoParser#calc_stmt_one}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalc_stmt_one(TaskuinoParser.Calc_stmt_oneContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskuinoParser#calc_stmt_two}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalc_stmt_two(TaskuinoParser.Calc_stmt_twoContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskuinoParser#if_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_cond(TaskuinoParser.If_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskuinoParser#comp_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_param(TaskuinoParser.Comp_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskuinoParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(TaskuinoParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskuinoParser#op_pres_one}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_pres_one(TaskuinoParser.Op_pres_oneContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskuinoParser#op_pres_two}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_pres_two(TaskuinoParser.Op_pres_twoContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskuinoParser#bool_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_op(TaskuinoParser.Bool_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskuinoParser#mod_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMod_op(TaskuinoParser.Mod_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskuinoParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(TaskuinoParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskuinoParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(TaskuinoParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskuinoParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(TaskuinoParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskuinoParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal(TaskuinoParser.ValContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskuinoParser#ival}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIval(TaskuinoParser.IvalContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskuinoParser#fval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFval(TaskuinoParser.FvalContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskuinoParser#lconst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLconst(TaskuinoParser.LconstContext ctx);
}