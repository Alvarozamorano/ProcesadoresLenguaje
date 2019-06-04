package fuente;

public class VisitorJson extends gjsonbParserBaseVisitor{
    private TbSimbJson _tablasimbolos;

    public VisitorJson(TbSimbJson p_ts){
        super();
        _tablasimbolos = p_ts;
    }
    
    @Override
    public Object visitNombreGrafo(gjsonbParser.NombreGrafoContext ctx) {
        _tablasimbolos.addGrafo(ctx.TEXTO().getText());
        return null;
    }

    @Override
    public Object visitTipoGrafo(gjsonbParser.TipoGrafoContext ctx) {
        _tablasimbolos.addTypeGrafo(ctx.TEXTO().getText());
        return null;
    }

    @Override
    public Object visitClase(gjsonbParser.ClaseContext ctx) {
        _tablasimbolos.newNodo();
        _tablasimbolos.addValue("id", "CLASE_NODO");
        String ruta = ctx.CLASE().getText();
        String[] partes = ruta.split("#");
        String nombreClase=partes[1];
        _tablasimbolos.addClassName(nombreClase);
        _tablasimbolos.addValue("name", nombreClase);
        return null;
    }
    @Override
    public Object visitPropiedad(gjsonbParser.PropiedadContext ctx) {
        _tablasimbolos.newNodo();
        _tablasimbolos.addValue("id", "PROPIEDAD_NODO");
        String ruta = ctx.PROPIEDAD().getText();
        String[] partes = ruta.split("#");
        String nombrePropiedad=partes[1];
        _tablasimbolos.addClassName(nombrePropiedad);
        _tablasimbolos.addValue("name", nombrePropiedad);
        return null;
    }

    @Override
    public Object visitRelacion(gjsonbParser.RelacionContext ctx) {
        _tablasimbolos.newNodo();
        _tablasimbolos.addValue("id", "RELACION_NODO");
        String ruta = ctx.RELACION().getText();
        String[] partes = ruta.split("#");
        String nombreRelacion=partes[1];
        _tablasimbolos.addClassName(nombreRelacion);
        _tablasimbolos.addValue("name", nombreRelacion);
        return null;
    }
   
    @Override
    public Object visitTextoEs(gjsonbParser.TextoEsContext ctx) {
        _tablasimbolos.addValue("labelEs", ctx.TEXTO().getText());
        return null;
    }
    @Override
    public Object visitTextoIn(gjsonbParser.TextoInContext ctx) {
        _tablasimbolos.addValue("labelIn", ctx.TEXTO().getText());
        return null;
    }

    @Override
    public Object visitTextoEsReverse(gjsonbParser.TextoEsReverseContext ctx) {
        _tablasimbolos.addValue("labelEsRev", ctx.TEXTO().getText());
        return null;
    }

    @Override
    public Object visitTextoInReverse(gjsonbParser.TextoInReverseContext ctx) {
        _tablasimbolos.addValue("labelInRev", ctx.TEXTO().getText());
        return null;
    }
    @Override
    public Object visitProp(gjsonbParser.PropContext ctx) {
        //_tablasimbolos.addValue("propiedad", ctx.TEXTO().getText());
        _tablasimbolos.addProp(ctx.TEXTO().getText());
        return null;
    }

    @Override
    public Object visitFrom(gjsonbParser.FromContext ctx) {
        _tablasimbolos.addValue("from", ctx.TEXTO().getText());
        return null;
    }

    @Override
    public Object visitTo(gjsonbParser.ToContext ctx) {
        _tablasimbolos.addValue("to", ctx.TEXTO().getText());
        return null;
    }

    @Override
    public Object visitUsedby(gjsonbParser.UsedbyContext ctx) {
        _tablasimbolos.addValue("usedBy", ctx.TEXTO().getText());
        return null;
    }

    @Override
    public Object visitTypeOf(gjsonbParser.TypeOfContext ctx) {
        _tablasimbolos.addValue("typeOf", ctx.TEXTO().getText());
        return null;
    }

    @Override
    public Object visitIsList(gjsonbParser.IsListContext ctx) {
        _tablasimbolos.addValue("isList", ctx.BOOL().getText());
        return null;
    }

    @Override
    public Object visitMultiplicityMax(gjsonbParser.MultiplicityMaxContext ctx) {
        _tablasimbolos.addValue("mulMax", ctx.TEXTO().getText());
        return null;
    }

    @Override
    public Object visitMultiplicityMin(gjsonbParser.MultiplicityMinContext ctx) {
        _tablasimbolos.addValue("mulMin", ctx.TEXTO().getText());
        return null;
    }

    @Override
    public Object visitInherits(gjsonbParser.InheritsContext ctx) {
        _tablasimbolos.addValue("hereda", ctx.TEXTO().getText());
        return null;
    }
}