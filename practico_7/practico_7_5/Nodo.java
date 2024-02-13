package practico_7.practico_7_5;

public class Nodo implements Comparable<Nodo> {

    private Comparable valor;
    private Nodo izquierdo;
    private Nodo derecho;

    public Nodo(Comparable c) {
        this.valor = c;
        this.izquierdo = null;
        this.derecho = null;
    }

    public Comparable getValor() {
        return this.valor;
    }

    public void insertar(Comparable n) {
        int comparacion = this.valor.compareTo(n);

        if (comparacion < 0) {
            // va a la derecha
            if (this.derecho == null) {
                derecho = new Nodo(n);
                // aca debería usar la acción. Pero no supe como adaptarla.
                System.out.println("Insertando " + n + " a la DERECHA de " + this.valor);
            } else {
                derecho.insertar(n);
            }

        } else if (comparacion > 0) {
            // va a la izquierda
            if (this.izquierdo == null) {
                this.izquierdo = new Nodo(n);
                System.out.println("Insertando " + n + " a la IZQUIERDA de " + this.valor);
            } else {
                this.izquierdo.insertar(n);
            }

        }
    }

    @Override
    public int compareTo(Nodo n1) {
        return this.valor.compareTo(n1.getValor());
    }

}
