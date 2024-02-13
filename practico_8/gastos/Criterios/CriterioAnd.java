package practico_8.gastos.Criterios;

import practico_8.gastos.ElementoAbsGasto;
import practico_8.gastos.GastoSimple;

public class CriterioAnd extends Criterio {

    private Criterio c1;
    private Criterio c2;

    public CriterioAnd(Criterio c1, Criterio c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public Criterio getCriterio1() {
        return this.c1;
    }

    public Criterio getCriterio2() {
        return this.c2;
    }

    public boolean cumple(ElementoAbsGasto g) {
        return c1.cumple(g) && c2.cumple(g);
    }
}
