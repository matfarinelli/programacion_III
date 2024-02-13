package Congreso;

import java.util.ArrayList;

public class Congreso {

    private String nombre;
    private ArrayList<Evaluador> evaluadores;
    private ArrayList<Trabajo> trabajos;
    private ArrayList<String> conocimientosExpertos;

    public Congreso(String nombre) {
        this.nombre = nombre;
        this.evaluadores = new ArrayList<>();
        this.trabajos = new ArrayList<>();
        this.conocimientosExpertos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
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

    // el congreso determina que temas se necesitan conocer para ser un experto
    public void addConocimiento(String conocimiento) {
        if (!this.conocimientosExpertos.contains(conocimiento)) {
            this.conocimientosExpertos.add(conocimiento);
        }
    }

    public ArrayList<String> getEvaluadoresString() {
        ArrayList<String> evaluadores = new ArrayList<>();

        for (Evaluador ev : this.evaluadores) {
            evaluadores.add(ev.getNombreCompleto());
        }

        return evaluadores;
    }

    // 1
    public ArrayList<Evaluador> getEvaluadoresAptosParaTrabajo(Trabajo trabajo) {
        ArrayList<Evaluador> evaluadoresAptos = new ArrayList<>();

        for (Evaluador evaluador : this.evaluadores) {
            if (trabajo.isEvaluadorApto(evaluador)) {
                evaluadoresAptos.add(evaluador);
            }
        }

        return evaluadoresAptos;
    }

    // 2
    public ArrayList<Trabajo> getTrabajosParaEvaluador(Evaluador evaluador) {
        ArrayList<Trabajo> trabajosAptos = new ArrayList<>();

        for (Trabajo trabajo : this.trabajos) {
            if (trabajo.isEvaluadorApto(evaluador)) {
                trabajosAptos.add(trabajo);
            }
        }

        return trabajosAptos;
    }

    // 3
    public int getCantidadTrabajos(Evaluador evaluador) {
        return evaluador.getCantidadTrabajos();
    }

    // 4
    public String isExperto(Evaluador evaluador) {
        for (String conocimiento : this.conocimientosExpertos) {
            if (!evaluador.tieneConocimiento(conocimiento)) {
                return "Es general";
            }
        }
        return "Es experto";
    }

    // main
    public static void main(String args[]) {

        Congreso congreso = new Congreso("XXI Exa");

        Evaluador e1 = new Evaluador("E1");
        Evaluador e2 = new Evaluador("E2");
        Evaluador e3 = new Evaluador("E3");
        Evaluador e4 = new Evaluador("E4");
        Evaluador e5 = new Evaluador("E5");

        congreso.addEvaluador(e1);
        congreso.addEvaluador(e2);
        congreso.addEvaluador(e3);
        congreso.addEvaluador(e4);
        congreso.addEvaluador(e5);

        e1.addConocimiento("c1");
        e1.addConocimiento("c2");
        e1.addConocimiento("c3");

        e2.addConocimiento("c1");
        e2.addConocimiento("c4");

        e3.addConocimiento("c2");
        e3.addConocimiento("c4");

        e4.addConocimiento("c1");
        e4.addConocimiento("c3");
        e4.addConocimiento("c8");

        e5.addConocimiento("e2");
        e5.addConocimiento("c6");
        e5.addConocimiento("c7");

        Trabajo t1 = new Poster("trabajo1");
        t1.addRequisitos("c1");
        t1.addRequisitos("c4");

        Trabajo t2 = new TrabajoExigente("trabajo2");
        t2.addRequisitos("c1");
        // t2.addRequisitos("c2");
        t2.addRequisitos("c3");
        // t2.addRequisitos("c5");

        Trabajo t3 = new TrabajoExigente("trabajo3");
        t3.addRequisitos("c1");
        t3.addRequisitos("c7");

        Trabajo t4 = new Poster("trabajo4");
        t4.addRequisitos("c6");
        t4.addRequisitos("c4");

        // determinación de expertos
        congreso.addConocimiento("c1");
        congreso.addConocimiento("c8");

        // agregar trabajos
        congreso.addTrabajo(t1);
        congreso.addTrabajo(t2);
        congreso.addTrabajo(t3);
        congreso.addTrabajo(t4);

        System.out.println(("Evaluadores aptos para el t1 : " + congreso.getEvaluadoresAptosParaTrabajo(t1)));
        System.out.println(("Evaluadores aptos para el t2 : " + congreso.getEvaluadoresAptosParaTrabajo(t2)));
        System.out.println(("Evaluadores aptos para el t3 : " + congreso.getEvaluadoresAptosParaTrabajo(t3)));
        System.out.println(("Evaluadores aptos para el t4 : " + congreso.getEvaluadoresAptosParaTrabajo(t4)));

        System.out.println("--------------");

        System.out.println(("Trabajos aptos para el e1 : " + congreso.getTrabajosParaEvaluador(e1)));

        System.out.println("--------------");

        System.out.println(("Evaluador1: " + congreso.isExperto(e1)));
        System.out.println(("Evaluador2: " + congreso.isExperto(e2)));
        System.out.println(("Evaluador3: " + congreso.isExperto(e3)));
        System.out.println(("Evaluador4: " + congreso.isExperto(e4)));

    }
}
