// Generated from /home/hubert/src/simple-lang/simple-lang-syntax/src/main/antlr/Syntax.g4 by ANTLR 4.8
package simple.syntax;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SyntaxParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SyntaxVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SyntaxParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(SyntaxParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyntaxParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(SyntaxParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyntaxParser#termDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermDef(SyntaxParser.TermDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyntaxParser#typedVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedVar(SyntaxParser.TypedVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyntaxParser#bind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBind(SyntaxParser.BindContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyntaxParser#cons}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCons(SyntaxParser.ConsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyntaxParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(SyntaxParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyntaxParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(SyntaxParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyntaxParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest(SyntaxParser.TestContext ctx);
}