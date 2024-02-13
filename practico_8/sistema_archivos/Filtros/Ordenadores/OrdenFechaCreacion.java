package practico_8.sistema_archivos.Filtros.Ordenadores;

import java.time.LocalDate;
import java.util.Comparator;

import practico_8.sistema_archivos.ElementoFS;

public class OrdenFechaCreacion extends Orden {

    // public OrdenFechaCreacion(boolean ascendente) {
    //     if (ascendente)
    //         super.multiplicador = 1;
    //     else
    //         super.multiplicador = -1;
    // }

    @Override
    public int compare(ElementoFS o1, ElementoFS o2) {
        if (o1.getFecha_creacion().isBefore(o2.getFecha_creacion())) {
            return  -1;
        } else if (o2.getFecha_creacion().isBefore(o1.getFecha_creacion())) {
            return  1;
        } else
            return 0;
    }

}
