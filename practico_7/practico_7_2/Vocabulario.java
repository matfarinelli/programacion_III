package practico_7.practico_7_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Vocabulario {

    private HashSet<String> vocabulario;
    private ArrayList<String> vocabulario_completo;
    private HashMap<String, Integer> vocabulario_frecuencia;
    private StringTokenizer tokenizer;

    public Vocabulario(String texto) {
        this.vocabulario = new HashSet<>();
        this.vocabulario_completo = new ArrayList<>();
        this.tokenizer = new StringTokenizer(texto, " ");
        this.vocabulario_frecuencia = new HashMap<>();
        this.procesar();
    }

    // al usar SET no guarda repetidas - me permite contarlas mediante un size.
    // arraylist me permite guardar todas las palabras y mostrar frecuencias
    public void procesar() {

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken().replaceAll("[,\\\\.]", ""); // para eliminar comas y punto

            // System.out.println("Palabra: " + token);
            this.vocabulario.add(token);
            this.vocabulario_completo.add(token);

            if (this.vocabulario_frecuencia.containsKey(token)) {
                this.vocabulario_frecuencia.put(token, vocabulario_frecuencia.get(token) + 1);
            } else {
                this.vocabulario_frecuencia.put(token, 1);
            }
        }

    }

    /*
     * devuelve la cantidad de palabras distintas que posee el texto
     */
    public HashSet<String> getVocabulario() {
        return this.vocabulario;
    }

    /*
     * devuelve todas las palabras del texto (con repeticiones)
     */
    public ArrayList<String> getVocabularioCompleto() {
        return this.vocabulario_completo;
    }

    /*
     * devuelve la cantidad de palabras del texto (incluye repetidas)
     */
    public int getCantidadPalabras() {
        return this.vocabulario_completo.size();
    }

    /*
     * devuelve la cantidad de palabras distintas del texto
     */
    public int getCantidadPalabrasDistintas() {
        return this.vocabulario.size();
    }

    /*
     * devuelve las palabra y cantidad de repeticiones
     */
    public Map<String, Integer> getFrecuencias() {
        return this.vocabulario_frecuencia;
    }

    /*
     * devuelve la palabra mas repetida
     */
    public Map.Entry<String, Integer> getMayorFrecuencia() {
        Map.Entry<String, Integer> mayorFrecuencia = null;

        for (Map.Entry<String, Integer> entry : this.getFrecuencias().entrySet()) {

            if (mayorFrecuencia == null || entry.getValue() > mayorFrecuencia.getValue()) {
                mayorFrecuencia = entry;
            }

        }

        return mayorFrecuencia;
    }

    /*
     * devuelve la palabra menos repetida
     */
    public Map.Entry<String, Integer> getMenorFrecuencia() {
        Map.Entry<String, Integer> menorFrecuencia = null;

        for (Map.Entry<String, Integer> entry : this.getFrecuencias().entrySet()) {
            if (menorFrecuencia == null || entry.getValue() < menorFrecuencia.getValue()) {
                menorFrecuencia = entry;
            }
        }

        return menorFrecuencia;
    }

    /*
     * devuelve la frecuencia o cantidad de repeticiones de una palabra dada
     */
    public Integer getFrecuencia(String palabra) {
        return this.getFrecuencias().get(palabra);
        // if (this.getFrecuencias().containsKey(palabra)) {
        // return this.getFrecuencias().get(palabra);
        // } else {
        // return null;
        // }
    }

    /*
     * devuelve las palabras ordenadas
     */
    public ArrayList<String> getPalabrasOrdenadas() {
        ArrayList<String> palabrasOrdenadas = new ArrayList<>(this.getVocabulario());

        // Eliminar palabras que comienzan con caracteres especiales
        palabrasOrdenadas.removeIf(palabra -> !Character.isLetterOrDigit(palabra.charAt(0)));

        /*
         * puedes usar String.CASE_INSENSITIVE_ORDER en cualquier lugar donde necesites
         * realizar comparaciones de cadenas insensibles a mayúsculas y minúsculas, ya
         * sea para ordenar, buscar o comparar cadenas en diversas estructuras de datos.
         */
        Collections.sort(palabrasOrdenadas, String.CASE_INSENSITIVE_ORDER);

        return palabrasOrdenadas;
    }

    /*
     * devuelve ordenado por frecuencia
     */

    // treeMap no sirve por que no pueden repetirse las claves
    // public TreeMap<String, Integer> getPalabrasOrdenadasFrecuencia() {

    // HashMap<String, Integer> mapa = new HashMap<>(this.getFrecuencias());

    // TreeMap<String, Integer> tree_palabras = new TreeMap<>(new
    // Comparator<String>() {
    // @Override
    // public int compare(String palabra1, String palabra2) {
    // // Comparar las palabras según sus frecuencias en el HashMap
    // int frecuencia1 = mapa.getOrDefault(palabra1, 0);
    // int frecuencia2 = mapa.getOrDefault(palabra2, 0);

    // // Ordenar en orden descendente (mayor frecuencia primero)
    // return Integer.compare(frecuencia2, frecuencia1);
    // }
    // });

    // // for (Map.Entry<String,Integer> entry : mapa.entrySet()) {
    // // tree_palabras.put(entry.getKey(), entry.getValue());
    // // }
    // // lo mismo pero en una linea
    // tree_palabras.putAll(mapa);

    // return tree_palabras;
    // }

    /*
     * devuelve ordenado por frecuencia
     */
    public LinkedHashMap<String, Integer> getPalabrasOrdenadasFrecuencia() {
        // lista de entradas del map
        List<Map.Entry<String,Integer>> mapa = new ArrayList<>(this.getFrecuencias().entrySet());
        // utilizo el comparador creado para tal fin
        mapa.sort( new Comparator_frecuencia());
        // elijo un linkedhashmap dado que el orden de inserción se respeta
        LinkedHashMap<String,Integer> mapa_ordenado = new LinkedHashMap<>();

        for (Map.Entry<String,Integer> entrada : mapa){
            mapa_ordenado.put(entrada.getKey(), entrada.getValue());
        }

        return mapa_ordenado;
    }

    public static void main(String[] args) {
        String cadena = "En el vasto horizonte de la imaginación, nuestros límites son solo los que nosotros mismos creamos. No debemos permitir que el conocimiento existente nos restrinja, sino que debemos usarlo como un trampolín para explorar nuevos mundos de ideas. La imaginación, con su poder ilimitado, es la fuerza que nos impulsa a superar barreras y a descubrir lo que aún no sabemos. En el equilibrio entre el conocimiento y la imaginación, encontramos la clave para el progreso humano. River  River  River River  River  River";

        Vocabulario texto1 = new Vocabulario(cadena);

        // System.out.println(texto1.getVocabulario());

        // System.out.println(texto1.getCantidadPalabrasDistintas());

        // System.out.println(texto1.getVocabularioCompleto());

        // System.out.println(texto1.getCantidadPalabras());

        // Map<String, Integer> frecuenciaPalabras = new
        // HashMap<>(texto1.getFrecuencias());

        // for (Map.Entry<String, Integer> entry : frecuenciaPalabras.entrySet()) {
        // System.out.println("Palabra: " + entry.getKey() + ", Frecuencia: " +
        // entry.getValue());
        // }

        // System.out.println(frecuenciaPalabras.entrySet());

        // otro método
        // frecuenciaPalabras.forEach( (k,v) -> System.out.println("Palabra: " + k + ",
        // Frecuencia: " + v));

        // System.out.println(texto1.getMayorFrecuencia());
        // System.out.println(texto1.getMenorFrecuencia());

        // System.out.println("Frecuencia de la palabra: " +
        // texto1.getFrecuencia("debemos"));

        // System.out.println(texto1.getPalabrasOrdenadas());

        System.out.println(texto1.getPalabrasOrdenadasFrecuencia());

    }
}
