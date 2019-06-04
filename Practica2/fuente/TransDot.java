package fuente;

import java.util.*;

public class TransDot {
    private Grafo _grafo;
    private ArrayList<HashMap<String, String>> _nodosGrafo;
    private ArrayList<String> _clasesEntrantes;
    private ArrayList<ArrayList<String>> _propiedadesPropias;
    private String _nombre;
    private String _tipo;
    private StringBuffer _propiedadesBuffer = new StringBuffer();
    private StringBuffer _clasesBuffer = new StringBuffer();
    private StringBuffer _relacionesBuffer = new StringBuffer();
    private StringBuffer _clasepropBuffer = new StringBuffer();
    private StringBuffer _relpropBuffer = new StringBuffer();
    private StringBuffer _usoindBuffer = new StringBuffer();
    private StringBuffer _asociacionesBuffer = new StringBuffer();
    private StringBuffer _herenciasBuffer = new StringBuffer();
    private StringBuffer _enlacesrelBuffer = new StringBuffer();
    private static LinkedHashMap<String, String> formato;
    private static LinkedHashMap<String, ArrayList<String>> formParametros;

    /**
     * Constructor
     * 
     * @param grafo_ts
     * @param p_nombre
     * @param formt
     */
    public TransDot(Grafo grafo_ts, String p_nombre, LinkedHashMap<String, ArrayList<String>> form) {
        super();
        _grafo = grafo_ts;
        _nodosGrafo = _grafo.getNodos();
        _clasesEntrantes = _grafo.getNameClasses();
        _propiedadesPropias = _grafo.getProperties();
        _nombre = p_nombre;
        _tipo = "graph";
        inicializarFormato();
        formParametros = form;
        compararFormato();
    }

    /**
     * Método que se encarga de inicializar el formato por defecto del dot
     */
    private static void inicializarFormato() {
        formato = new LinkedHashMap<String, String>();

        formato.put("Defecto", "node [fontname=\"Arial\"];\nedge [fontname=\"Arial\",fontsize=12];\n\n");

        formato.put("Propiedades", "node [shape=record,style=filled,fillcolor=lightgoldenrodyellow,fontsize=10]\n");

        formato.put("Clases", "node [shape=ellipse,style=filled,fillcolor=lightseagreen,fontsize=20]\n");

        formato.put("Relaciones", "node [shape=hexagon,style=filled,fillcolor=paleturquoise,fontsize=15]\n");

        formato.put("Separar", "edge[style=dashed,len=3,color=grey]\n");

        formato.put("Clase-Prop", "");

        formato.put("Rel-Prop", "");

        formato.put("In-Tipos", "edge [style=dotted,arrowhead=vee,dir=forward,arrowsize=2,label=\"TypeOf\"]\n");

        formato.put("Asoc",
                "edge [fontcolor=orangered, color=orangered, style=dashed, arrowhead=vee,dir=forward,arrowsize=2]\n");

        formato.put("Herencias", "edge[len=5,color=black, arrowhead=normal,arrowsize=3,dir=back,label=\"inherits\"]\n");

        formato.put("Enlaces", "edge[len=2,penwidth=3,color=blue,fontcolor=blue,dir=forward,arrowhead=normal]\n");
    }

    /**
     * Método que se encarga de comparar el formato posible introducido por paramétros
     * y el que tenemos por defecto para cambiar lo que sea necesario
     */
    private static void compararFormato() {
        String rel, clas, prop, her, in, vacio="\r\n\r\n";

        rel = formParametros.get("Relaciones").get(0) + "\r\n" + formParametros.get("Relaciones").get(1) + "\r\n";
        clas = formParametros.get("Clases").get(0) + "\r\n" + formParametros.get("Clases").get(1) + "\r\n";
        prop = formParametros.get("Propiedades").get(0) + "\r\n" + formParametros.get("Propiedades").get(1) + "\r\n";
        her = formParametros.get("Herencias").get(0) + "\r\n" + formParametros.get("Herencias").get(1) + "\r\n";
        in = formParametros.get("In-Tipos").get(0) + "\r\n" + formParametros.get("In-Tipos").get(1) + "\r\n";

        //En caso de que haya parametros para relaciones, clases,... se pondrán esos
        if (!rel.equals(vacio)) {
            formato.replace("Relaciones", rel);
        }

        if (!clas.equals(vacio)) {
            formato.replace("Clases", clas);
        }

        if (!prop.equals(vacio)) {
            formato.replace("Propiedades", prop);
        }

        if (!her.equals(vacio)) {
            formato.replace("Herencias", her);
        }

        if (!in.equals(vacio)) {
            formato.replace("In-Tipos", in);
        }
    }

