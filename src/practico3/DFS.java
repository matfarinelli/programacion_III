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

    // Ejercicio 3.
    // Implemente un algoritmo que determine si un grafo dirigido tiene algún ciclo.

    public boolean hayCiclo() {
        boolean hayCiclo = false;

        Iterator<Integer> it = this.grafo.obtenerVertices();

        while (it.hasNext()) {
            int verticeId = it.next();
            colores.put(verticeId, "blanco");
        }
        tiempo = 0;

        it = this.grafo.obtenerVertices();

        while (it.hasNext() && !hayCiclo) {
            int verticeId = it.next();
            if (colores.get(verticeId).equals("blanco")) {
                hayCiclo = hayCiclo(verticeId);
            }
        }

        return hayCiclo;
    }

    private boolean hayCiclo(int verticeId) {
        boolean hayCiclo = false;

        colores.put(verticeId, "amarillo");
        tiempo += 1;
        descubrimiento.put(verticeId, tiempo);

        Iterator<Integer> it = this.grafo.obtenerAdyacentes(verticeId);

        while (it.hasNext() && !hayCiclo) {
            int adyacente = it.next();

            if (colores.get(adyacente).equals("blanco")) {
                hayCiclo = hayCiclo(adyacente);

            } else if (colores.get(adyacente).equals("amarillo")) {
                hayCiclo = true;

            }
        }

        colores.put(verticeId, "negro");
        tiempo += 1;
        finalizacion.put(verticeId, tiempo);

        return hayCiclo;

    }
}
