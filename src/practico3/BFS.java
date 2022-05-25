package practico3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class BFS {

    private Grafo<?> grafo;
    private HashMap<Integer, Boolean> visitados;
    private List<Integer> fila;
    


    public BFS(Grafo<?> grafo) {
        this.grafo = grafo;
        this.visitados = new HashMap<Integer, Boolean>();
        this.fila = new ArrayList<Integer>();
    }

    // metodo para ir entendiendo el proceso!!!!
    // public void getFila(){
    //     Iterator<Integer> it = grafo.obtenerVertices();
    //     while (it.hasNext()) {
    //         int verticeId = it.next();
    //         visitados.put(verticeId, false);
    //     }
    
    //     System.out.println(visitados.toString());
    // }



    public void bfs() {
        Iterator<Integer> it = grafo.obtenerVertices();
        while (it.hasNext()) {
            int verticeId = it.next();
            fila.add(verticeId);
            visitados.put(verticeId, false);
        }

        //fila = grafo.obtenerVertices();

        while (it.hasNext()) {
            int verticeId = it.next();

            if (visitados.get(verticeId) == false) {
                bfs(grafo, verticeId);
            }
        }

        
    }

    public void bfs(Grafo<?> grafo, int origen) {
        visitados.put(origen, true);


    }
}
