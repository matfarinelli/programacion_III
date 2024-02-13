package practico_8.sistema_electoral;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;

import practico_8.sistema_electoral.Comparadores.ComparadorCandidato;

public class SistemaElectoral {

    // private ArrayList<ElementoElectoral> lugaresVoto;
    // private ArrayList<Votante> votantes;

    // public SistemaElectoral() {
    // this.lugaresVoto = new ArrayList<>();
    // this.votantes = new ArrayList<>();
    // }

    // public void addLugar(ElementoElectoral e) {
    // this.lugaresVoto.add(e);
    // }

    // public void addVotante(ElementoElectoral e) {
    // this.lugaresVoto.add(e);
    // }

    public static void main(String[] args) {

        Conjunto elecciones = new Conjunto("Padron general");

        // Crear votantes
        Votante v1 = new Votante("Matias", 1);
        Votante v2 = new Votante("Carlos", 2);
        Votante v3 = new Votante("Luisa", 3);
        Votante v4 = new Votante("Ana", 4);
        Votante v5 = new Votante("Pedro", 5);
        Votante v6 = new Votante("María", 6);
        Votante v7 = new Votante("Lucas", 7);
        Votante v8 = new Votante("Sofía", 8);
        Votante v9 = new Votante("Diego", 9);
        Votante v10 = new Votante("Laura", 10);
        Votante v11 = new Votante("Marta", 11);

        // Crear candidatos
        Candidato c1 = new Candidato("Jorge Chamuyo", 15, "Partido A", "Agrupación 1");
        Candidato c2 = new Candidato("Luisa Honestidad", 16, "Partido B", "Agrupación 1");
        Candidato c3 = new Candidato("Carlos Pragmático", 17, "Partido C", "Agrupación 1");
        Candidato c4 = new Candidato("Marta Visionaria", 18, "Partido A", "Agrupación 1");
        Candidato c5 = new Candidato("Alejandro Conciliador", 19, "Partido B", "Agrupación 2");
        Candidato c6 = new Candidato("Lucía Ecologista", 20, "Partido C", "Agrupación 2");
        Candidato c7 = new Candidato("Ana Diplomática", 21, "Partido A", "Agrupación 3");
        Candidato c8 = new Candidato("Pedro Innovador", 22, "Partido C", "Agrupación 1");
        Candidato c9 = new Candidato("Sofía Sostenible", 23, "Partido C", "Agrupación 2");

        // Crear localidades
        Conjunto tandil = new Conjunto("Tandil");
        Conjunto azul = new Conjunto("Azul");

        // Crear barrios en Tandil
        Conjunto barrio1Tandil = new Conjunto("Barrio A - Tandil");
        Conjunto barrio2Tandil = new Conjunto("Barrio B - Tandil");

        // Crear barrios en Azul
        Conjunto barrio1Azul = new Conjunto("Barrio A - Azul");
        Conjunto barrio2Azul = new Conjunto("Barrio B - Azul");

        // Crear escuelas en barrio1Tandil
        Conjunto escuela1Tandil = new Conjunto("Escuela 1 - Tandil");
        Conjunto escuela2Tandil = new Conjunto("Escuela 2 - Tandil");

        // Crear escuelas en barrio1Azul
        Conjunto escuela1Azul = new Conjunto("Escuela 1 - Azul");
        Conjunto escuela2Azul = new Conjunto("Escuela 2 - Azul");

        // Crear mesas en escuela1Tandil
        Mesa mesa1Tandil = new Mesa("Mesa 1 - Tandil");
        Mesa mesa2Tandil = new Mesa("Mesa 2 - Tandil");

        // Crear mesas en escuela2Tandil
        Mesa mesa1Tandil2 = new Mesa("Mesa 1 - Tandil");
        Mesa mesa2Tandil2 = new Mesa("Mesa 2 - Tandil");

        // Crear mesas en escuela1Azul
        Mesa mesa1Azul = new Mesa("Mesa 1 - Azul");
        Mesa mesa2Azul = new Mesa("Mesa 2 - Azul");

        // Crear mesas en escuela2Azul
        Mesa mesa1Azul2 = new Mesa("Mesa 1 - Azul");
        Mesa mesa2Azul2 = new Mesa("Mesa 2 - Azul");

        // Agregar las estructuras a la jerarquía

        elecciones.addElementoElectoral(azul);
        elecciones.addElementoElectoral(tandil);

        tandil.addElementoElectoral(barrio1Tandil);
        tandil.addElementoElectoral(barrio2Tandil);

        azul.addElementoElectoral(barrio1Azul);
        azul.addElementoElectoral(barrio2Azul);

        barrio1Tandil.addElementoElectoral(escuela1Tandil);
        barrio1Tandil.addElementoElectoral(escuela2Tandil);

        barrio1Azul.addElementoElectoral(escuela1Azul);
        barrio1Azul.addElementoElectoral(escuela2Azul);

        escuela1Tandil.addElementoElectoral(mesa1Tandil);
        escuela1Tandil.addElementoElectoral(mesa2Tandil);

        escuela1Azul.addElementoElectoral(mesa1Azul);
        escuela1Azul.addElementoElectoral(mesa2Azul);

        escuela2Tandil.addElementoElectoral(mesa1Tandil2);
        escuela2Tandil.addElementoElectoral(mesa2Tandil2);

        escuela2Azul.addElementoElectoral(mesa1Azul2);
        escuela2Azul.addElementoElectoral(mesa2Azul2);

        // asignación de votantes a mesas
        mesa1Azul.addDni(1);
        mesa1Azul.addDni(2);
        mesa1Azul.addDni(3);

        mesa1Azul2.addDni(4);
        mesa1Azul2.addDni(5);

        mesa1Tandil.addDni(6);
        mesa1Tandil.addDni(7);

        mesa2Tandil2.addDni(8);

        mesa1Tandil2.addDni(9);
        mesa1Tandil2.addDni(10);

        mesa2Tandil2.addDni(11);

        // Asignar votos a algunos votantes
        v1.votar(c1, mesa1Azul);
        v2.votar(c2, mesa1Azul);
        v3.votar(c2, mesa1Azul);
        v4.votar(null, mesa1Azul2);
        v5.votar(c2, mesa1Azul2);
        v6.votar(c2, mesa1Tandil);
        v7.votar(c1, mesa1Tandil);
        v8.votar(c1, mesa2Tandil2);
        v9.votar(c2, mesa1Tandil2);
        v10.votar(c1, mesa1Tandil2);
        v11.votar(c2, mesa2Tandil); // debería arrojar alerta

        System.out.println("\n");
        System.out.println("Porcentaje candidato 1: " + elecciones.getPorcentajeCandidato(c1));
        System.out.println("Porcentaje candidato 2: " + elecciones.getPorcentajeCandidato(c2));

        System.out.println("\n");
        System.out.println("Azul: " + azul.getCantidadVotos());
        System.out.println("Escuela 1 Azul: " + escuela1Azul.getCantidadVotos());
        System.out.println("Mesa 1 Escuela 1 Azul: " + mesa1Azul.getCantidadVotos());
        System.out.println("Mesa 2 Escuela 1 Azul: " + mesa2Azul.getCantidadVotos());
        System.out.println("Escuela 2 Azul: " + escuela2Azul.getCantidadVotos());
        System.out.println("Mesa 1 Escuela 2 Azul: " + mesa1Azul2.getCantidadVotos());
        System.out.println("Mesa 2 Escuela 2 Azul: " + mesa2Azul2.getCantidadVotos());
        System.out.println("Cantidad de votos candidato1: " + azul.getCantidadVotosCandidato(c1));
        System.out.println("Cantidad de votos candidato2: " + azul.getCantidadVotosCandidato(c2));
        System.out.println("Porcentaje azul c1: " + azul.getPorcentajeCandidato(c1));
        System.out.println("Porcentaje azul c2: " + azul.getPorcentajeCandidato(c2));

        System.out.println("\n");
        System.out.println("Tandil: " + tandil.getCantidadVotos());
        System.out.println("Escuela 1 Tandil: " + escuela1Tandil.getCantidadVotos());
        System.out.println("Mesa 1 Escuela 1 Tandil: " + mesa1Tandil.getCantidadVotos());
        System.out.println("Mesa 2 Escuela 1 Tandil: " + mesa2Tandil.getCantidadVotos());
        System.out.println("Escuela 2 Tandil: " + escuela2Tandil.getCantidadVotos());
        System.out.println("Mesa 1 Escuela 2 Tandil: " + mesa1Tandil2.getCantidadVotos());
        System.out.println("Mesa 2 Escuela 2 Tandil: " + mesa2Tandil2.getCantidadVotos());
        System.out.println("Cantidad de votos candidato1: " + tandil.getCantidadVotosCandidato(c1));
        System.out.println("Cantidad de votos candidato2: " + tandil.getCantidadVotosCandidato(c2));
        System.out.println("Porcentaje tandil c1: " + tandil.getPorcentajeCandidato(c1));
        System.out.println("Porcentaje tandil c2 :" + tandil.getPorcentajeCandidato(c2));

        // System.out.println("porc:" + azul.getPorcentajeCandidato(c1));
        // System.out.println("porc:" + azul.getPorcentajeCandidato(c2));

        System.out.println("\n");
        System.out.println("Cantidad de votos en blanco: " + elecciones.getCantidadVotosBlanco());
        System.out.println("Porcentaje de votos en blanco: " + elecciones.getPorcentajeVotosBlanco());

        System.out.println("\n");

        // Obtener todos los votos
        ArrayList<Voto> todosLosVotos = elecciones.getVotos();

        // Ordenar todos los votos
        Collections.sort(todosLosVotos);

        // Imprimir o procesar los resultados
        System.out.println("\nVotos ordenados por hora:");
        for (Voto v : todosLosVotos) {
            System.out.println(v);
        }

        ArrayList<Candidato> todosLosCandidatos = new ArrayList<>();
        Candidato[] candidatos = { c1, c2, c3, c4, c5, c6, c7, c8, c9 };

        for (Candidato candidato : candidatos) {
            todosLosCandidatos.add(candidato);
        }
        Collections.sort(todosLosCandidatos, new ComparadorCandidato());

        System.out.println("\nTodos los candidatos: ");
        for (Candidato c : todosLosCandidatos) {
            System.out.println(c);
        }

        LocalTime inicio = LocalTime.of(8, 00);
        LocalTime fin = LocalTime.of(12, 00);
        System.out.println("\nCantidad de votos entre 19 y 22: " + elecciones.getPorcentajeVotosEnFranja(inicio, fin));

    }

}
