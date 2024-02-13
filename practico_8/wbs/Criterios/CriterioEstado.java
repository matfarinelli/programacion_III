package practico_8.wbs.Criterios;

import practico_8.wbs.TareaAbstracta;

public class CriterioEstado extends Criterio {

    private String estado;

    public CriterioEstado(String estado){
        this.estado = estado;
    }

    public boolean cumple(TareaAbstracta t){
        return t.getEstado().equals(estado);
    }

}
