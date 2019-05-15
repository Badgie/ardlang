// Generated from /home/badgy/Desktop/ardlang/Taskuino.g4 by ANTLR 4.7.2
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
	 * Visit a parse tree produced by {@link TaskuinoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(TaskuinoParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskuinoParser#dcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcl(TaskuinoParser.DclContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskuinoParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(TaskuinoParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskuinoParser#calc_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalc_expr(TaskuinoParser.Calc_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskuinoParser#bool_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr(TaskuinoParser.Bool_exprContext ctx);
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
	 * Visit a parse tree produced by {@link TaskuinoParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(TaskuinoParser.Func_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskuinoParser#calc_expr_one}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalc_expr_one(TaskuinoParser.Calc_expr_oneContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskuinoParser#calc_expr_two}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalc_expr_two(TaskuinoParser.Calc_expr_twoContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskuinoParser#bool_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_condition(TaskuinoParser.Bool_conditionContext ctx);
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
	 * Visit a parse tree produced by {@link TaskuinoParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal(TaskuinoParser.ValContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskuinoParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(TaskuinoParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskuinoParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(TaskuinoParser.NumberContext ctx);
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
	 * Visit a parse tree produced by {@link TaskuinoParser#literals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiterals(TaskuinoParser.LiteralsContext ctx);
}