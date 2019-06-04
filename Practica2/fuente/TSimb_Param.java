package fuente;

import java.util.*;

/**
 * Esta clase se encarga de mantener los datos de los parametros de entrada
 */

public class TSimb_Param {

    private String json = "";
    private String dot = "";
    private String svg = "";
    private String csv = "";
    private boolean hayCSV = false;

    private ArrayList<HashMap<String, String>> _filas = new ArrayList<HashMap<String, String>>();
    private ArrayList<String> _columnas = new ArrayList<String>();

    /**
     * Método auxiliar para obtener el array de filas
     * 
     * @return
     */
    public ArrayList<HashMap<String, String>> getFilas() {
        return _filas;
    }

    /**
     * Metodo que se encarga de añadir una columna nueva a la lista de columnas del
     * CSV No se especifica la posicion porque esto debe establecerse por orden de
     * lectura
     * 
     * @param p_nombreColumna Nombre de la columna a insertar
     */
    public void addColumn(String p_nombreColumna) {
        _columnas.add(p_nombreColumna);
    }

    /**
     * Metodo para saber si un nombre de columna existe y que indice tiene
     * 
     * @param p_nombreColumna Nombre de la columna a buscar
     * @return
     */
    public int getColumnIndex(String p_nombreColumna) {
        return _columnas.indexOf(p_nombreColumna);
    }

    /**
     * Dado el indice de una columna, nos devuelve su nombre
     * 
     * @param p_indiceColumna
     * @return
     */
    public String getColumnName(int p_indiceColumna) {
        return _columnas.get(p_indiceColumna);
    }

    /**
     * Método para crear tantas filas como sean necesarias si no hay suficientes
     * para lo que solicita el usuario
     * 
     * @param p_filas
     */
    private void crea_filas(int p_filas) {
        while (_filas.size() < p_filas) {
            _filas.add(new HashMap<String, String>());
        }
    }

    /**
     * Metodo para crear una nueva fila
     * 
     */
    public void newRow() {
        this.crea_filas(_filas.size() + 1);
    }

    /**
     * Metodo que introduce de manera efectiva los datos de una celda en su
     * estructura
     * 
     * @param p_fila    Numero de la fila
     * @param p_columna Nombre de la columna
     * @param p_valor   Valor a introducir
     */
    public void addValue(int p_fila, String p_columna, String p_valor) {
        // Me aseguro que tengo filas donde introducir datos
        this.crea_filas(p_fila);

        // Añadimos los datos en la fila que me han pedido
        _filas.get(p_fila - 1).put(p_columna, p_valor);
    }

    /**
     * Método que introduce datos de una celda segun su indice de fila,columna
     * 
     * @param p_fila    Numero de fila
     * @param p_columna Numero de columna
     * @param p_valor   valor a introducir
     */
    public void addValue(int p_fila, int p_columna, String p_valor) {
        // Hacemos uso del método de introduccion de datos
        this.addValue(p_fila, this.getColumnName(p_columna), p_valor);
    }

    /**
     * Metodo para la recuperacion efectiva de los datos de una celda de la
     * estructura
     * 
     * @param p_fila    fila a leer
     * @param p_columna nombre de columna a recuperar
     * @return
     */
    public String getValue(int p_fila, String p_columna) {
        return _filas.get(p_fila - 1).get(p_columna);
    }

    /**
     * Metodo que recupera los datos segun las coordenadas fila,columna
     * 
     * @param p_fila    numero de fila a recuperar (base 1)
     * @param p_columna numero de columna a recuperar (base 0)
     * @return
     */
    public String getValue(int p_fila, int p_columna) {
        return this.getValue(p_fila, this.getColumnName(p_columna));
    }

    /**
     * Metodo de utilidad para introducir valores en la ultima fila de la estructura
     * disponible
     * 
     * @param p_columna Nombre de la columna
     * @param p_valor   Valor a introducir
     */
    public void addValue(String p_columna, String p_valor) {
        this.addValue(_filas.size(), p_columna, p_valor);
    }

    /**
     * Metodo de utilidad para introducir valores en la ultima fila sin el nombre de
     * la columna, solo con su indice (base 0)
     * 
     * @param p_columna Indice de la columna (base 0)
     * @param p_valor   valor a introducir
     */
    public void addValue(int p_columna, String p_valor) {
        this.addValue(_filas.size(), p_columna, p_valor);
    }

    /**
     * Metodo de utilidad para introducir un valor al final absoluto de la
     * estructura de datos
     * 
     * @param p_valor
     */
    public void addValue(String p_valor) {
        addValue(_filas.size(), _filas.get(_filas.size() - 1).size(), p_valor);
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\nTabla de simbolos PARAM:\r\n");
        sb.append("JSON: " + json);
        sb.append("DOT: " + dot);
        sb.append("SVG: " + svg);
        sb.append("CSV: " + csv);
        sb.append("Numero de columnas: " + columnSize() + " - Numero de filas: " + this.size() + "\r\n");
        sb.append("Columnas disponibles: \r\n" + _columnas.toString() + "\r\n");
        sb.append("Filas disponibles: \r\n" + _filas.toString() + "\r\n");

        return sb.toString();
    }

    /**
     * Metodo auxiliar para devolver el numero de filas
     * 
     * @return
     */
    public int size() {
        return _filas.size();
    }

    /**
     * Metodo auxiliar para devolver el numero de columnas
     */
    public int columnSize() {
        return _columnas.size();
    }

    /**
     * Método para comprobar si han introducido CSV
     */
    public boolean hayCsv() {
        return hayCSV;
    }

    //Métodos get y set para cada una de las rutas
    public void setJson(String ruta) {
        json = ruta;
    }

    public String getJson() {
        return json;
    }

    public void setDot(String ruta) {
        dot = ruta;
    }

    public String getDot() {
        return dot;
    }

    public void setSvg(String ruta) {
        svg = ruta;
    }

    public String getSvg() {
        return svg;
    }

    public void setCsv(String ruta) {
        csv = ruta;
        hayCSV = true;
    }

    public String getCsv() {
        return csv;
    }
}