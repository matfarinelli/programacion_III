package practico_7.practico_7_4.Ordenadores;

import java.util.Comparator;

import practico_7.practico_7_4.Planta;

public class Ordenador implements Comparator<Planta> {

    // el default de los ordenadores es por nombre, se pisa con el compare de
    // Plantas. Pero lo uso por la jerarquía
    // de los otros ordenadores
    @Override
    public int compare(Planta o1, Planta o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }

}
