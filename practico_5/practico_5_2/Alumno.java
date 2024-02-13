package practico_5_2;

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
        this.casa = null;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Casa getCasa() {
        return this.casa;
    }

    public ArrayList<String> getCualidades() {
        return new ArrayList<>(this.cualidades);
    }

    public ArrayList<String> getFamiliares() {
        ArrayList<String> familiares_ = new ArrayList<>();

        for (Alumno familiar : this.familiares) {
            familiares_.add(familiar.getNombre());
        }

        return familiares_;
    }

    public boolean tieneFamiliar(Alumno familiar) {
        return this.familiares.contains(familiar);
    }

    public void setFamiliar(Alumno familiar) {
        if (!this.familiares.contains(familiar)) {
            this.familiares.add(familiar);
        }
    }


    public void addCualidad(String cualidad) {
        if (!this.cualidades.contains(cualidad.toLowerCase())) {
            this.cualidades.add(cualidad.toLowerCase());
        }
    }

    public boolean tieneCualidad(String cualidad) {
        return this.cualidades.contains(cualidad.toLowerCase());
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }
}
