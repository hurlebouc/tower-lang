// Generated from /home/hubert/src/simple-lang/simple-lang-syntax/src/main/antlr/Syntax.g4 by ANTLR 4.8
package simple.syntax;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SyntaxParser}.
 */
public interface SyntaxListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(SyntaxParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(SyntaxParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(SyntaxParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(SyntaxParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#termDef}.
	 * @param ctx the parse tree
	 */
	void enterTermDef(SyntaxParser.TermDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#termDef}.
	 * @param ctx the parse tree
	 */
	void exitTermDef(SyntaxParser.TermDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#typedVar}.
	 * @param ctx the parse tree
	 */
	void enterTypedVar(SyntaxParser.TypedVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#typedVar}.
	 * @param ctx the parse tree
	 */
	void exitTypedVar(SyntaxParser.TypedVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#bind}.
	 * @param ctx the parse tree
	 */
	void enterBind(SyntaxParser.BindContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#bind}.
	 * @param ctx the parse tree
	 */
	void exitBind(SyntaxParser.BindContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#cons}.
	 * @param ctx the parse tree
	 */
	void enterCons(SyntaxParser.ConsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#cons}.
	 * @param ctx the parse tree
	 */
	void exitCons(SyntaxParser.ConsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(SyntaxParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(SyntaxParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(SyntaxParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(SyntaxParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest(SyntaxParser.TestContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest(SyntaxParser.TestContext ctx);
}