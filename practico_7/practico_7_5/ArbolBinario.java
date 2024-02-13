package practico_7.practico_7_5;

public class ArbolBinario {

    private Nodo root;

    public ArbolBinario() {
        this.root = null;
    }

    // en realidad se inserta un valor y eso crea el nodo
    public void insertarNodo(Comparable c) {
        if (this.root != null) {
            root.insertar(c);
        } else // si no hay raiz, se crea
            root = new Nodo(c);
    }

    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();

        // Insertar valores en el árbol
        System.out.println("Estableciendo la raíz con el número 15");
        arbol.insertarNodo(15);
        arbol.insertarNodo(3);
        arbol.insertarNodo(8);
        arbol.insertarNodo(12);
        arbol.insertarNodo(40);
        arbol.insertarNodo(72);
        arbol.insertarNodo(9);
        arbol.insertarNodo(19);
        arbol.insertarNodo(43);

    }

}
