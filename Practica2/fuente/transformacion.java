import fuente.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Path;
import java.util.*;

/**
 *
 * @author Gabriel Lopez Cuenca
 * @author Alvaro Zamorano Ortega
 * @author Samuel Garcia Gonzalez
 */
public class transformacion {

    // Metodo de entrada por defecto
    public static void main(String[] args) throws Exception {

        try {
            if (args.length > 0) {

                ParseTree treeParam = antlrParam(args);

                // Walker para todos los arboles
                ParseTreeWalker walker = new ParseTreeWalker();

                // Crear tabla de símbolos para la entrada
                TSimb_Param tsParam = new TSimb_Param();

                // Crear listener para la entrada
                TransformacionListener escuchadorParam = new TransformacionListener(tsParam);

                // Recorrer arbol entrada
                walker.walk(escuchadorParam, treeParam);

                // Almacenar el formato introducido en los parámetros
                LinkedHashMap<String, ArrayList<String>> form = trFormato(tsParam);

                TbSimbJson tsJSON;

                if (tsParam.hayCsv()) {
                    System.out.println("... procesando CSV");

                    String rC = tratarCSV(tsParam.getCsv());

                    // Procesar archivo CSV
                    TSimb_CSV tsCSV = new TSimb_CSV();
                    CSVListenerAvanzado escuchadorCSV = new CSVListenerAvanzado(tsCSV);
                    ParseTree treeCSV = antlrCSV(rC);
                    walker.walk(escuchadorCSV, treeCSV);

                    String rutaJson, rutaDot, rutaSvg;

                    // Para cada uno de los JSON del CSV se procesan y se generan
                    // los dot necesarios
                    for (int i = 0; i < tsCSV.getFilas().size(); i++) {
                        rutaJson = tsCSV.getFilas().get(i).get("rutafichero");
                        rutaDot = tsCSV.getFilas().get(i).get("rutaficherosalida");
                        rutaSvg = tsCSV.getFilas().get(i).get("rutaficherografico");
                        tsJSON = procJSON(rutaJson, i + 1);
                        generarDOT(rutaDot, rutaSvg, tsJSON, form);
                    }

                } else {
                    // Cogemos el JSON directamente de los parametros
                    tsJSON = procJSON(tsParam.getJson(), 0);
                    generarDOT(tsParam.getDot(), tsParam.getSvg(), tsJSON, form);
                }

                // Generados los Dot y Svg necesarios
                System.out.println("\r\n*** Archivos generados correctamente ***\r\n");

            } else {
                System.out.println("No hay parametros");
            }
        } catch (Exception e) {
            System.out.println("ERROR");
        }

    }

