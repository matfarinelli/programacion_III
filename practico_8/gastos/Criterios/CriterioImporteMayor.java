package practico_8.gastos.Criterios;

import practico_8.gastos.ElementoAbsGasto;
import practico_8.gastos.GastoSimple;

public class CriterioImporteMayor extends Criterio {

    private double importe;

    public CriterioImporteMayor(double importe) {
        this.importe = importe;
    }

    public double getImporte() {
        return importe;
    }

    public boolean cumple(ElementoAbsGasto g) {
        return g.getGasto() > this.getImporte();
    }

}