    /**
     * Método que se encarga de ir recorriendo los hashmap de cada nodo, y según e
     * que tipo sea, llama al método correspondiente
     */
    public void principal() {
        for (int i = 0; i < _nodosGrafo.size(); i++) {
            if (_nodosGrafo.get(i).containsValue("CLASE_NODO")) {
                this.classMethod(_nodosGrafo.get(i));
            } else if (_nodosGrafo.get(i).containsValue("PROPIEDAD_NODO")) {
                this.propertyMethod(_nodosGrafo.get(i));
            } else if (_nodosGrafo.get(i).containsValue("RELACION_NODO")) {
                this.relationshipMethod(_nodosGrafo.get(i));
            }
        }
    }

    /**
     * Método que se encarga de manipular los datos de un nodo clase, y los añade l
     *  buffer correspondiente
     * 
     * @param p_clase
     */
    private void classMethod(HashMap<String, String> p_clase) {
        String nombre = "";
        String propiedad = "";
        String label = "";

        nombre = p_clase.get("name");
        label = p_clase.get("labelEs");

        _clasesBuffer.append("class_" + nombre + " [label=" + "\"" + label + "\"];\r\n");

        int indexOfClass = _clasesEntrantes.indexOf(nombre);
        if (!_propiedadesPropias.get(indexOfClass).isEmpty()) {
            for (int i = 0; i < _propiedadesPropias.get(indexOfClass).size(); i++) {
                propiedad = _propiedadesPropias.get(indexOfClass).get(i);
                _clasepropBuffer.append("class_" + nombre + " -- property_" + propiedad + ";\r\n");
            }
        }

        if (p_clase.containsKey("hereda")) {
            String hereda = p_clase.get("hereda");
            String[] parts = hereda.split("#");
            String claseHeredada = parts[1];
            _herenciasBuffer.append("class_" + claseHeredada + " -- class_" + nombre + ";\r\n");

            /**
             * En este fragmento se añaden las propiedades de la clase a la que hereda y se
             * añaden estas propiedades al arrayList de String de propiedades
             */
            int index = _clasesEntrantes.indexOf(claseHeredada);
            if (!_propiedadesPropias.get(index).isEmpty()) {
                for (int i = 0; i < _propiedadesPropias.get(index).size(); i++) {
                    String propHeredada = _propiedadesPropias.get(index).get(i);
                    _clasepropBuffer.append("class_" + nombre + " -- property_" + propHeredada + ";\r\n");
                    _propiedadesPropias.get(indexOfClass).add(propHeredada);
                }
            }
        }
    }

    /**
     * Método que se encarga de manipular los datos de un nodo propiedad, y los
     * añade al buffer correspondiente
     * 
     * @param p_prop
     */
    private void propertyMethod(HashMap<String, String> p_prop) {
        String nombre = "";
        String type = "";
        String label = "";

        nombre = p_prop.get("name");
        type = p_prop.get("typeOf");
        label = p_prop.get("labelEs");

        _propiedadesBuffer.append("property_" + nombre + " [label=" + "\"{" + label + "|" + type + "}\"];\r\n");

        String[] parts = type.split("#");
        String prop = parts[0];
        if (prop.equals("http://PdL.com/class")) {
            _usoindBuffer.append("property_" + nombre + " -- class_" + parts[1] + ";\r\n");
            if (p_prop.containsKey("mulMax")) {
                String mulMax = p_prop.get("mulMax");
                String mulMin = p_prop.get("mulMin");
                String usedBy = p_prop.get("usedBy");
                String[] partes = usedBy.split("#");
                String usadaPor = partes[1];
                _asociacionesBuffer.append("class_" + usadaPor + " -- class_" + parts[1] + "[label=\"." + nombre
                        + " (" + mulMin + ".." + mulMax + ")\"]\r\n");

            }
        }
    }