    /**
     * Método que se encarga de almacenar el formato posible introducido en los 
     * aramétros del programa
     * 
     * @param ts
     * @return
     */
    private static LinkedHashMap<String, ArrayList<String>> trFormato(TSimb_Param ts) {
        LinkedHashMap<String, ArrayList<String>> form = new LinkedHashMap<String, ArrayList<String>>();
        ArrayList<String> rel = new ArrayList<String>();
        ArrayList<String> clas = new ArrayList<String>();
        ArrayList<String> prop = new ArrayList<String>();
        ArrayList<String> her = new ArrayList<String>();
        ArrayList<String> in = new ArrayList<String>();

        ArrayList<HashMap<String, String>> filas = ts.getFilas();

        String rel_e = "edge [", clas_e = "edge [", prop_e = "edge [", her_e = "edge [", in_e = "edge [",
                rel_n = "node [", clas_n = "node [", prop_n = "node [", her_n = "node [", in_n = "node [";

        // Para cada una de las filas, se mira al tipo de elemento que afectan y se
        // introduce
        // en su String correspondiente con un formato adecuado
        for (int i = 0; i < filas.size(); i++) {
            if (filas.get(i).get("Elemento").equals("Relaciones")) {
                if (filas.get(i).get("Edno").equals("edge")) {
                    rel_e += filas.get(i).get("Parametro") + "=" + filas.get(i).get("Valor") + ",";
                } else if (filas.get(i).get("Edno").equals("node")) {
                    rel_n += filas.get(i).get("Parametro") + "=" + filas.get(i).get("Valor") + ",";
                }
            } else if (filas.get(i).get("Elemento").equals("Clases")) {
                if (filas.get(i).get("Edno").equals("edge")) {
                    clas_e += filas.get(i).get("Parametro") + "=" + filas.get(i).get("Valor") + ",";
                } else if (filas.get(i).get("Edno").equals("node")) {
                    clas_n += filas.get(i).get("Parametro") + "=" + filas.get(i).get("Valor") + ",";
                }

            } else if (filas.get(i).get("Elemento").equals("Propiedades")) {
                if (filas.get(i).get("Edno").equals("edge")) {
                    prop_e += filas.get(i).get("Parametro") + "=" + filas.get(i).get("Valor") + ",";
                } else if (filas.get(i).get("Edno").equals("node")) {
                    prop_n += filas.get(i).get("Parametro") + "=" + filas.get(i).get("Valor") + ",";
                }

            } else if (filas.get(i).get("Elemento").equals("Herencias")) {
                if (filas.get(i).get("Edno").equals("edge")) {
                    her_e += filas.get(i).get("Parametro") + "=" + filas.get(i).get("Valor") + ",";
                } else if (filas.get(i).get("Edno").equals("node")) {
                    her_n += filas.get(i).get("Parametro") + "=" + filas.get(i).get("Valor") + ",";
                }

            } else if (filas.get(i).get("Elemento").equals("In-Tipos")) {
                if (filas.get(i).get("Edno").equals("edge")) {
                    in_e += filas.get(i).get("Parametro") + "=" + filas.get(i).get("Valor") + ",";
                } else if (filas.get(i).get("Edno").equals("node")) {
                    in_n += filas.get(i).get("Parametro") + "=" + filas.get(i).get("Valor") + ",";
                }
            }
        }

        // Comprobar si previamente se han introducido datos para terminar de
        // completarlos
        // o introducir la cadena vacía en la estructura
        if (!rel_e.equals("edge [")) {
            rel_e = rel_e.substring(0, rel_e.length() - 1) + "]";
            rel.add(rel_e);
        } else {
            rel.add("");
        }

        if (!rel_n.equals("node [")) {
            rel_n = rel_n.substring(0, rel_n.length() - 1) + "]";
            rel.add(rel_n);
        } else {
            rel.add("");
        }

        if (!clas_e.equals("edge [")) {
            clas_e = clas_e.substring(0, clas_e.length() - 1) + "]";
            clas.add(clas_e);
        } else {
            clas.add("");
        }

        if (!clas_n.equals("node [")) {
            clas_n = clas_n.substring(0, clas_n.length() - 1) + "]";
            clas.add(clas_n);
        } else {
            clas.add("");
        }

        if (!prop_e.equals("edge [")) {
            prop_e = prop_e.substring(0, prop_e.length() - 1) + "]";
            prop.add(prop_e);
        } else {
            prop.add("");
        }

        if (!prop_n.equals("node [")) {
            prop_n = prop_n.substring(0, prop_n.length() - 1) + "]";
            prop.add(prop_n);
        } else {
            prop.add("");
        }

        if (!her_e.equals("edge [")) {
            her_e = her_e.substring(0, her_e.length() - 1) + "]";
            her.add(her_e);
        } else {
            her.add("");
        }

        if (!her_n.equals("node [")) {
            her_n = her_n.substring(0, her_n.length() - 1) + "]";
            her.add(her_n);
        } else {
            her.add("");
        }

        if (!in_e.equals("edge [")) {
            in_e = in_e.substring(0, in_e.length() - 1) + "]";
            in.add(in_e);
        } else {
            in.add("");
        }

        if (!in_n.equals("node [")) {
            in_n = in_n.substring(0, in_n.length() - 1) + "]";
            in.add(in_n);
        } else {
            in.add("");
        }

        // Finalmente se añade a la estructura general
        form.put("Relaciones", rel);
        form.put("Clases", clas);
        form.put("Propiedades", prop);
        form.put("Herencias", her);
        form.put("In-Tipos", in);

        return form;
    }

