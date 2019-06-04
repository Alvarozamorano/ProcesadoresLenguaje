package fuente;

import java.util.*;

/**
 * Esta clase se encarga de mantener los datos de un JSON
 */

public class TbSimbJson {
    //Aqui se guarda el nombre de cada grafo
    private ArrayList<String> _grafos = new ArrayList<String>();
    //Aqui se guarda el tipo de cada grafo
    private ArrayList<String> _tipoGrafos = new ArrayList<String>();
    //Aqui se guardan los Grafos que esta compuesto el JSON
    private ArrayList<Grafo> _estructuras = new ArrayList<Grafo>();

    /**
     * Metodo para devolver el número de grafos que hay en el archivo JSON
     * @return
     */
    public int getNGrafos (){
        return _grafos.size();
    }

    /**
     * Metodo que se encarga de añadir un grafo nuevo a la lista de grafos del JSON
     * No se especifica la posicion porque esto debe establecerse por orden de
     * lectura
     * 
     * @param p_nombreGrafo Nombre del grafo a insertar
     */
    public void addGrafo(String p_nombreGrafo) {
        _grafos.add(p_nombreGrafo);
        this.newGrafo();
    }

    /**
     * Metodo para saber si un nombre de grafo existe y que indice tiene
     * 
     * @param p_nombreGrafo Nombre del grafo a buscar
     * @return
     */
    public int getGrafoIndex(String p_nombreGrafo) {
        return _grafos.indexOf(p_nombreGrafo);
    }

    /**
     * Dado el indice de una grafo, nos devuelve su nombre
     * 
     * @param p_indiceGrafo
     * @return
     */
    public String getGrafoName(int p_indiceGrafo) {
        return _grafos.get(p_indiceGrafo);
    }

    /**
     * Metodo que se encarga de añadir un tipo de grafo nuevo a la lista de tipos
     * del JSON No se especifica la posicion porque esto debe establecerse por orden
     * de lectura
     * 
     * @param p_tipoGrafo Nombre del grafo a insertar
     */
    public void addTypeGrafo(String p_tipoGrafo) {
        _tipoGrafos.add(p_tipoGrafo);
    }

    /**
     * Metodo para saber si un tipo de grafo existe y que indice tiene
     * 
     * @param p_tipoGrafo Tipo del grafo a buscar
     * @return
     */
    public int getTypeGrafoIndex(String p_tipoGrafo) {
        return _tipoGrafos.indexOf(p_tipoGrafo);
    }

    /**
     * Dado el indice de un tipo de grafo, nos devuelve su nombre
     * 
     * @param p_tipoGrafo
     * @return
     */
    public String getTypeGrafoName(int p_tipoGrafo) {
        return _tipoGrafos.get(p_tipoGrafo);
    }

    /**
     * Metodo que añade un nuevo grafo
     */
    private void newGrafo() {
        // _estructuras.add(new ArrayList<HashMap<String,String>>());
        _estructuras.add(new Grafo());
    }

    /**
     * Metodo para añadir un nuevo nodo
     * 
     */
    public void newNodo() {
        _estructuras.get(_grafos.size() - 1).newNodo();
        // this.crea_nodos(_estructuras.get(num-1).size()+1);
    }

    /**
     * Metodo de utilidad para añadir un hashmap(clave,valor) al ultimo nodo del
     * ultimo grafo disponible
     * 
     * @param clave
     * @param valor
     */
    public void addValue(String clave, String valor) {
        _estructuras.get(_grafos.size() - 1).addValue(clave, valor);
    }

    /**
     * Método que añade una propiedad al arrayList de la clase Grafo en su Array
     * correspondiente
     * 
     * @param valor
     */
    public void addProp(String valor) {
        _estructuras.get(_grafos.size() - 1).addProperty(valor);
    }

    /**
     * Método oque añade el nombre de una clase o relacion en el ArrayList de
     * nombres de clases y relaciones
     * 
     * @param p_nombre
     */
    public void addClassName(String p_nombre) {
        _estructuras.get(_grafos.size() - 1).addNameClass(p_nombre);
    }

    /**
     * Método que devuelve la tabla de simbolos de un grafo en concreto según su
     * indice
     * 
     * @param p_indice
     * @return
     */
    public Grafo getGrafo(int p_indice) {
        return _estructuras.get(p_indice);
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\nTabla de simbolos JSON:\r\n");
        sb.append("Numero de grafos: " + _grafos.size() + "\r\n");
        sb.append("Nombre de grafos: \r\n" + _grafos.toString() + "\r\n");
        sb.append("Tipo de grafos: \r\n" + _tipoGrafos.toString() + "\r\n");
        for (int i = 0; i < _grafos.size(); i++) {
            sb.append("GRAFO " + i + " :\r\n" + _estructuras.get(i).toString() + "\r\n");
        }
        return sb.toString();
    }
}