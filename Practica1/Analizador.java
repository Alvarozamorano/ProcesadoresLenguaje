import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Analizador{

    //Método de entrada por defecto

    public static void main(String[] args) throws Exception{
        //Inicializamos la entrada de datos
        String inputFile=null;
        if(args.length>0) inputFile=args[0];

        //Inicializamos los streams de datos
        InputStream is=System.in;
        if(inputFile!=null) is = new FileInputStream(inputFile);

        //Inicializo ANTLR con el fichero
        ANTLRInputStream input = new ANTLRInputStream(is);

        //conectamos con el lexer
        gFiboLexer lexer = new gFiboLexer(input);

        //inicializamos el canal de tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        //preparamos el parser
        gFiboParser parser = new gFiboParser(tokens);

        //generar arbol a partir del axioma de la gramatica
        ParseTree tree = parser.fichero();

        //Recorrer el arbol:
        //1-Inicializar un recorredor
        //2-Inicializar mi escuchador
        //3-Recorrer el arbol

        //1
        ParseTreeWalker walker = new ParseTreeWalker();
        //2
        AnalizadorListener escuchador = new AnalizadorListener();
        //3
        walker.walk(escuchador,tree);

        //generar archivo html 
        String ruta = "./"+args[1]+".html";
        File archivo = new File(ruta);
        BufferedWriter bw;
        //if(archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write(escuchador.getString());
        /*} else {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write(escuchador.getString());
        }*/
        bw.close();
        
    }
}