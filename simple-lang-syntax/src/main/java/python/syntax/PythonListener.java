// Generated from /home/hubert/src/simple-lang/simple-lang-syntax/src/main/antlr/Python.g4 by ANTLR 4.8
package python.syntax;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PythonParser}.
 */
public interface PythonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PythonParser#single_input}.
	 * @param ctx the parse tree
	 */
	void enterSingle_input(PythonParser.Single_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#single_input}.
	 * @param ctx the parse tree
	 */
	void exitSingle_input(PythonParser.Single_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#file_input}.
	 * @param ctx the parse tree
	 */
	void enterFile_input(PythonParser.File_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#file_input}.
	 * @param ctx the parse tree
	 */
	void exitFile_input(PythonParser.File_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(PythonParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(PythonParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmt(PythonParser.Simple_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmt(PythonParser.Simple_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSmall_stmt(PythonParser.Small_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSmall_stmt(PythonParser.Small_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt(PythonParser.Assignment_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt(PythonParser.Assignment_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFlow_stmt(PythonParser.Flow_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFlow_stmt(PythonParser.Flow_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stmt(PythonParser.Break_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stmt(PythonParser.Break_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void enterContinue_stmt(PythonParser.Continue_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void exitContinue_stmt(PythonParser.Continue_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_stmt(PythonParser.Compound_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_stmt(PythonParser.Compound_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(PythonParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(PythonParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(PythonParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(PythonParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#suite}.
	 * @param ctx the parse tree
	 */
	void enterSuite(PythonParser.SuiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#suite}.
	 * @param ctx the parse tree
	 */
	void exitSuite(PythonParser.SuiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest(PythonParser.TestContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest(PythonParser.TestContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrint_stmt(PythonParser.Print_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrint_stmt(PythonParser.Print_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterComp_op(PythonParser.Comp_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitComp_op(PythonParser.Comp_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PythonParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PythonParser.ExprContext ctx);
}