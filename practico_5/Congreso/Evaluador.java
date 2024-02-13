package Congreso;

import java.util.ArrayList;

public class Evaluador {

    private String nombreCompleto;
    private ArrayList<String> conocimientos;
    private ArrayList<Trabajo> trabajos;

    public Evaluador(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
        this.conocimientos = new ArrayList<>();
        this.trabajos = new ArrayList<>();
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public ArrayList<String> getConocimientos() {
        return new ArrayList<>(this.conocimientos);
    }

    public void addConocimiento(String conocimiento) {
        if (!this.conocimientos.contains(conocimiento)) {
            this.conocimientos.add(conocimiento);
        }
    }

    public void addTrabajo(Trabajo trabajo) {
        if (!this.trabajos.contains(trabajo)) {
            this.trabajos.add(trabajo);
        }
    }

    public int getCantidadTrabajos() {
        return this.conocimientos.size();
    }

    public boolean tieneConocimiento(String requisito) {
        return this.conocimientos.contains(requisito);
    }

    public boolean tieneConocimientos(Trabajo trabajo) {
        return this.conocimientos.containsAll(trabajo.getRequisitos());
    }

    public boolean equals(Object o) {
        try {
            Evaluador ev = (Evaluador) o;
            return ev.getNombreCompleto().equals(this.getNombreCompleto());
        } catch (Exception e) {
            return false;
        }
    }

    public String toString() {
        return this.getNombreCompleto();
    }
}
