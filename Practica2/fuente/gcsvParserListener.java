package fuente;

// Generated from gcsvParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gcsvParser}.
 */
public interface gcsvParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gcsvParser#fichero}.
	 * @param ctx the parse tree
	 */
	void enterFichero(gcsvParser.FicheroContext ctx);
	/**
	 * Exit a parse tree produced by {@link gcsvParser#fichero}.
	 * @param ctx the parse tree
	 */
	void exitFichero(gcsvParser.FicheroContext ctx);
	/**
	 * Enter a parse tree produced by {@link gcsvParser#cabecera}.
	 * @param ctx the parse tree
	 */
	void enterCabecera(gcsvParser.CabeceraContext ctx);
	/**
	 * Exit a parse tree produced by {@link gcsvParser#cabecera}.
	 * @param ctx the parse tree
	 */
	void exitCabecera(gcsvParser.CabeceraContext ctx);
	/**
	 * Enter a parse tree produced by {@link gcsvParser#linea}.
	 * @param ctx the parse tree
	 */
	void enterLinea(gcsvParser.LineaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gcsvParser#linea}.
	 * @param ctx the parse tree
	 */
	void exitLinea(gcsvParser.LineaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnaSinComillas}
	 * labeled alternative in {@link gcsvParser#columna}.
	 * @param ctx the parse tree
	 */
	void enterColumnaSinComillas(gcsvParser.ColumnaSinComillasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnaSinComillas}
	 * labeled alternative in {@link gcsvParser#columna}.
	 * @param ctx the parse tree
	 */
	void exitColumnaSinComillas(gcsvParser.ColumnaSinComillasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnaConComillas}
	 * labeled alternative in {@link gcsvParser#columna}.
	 * @param ctx the parse tree
	 */
	void enterColumnaConComillas(gcsvParser.ColumnaConComillasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnaConComillas}
	 * labeled alternative in {@link gcsvParser#columna}.
	 * @param ctx the parse tree
	 */
	void exitColumnaConComillas(gcsvParser.ColumnaConComillasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnaVacio}
	 * labeled alternative in {@link gcsvParser#columna}.
	 * @param ctx the parse tree
	 */
	void enterColumnaVacio(gcsvParser.ColumnaVacioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnaVacio}
	 * labeled alternative in {@link gcsvParser#columna}.
	 * @param ctx the parse tree
	 */
	void exitColumnaVacio(gcsvParser.ColumnaVacioContext ctx);
	/**
	 * Enter a parse tree produced by the {@code textoSinComillas}
	 * labeled alternative in {@link gcsvParser#campo}.
	 * @param ctx the parse tree
	 */
	void enterTextoSinComillas(gcsvParser.TextoSinComillasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code textoSinComillas}
	 * labeled alternative in {@link gcsvParser#campo}.
	 * @param ctx the parse tree
	 */
	void exitTextoSinComillas(gcsvParser.TextoSinComillasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringConComillas}
	 * labeled alternative in {@link gcsvParser#campo}.
	 * @param ctx the parse tree
	 */
	void enterStringConComillas(gcsvParser.StringConComillasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringConComillas}
	 * labeled alternative in {@link gcsvParser#campo}.
	 * @param ctx the parse tree
	 */
	void exitStringConComillas(gcsvParser.StringConComillasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code campoVacio}
	 * labeled alternative in {@link gcsvParser#campo}.
	 * @param ctx the parse tree
	 */
	void enterCampoVacio(gcsvParser.CampoVacioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code campoVacio}
	 * labeled alternative in {@link gcsvParser#campo}.
	 * @param ctx the parse tree
	 */
	void exitCampoVacio(gcsvParser.CampoVacioContext ctx);
}