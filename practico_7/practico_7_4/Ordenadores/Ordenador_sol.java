package practico_7.practico_7_4.Ordenadores;

import practico_7.practico_7_4.Planta;

public class Ordenador_sol extends Ordenador {

    public int compare(Planta o1, Planta o2) {
        return Integer.compare(o1.getSol(), o2.getSol());
    }
}