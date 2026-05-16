// Generated from d:/Universidad/2 AÑO/SSL/Proyecto/grammarProject/grammarProject.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link grammarProjectParser}.
 */
public interface grammarProjectListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link grammarProjectParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(grammarProjectParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarProjectParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(grammarProjectParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarProjectParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(grammarProjectParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarProjectParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(grammarProjectParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarProjectParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(grammarProjectParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarProjectParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(grammarProjectParser.StateContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarProjectParser#role}.
	 * @param ctx the parse tree
	 */
	void enterRole(grammarProjectParser.RoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarProjectParser#role}.
	 * @param ctx the parse tree
	 */
	void exitRole(grammarProjectParser.RoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarProjectParser#permission}.
	 * @param ctx the parse tree
	 */
	void enterPermission(grammarProjectParser.PermissionContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarProjectParser#permission}.
	 * @param ctx the parse tree
	 */
	void exitPermission(grammarProjectParser.PermissionContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarProjectParser#transition}.
	 * @param ctx the parse tree
	 */
	void enterTransition(grammarProjectParser.TransitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarProjectParser#transition}.
	 * @param ctx the parse tree
	 */
	void exitTransition(grammarProjectParser.TransitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarProjectParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(grammarProjectParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarProjectParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(grammarProjectParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarProjectParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(grammarProjectParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarProjectParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(grammarProjectParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarProjectParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(grammarProjectParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarProjectParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(grammarProjectParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarProjectParser#notification}.
	 * @param ctx the parse tree
	 */
	void enterNotification(grammarProjectParser.NotificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarProjectParser#notification}.
	 * @param ctx the parse tree
	 */
	void exitNotification(grammarProjectParser.NotificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarProjectParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(grammarProjectParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarProjectParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(grammarProjectParser.ValueContext ctx);
}