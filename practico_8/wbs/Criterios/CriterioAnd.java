package practico_8.wbs.Criterios;

import practico_8.wbs.TareaAbstracta;

public class CriterioAnd extends Criterio {

    private Criterio c1;
    private Criterio c2;

    public CriterioAnd(Criterio c1, Criterio c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(TareaAbstracta t) {
        return c1.cumple(t) && c2.cumple(t);
    }

}
