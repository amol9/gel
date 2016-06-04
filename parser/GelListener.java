// Generated from Gel.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GelParser}.
 */
public interface GelListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GelParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(GelParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(GelParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(GelParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(GelParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(GelParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(GelParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(GelParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(GelParser.ValueContext ctx);
}