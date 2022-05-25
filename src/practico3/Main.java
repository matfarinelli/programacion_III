package practico3;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        GrafoDirigido<Integer> grafo_d = new GrafoDirigido<Integer>();

        grafo_d.agregarVertice(0);
        grafo_d.agregarVertice(1);
        grafo_d.agregarVertice(2);
        grafo_d.agregarVertice(3);
        grafo_d.agregarVertice(4);
        grafo_d.agregarVertice(5);
        grafo_d.agregarVertice(6);
        grafo_d.agregarVertice(7);

        grafo_d.agregarArco(0, 1, 0);
        grafo_d.agregarArco(0, 3, 0);
        grafo_d.agregarArco(1, 2, 35);
        grafo_d.agregarArco(2, 5, 0);
        grafo_d.agregarArco(2, 0, 0);
        grafo_d.agregarArco(3, 4, 0);
        grafo_d.agregarArco(4, 1, 0);
        grafo_d.agregarArco(4, 5, 0);

        // System.out.println(grafo_d.existeArco(0, 3));
        // grafo_d.borrarArco(0, 3);
        // System.out.println(grafo_d.existeArco(0, 3));

        // System.out.println(grafo_d.obtenerArco(1,2).getEtiqueta());

        // System.out.println(grafo_d.cantidadVertices());

        // Iterator<Arco<Integer>> itArcos = grafo_d.obtenerArcos();
        // while (itArcos.hasNext()) {
        // System.out.println(itArcos.next().getDatos());
        // }

        // System.out.println(grafo_d.cantidadArcos());

        // Iterator<Integer> itAdyacentes = grafo_d.obtenerAdyacentes(2);
        // while (itAdyacentes.hasNext()) {
        // System.out.println(itAdyacentes.next().intValue());
        // }

        // DFS dfs = new DFS(grafo_d);

        // dfs.dfs();

        // System.out.println(dfs.hayCiclo());

        BFS bfs = new BFS(grafo_d);

        bfs.bfs();
    }
}
