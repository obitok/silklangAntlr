// Generated from SilkGrammar.g4 by ANTLR 4.13.0
package silkgrammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SilkGrammarParser}.
 */
public interface SilkGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SilkGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SilkGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SilkGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SilkGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SilkGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SilkGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SilkGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SilkGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SilkGrammarParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(SilkGrammarParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SilkGrammarParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(SilkGrammarParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SilkGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SilkGrammarParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SilkGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SilkGrammarParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SilkGrammarParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(SilkGrammarParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SilkGrammarParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(SilkGrammarParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SilkGrammarParser#inputStatement}.
	 * @param ctx the parse tree
	 */
	void enterInputStatement(SilkGrammarParser.InputStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SilkGrammarParser#inputStatement}.
	 * @param ctx the parse tree
	 */
	void exitInputStatement(SilkGrammarParser.InputStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SilkGrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(SilkGrammarParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SilkGrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(SilkGrammarParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SilkGrammarParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(SilkGrammarParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SilkGrammarParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(SilkGrammarParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SilkGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SilkGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SilkGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SilkGrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SilkGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SilkGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SilkGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SilkGrammarParser.ExpressionContext ctx);
}