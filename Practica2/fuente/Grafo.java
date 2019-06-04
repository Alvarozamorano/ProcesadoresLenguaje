package fuente;

import java.util.*;

/**
 * Clase que guarda los datos de un grafo que está compuesto el json
 */
public class Grafo{
    //Aqui se guardan los distintos nodos que esta formado el Grafo con sus respectivos datos
    private ArrayList<HashMap<String,String>> _nodos = new ArrayList<HashMap<String,String>>();
    //Aqui se guardan las propiedades de las que estan compuestas cada nodo clase o relacion
    private ArrayList<ArrayList<String>> _propiedades = new ArrayList<ArrayList<String>>();
    //Aqui se guardan el nombre de las clases o de las relaciones de las que esta compuestas el grafo
    private ArrayList<String> _nombresClases = new ArrayList<String>();

    /**
     * Método para crear tantas nodos como sean necesarios 
     * @param p_filas
     */
    private void crea_nodos(int p_nodos){
        while(_nodos.size()<p_nodos){
            _nodos.add(new HashMap<String,String>());
        }        
    }

    /**
     * Metodo para añadir un nuevo nodo
     * 
     */
    public void newNodo(){      
        //this.crea_nodos(_estructuras.get(num-1).size()+1);
        this.crea_nodos(_nodos.size()+1);
    }

    /**
     * Metodo para añadir un hashmap (clave,valor) en un nodo concreto
     * @param p_nodo
     * @param clave
     * @param valor
     */
    public void addValue(int p_nodo,String clave,String valor){
        //Me aseguro que tengo nodos donde introducir datos
        this.crea_nodos(p_nodo);

        //Añadimos los datos en el nodo que me han pedido
        _nodos.get(p_nodo-1).put(clave, valor);
    
    }

    /**
     * Metodo de utilidad para añadir un hashmap(clave,valor) al ultimo nodo
     * del ultimo grafo disponible
     * @param clave
     * @param valor
     */
    public void addValue(String clave,String valor){
        this.addValue(_nodos.size(), clave, valor);  
    }

    /**
     * Método que se encarga de añadir una propiedad al ArrayList de propiedades
     * en su celda correspondiente a su clase o relacion
     * @param p_prop
     */
    public void addProperty(String p_prop){
        String[] partes = p_prop.split("#");
        String nombrePropiedad=partes[1];
        _propiedades.get(_nombresClases.size()-1).add(nombrePropiedad);
    }

    /**
     * Método que se encarga de añadir los nombres de las clases o relaciones al 
     * ArrayList de _nombreClases
     * @param p_nombre
     */
    public void addNameClass(String p_nombre){
        _nombresClases.add(p_nombre);
        _propiedades.add(new ArrayList<String>());
    }
    
    /**
     * Método que se encarga de devolver el ArrayList de HashMap de los nodos
     * que presenta el grafo
     * @return
     */
    public ArrayList<HashMap<String,String>> getNodos(){
        return _nodos;
    }

    /**
     * Método que se encarga de devolver el ArrayList de ArrayList de String 
     * con los nombres de las propiedades que contiene cada nodo clase o propiedad
     * @return
     */
    public ArrayList<ArrayList<String>> getProperties(){
        return _propiedades;
    }
    
    /**
     * Método que se encarga de devolver el ArrayList de los nombres de las clases
     * o relaciones que contiene el grafo
     * @return
     */
    public ArrayList<String> getNameClasses(){
        return _nombresClases;
    }

    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("NODOS: \r\n" + _nodos.toString() + "\r\n");
        sb.append("Nombre clases: \r\n" + _nombresClases.toString() + "\r\n");
        sb.append("PROPIEDADES: \r\n" + _propiedades.toString() + "\r\n");

        return sb.toString();

    }


}