    /**
     * Método que se encarga de manipular los datos de un nodo relación, y los a
     * ade al buffer correspondiente
     * 
     * @param p_rela
     */
    private void relationshipMethod(HashMap<String, String> p_rela) {
        String nombre = "";
        String label = "";
        String labelReverse = "";
        String from = "";
        String to = "";
        nombre = p_rela.get("name");
        label = p_rela.get("labelEs");
        labelReverse = p_rela.get("labelEsRev");

        _relacionesBuffer.append("relationship_" + nombre + " [label=\"" + label + "\"];\r\n");

        int indexOfClass = _clasesEntrantes.indexOf(nombre);
        if (!_propiedadesPropias.get(indexOfClass).isEmpty()) {
            for (int i = 0; i < _propiedadesPropias.get(indexOfClass).size(); i++) {
                String propiedad = _propiedadesPropias.get(indexOfClass).get(i);
                _relpropBuffer.append("relationship_" + nombre + " -- property_" + propiedad + ";\r\n");
            }
        }

        from = p_rela.get("from");
        String[] parts = from.split("#");
        String fromClass = parts[1];
        to = p_rela.get("to");
        String[] partsTo = to.split("#");
        String toClass = partsTo[1];
        _enlacesrelBuffer
                .append("class_" + fromClass + " -- relationship_" + nombre + " [label=\"" + label + "\"];\r\n");
        _enlacesrelBuffer
                .append("relationship_" + nombre + " -- class_" + toClass + " [label=\"" + labelReverse + "\"];\r\n");
    }

    /**
     * Método que se encarga de unir todos los buffers
     * 
     * @return
     */
    public String merge() {
        StringBuffer sb = new StringBuffer();
        sb.append(_tipo + " " + _nombre + "{\r\n\n");

        sb.append("//Defecto\r\n");
        sb.append(formato.get("Defecto"));

        if (_propiedadesBuffer.length() > 0) {
            sb.append("//Propiedades\r\n");
            sb.append(formato.get("Propiedades"));
            sb.append(_propiedadesBuffer);
        }

        if (_clasesBuffer.length() > 0) {
            sb.append("\r\n//Clases\r\n");
            sb.append(formato.get("Clases"));
            sb.append(_clasesBuffer);
        }

        if (_relacionesBuffer.length() > 0) {
            sb.append("\r\n//Relaciones\r\n");
            sb.append(formato.get("Relaciones"));
            sb.append(_relacionesBuffer);

            sb.append("\r\n//Se separan elementos\r\n");
            sb.append(formato.get("Separar"));
        }

        if (_clasepropBuffer.length() > 0) {
            sb.append("\r\n//Clase-propiedad\r\n");
            sb.append(formato.get("Clase-Prop"));
            sb.append(_clasepropBuffer);
        }

        if (_relpropBuffer.length() > 0) {
            sb.append("\r\n//Relacion-propiedad\r\n");
            sb.append(formato.get("Rel-Prop"));
            sb.append(_relpropBuffer);
        }

        if (_usoindBuffer.length() > 0) {
            sb.append("\r\n//uso indirecto de definicion de tipos\r\n");
            sb.append(formato.get("In-Tipos"));
            sb.append(_usoindBuffer);
        }

        if (_asociacionesBuffer.length() > 0) {
            sb.append("\r\n//asociaciones a traves de atributos marcadas de forma directa\r\n");
            sb.append(formato.get("Asoc"));
            sb.append(_asociacionesBuffer);
        }

        if (_herenciasBuffer.length() > 0) {
            sb.append("\r\n//herencias\r\n");
            sb.append(formato.get("Herencias"));
            sb.append(_herenciasBuffer);
        }

        if (_enlacesrelBuffer.length() > 0) {
            sb.append("\r\n//Enlaces de las relaciones\r\n");
            sb.append(formato.get("Enlaces"));
            sb.append(_enlacesrelBuffer);
        }

        sb.append("}");
        return sb.toString();
    }

}