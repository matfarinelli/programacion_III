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

public class Camino {

    private Grafo<?> grafo; // o mapa
    private HashMap<Integer, String> colores;

    public Camino(Grafo<?> grafo) {
        this.grafo = grafo;
        this.colores = new HashMap<Integer, String>();
    }

    public boolean existeCamino(int origen, int destino) {

        Iterator<Integer> it = this.grafo.obtenerVertices();
        while (it.hasNext()) {
            int vertice_id = it.next();
            colores.put(vertice_id, "blanco");
        }

        Boolean existeCamino = existeCamino_visit(origen, destino);

        return existeCamino;
    }

    private boolean existeCamino_visit(int v_origen, int v_destino) {

        if (v_origen == v_destino) {
            return true;
        }

        colores.put(v_origen, "amarillo");

        Iterator<Integer> it_ady = this.grafo.obtenerAdyacentes(v_origen);
        Boolean existeCamino = false;

        while (it_ady.hasNext() && !existeCamino) {
            int vert_ady = it_ady.next();
            if (colores.get(vert_ady).equals("blanco")) {
                existeCamino = existeCamino_visit(vert_ady, v_destino);
            }

        }

        colores.put(v_origen, "negro");

        return existeCamino;
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
                // System.out.println("Recorrido iteracion " + recorridoIteracion);

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

        // System.out.println("Recorrido mayor " + recorridoMayor);
        return recorridoMayor;
    }

    public ArrayList<Integer> mostrarCaminos(int origen, int destino) {
        ArrayList<Integer> caminos = new ArrayList<>();

        Iterator<Integer> it = this.grafo.obtenerVertices();

        while (it.hasNext()) {
            int vertice = it.next();
            colores.put(vertice, "blanco");
        }

        caminos = mostrarCaminos_visit(origen, destino);

        return caminos;
    }

    private ArrayList<Integer> mostrarCaminos_visit(int v_origen, int v_destino) {

        // solo retornará cuando llegó a destino - situación corte
        if (v_origen == v_destino) {
            ArrayList<Integer> out_destino = new ArrayList<>();
            out_destino.add(v_origen);
            return out_destino;
        }

        ArrayList<Integer> camino = null;
        colores.put(v_origen, "amarillo");

        Iterator<Integer> it_ady = this.grafo.obtenerAdyacentes(v_origen);

        while (it_ady.hasNext() && camino == null) {
            int vert_ady = it_ady.next();
            ArrayList<Integer> camino_parcial = new ArrayList<>();
           
            if (colores.get(vert_ady).equals("blanco")) {
                camino_parcial = mostrarCaminos_visit(vert_ady, v_destino);
           
                if (camino_parcial != null) {
                    camino = new ArrayList<>();
                    camino.add(v_origen);
                    camino.addAll(camino_parcial);
                }
            }
        }

        colores.put(v_origen, "negro");
 
        return camino;
    }

}
