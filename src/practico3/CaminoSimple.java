package practico3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Ejercicio 4.
// Escribir un algoritmo que, dado un grafo dirigido y dos vértices i, j de este
// grafo, devuelva el camino simple (sin ciclos) de mayor longitud del vértice i al vértice j.
// Puede suponerse que el grafo de entrada es acíclico.

public class CaminoSimple {

    private Grafo<?> grafo; // o mapa
    private HashMap<Integer, String> colores;

    public CaminoSimple(Grafo<?> grafo) {
        this.grafo = grafo;
        this.colores = new HashMap<Integer, String>();
    }

    public List<Integer> obtenerCaminos(int v_origen, int v_destino) {

        // si no existen los vertices, no hay camino -- lista vacía
        if (!grafo.contieneVertice(v_origen) || !grafo.contieneVertice(v_destino)) {
            return new LinkedList<Integer>();
        }

        Iterator<Integer> it = this.grafo.obtenerVertices();
        while (it.hasNext()) {
            int verticeId = it.next();
            colores.put(verticeId, "Blanco");
        }

        List<Integer> camino = obtenerMayorCaminoPosible(v_origen, v_destino);

        // sin estas lineas, devuelve un camino largo aunque no llegue.
        if ((camino.get(0) == v_origen) && (camino.get(camino.size() - 1) == v_destino)) {
            return camino;
        } else
            return new LinkedList<Integer>();

    }

    public List<Integer> obtenerMayorCaminoPosible(int v_origen, int v_destino) {
        List<Integer> recorridoMayor = new LinkedList<>();
        boolean llegaADestino = false;

        // agrego el vertice destino y mas abajo, el que hizo lo hizo llegar
        if (v_origen == v_destino) {
            LinkedList<Integer> camino = new LinkedList<Integer>();
            camino.add(v_origen);
            return camino;
        }

        colores.put(v_origen, "Amarillo");

        Iterator<Integer> it_ady = this.grafo.obtenerAdyacentes(v_origen);

        while (it_ady.hasNext()) {
            int vert_ady = it_ady.next();
            List<Integer> recorridoIteracion;

            if (colores.get(vert_ady).equals("Blanco")) {
                recorridoIteracion = obtenerMayorCaminoPosible(vert_ady, v_destino);

                // System.out.println("Vertice ady: " + vert_ady);
                //System.out.println("Recorrido iteracion " + recorridoIteracion);

                if (recorridoIteracion.size() != 0) {
                    llegaADestino = true;
                    // seleccionador de camino largo
                    if (recorridoMayor.size() < recorridoIteracion.size()) {
                        recorridoMayor = recorridoIteracion;
                    }
                }
            }
        }

        if (llegaADestino) {
            colores.put(v_origen, "Blanco");
        } else
            colores.put(v_origen, "Negro");

        recorridoMayor.add(0, v_origen);

        //System.out.println("Recorrido mayor " + recorridoMayor);
        return recorridoMayor;
    }

}
