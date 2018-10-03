// Generated from PP.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PPParser}.
 */
public interface PPListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PPParser#programme}.
	 * @param ctx the parse tree
	 */
	void enterProgramme(PPParser.ProgrammeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#programme}.
	 * @param ctx the parse tree
	 */
	void exitProgramme(PPParser.ProgrammeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(PPParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(PPParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(PPParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(PPParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(PPParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(PPParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(PPParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(PPParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(PPParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(PPParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#fonction}.
	 * @param ctx the parse tree
	 */
	void enterFonction(PPParser.FonctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#fonction}.
	 * @param ctx the parse tree
	 */
	void exitFonction(PPParser.FonctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PPParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PPParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#cible}.
	 * @param ctx the parse tree
	 */
	void enterCible(PPParser.CibleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#cible}.
	 * @param ctx the parse tree
	 */
	void exitCible(PPParser.CibleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#constante}.
	 * @param ctx the parse tree
	 */
	void enterConstante(PPParser.ConstanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#constante}.
	 * @param ctx the parse tree
	 */
	void exitConstante(PPParser.ConstanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#bop}.
	 * @param ctx the parse tree
	 */
	void enterBop(PPParser.BopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#bop}.
	 * @param ctx the parse tree
	 */
	void exitBop(PPParser.BopContext ctx);
}