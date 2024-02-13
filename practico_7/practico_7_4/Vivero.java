package practico_7.practico_7_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import practico_7.practico_7_4.Criterios.Criterio;
import practico_7.practico_7_4.Criterios.Criterio_Riego_inferior;
import practico_7.practico_7_4.Criterios.Criterio_Sol_inferior;
import practico_7.practico_7_4.Criterios.Criterio_and;
import practico_7.practico_7_4.Criterios.Criterio_clasificacion;
import practico_7.practico_7_4.Criterios.Criterio_nombre;
import practico_7.practico_7_4.Criterios.Criterio_not;
import practico_7.practico_7_4.Ordenadores.Ordenador;
import practico_7.practico_7_4.Ordenadores.Ordenador_clasificacion;
import practico_7.practico_7_4.Ordenadores.Ordenador_riego;
import practico_7.practico_7_4.Ordenadores.Ordenador_sol;

public class Vivero {

    private String nombre;
    private HashSet<Planta> plantas;
    // private Criterio filtro;

    public Vivero(String nombre) {
        this.nombre = nombre;
        this.plantas = new HashSet<>();
    }

    public void addPlanta(Planta p) {
        this.plantas.add(p);
    }

    public ArrayList<Planta> getPlantas() {
        ArrayList<Planta> plantas = new ArrayList<>(this.plantas);

        Collections.sort(plantas);

        return plantas;
    }

    // getPlantas por orden especifico
    public ArrayList<Planta> getPlantas(Ordenador ordenador) {
        ArrayList<Planta> plantas = new ArrayList<>(this.plantas);

        Collections.sort(plantas, ordenador);

        return plantas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // idem anterior, pero en reverse
    public ArrayList<Planta> getPlantasDescendente(Ordenador ordenador) {
        ArrayList<Planta> plantas = getPlantas(ordenador);

        Collections.reverse(plantas);

        return plantas;
    }

    // por defecto devuelve ordenado por nombre cientifico de las plantas
    public ArrayList<Planta> buscarPlantas(Criterio filtro) {
        ArrayList<Planta> coincidencias = new ArrayList<>();

        for (Planta planta : this.plantas) {
            if (filtro.buscar(planta)) {
                coincidencias.add(planta);
            }
        }

        Collections.sort(coincidencias);
        // descendente
        // Collections.sort(coincidencias, Collections.reverseOrder());

        return coincidencias;
    }

    // retorna por orden establecido por el usuario
    public ArrayList<Planta> buscarPlantas(Criterio filtro, Ordenador ordenador) {
        ArrayList<Planta> coincidencias = new ArrayList<>();

        for (Planta planta : this.plantas) {
            if (filtro.buscar(planta)) {
                coincidencias.add(planta);
            }
        }

        Collections.sort(coincidencias, ordenador);
        // descendente
        // Collections.sort(coincidencias, Collections.reverseOrder());

        return coincidencias;
    }

    public static void main(String[] args) {
        // Crear el vivero
        Vivero miVivero = new Vivero("Mi Vivero");

        // Crear las plantas
        Planta planta1 = new Planta("Rosa", "Flor", "Rosáceas", "Arbusto", true, 5, 7);
        Planta planta2 = new Planta("Orquídea", "Flor", "Orquidáceas", "Orquídea", false, 3, 1);
        Planta planta3 = new Planta("Helecho", "Follaje", "Pteridofitas", "Helecho", true, 4, 6);
        Planta planta4 = new Planta("Cactus", "Suculenta", "Cactáceas", "Cactus", true, 2, 9);
        Planta planta5 = new Planta("Lavanda", "Flor", "Lamiáceas", "Arbusto", false, 6, 7);

        // Agregar las plantas al vivero
        miVivero.addPlanta(planta1);
        miVivero.addPlanta(planta2);
        miVivero.addPlanta(planta3);
        miVivero.addPlanta(planta4);
        miVivero.addPlanta(planta5);

        Planta planta6 = new Planta("Rosa Roja", "Flor", "Rosáceas", "Arbusto", true, 6, 8);
        Planta planta7 = new Planta("Orquídea Blanca", "Flor", "Orquidáceas", "Orquídea", false, 4, 7);
        Planta planta8 = new Planta("Helecho Australiano", "Follaje", "Pteridofitas", "Helecho", true, 5, 6);
        Planta planta9 = new Planta("Cactus Espinoso", "Suculenta", "Cactáceas", "Cactus", true, 1, 9);
        Planta planta10 = new Planta("Lavanda Inglesa", "Flor", "Lamiáceas", "Arbusto", false, 7, 6);
        Planta planta11 = new Planta("Rosa Amarilla", "Flor", "Rosáceas", "Arbusto", true, 3, 8);
        Planta planta12 = new Planta("Orquídea Morada", "Flor", "Orquidáceas", "Orquídea", false, 4, 7);

        // Agregar estas plantas al vivero
        miVivero.addPlanta(planta6);
        miVivero.addPlanta(planta7);
        miVivero.addPlanta(planta8);
        miVivero.addPlanta(planta9);
        miVivero.addPlanta(planta10);
        miVivero.addPlanta(planta11);
        miVivero.addPlanta(planta12);

        // Imprimir información del vivero
        System.out.println("Bienvenido al Vivero: " + miVivero.getNombre());
        System.out.println("Plantas en el vivero:");

        for (Planta planta : miVivero.getPlantas()) {
            System.out.println("Nombre: " + planta.getNombre());
            System.out.println("Clasificación: " + planta.getClasificacion());
            System.out.println("Familia: " + planta.getFamilia());
            System.out.println("Clase: " + planta.getClase());
            System.out.println("Interior: " + planta.getIsInterior());
            System.out.println("Nivel de Riego: " + planta.getRiego());
            System.out.println("Nivel de Sol: " + planta.getSol());
            System.out.println("----------------------------------------");
        }

        // orden default - por nombre
        Criterio_nombre criterio_nombre = new Criterio_nombre("rosa");

        System.out.println("Plantas cuyo nombre incluya la palabra " + criterio_nombre.getNombre() + ":"
                + miVivero.buscarPlantas(criterio_nombre));

        System.out.println("---------------------");

        Criterio_clasificacion criterio_clasificacion = new Criterio_clasificacion("follaje");

        System.out.println("Plantas cuya clasificacion sea " + criterio_clasificacion.getClasificacion() + ":"
                + miVivero.buscarPlantas(criterio_clasificacion));

        //////////////////////// Separador ///////////////////////////

        // orden por clasificacion
        System.out.println("---------------------");
        Ordenador orden1 = new Ordenador_clasificacion();
        System.out.println(miVivero.getPlantas(orden1));

        // orden por riego
        System.out.println("---------------------");

        Ordenador orden_riego = new Ordenador_riego();

        Criterio_Sol_inferior criterio_sol = new Criterio_Sol_inferior(5);
        Criterio criterio_not = new Criterio_not(criterio_sol);

        Criterio_Riego_inferior criterio_riego = new Criterio_Riego_inferior(3);
        Criterio criterio_and = new Criterio_and(criterio_not, criterio_riego);

        System.out.println("Plantas cuyo riego sea superior a " + criterio_sol.getSol() + " y riego inferior a "
                + criterio_riego.getRiego() + ":" + miVivero.buscarPlantas(criterio_and, orden_riego));

        // orden por sol de mayor a menor
        System.out.println("---------------------");
        Ordenador ordenador_sol = new Ordenador_sol();

        System.out.println("Plantas ordenado por sol : " + miVivero.getPlantasDescendente(ordenador_sol));

    }

}
