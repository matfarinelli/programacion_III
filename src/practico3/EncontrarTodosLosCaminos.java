package practico3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

// Ejercicio 5.
// Escriba un algoritmo que dado un grafo G y un vértice v de dicho grafo, devuelva una lista
// con todos los vértices a partir de los cuales exista un camino en G que termine en v.

public class EncontrarTodosLosCaminos {

    private Grafo<?> grafo;
    private HashMap<Integer, String> colores;

    public EncontrarTodosLosCaminos(Grafo<?> grafo) {
        this.grafo = grafo;
        this.colores = new HashMap<Integer, String>();
    }

    public ArrayList<ArrayList<Integer>> obtenerTodosLosCaminos(int origen, int destino) {

        Iterator<Integer> it = this.grafo.obtenerVertices();

        while (it.hasNext()) {
            int verticeId = it.next();
            colores.put(verticeId, "blanco");
        }

        ArrayList<ArrayList<Integer>> caminos = dfs_visit(origen, destino);

        return caminos;
    }

    private ArrayList<ArrayList<Integer>> dfs_visit(int origen, int destino) {
        ArrayList<ArrayList<Integer>> todosLosCaminos = new ArrayList<>();

        if (origen == destino) {
            ArrayList<Integer> out = new ArrayList<>();
            out.add(origen);
            todosLosCaminos.add(out);
        } else {
            colores.put(origen, "amarillo");

            Iterator<Integer> it_ady = this.grafo.obtenerAdyacentes(origen);

            while (it_ady.hasNext()) {
                int vert_ady = it_ady.next();

                if (colores.get(vert_ady).equals("blanco")) {

                    ArrayList<ArrayList<Integer>> subcaminosDesdeAdy = dfs_visit(vert_ady, destino);
                    // subcaminosDesdeAdy solo existirá cuando dfs llega a destino y a partir de
                    // ahí, agrega el recorrido
                    // 7 - 2 7 - 1 2 7 - 0 1 2 7
                    for (ArrayList<Integer> subcamino : subcaminosDesdeAdy) {
                        subcamino.add(0, origen);
                        todosLosCaminos.add(subcamino);
                    }

                }
            }
            colores.put(origen, "blanco");
        }
        return todosLosCaminos;
    }

    // Ejercicio 6. Supongamos una conexión entre computadoras (1, ... ,n) que se
    // encuentra modelada mediante un grafo. Se requiere, si existe, dar una
    // conexión entre dos computadoras a y b existentes sabiendo que la computadora
    // i está fuera de servicio.

    public ArrayList<ArrayList<Integer>> obtener_conexion(int origen, int destino, int vertFueraServicio) {
        Iterator<Integer> it = this.grafo.obtenerVertices();

        while (it.hasNext()) {
            int verticeId = it.next();
            colores.put(verticeId, "blanco");
        }

        ArrayList<ArrayList<Integer>> caminos = dfs_visit(origen, destino, vertFueraServicio);

        return caminos;
    }

    private ArrayList<ArrayList<Integer>> dfs_visit(int origen, int destino, int vertFueraServicio) {
        ArrayList<ArrayList<Integer>> todosLosCaminos = new ArrayList<>();

        if (origen == destino) {
            ArrayList<Integer> out = new ArrayList<>();
            out.add(origen);
            todosLosCaminos.add(out);
        } else {
            colores.put(origen, "amarillo");

            Iterator<Integer> it_ady = this.grafo.obtenerAdyacentes(origen);

            while (it_ady.hasNext()) {
                int vert_ady = it_ady.next();

                if (colores.get(vert_ady).equals("blanco")) {

                    ArrayList<ArrayList<Integer>> subcaminosDesdeAdy = dfs_visit(vert_ady, destino);

                    for (ArrayList<Integer> subcamino : subcaminosDesdeAdy) {
                        if (!subcamino.contains(vertFueraServicio)) {
                            subcamino.add(0, origen);
                            todosLosCaminos.add(subcamino);
                        }
                    }

                }
            }
            colores.put(origen, "blanco");
        }
        return todosLosCaminos;
    }
}