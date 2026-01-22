// Generated from C:/Users/awais/IdeaProjects/DBZ_PARSER/src/antlr4/DBZ.g4 by ANTLR 4.13.2
package antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DBZParser}.
 */
public interface DBZListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DBZParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DBZParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBZParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DBZParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBZParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(DBZParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBZParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(DBZParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBZParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(DBZParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBZParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(DBZParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBZParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(DBZParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBZParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(DBZParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBZParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(DBZParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBZParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(DBZParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBZParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(DBZParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBZParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(DBZParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBZParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(DBZParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBZParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(DBZParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBZParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(DBZParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBZParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(DBZParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBZParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(DBZParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBZParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(DBZParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBZParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOp(DBZParser.RelationalOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBZParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOp(DBZParser.RelationalOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link DBZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(DBZParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link DBZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(DBZParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link DBZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumber(DBZParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link DBZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumber(DBZParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link DBZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(DBZParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link DBZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(DBZParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link DBZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(DBZParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link DBZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(DBZParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link DBZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParens(DBZParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link DBZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParens(DBZParser.ParensContext ctx);
}