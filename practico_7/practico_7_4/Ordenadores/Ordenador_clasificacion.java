package practico_7.practico_7_4.Ordenadores;

import java.util.Comparator;

import practico_7.practico_7_4.Planta;

public class Ordenador_clasificacion extends Ordenador {

    @Override
    public int compare(Planta o1, Planta o2) {
        return o1.getClasificacion().compareTo(o2.getClasificacion());
    }

}
