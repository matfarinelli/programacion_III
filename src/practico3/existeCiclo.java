package practico3;

import java.util.HashMap;
import java.util.Iterator;

public class existeCiclo {

    private Grafo<?> grafo;
    private HashMap<Integer, String> colores;

    public existeCiclo(Grafo<?> grafo) {
        this.grafo = grafo;
        this.colores = new HashMap<Integer, String>();
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
        return hayCiclo;

    }

}
