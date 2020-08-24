// Generated from C:\Users\cml_9\Documents\NetBeansProjects\complexGrammar\src\antlr\example\complex.g4 by ANTLR 4.8
package antlr.example;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link complexParser}.
 */
public interface complexListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link complexParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(complexParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link complexParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(complexParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link complexParser#define}.
	 * @param ctx the parse tree
	 */
	void enterDefine(complexParser.DefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link complexParser#define}.
	 * @param ctx the parse tree
	 */
	void exitDefine(complexParser.DefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link complexParser#printvar}.
	 * @param ctx the parse tree
	 */
	void enterPrintvar(complexParser.PrintvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link complexParser#printvar}.
	 * @param ctx the parse tree
	 */
	void exitPrintvar(complexParser.PrintvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link complexParser#grafvar}.
	 * @param ctx the parse tree
	 */
	void enterGrafvar(complexParser.GrafvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link complexParser#grafvar}.
	 * @param ctx the parse tree
	 */
	void exitGrafvar(complexParser.GrafvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link complexParser#numdef}.
	 * @param ctx the parse tree
	 */
	void enterNumdef(complexParser.NumdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link complexParser#numdef}.
	 * @param ctx the parse tree
	 */
	void exitNumdef(complexParser.NumdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link complexParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(complexParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link complexParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(complexParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link complexParser#operdef}.
	 * @param ctx the parse tree
	 */
	void enterOperdef(complexParser.OperdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link complexParser#operdef}.
	 * @param ctx the parse tree
	 */
	void exitOperdef(complexParser.OperdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link complexParser#oper}.
	 * @param ctx the parse tree
	 */
	void enterOper(complexParser.OperContext ctx);
	/**
	 * Exit a parse tree produced by {@link complexParser#oper}.
	 * @param ctx the parse tree
	 */
	void exitOper(complexParser.OperContext ctx);
	/**
	 * Enter a parse tree produced by {@link complexParser#suma}.
	 * @param ctx the parse tree
	 */
	void enterSuma(complexParser.SumaContext ctx);
	/**
	 * Exit a parse tree produced by {@link complexParser#suma}.
	 * @param ctx the parse tree
	 */
	void exitSuma(complexParser.SumaContext ctx);
	/**
	 * Enter a parse tree produced by {@link complexParser#resta}.
	 * @param ctx the parse tree
	 */
	void enterResta(complexParser.RestaContext ctx);
	/**
	 * Exit a parse tree produced by {@link complexParser#resta}.
	 * @param ctx the parse tree
	 */
	void exitResta(complexParser.RestaContext ctx);
	/**
	 * Enter a parse tree produced by {@link complexParser#mul}.
	 * @param ctx the parse tree
	 */
	void enterMul(complexParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by {@link complexParser#mul}.
	 * @param ctx the parse tree
	 */
	void exitMul(complexParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by {@link complexParser#div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(complexParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link complexParser#div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(complexParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by {@link complexParser#binomica}.
	 * @param ctx the parse tree
	 */
	void enterBinomica(complexParser.BinomicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link complexParser#binomica}.
	 * @param ctx the parse tree
	 */
	void exitBinomica(complexParser.BinomicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link complexParser#polar}.
	 * @param ctx the parse tree
	 */
	void enterPolar(complexParser.PolarContext ctx);
	/**
	 * Exit a parse tree produced by {@link complexParser#polar}.
	 * @param ctx the parse tree
	 */
	void exitPolar(complexParser.PolarContext ctx);
	/**
	 * Enter a parse tree produced by {@link complexParser#real}.
	 * @param ctx the parse tree
	 */
	void enterReal(complexParser.RealContext ctx);
	/**
	 * Exit a parse tree produced by {@link complexParser#real}.
	 * @param ctx the parse tree
	 */
	void exitReal(complexParser.RealContext ctx);
	/**
	 * Enter a parse tree produced by {@link complexParser#imaginaria}.
	 * @param ctx the parse tree
	 */
	void enterImaginaria(complexParser.ImaginariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link complexParser#imaginaria}.
	 * @param ctx the parse tree
	 */
	void exitImaginaria(complexParser.ImaginariaContext ctx);
}