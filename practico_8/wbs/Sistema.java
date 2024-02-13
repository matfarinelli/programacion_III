package practico_8.wbs;

import java.time.LocalDate;

import practico_8.wbs.Criterios.CriterioAnd;
import practico_8.wbs.Criterios.CriterioAtraso;
import practico_8.wbs.Criterios.CriterioEstado;

public class Sistema {

    public static void main(String[] args) {

        TareaCompuesta tc = new TareaCompuesta("Inicio");

        TareaCompuesta tc1 = new TareaCompuesta("TC1");

        TareaSimple ts1 = new TareaSimple("TS1");
        TareaSimple ts2 = new TareaSimple("TS2");
        TareaSimple ts3 = new TareaSimple("TS3");

        ts1.setFechaFinEstimada(LocalDate.of(2023, 12, 1));
        ts1.setEstado("en espera");
        ts2.setFechaFinEstimada(LocalDate.of(2023, 12, 3));
        ts2.setEstado("en espera");
        ts3.setFechaFinEstimada(LocalDate.of(2023, 12, 2));
        ts3.setEstado("completo");

        tc1.addTarea(ts1);
        tc1.addTarea(ts2);
        tc1.addTarea(ts3);

        TareaCompuesta tc2 = new TareaCompuesta("TC2");

        TareaCompuesta tc3 = new TareaCompuesta("TC3");
        ts3.setFechaFinEstimada(LocalDate.of(2023, 12, 7));

        TareaSimple ts4 = new TareaSimple("TS4");
        TareaSimple ts5 = new TareaSimple("TS5");
        TareaSimple ts6 = new TareaSimple("TS6");

        ts4.setFechaFinEstimada(LocalDate.of(2023, 12, 1));
        ts4.setEstado("en espera");
        ts5.setFechaFinEstimada(LocalDate.of(2023, 12, 3));
        ts5.setEstado("completo");
        ts6.setFechaFinEstimada(LocalDate.of(2023, 12, 2));
        ts6.setEstado("en preparacion");

        tc3.addTarea(ts4);
        tc3.addTarea(ts5);
        tc3.addTarea(ts6);

        tc.addTarea(tc1);
        tc.addTarea(tc2);
        tc.addTarea(tc3);

        CriterioAtraso c_atraso = new CriterioAtraso();
        CriterioEstado c_estado = new CriterioEstado("completo");
        CriterioAnd c_and = new CriterioAnd(c_atraso, c_estado);

        // System.out.println(tc.getTareas(c_and));

        Recurso r1 = new Recurso("recurso1", false);
        Recurso r2 = new Recurso("recurso2", true);
        Recurso r3 = new Recurso("recurso3", false);
        Recurso r4 = new Recurso("recurso4", true);
        Recurso r5 = new Recurso("recurso5", false);
        Recurso r6 = new Recurso("recurso6", false);
        Recurso r7 = new Recurso("recurso7", true);
        Recurso r8 = new Recurso("recurso8", false);
        Recurso r9 = new Recurso("recurso9", false);
        // Asignar recursos a ts1
        ts1.addRecursoMaterial(r1);
        ts1.addRecursoMaterial(r2);
        ts1.addRecursoMaterial(r3);
        ts1.addRecursoPersona(r4);

        // Asignar recursos a ts2
        ts2.addRecursoMaterial(r5);
        ts2.addRecursoMaterial(r6);
        ts2.addRecursoPersona(r7);

        // Asignar recursos a ts3
        ts3.addRecursoMaterial(r2);
        ts3.addRecursoMaterial(r4);
        ts3.addRecursoMaterial(r6);
        ts3.addRecursoPersona(r8);

        // Asignar recursos a ts4
        ts4.addRecursoMaterial(r1);
        ts4.addRecursoMaterial(r3);
        ts4.addRecursoPersona(r5);

        // Asignar recursos a ts5
        ts5.addRecursoMaterial(r7);
        ts5.addRecursoPersona(r2);

        // Asignar recursos a ts6
        ts6.addRecursoMaterial(r3);
        ts6.addRecursoMaterial(r5);
        ts6.addRecursoMaterial(r8);
        ts6.addRecursoPersona(r1);
        ts6.addRecursoPersona(r9);

        // System.out.println(tc.getTareasUsan(r8));

        System.out.println(tc.getRecursos(tc));

    }

}
