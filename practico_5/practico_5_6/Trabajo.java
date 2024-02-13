package practico_5_6;

import java.util.ArrayList;

public class Trabajo {

    protected ArrayList<String> temas;
    protected String nombre;

    // static final int prueba = 18;
    // public static final int prueba2 = 17;

    public Trabajo(String nombre) {
        this.nombre = nombre;
        this.temas = new ArrayList<>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void addTemas(String tema) {
        if (!this.temas.contains(tema)) {
            this.temas.add(tema);
        }
    }

    public ArrayList<String> getTemas() {
        return new ArrayList<>(this.temas);
    }

    // debe recibir un evaluador
    public boolean isApto(Evaluador evaluador) {

        // consulto al evaluador si conoce todos los temas del trabajo
        if (evaluador.tieneConocimientos(this.temas)) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return this.nombre;
    }

}
