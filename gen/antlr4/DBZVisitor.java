// Generated from C:/Users/awais/IdeaProjects/DBZ_PARSER/src/antlr4/DBZ.g4 by ANTLR 4.13.2
package antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DBZParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DBZVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DBZParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(DBZParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBZParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(DBZParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBZParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(DBZParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBZParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(DBZParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBZParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(DBZParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBZParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(DBZParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBZParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(DBZParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBZParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(DBZParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBZParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(DBZParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBZParser#relationalOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalOp(DBZParser.RelationalOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link DBZParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(DBZParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link DBZParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(DBZParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link DBZParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(DBZParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link DBZParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(DBZParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link DBZParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(DBZParser.ParensContext ctx);
}