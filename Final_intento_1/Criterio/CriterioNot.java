package Final_intento_1.Criterio;

import Final_intento_1.ComandoSimple;

public class CriterioNot {

    private Criterio c1;

    public CriterioNot(Criterio c1) {
        this.c1 = c1;
    }

    public Criterio getCriterio1() {
        return this.c1;
    }

    public boolean cumple(ComandoSimple c) {
        return !c1.cumple(c);
    }

}
