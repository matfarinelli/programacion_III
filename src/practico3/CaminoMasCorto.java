package practico3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

// Ejercicio 7.
// Supongamos que una ciudad se encuentra modelada mediante un grafo, donde cada nodo
// es una esquina, y las aristas representan las calles. Diseñe un algoritmo tal que dadas dos
// esquinas, devuelva el camino más corto entre ambas de manera de caminar la menor
// cantidad de cuadras posible.

public class CaminoMasCorto {

    private Grafo<?> grafo;
    private HashMap<Integer, Boolean> visitados;
    private ArrayList<Integer> filaVertices;
    private HashMap<Integer, Integer> padres_hijos;

    public CaminoMasCorto(Grafo<?> grafo) {
        this.grafo = grafo;
        this.visitados = new HashMap<Integer, Boolean>();
        this.filaVertices = new ArrayList<Integer>();
        this.padres_hijos = new HashMap<Integer, Integer>();
    }

    public ArrayList<Integer> obtenerCaminoMasCorto(int origen, int destino) {

        this.filaVertices.clear();
        this.padres_hijos.clear();

        Iterator<Integer> it = grafo.obtenerVertices();
        // pido vertices del grafo y todos como "no visitado"
        while (it.hasNext()) {
            int verticeId = it.next();
            visitados.put(verticeId, false);
        }

        // marco vertice recibido como visitado y lo agrego a vertices
        visitados.put(origen, true);
        filaVertices.add(origen);

        while (!filaVertices.isEmpty()) {
            int vert_top = filaVertices.remove(0);
            Iterator<Integer> itAdyacentes = this.grafo.obtenerAdyacentes(vert_top);

            while (itAdyacentes.hasNext()) {
                int vert_adyac = itAdyacentes.next();

                // System.out.println("Adyacente visitado: " + vert_adyac);

                if (!visitados.get(vert_adyac)) {
                    padres_hijos.put(vert_top, vert_adyac);
                    visitados.put(vert_adyac, true);
                    filaVertices.add(vert_adyac);

                    if (vert_adyac == destino) {

                        // obtener todas las keys del hashmap
                         Set<Integer> padres = padres_hijos.keySet();
                        
                         System.out.println(padres);
                        // obtener padre de destino hasta llegar a origen



                    }
                }
            }

            // System.out.println("Visitados en el ciclo" + visitados);
            System.out.println("padre/hijos" + padres_hijos);
            // System.out.println("Fila de vertices " + filaVertices);
        }
        return new ArrayList<>();
    }

}
