package practico_5_2;

import java.util.ArrayList;

public class Casa {

    private String nombre;
    protected ArrayList<String> cualidades_requeridas;
    protected int maximo_alumnos;
    protected ArrayList<Alumno> alumnos;

    public Casa(String nombre, int maximo_alumnos) {
        this.nombre = nombre;
        this.cualidades_requeridas = new ArrayList<>();
        this.maximo_alumnos = maximo_alumnos;
        this.alumnos = new ArrayList<>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getMaximoAlumnos() {
        return this.maximo_alumnos;
    }

    public void addCualidad(String cualidad) {
        if (!this.cualidades_requeridas.contains(cualidad.toLowerCase())) {
            this.cualidades_requeridas.add(cualidad.toLowerCase());
        }
    }

    public boolean isAdmisible(Alumno alumno) {
        if (this.alumnos.size() < maximo_alumnos) {

            for (String cualidad : this.cualidades_requeridas) {
                if (!alumno.tieneCualidad(cualidad.toLowerCase())) {
                    // System.out.println("Cualidad analizada " + cualidad);
                    System.out.println(alumno.getNombre() + " no admitido por " + this.getNombre());
                    return false;
                }
            }

            this.addAlumno(alumno);
            alumno.setCasa(this);
            System.out.println(alumno.getNombre() + " agregado a " + this.getNombre());
        }
        return true;
    }

    protected void addAlumno(Alumno alumno) {
        if (!this.alumnos.contains(alumno)) {
            this.alumnos.add(alumno);
        }
    }

    public String toString() {
        return this.getNombre();
    }

    public ArrayList<String> getAlumnos() {
        ArrayList<String> alumnos = new ArrayList<>();

        for (Alumno alumno : this.alumnos) {
            alumnos.add(alumno.getNombre());
        }

        return alumnos;
    }
}
