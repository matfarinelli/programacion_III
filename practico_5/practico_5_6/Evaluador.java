package practico_5_6;

import java.util.ArrayList;

public class Evaluador {

    private String nombre;
    private ArrayList<String> conocimientos;
    private ArrayList<Trabajo> trabajos;

    public Evaluador(String nombre) {
        this.nombre = nombre;
        this.conocimientos = new ArrayList<>();
        this.trabajos = new ArrayList<>();
    }

    public void addConocimiento(String conocimiento) {
        if (!this.conocimientos.contains(conocimiento)) {
            this.conocimientos.add(conocimiento);
        }
    }

    public void addTrabajo(Trabajo trabajo) {
        this.trabajos.add(trabajo);
    }

    //3
    public ArrayList<Trabajo> getTrabajos() {
        return new ArrayList<>(this.trabajos);
    }

    public String getNombre() {
        return this.nombre;
    }

    @Override
    public boolean equals(Object o) {
        try {
            String nombre = ((Evaluador) o).getNombre();

            if (this.nombre.equals(nombre)) {
                return true;
            } else
                return false;

        } catch (Exception e) {
            return false;
        }
    }

    // alguno
    public boolean tieneConocimiento(String conocimiento) {
        return this.conocimientos.contains(conocimiento);
    }

    // todos
    public boolean tieneConocimientos(ArrayList<String> conocimientos) {
        return this.conocimientos.containsAll(conocimientos);
    }

    public String toString() {
        return this.nombre;
    }

    public ArrayList<String> getConocimientos() {
        return new ArrayList<>(this.conocimientos);
    }

}
