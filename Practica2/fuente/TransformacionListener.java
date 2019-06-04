package fuente;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 *
 * @author Gabriel López Cuenca
 */
public class TransformacionListener extends gParamParserBaseListener {
    
    private TSimb_Param ts;

    public TransformacionListener(TSimb_Param tsimbolos){
        super();
        ts = tsimbolos;
    }

    @Override
    public void exitRuta(gParamParser.RutaContext ctx) {
        if (ctx.getParent().getRuleIndex() == gParamParser.RULE_json){
            ts.setJson(ctx.getText());
        }

        else if (ctx.getParent().getRuleIndex() == gParamParser.RULE_dot){
            ts.setDot(ctx.getText());
        }

        else if (ctx.getParent().getRuleIndex() == gParamParser.RULE_svg){
            ts.setSvg(ctx.getText());
        }

        else if (ctx.getParent().getRuleIndex() == gParamParser.RULE_csv){
            ts.setCsv(ctx.getText());
        }
    }

    @Override
    public void enterParam(gParamParser.ParamContext ctx) {
        ts.addColumn("Parametro");
        ts.addColumn("Edno");
        ts.addColumn("Elemento");
        ts.addColumn("Valor");
    }

    //Tipos
    @Override
    public void enterLen(gParamParser.LenContext ctx) {
        ts.newRow();
        ts.addValue("Parametro", "len");
        ts.addValue("Edno", "edge"); //Len siempre es para las uniones
    }

    @Override
    public void enterFontcolor(gParamParser.FontcolorContext ctx) {
        ts.newRow();
        ts.addValue("Parametro", "fontcolor");
    }

    @Override
    public void enterFontname(gParamParser.FontnameContext ctx) {
        ts.newRow();
        ts.addValue("Parametro", "fontname");
    }

    @Override
    public void enterFontsize(gParamParser.FontsizeContext ctx) {
        ts.newRow();
        ts.addValue("Parametro", "fontsize");
    }

    @Override
    public void enterArrowsize(gParamParser.ArrowsizeContext ctx) {
        ts.newRow();
        ts.addValue("Parametro", "arrowsize");
    }

    @Override
    public void enterArrowcolor(gParamParser.ArrowcolorContext ctx) {
        ts.newRow();
        ts.addValue("Parametro", "arrowcolor");
    }

    @Override
    public void enterPenwidth(gParamParser.PenwidthContext ctx) {
        ts.newRow();
        ts.addValue("Parametro", "penwidth");
    }

    @Override
    public void enterFillcolor(gParamParser.FillcolorContext ctx) {
        ts.newRow();
        ts.addValue("Parametro", "fillcolor");
    }

    @Override
    public void enterStyle(gParamParser.StyleContext ctx) {
        ts.newRow();
        ts.addValue("Parametro", "style");
    }

    @Override
    public void enterShape(gParamParser.ShapeContext ctx) {
        ts.newRow();
        ts.addValue("Parametro", "shape");
    }

    //Edge o Node
    @Override
    public void exitNode(gParamParser.NodeContext ctx) {
        ts.addValue("Edno", "node");
    }

    @Override
    public void exitEdge(gParamParser.EdgeContext ctx) {
        ts.addValue("Edno", "edge");
    }

    //Elementos sobre los que actúa
    @Override
    public void exitW_rela(gParamParser.W_relaContext ctx) {
        ts.addValue("Elemento","Relaciones");
    }

    @Override
    public void exitW_class(gParamParser.W_classContext ctx) {
        ts.addValue("Elemento","Clases");
    }

    @Override
    public void exitW_prop(gParamParser.W_propContext ctx) {
        ts.addValue("Elemento","Propiedades");
    }

    @Override
    public void exitW_inhe(gParamParser.W_inheContext ctx) {
        ts.addValue("Elemento","Herencias");
    }

    @Override
    public void exitW_indi(gParamParser.W_indiContext ctx) {
        ts.addValue("Elemento","In-Tipos");
    }

    //Cadena o entero
    @Override
    public void exitCadena(gParamParser.CadenaContext ctx) {
        ts.addValue("Valor", ctx.TEXTOSIN().getText());
    }

    @Override
    public void exitEntero(gParamParser.EnteroContext ctx) {
        ts.addValue("Valor", ctx.ENTERO().getText());
    }
}