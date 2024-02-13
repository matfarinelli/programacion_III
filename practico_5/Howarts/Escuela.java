package Howarts;

import java.util.ArrayList;

public class Escuela {

    private String nombre;
    private Sombrero sombrero;
    private ArrayList<Alumno> alumnos;
    private ArrayList<Casa> casas;

    public Escuela(String nombre, Sombrero sombrero) {
        this.nombre = nombre;
        this.alumnos = new ArrayList<>();
        this.casas = new ArrayList<>();
        this.sombrero = sombrero;
    }

    public void addCasa(Casa casa) {
        if (!this.casas.contains(casa)) {
            this.casas.add(casa);
        }
    }

    public void asignarAlumno(Alumno alumno) {

        for (Casa casa : this.casas) {
            // si el alumno no tiene casa - le busco asignación
            if (alumno.getCasa() == null) {
                // si devuelve un booleano puedo añadirlo, o no
                if (sombrero.asignarAlumno(casa, alumno)) {
                    alumno.setCasa(casa);
                    this.alumnos.add(alumno);
                    System.out.println(alumno.getNombre() + " agregado a " + casa.getNombre());
                }
            }
        }
    }

    public ArrayList<String> getAlumnosString() {
        ArrayList<String> alumnos = new ArrayList<>();
        for (Alumno alumno : this.alumnos) {
            alumnos.add(alumno.getNombre());
        }
        return alumnos;
    }

    public ArrayList<Alumno> getAlumnos() {
        return new ArrayList<Alumno>(this.alumnos);
    }
}
