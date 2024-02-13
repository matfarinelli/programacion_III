package Howarts;

import java.util.ArrayList;

public class Casa {

    private String nombre;
    private ArrayList<String> cualidadesRequeridas;
    private ArrayList<Alumno> alumnos;
    private int maximoAlumnos;

    public Casa(String nombre, int maximoAlumnos) {
        this.nombre = nombre;
        this.maximoAlumnos = maximoAlumnos;
        this.alumnos = new ArrayList<>();
        this.cualidadesRequeridas = new ArrayList<>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void addCualidad(String cualidad) {
        if (!this.cualidadesRequeridas.contains(cualidad)) {
            this.cualidadesRequeridas.add(cualidad);
        }
    }

    // metodo de admision incluido
    public boolean addAlumno(Alumno alumnoNuevo) {
        // si hay lugar
        if (this.alumnos.size() < this.maximoAlumnos) {
            // control que tenga todas las cualidades
            for (String cualidad : this.cualidadesRequeridas) {
                if (!alumnoNuevo.tieneCualidad(cualidad)) {
                    System.out.println(alumnoNuevo.getNombre() + " rechazado por " + this.getNombre());
                    return false;
                }
            }
        } else {
            System.out.println("Casa llena");
        }
        // si tuvo todas las cualidades la casa agrega al alumno
        this.alumnos.add(alumnoNuevo);
        return true;
    }

    public boolean isApto(Alumno alumno) {
        for (String cualidad : this.cualidadesRequeridas) {
            if (!alumno.tieneCualidad(cualidad)) {
                return false;
            }
        }
        return true;
    }

}
