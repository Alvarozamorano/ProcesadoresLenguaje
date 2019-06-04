package fuente;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.*;

public class CSVListenerAvanzado extends gcsvParserBaseListener{
    public static final String CAMPO_VACIO="";

    private TSimb_CSV _tablasimbolos;

    public CSVListenerAvanzado(){
        super();
    }

    public CSVListenerAvanzado(TSimb_CSV p_ts){
        super();
        _tablasimbolos = p_ts;
    }

    @Override
    public void exitColumnaConComillas(gcsvParser.ColumnaConComillasContext ctx) {
        _tablasimbolos.addColumn(ctx.CADENA().getText());
    }

    @Override
    public void exitColumnaSinComillas(gcsvParser.ColumnaSinComillasContext ctx) {
        _tablasimbolos.addColumn(ctx.TEXTO().getText());
    }

    @Override
    public void exitColumnaVacio(gcsvParser.ColumnaVacioContext ctx) {
        _tablasimbolos.addColumn(CSVListenerAvanzado.CAMPO_VACIO);
    }

    @Override
    public void enterLinea(gcsvParser.LineaContext ctx) {
        _tablasimbolos.newRow();
    }

    @Override
    public void exitTextoSinComillas(gcsvParser.TextoSinComillasContext ctx) {
        _tablasimbolos.addValue(ctx.TEXTO().getText());
    }


    @Override
    public void exitStringConComillas(gcsvParser.StringConComillasContext ctx) {
        _tablasimbolos.addValue(ctx.CADENA().getText());
        
    }


    @Override
    public void exitCampoVacio(gcsvParser.CampoVacioContext ctx) {
        _tablasimbolos.addValue(CSVListenerAvanzado.CAMPO_VACIO);
    }
    
}