package practico_8.sistema_archivos.Filtros;

import java.time.LocalDate;
import practico_8.sistema_archivos.ElementoFS;

public class CriterioFModificacionDespues implements Criterio {

    private LocalDate fechaBuscada;

    public CriterioFModificacionDespues(LocalDate fechaBuscada) {
        this.fechaBuscada = fechaBuscada;
    }

    public LocalDate getFechaBuscada() {
        return this.fechaBuscada;
    }

    public boolean coincide(ElementoFS elem) {
        return elem.getFecha_modificacion().isAfter(fechaBuscada);
    }

}
