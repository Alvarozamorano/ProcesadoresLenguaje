package fuente;

// Generated from gjsonbParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gjsonbParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gjsonbParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gjsonbParser#fichero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFichero(gjsonbParser.FicheroContext ctx);
	/**
	 * Visit a parse tree produced by {@link gjsonbParser#context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContext(gjsonbParser.ContextContext ctx);
	/**
	 * Visit a parse tree produced by {@link gjsonbParser#textoc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextoc(gjsonbParser.TextocContext ctx);
	/**
	 * Visit a parse tree produced by {@link gjsonbParser#graphs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGraphs(gjsonbParser.GraphsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gjsonbParser#grafo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrafo(gjsonbParser.GrafoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gjsonbParser#dentroGrafo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDentroGrafo(gjsonbParser.DentroGrafoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gjsonbParser#nodo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodo(gjsonbParser.NodoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gjsonbParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(gjsonbParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link gjsonbParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(gjsonbParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link gjsonbParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(gjsonbParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link gjsonbParser#properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperties(gjsonbParser.PropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link gjsonbParser#prop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProp(gjsonbParser.PropContext ctx);
	/**
	 * Visit a parse tree produced by {@link gjsonbParser#reverseName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReverseName(gjsonbParser.ReverseNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link gjsonbParser#labelReverseName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelReverseName(gjsonbParser.LabelReverseNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link gjsonbParser#from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom(gjsonbParser.FromContext ctx);
	/**
	 * Visit a parse tree produced by {@link gjsonbParser#to}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTo(gjsonbParser.ToContext ctx);
	/**
	 * Visit a parse tree produced by {@link gjsonbParser#typeOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeOf(gjsonbParser.TypeOfContext ctx);
	/**
	 * Visit a parse tree produced by {@link gjsonbParser#usedby}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsedby(gjsonbParser.UsedbyContext ctx);
	/**
	 * Visit a parse tree produced by {@link gjsonbParser#multiplicityMax}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicityMax(gjsonbParser.MultiplicityMaxContext ctx);
	/**
	 * Visit a parse tree produced by {@link gjsonbParser#multiplicityMin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicityMin(gjsonbParser.MultiplicityMinContext ctx);
	/**
	 * Visit a parse tree produced by {@link gjsonbParser#inherits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInherits(gjsonbParser.InheritsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gjsonbParser#optional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptional(gjsonbParser.OptionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link gjsonbParser#isList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsList(gjsonbParser.IsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gjsonbParser#clase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClase(gjsonbParser.ClaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link gjsonbParser#propiedad}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropiedad(gjsonbParser.PropiedadContext ctx);
	/**
	 * Visit a parse tree produced by {@link gjsonbParser#relacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelacion(gjsonbParser.RelacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gjsonbParser#textoEs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextoEs(gjsonbParser.TextoEsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gjsonbParser#textoIn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextoIn(gjsonbParser.TextoInContext ctx);
	/**
	 * Visit a parse tree produced by {@link gjsonbParser#textoEsReverse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextoEsReverse(gjsonbParser.TextoEsReverseContext ctx);
	/**
	 * Visit a parse tree produced by {@link gjsonbParser#textoInReverse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextoInReverse(gjsonbParser.TextoInReverseContext ctx);
	/**
	 * Visit a parse tree produced by {@link gjsonbParser#nombreGrafo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNombreGrafo(gjsonbParser.NombreGrafoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gjsonbParser#tipoGrafo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoGrafo(gjsonbParser.TipoGrafoContext ctx);
}