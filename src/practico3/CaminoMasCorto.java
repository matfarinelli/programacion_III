package practico3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

// Ejercicio 7.
// Supongamos que una ciudad se encuentra modelada mediante un grafo, donde cada nodo
// es una esquina, y las aristas representan las calles. Diseñe un algoritmo tal que dadas dos
// esquinas, devuelva el camino más corto entre ambas de manera de caminar la menor
// cantidad de cuadras posible.

public class CaminoMasCorto {

    private Grafo<?> grafo;
    private HashMap<Integer, Boolean> visitados;
    private ArrayList<Integer> filaVertices;
    private HashMap<Integer, Integer> hijos_padres;

    public CaminoMasCorto(Grafo<?> grafo) {
        this.grafo = grafo;
        this.visitados = new HashMap<Integer, Boolean>();
        this.filaVertices = new ArrayList<Integer>();
        this.hijos_padres = new HashMap<Integer, Integer>();
    }

    public Boolean existeCamino(int origen, int destino) {

        this.filaVertices.clear();
        this.hijos_padres.clear();

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

                System.out.println("Adyacente visitado: " + vert_adyac);

                if (!visitados.get(vert_adyac)) {
                    hijos_padres.put(vert_adyac, vert_top);
                    visitados.put(vert_adyac, true);
                    filaVertices.add(vert_adyac);

                    if (vert_adyac == destino) {
                        // no tiene mucho sentido el array, dado que no voy a poder devolver el camino,
                        // sino los vertices que pudieron ser visitados antes de llegar al destino
                        return true;

                    }
                }
            }

            // System.out.println("Visitados en el ciclo" + visitados);
            // System.out.println("hijo/padre" + hijos_padres);
            // System.out.println("Fila de vertices " + filaVertices);
        }
        return false;
    }

    public ArrayList<Integer> caminoMasCorto(int origen, int destino) {
        if (existeCamino(origen, destino)) {

        }
        return new ArrayList<>();
    }
}
