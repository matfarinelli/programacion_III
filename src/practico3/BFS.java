package practico3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class BFS {

    private Grafo<?> grafo;
    private HashMap<Integer, Boolean> visitados;
    private List<Integer> filaVertices;

    public BFS(Grafo<?> grafo) {
        this.grafo = grafo;
        this.visitados = new HashMap<Integer, Boolean>();
        this.filaVertices = new ArrayList<Integer>();
    }

    public void bfs() {
        this.filaVertices.clear();
        Iterator<Integer> it = grafo.obtenerVertices();
        // pido vertices del grafo y todos como "no visitado"
        while (it.hasNext()) {
            int verticeId = it.next();
            visitados.put(verticeId, false);
        }

        // reinicio iterador si no hago esto, no ingresa en el while sigte
        it = grafo.obtenerVertices();

        while (it.hasNext()) {
            int verticeId = it.next();
            // si el vertice no fue visitado
            if (visitados.get(verticeId) == false) {
                bfs_visit(grafo, verticeId);
            }
        }

    }

    public void bfs_visit(Grafo<?> grafo, int origen) {
        // marco vertice recibido como visitado y lo agrego a vertices
        visitados.put(origen, true);
        filaVertices.add(origen);

        while (!filaVertices.isEmpty()) {
            int vert_top = filaVertices.remove(0);
            Iterator<Integer> itAdyacentes = this.grafo.obtenerAdyacentes(vert_top);

            while (itAdyacentes.hasNext()) {
                int vert_adyac = itAdyacentes.next();

                if (visitados.get(vert_adyac) == false) {
                    visitados.put(vert_adyac, true);
                    filaVertices.add(vert_adyac);
                }
            }

        }
    }

}
