package practico_5_1;

import java.util.ArrayList;

public class Pila {

    private ArrayList<String> elementos;

    public Pila() {
        this.elementos = new ArrayList<>();
    }

    // inserta un elemento
    public void push(String elemento) {
        this.elementos.add(elemento);
    }

    // elimina el ultimo elemento agregado (tope de pila) y lo retorna
    public String pop() {
        try {
            String ultimo = this.elementos.get(this.elementos.size() - 1);
            this.elementos.remove(this.elementos.size() - 1);

            return ultimo;
        } catch (Exception e) {
            return null;
        }

        // otra implementacion
        // if (this.elementos.isEmpty()) {
        // return null;
        // } else {
        // String ultimo = this.elementos.get(this.elementos.size() - 1);
        // this.elementos.remove(this.elementos.size() - 1);

        // return ultimo;
        // }

    }

    // retorna ultimo
    public String top() {
        try {
            return this.elementos.get(this.elementos.size() - 1);
        } catch (Exception e) {
            return null;
        }

    }

    // retorna lista
    public ArrayList<String> copy() {
        return new ArrayList<String>(this.elementos);
    }

    // retorna tamaño de la lista
    public int size() {
        int size;
        if (this.elementos.isEmpty()) {
            size = 0;
        } else {
            size = this.elementos.size();
        }

        return size;
    }

    // retorna la lista invertida
    // public ArrayList<String> reverse() {
    // ArrayList<String> reverse = new ArrayList<>();

    // while (this.elementos.size() != 0) {
    // String ultimo = this.pop();
    // reverse.add(ultimo);
    // }

    // return reverse;
    // }

    public ArrayList<String> reverse() {
        ArrayList<String> reverse = new ArrayList<>();
        int cantidad = this.elementos.size();
        while (cantidad > 0) {
            String ultimo = this.elementos.get(cantidad-1);
            reverse.add(ultimo);
            cantidad--;
        }

        return reverse;
    }

    public static void main(String[] args) {

        Pila p1 = new Pila();
        p1.push("S1");
        p1.push("S2");
        p1.push("S3");
        p1.push("S4");

        // System.out.println(p1.copy());
        // System.out.println(p1.pop());
        System.out.println(p1.copy());

        System.out.println(p1.reverse());
        System.out.println(p1.copy());
    }
}
