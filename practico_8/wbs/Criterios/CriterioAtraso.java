package practico_8.wbs.Criterios;

import java.time.LocalDate;

import practico_8.wbs.TareaAbstracta;

public class CriterioAtraso extends Criterio{
    
    private LocalDate fecha;

    public CriterioAtraso(){
        this.fecha = LocalDate.now();
    }

    public boolean cumple(TareaAbstracta t){
        return t.getFechaFinalizacionEstimada().isBefore(LocalDate.now());
    }

}
