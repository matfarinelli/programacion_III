package practico3;

import java.util.HashMap;
import java.util.Iterator;

public class DFS {

    private Grafo<?> grafo;
    private HashMap<Integer, String> colores;
    private int tiempo;
    // clave vertice - valor tiempo de desc. o final.
    private HashMap<Integer, Integer> descubrimiento;
    private HashMap<Integer, Integer> finalizacion;

    public DFS(Grafo<?> grafo) {
        this.grafo = grafo;
        this.colores = new HashMap<Integer, String>();
        this.descubrimiento = new HashMap<Integer, Integer>();
        this.finalizacion = new HashMap<Integer, Integer>();
        this.tiempo = 0;
    }

    public void dfs() {
        Iterator<Integer> it = grafo.obtenerVertices();
        while (it.hasNext()) {
            int verticeId = it.next();
            colores.put(verticeId, "blanco");
        }
        tiempo = 0;

        it = grafo.obtenerVertices();

        while (it.hasNext()) {
            int verticeId = it.next();
            if (colores.get(verticeId).equals("blanco")) {
                dfs_visit(verticeId);
            }
        }

    }

    public void dfs_visit(int verticeId) {
        colores.put(verticeId, "amarillo");
        tiempo += 1;
        descubrimiento.put(verticeId, tiempo);

        Iterator<Integer> it = this.grafo.obtenerAdyacentes(verticeId);
        while (it.hasNext()) {
            int adyacente = it.next();
            if (colores.get(adyacente).equals("blanco")) {
                dfs_visit(adyacente);
            }
        }
        colores.put(verticeId, "negro");
        tiempo += 1;
        finalizacion.put(verticeId, tiempo);
        // System.out.println("VerticeID : " + verticeId + " Color: " +
        // colores.get(verticeId) + " Tiempo descubrimiento: " +
        // descubrimiento.get(verticeId)
        // + " Tiempo finalizacion: " + finalizacion.get(verticeId));
    }

}
