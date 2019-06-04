import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class AnalizadorListener extends gFiboParserBaseListener{
    
    
    private String datos=
        "<html>"+
            "<head><title>Fichero PdL-LS01-fibonacci.prog</title>"+
            
                "<style>"+
                    "body{" +
                        "background:grey;"+
                    "}"+
        
                    ".PalabraReservada {"+
                    "color:blue;"+
                    "font-weight:bolder;"+
                    "}"+
                    ".comentario {"+
                    "color:lightgreen;"+
                    "}"+
                    ".nombref {"+
                    "color:white;"+
                    "font-weight:bolder;"+
                    "}"+
                    ".variables {"+
                    "color:yellow;"+
                    "}"+
                    ".tipod {"+
                    "color:red;"+
                    "}"+
                    ".simop {"+
                    "color:black;"+
                    "font-weight:bolder;"+
                    "}"+
                    ".asignacion {"+
                    "color:yellow;"+
                    "font-weight:bolder;"+
                    "}"+
                    ".separadores {"+
                    "color:blue;"+
                    "}"+
                    ".beginEnd {"+
                    "color:orange;"+
                    "font-weight:bolder;"+
                    "}"+
                    ".numeros {"+
                    "color:blue;"+
                    "}"+
                    ".cadenas {"+
                    "color:purple;"+
                    "font-style:italic;"+
                    "}"+

                    "</style>"+
            
            
                    " </head>"+
                    "<body>"+
                    "<h1>C&oacute;digo del fichero PdL-LS01-fibonacci.prog</h1>"+
                    "<code>"+
                    "<pre>";
    

    @Override
    public void enterWs(gFiboParser.WsContext ctx) {
        datos+=ctx.getText();
    }
    @Override
    public void enterComentario(gFiboParser.ComentarioContext ctx) {
        datos+="<span class=\"comentario\">";
        datos+=ctx.getText();
    }

    @Override
    public void exitComentario(gFiboParser.ComentarioContext ctx) {
        datos+="</span>";
    }

    @Override
    public void enterVariable(gFiboParser.VariableContext ctx) {
        datos+="<span class=\"variables\">";
        datos+=ctx.getText();
    }

    @Override
    public void exitVariable(gFiboParser.VariableContext ctx) {
        datos+="</span>";
    }
    
    @Override
    public void enterOperacion(gFiboParser.OperacionContext ctx) {
        datos+="<span class=\"simop\">";
        datos+=ctx.getText();
    }
    @Override
    public void exitOperacion(gFiboParser.OperacionContext ctx) {
        datos+="</span>";
    }
    @Override
    public void enterNombre_funcion(gFiboParser.Nombre_funcionContext ctx) {
        datos+="<span class=\"nombref\">";
        datos+=ctx.getText();
    }

    @Override
    public void exitNombre_funcion(gFiboParser.Nombre_funcionContext ctx) {
        datos+="</span>";
    }
    
    @Override
    public void enterTipo_dato(gFiboParser.Tipo_datoContext ctx) {
        datos+="<span class=\"tipod\">";
        datos+=ctx.getText();
    }

    @Override
    public void exitTipo_dato(gFiboParser.Tipo_datoContext ctx) {
        datos+="</span>";
    }
    
    @Override
    public void enterTipo_dato_salida(gFiboParser.Tipo_dato_salidaContext ctx) {
        datos+="<span class=\"tipod\">";
        datos+=ctx.getText();
    }

    @Override
    public void exitTipo_dato_salida(gFiboParser.Tipo_dato_salidaContext ctx) {
        datos+="</span>";
    }

    @Override
    public void enterComa(gFiboParser.ComaContext ctx) {
        datos+="<span class=\"separadores\">";
        datos+=ctx.getText();
    }

    @Override
    public void exitComa(gFiboParser.ComaContext ctx) {
        datos+="</span>";
    }
    
    @Override
    public void enterIntro(gFiboParser.IntroContext ctx) {
        datos+=ctx.getText();
    }
    
    @Override
    public void enterWhilep(gFiboParser.WhilepContext ctx) {
        datos+="<span class=\"PalabraReservada\">";
        datos+=ctx.getText();
    }

    @Override
    public void exitWhilep(gFiboParser.WhilepContext ctx) {
        datos+="</span>";
    }

    @Override
    public void enterBegin(gFiboParser.BeginContext ctx) {
        datos+="<span class=\"beginEnd\">";
        datos+=ctx.getText();
    }
    @Override
    public void exitBegin(gFiboParser.BeginContext ctx) {
        datos+="</span>";
    }

    @Override
    public void enterEnd(gFiboParser.EndContext ctx) {
        datos+="<span class=\"beginEnd\">";
        datos+=ctx.getText();
    }

    @Override
    public void exitEnd(gFiboParser.EndContext ctx) {
        datos+="</span>";
    }
    @Override
    public void enterDevolver(gFiboParser.DevolverContext ctx) {
        datos+="<span class=\"PalabraReservada\">";
        datos+=ctx.getText();
    }

    @Override
    public void exitDevolver(gFiboParser.DevolverContext ctx) {
        datos+="</span>";
    }
    @Override
    public void enterTerminador(gFiboParser.TerminadorContext ctx) {
        datos+="<span class=\"separadores\">";
        datos+=ctx.getText();
    }
    @Override
    public void exitTerminador(gFiboParser.TerminadorContext ctx) {
        datos+="</span>";
    }
    @Override
    public void enterIncludep(gFiboParser.IncludepContext ctx) {
        datos+="<span class=\"PalabraReservada\">";
        datos+=ctx.getText();
    }

    @Override
    public void exitInclude(gFiboParser.IncludeContext ctx) {
        datos+="</span>";
    }
    @Override
    public void enterParentesisa(gFiboParser.ParentesisaContext ctx) {
        datos+="<span class=\"simop\">";
        datos+=ctx.getText();
    }

    @Override
    public void exitParentesisa(gFiboParser.ParentesisaContext ctx) {
        datos+="</span>";
    }
    @Override
    public void enterParentesisc(gFiboParser.ParentesiscContext ctx) {
        datos+="<span class=\"simop\">";
        datos+=ctx.getText();
    }
    @Override
    public void exitParentesisc(gFiboParser.ParentesiscContext ctx) {
        datos+="</span>";
    }
    @Override
    public void enterMd(gFiboParser.MdContext ctx) {
        //System.out.print(ctx.getText());
        datos+="<span class=\"simop\">";
        datos+=ctx.getText();
    }
    @Override
    public void exitMd(gFiboParser.MdContext ctx) {
        datos+="</span>";
    }
    @Override
    public void enterSr(gFiboParser.SrContext ctx) {
        datos+="<span class=\"simop\">";
        datos+=ctx.getText();
    }
    @Override
    public void exitSr(gFiboParser.SrContext ctx) {
        datos+="</span>";
    }
    @Override
    public void enterComp(gFiboParser.CompContext ctx) {
        datos+="<span class=\"simop\">";
        datos+=ctx.getText();
    }
    @Override
    public void exitComp(gFiboParser.CompContext ctx) {
        datos+="</span>";
    }
    
    
    @Override
    public void enterFuncionp(gFiboParser.FuncionpContext ctx) {
        datos+="<span class=\"PalabraReservada\">";
        datos+=ctx.getText();
    }

    @Override
    public void exitFuncionp(gFiboParser.FuncionpContext ctx) {
        datos+="</span>";
    }

    @Override
    public void enterAsignar(gFiboParser.AsignarContext ctx) {
        datos+="<span class=\"asignacion\">";
        datos+=ctx.getText();
    }

    @Override
    public void exitAsignar(gFiboParser.AsignarContext ctx) {
        datos+="</span>";
    }

    @Override
    public void enterNumero(gFiboParser.NumeroContext ctx) {
        datos+="<span class=\"numeros\">";
        datos+=ctx.getText();
    }

    @Override
    public void exitNumero(gFiboParser.NumeroContext ctx) {
        datos+="</span>";
    }
    @Override
    public void enterCadena(gFiboParser.CadenaContext ctx) {
        datos+="<span class=\"cadenas\">";
        datos+=ctx.getText();
    }
    @Override
    public void exitCadena(gFiboParser.CadenaContext ctx) {
        datos+="</span>";
    }

    @Override
    public void enterDos_puntos(gFiboParser.Dos_puntosContext ctx) {
        datos+="<span class=\"separadores\">";
        datos+=ctx.getText();
    }

    @Override
    public void exitDos_puntos(gFiboParser.Dos_puntosContext ctx) {
        datos+="</span>";
    }
    
    
    public String getString(){
        datos+="</pre>"+
        "</code>"+
        "</body>"+
       "</html>";
        return datos;
    }
    
}