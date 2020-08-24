// Generated from complex.g4 by ANTLR 4.8
package antlr.example;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link complexParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface complexVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link complexParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(complexParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link complexParser#define}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine(complexParser.DefineContext ctx);
	/**
	 * Visit a parse tree produced by {@link complexParser#printvar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintvar(complexParser.PrintvarContext ctx);
	/**
	 * Visit a parse tree produced by {@link complexParser#grafvar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrafvar(complexParser.GrafvarContext ctx);
	/**
	 * Visit a parse tree produced by {@link complexParser#numdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumdef(complexParser.NumdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link complexParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(complexParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link complexParser#operdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperdef(complexParser.OperdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link complexParser#oper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOper(complexParser.OperContext ctx);
	/**
	 * Visit a parse tree produced by {@link complexParser#suma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuma(complexParser.SumaContext ctx);
	/**
	 * Visit a parse tree produced by {@link complexParser#resta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResta(complexParser.RestaContext ctx);
	/**
	 * Visit a parse tree produced by {@link complexParser#mul}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(complexParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by {@link complexParser#div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(complexParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by {@link complexParser#binomica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinomica(complexParser.BinomicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link complexParser#polar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPolar(complexParser.PolarContext ctx);
	/**
	 * Visit a parse tree produced by {@link complexParser#real}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal(complexParser.RealContext ctx);
	/**
	 * Visit a parse tree produced by {@link complexParser#imaginaria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImaginaria(complexParser.ImaginariaContext ctx);
}