package practico_8.gastos.Criterios;

import practico_8.gastos.ElementoAbsGasto;
import practico_8.gastos.GastoSimple;

public class CriterioRubro extends Criterio {

    private String rubro;

    public CriterioRubro(String rubro) {
        this.rubro = rubro;
    }

    public String getRubro() {
        return rubro;
    }

    @Override
    public boolean cumple(ElementoAbsGasto e) {
        return this.getRubro().toLowerCase().equals(e.getDescripcion().toLowerCase());
    }

}
