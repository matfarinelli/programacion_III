package Final_intento_1.Criterio;

import Final_intento_1.ComandoSimple;

public class CriterioOr {

    private Criterio c1;
    private Criterio c2;

    public CriterioOr(Criterio c1, Criterio c2){
        this.c1 = c1;
        this.c2 = c2;
    }

    public Criterio getCriterio1() {
        return this.c1;
    }

    public Criterio getCriterio2() {
        return this.c2;
    }

    public boolean cumple(ComandoSimple c) {
        return c1.cumple(c) || c2.cumple(c);
    }

}
