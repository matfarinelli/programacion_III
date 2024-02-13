package Howarts;

import java.util.ArrayList;

public class Alumno {

    private String nombre;
    private ArrayList<String> cualidades;
    private ArrayList<Alumno> familiares;
    private Casa casa;

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.cualidades = new ArrayList<>();
        this.familiares = new ArrayList<>();
    }

    // requiere de equals
    public void addFamiliar(Alumno familiar) {
        if (!this.familiares.contains(familiar)) {
            this.familiares.add(familiar);
        }
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public Casa getCasa() {
        return this.casa;
    }

    public String getCasaString() {
        return this.casa.getNombre();
    }

    public void addCualidad(String cualidad) {
        if (!this.cualidades.contains(cualidad)) {
            this.cualidades.add(cualidad);
        }
    }

    public boolean tieneCualidad(String cualidad) {
        return this.cualidades.contains(cualidad);
    }

    public boolean equals(Object o) {
        try {
            Alumno alumnoComparativo = (Alumno) o;

            return this.getNombre().equals(alumnoComparativo.getNombre());

        } catch (Exception e) {
            return false;
        }
    }
}
