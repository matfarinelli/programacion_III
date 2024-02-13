package practico_5_2;

import java.util.ArrayList;

public class Escuela {

    private String nombre;
    private Sombrero sombrero_seleccionador;
    private ArrayList<Casa> casas;

    public Escuela(String nombre) {
        this.nombre = nombre;
        this.casas = new ArrayList<>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void addCasa(Casa casa) {
        if (!this.casas.contains(casa)) {
            this.casas.add(casa);
        }
    }

    public void addSombrero(Sombrero seleccionador) {
        this.sombrero_seleccionador = seleccionador;
    }

    public void addAlumno(Alumno alumno) {
        this.sombrero_seleccionador.seleccionarCasa(alumno, this.casas);
    }

    public ArrayList<String> getCasas() {
        ArrayList<String> casas_ = new ArrayList<>();

        for (Casa casa : this.casas) {
            casas_.add(casa.getNombre());
        }

        return casas_;
    }

    public ArrayList<String> getAlumnos() {
        ArrayList<String> alumnos = new ArrayList<>();

        for (Casa casa : this.casas) {
            alumnos.addAll(casa.getAlumnos());
        }

        return alumnos;
    }

    public static void main(String[] args) {

        Escuela howarts = new Escuela("Howarts");
        Sombrero sombrero = new Sombrero();
        howarts.addSombrero(sombrero);

        Casa_linaje c1 = new Casa_linaje("Slytherin", 10);
        Casa c2 = new Casa("Griffindor", 10);
        Casa_enemiga c3 = new Casa_enemiga("White", 5);
        Casa c4 = new Casa("Comunes", 5);

        // hay que agregar algun alumno para que compare el linaje.
        Alumno al1 = new Alumno("Don Slytherin");
        c1.addAlumno(al1);

        // c1.addCualidad("Cara de malo");
        c1.addCualidad("Rubio");
        // c1.addCualidad("Hincha de Banfield");

        c2.addCualidad("Mestizo");
        // c2.addCualidad("Solidario");

        c3.setEnemiga(c2);

        howarts.addCasa(c1);
        howarts.addCasa(c2);
        howarts.addCasa(c3);
        howarts.addCasa(c4);

        Alumno a1 = new Alumno("Harry");
        a1.addCualidad("mestizo");

        Alumno a2 = new Alumno("Richard");
        a2.addCualidad("Rubio");

        // condicion para añadirlo a Slytherin
        // a2.setFamiliar(a1);

        Alumno a3 = new Alumno("Jack");
        a3.addCualidad("mestizo");

        Alumno a4 = new Alumno("Ben");
        a4.addCualidad("Rubio");

        // condicion para añadirlo a Slytherin
        a4.setFamiliar(al1);

        howarts.addAlumno(a1);
        howarts.addAlumno(a2);
        howarts.addAlumno(a3);
        howarts.addAlumno(a4);

        // todos los de la escuela
        System.out.println(howarts.getAlumnos());

        // System.out.println(howarts.getCasas());
        System.out.println(c4.getAlumnos());

    }

}
