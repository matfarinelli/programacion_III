package practico_8.gastos.Criterios;

import practico_8.gastos.ElementoAbsGasto;

public class CriterioCaracteristica extends Criterio {

    private String caracteristica;

    public CriterioCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public String getCaracteristica() {
        return this.caracteristica;
    }

    public boolean cumple(ElementoAbsGasto e){
        return e.tieneCaracteristica(caracteristica);
    }

}
