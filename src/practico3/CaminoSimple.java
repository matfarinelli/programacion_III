package practico3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

// Ejercicio 4.
// Escribir un algoritmo que, dado un grafo dirigido y dos vértices i, j de este
// grafo, devuelva el
// camino simple (sin ciclos) de mayor longitud del vértice i al vértice j.
// Puede suponerse que
// el grafo de entrada es acíclico.

public class CaminoSimple {

    private Grafo<?> grafo; // o mapa
    private HashMap<Integer, Boolean> visitados;
    private ArrayList<Integer> camino;
    private ArrayList<Integer> filaVertices;

    public CaminoSimple(Grafo<?> grafo) {
        this.grafo = grafo;
        this.visitados = new HashMap<Integer, Boolean>();
        this.camino = new ArrayList<Integer>();
        this.filaVertices = new ArrayList<Integer>();
    }

    public ArrayList<Integer> getCaminoSimple(int origen, int destino) {
        camino.clear();

        Iterator<Integer> it = this.grafo.obtenerVertices();

        while (it.hasNext()) {
            int verticeId = it.next();
            visitados.put(verticeId, false);
        }

        it = this.grafo.obtenerVertices();

        if (visitados.get(origen) == false) {
            camino.addAll(bfs_visit(origen, destino));
        }
        return camino;
    }

    public ArrayList<Integer> bfs_visit(int v_origen, int destino) {
        visitados.put(v_origen, true);
        filaVertices.add(v_origen);
        boolean destino_encontrado = false;

        while (!filaVertices.isEmpty() && !destino_encontrado) {
            int vertice_top = filaVertices.remove(0);
            Iterator<Integer> itAdyacentes = grafo.obtenerAdyacentes(vertice_top);

            while (itAdyacentes.hasNext()) {
                int vertice_ady = itAdyacentes.next();

                if (visitados.get(vertice_ady) == false) {
                    visitados.put(vertice_ady, true);
                    filaVertices.add(vertice_ady);

                    if (vertice_ady == destino) {
                        System.out.println("Destino encontrado!!!");
                    } else
                        System.out.println("Camino no encontrado");
                }

            }
        }

        return null;
    }

}
