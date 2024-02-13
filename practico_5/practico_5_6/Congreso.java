package practico_5_6;

import java.util.ArrayList;

public class Congreso {

    private ArrayList<Evaluador> evaluadores;
    private String nombre;
    private ArrayList<Trabajo> trabajos;
    private ArrayList<String> conocimientos_experto;

    public Congreso(String nombre) {
        this.nombre = nombre;
        this.evaluadores = new ArrayList<>();
        this.trabajos = new ArrayList<>();
        this.conocimientos_experto = new ArrayList<>();
    }

    public void addEvaluador(Evaluador evaluador) {
        if (!this.evaluadores.contains(evaluador)) {
            this.evaluadores.add(evaluador);
        }
    }

    public void addTrabajo(Trabajo trabajo) {
        if (!this.trabajos.contains(trabajo)) {
            this.trabajos.add(trabajo);
        }
    }

    public void addConocimientoParaExperto(String conocimiento) {
        this.conocimientos_experto.add(conocimiento);
    }

    // 4
    public boolean isExperto(Evaluador evaluador) {

        if (evaluador.tieneConocimientos(this.conocimientos_experto)) {
            return true;
        } else
            return false;

    }

    // 2
    public ArrayList<Trabajo> getTrabajosAptos(Evaluador evaluador) {
        ArrayList<Trabajo> trabajosAptos = new ArrayList<>();

        for (Trabajo trabajo : this.trabajos) {
            if (trabajo.isApto(evaluador)) {
                trabajosAptos.add(trabajo);
            }
        }

        return trabajosAptos;
    }

    // 1
    public ArrayList<Evaluador> getEvaluadoresAptos(Trabajo trabajo) {
        ArrayList<Evaluador> evaluadoresAptos = new ArrayList<>();

        for (Evaluador evaluador : this.evaluadores) {

            if (trabajo.isApto(evaluador)) {
                evaluadoresAptos.add(evaluador);
            }

        }

        return evaluadoresAptos;
    }

    // 3
    public ArrayList<Trabajo> getTrabajos(Evaluador evaluador) {
        return evaluador.getTrabajos();
    }

    public static void main(String[] args) {

        Congreso congreso = new Congreso("Exactas 2022");

        Trabajo t1 = new Poster("Trabajo1");
        Trabajo t2 = new Trabajo("Trabajo2");
        Trabajo t3 = new Poster("Trabajo3");

        // TEMAS DEL TRABAJO
        t1.addTemas("A1");
        t1.addTemas("A2");
        t1.addTemas("A3");
        t1.addTemas("A4");

        // TEMAS DEL RESUMEN
        t2.addTemas("R1");
        t2.addTemas("R2");
        t2.addTemas("R3");
        t2.addTemas("R4");
        t2.addTemas("R5");

        // TEMAS DEL POSTER
        t3.addTemas("P1");
        t3.addTemas("P2");
        t3.addTemas("P3");
        t3.addTemas("P4");
        t3.addTemas("P5");

        congreso.addTrabajo(t1);
        congreso.addTrabajo(t2);
        congreso.addTrabajo(t3);

        Evaluador e1 = new Evaluador("Juan");
        Evaluador e2 = new Evaluador("Matias");
        Evaluador e3 = new Evaluador("Florencia");

        e1.addConocimiento("P4");
        e1.addConocimiento("R1");
        e1.addConocimiento("A4");
        e1.addConocimiento("P2");
        e1.addConocimiento("A3");

        e2.addConocimiento("P1");
        e2.addConocimiento("P2");
        e2.addConocimiento("A3");

        e3.addConocimiento("A2");
        e3.addConocimiento("A1");
        e3.addConocimiento("A4");
        e3.addConocimiento("R1");
        e3.addConocimiento("R2");
        e3.addConocimiento("R3");
        e3.addConocimiento("R4");
        e3.addConocimiento("R5");

        congreso.addEvaluador(e1);
        congreso.addEvaluador(e2);
        congreso.addEvaluador(e3);

        // ArrayList<String> conocimientos_requeridos = new ArrayList<>();
        // conocimientos_requeridos.add("P1");
        // conocimientos_requeridos.add("A3");
        // conocimientos_requeridos.add("P2");

        // System.out.println(congreso.getExpertos(t1.getTemas()));

        // System.out.println(congreso.getEvaluadoresAptos(t2));

        System.out.println(congreso.getTrabajosAptos(e3));

    }

}
