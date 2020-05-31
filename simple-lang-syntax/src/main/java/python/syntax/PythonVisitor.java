// Generated from /home/hubert/src/simple-lang/simple-lang-syntax/src/main/antlr/Python.g4 by ANTLR 4.8
package python.syntax;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PythonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PythonVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PythonParser#single_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_input(PythonParser.Single_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#file_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_input(PythonParser.File_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(PythonParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_stmt(PythonParser.Simple_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmall_stmt(PythonParser.Small_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#assignment_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt(PythonParser.Assignment_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#flow_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlow_stmt(PythonParser.Flow_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#break_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_stmt(PythonParser.Break_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#continue_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_stmt(PythonParser.Continue_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_stmt(PythonParser.Compound_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(PythonParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(PythonParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#suite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuite(PythonParser.SuiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest(PythonParser.TestContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#print_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_stmt(PythonParser.Print_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_op(PythonParser.Comp_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(PythonParser.ExprContext ctx);
}