    /**
     * Método que se encarga de procesar cada uno de los JSON introducidos, 
     * evolviendo su tabla de símbolos
     * 
     * @return
     */
    private static TbSimbJson procJSON(String rJson, int ind) {
        String imprimir = "\r\n... procesando JSON";
        if (ind > 0) {
            imprimir += " " + ind;
        }
        System.out.println(imprimir);

        TbSimbJson tsJSON = null;
        try {
            tsJSON = new TbSimbJson();
            VisitorJson visitorJSON = new VisitorJson(tsJSON);
            ParseTree treeJSON = antlrJSON(rJson);
            visitorJSON.visit(treeJSON);

        } catch (Exception e) {
            System.out.println("Error al procesar JSON");
        }

        return tsJSON;
    }

    /**
     * Método encargado de generar un dot y para cada uno de ellos, llamar al 
     * étodo correspondiente de generar el svg
     * 
     * @param rutaDOT
     * @param rutaSVG
     * @param tsJ
     * @param form
     */
    private static void generarDOT(String rutaDOT, String rutaSVG, TbSimbJson tsJ,
            LinkedHashMap<String, ArrayList<String>> form) {
        try {
            String nombreGrafo, tipoGrafo;
            File archivo;
            BufferedWriter bw;
            Grafo grafo;
            TransDot dot;

            int ngrafos = tsJ.getNGrafos();
            String rutaDot = "", rutaSvg = "";
            ArrayList<String> rutas;

            for (int i = 0; i < ngrafos; i++) {
                if (ngrafos == 1) {
                    // Si solo hay un grafo no hay que generar ninguna ruta nueva
                    rutaDot = rutaDOT;
                    rutaSvg = rutaSVG;
                } else {
                    rutas = rutas(i, rutaDOT, rutaSVG);
                    rutaDot = rutas.get(0);
                    rutaSvg = rutas.get(1);
                }

                archivo = new File(rutaDot);
                grafo = tsJ.getGrafo(i);
                nombreGrafo = tsJ.getGrafoName(i);
                tipoGrafo = tsJ.getTypeGrafoName(i);
                dot = new TransDot(grafo, nombreGrafo, form);
                dot.principal();
                bw = new BufferedWriter(new FileWriter(archivo));
                bw.write(dot.merge());
                bw.close();

                // Para cada uno de los DOT se genera un SVG
                generarSVG(rutaSvg, rutaDot, tipoGrafo);
            }

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    /**
     * Método encargado de dar formato a las rutas introducidas en caso de que el
     * json tenga varios grafos
     * 
     * @return
     */
    private static ArrayList<String> rutas(int i, String rutaDot, String rutaSvg) {

        if (rutaDot.contains("\\\\")) {
            rutaDot = rutaDot.replaceAll("\\\\", "/");
        }

        if (rutaSvg.contains("\\\\")) {
            rutaSvg = rutaSvg.replaceAll("\\\\", "/");
        }

        ArrayList<String> rutas = new ArrayList<String>();
        String rutaD = "", rutaS = "";

        String[] partD = rutaDot.split("/");
        for (int j = 0; j < partD.length - 1; j++) {
            rutaD += partD[j] + "/";
        }
        rutaD += "nombre" + (i + 1) + "-" + partD[partD.length - 1];

        String[] partS = rutaSvg.split("/");
        for (int k = 0; k < partS.length - 1; k++) {
            rutaS += partS[k] + "/";
        }
        rutaS += "nombre" + (i + 1) + "-" + partS[partS.length - 1];

        rutas.add(rutaD);
        rutas.add(rutaS);

        return rutas;
    }

    /**
     * Método para añadir comillas a las rutas para que estas puedan contener _
     * 
     * @param arg
     */
    private static String tratarArgs(String arg) {
        String ar="";

        if (arg.contains("JSON") || arg.contains("DOT") || arg.contains("SVG") || arg.contains("CSV")){
            String[] partArg = arg.split("=");
            ar = partArg[0] + "=\"" + partArg[1] + "\"";
        } else {
            ar = arg;
        }
        
        return ar;
    }

    /**
     * Método encargado de enlazar los parámetros del programa con la gramática co
     *  respondiente
     * 
     * @param args
     * @return
     */
    private static ParseTree antlrParam(String[] args) {
        gParamParser parser = null;
        try {
            String inputFile = ""; // Inicializar entrada de datos
            
            for (int i = 0; i < args.length; i++) { 
                inputFile += tratarArgs(args[i]) + " "; 
            }

            ANTLRInputStream input = new ANTLRInputStream(inputFile);

            gParamLexer lexer = new gParamLexer(input);

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            parser = new gParamParser(tokens);

            parser.setBuildParseTree(true);

        } catch (Exception e) {
            System.out.println("Error al procesar entrada");
        }

        return parser.parametros();
    }

    /**
     * Método encargado de pasarle a la gramática correspondiente el archivo CSV
     * 
     * @param csv
     * @return
     */
    private static ParseTree antlrCSV(String csv) {
        gcsvParser parser = null;
        try {
            InputStream is = new FileInputStream(csv);

            ANTLRInputStream input = new ANTLRInputStream(is);

            gcsvLexer lexer = new gcsvLexer(input);

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            parser = new gcsvParser(tokens);

            parser.setBuildParseTree(true);

        } catch (Exception e) {
            System.out.println("Error al procesar CSV");
        }

        return parser.fichero();
    }

    /**
     * Método encargado de pasarle a la gramática correspondiente el archivo JSON
     * 
     * @param json
     * @return
     */
    private static ParseTree antlrJSON(String json) {
        gjsonbParser parser = null;
        try {
            InputStream is = new FileInputStream(json);

            ANTLRInputStream input = new ANTLRInputStream(is);

            gjsonbLexer lexer = new gjsonbLexer(input);

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            parser = new gjsonbParser(tokens);

            parser.setBuildParseTree(true);

        } catch (Exception e) {
            System.out.println("Error al procesar JSON");
        }

        return parser.fichero();
    }

    /**
     * Método para generar un svg mediante la ejecución de dot o neato d pendiendo
     * del tipo de grafo
     * 
     * @param rutaOut
     * @param rutaIn
     * @param tipo
     */
    private static void generarSVG(String rutaOut, String rutaIn, String tipo) {
        try {
            ProcessBuilder pbuilder;

            switch (tipo) {
            case "@tree":
                pbuilder = new ProcessBuilder("dot", "-Tsvg", "-o", rutaOut, rutaIn);
                pbuilder.redirectErrorStream(true);
                pbuilder.start();
                break;
            case "@graph":
                pbuilder = new ProcessBuilder("neato", "-Tsvg", rutaIn, "-o", rutaOut);
                pbuilder.redirectErrorStream(true);
                pbuilder.start();
                break;
            default:
                System.out.println("Tipo de grafo incompatible");
                break;
            }

        } catch (IOException e) {
            System.out.println("Error al crear SVG");
        }
    }

    /**
     * Método para introducir intro al final del fichero CSV
     * 
     * @param r
     */
    private static String tratarCSV(String r) {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(r, true));
            out.write("\r\n");
            out.close();
        } catch (IOException e) {
            System.out.println("Error al añadir intro en CSV");
        }
        return r;
    }
}