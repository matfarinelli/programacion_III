package practico_8.gastos.Criterios;

import java.time.LocalDate;

import practico_8.gastos.ElementoAbsGasto;
import practico_8.gastos.GastoSimple;

public class CriterioFecha extends Criterio {

    private LocalDate fecha;

    public CriterioFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalDate getFecha(){
        return this.fecha;
    }

    @Override
    public boolean cumple(ElementoAbsGasto e) {
        return this.getFecha().isEqual(e.getFecha());
    }

}
