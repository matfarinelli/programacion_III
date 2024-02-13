package practico_7.practico_7_4.Criterios;

import practico_7.practico_7_4.Planta;

public class Criterio_and extends Criterio {

    private Criterio criterio1;
    private Criterio criterio2;

    public Criterio_and(Criterio criterio1, Criterio criterio2) {
        this.criterio1 = criterio1;
        this.criterio2 = criterio2;
    }

    public Criterio getCriterio1() {
        return this.criterio1;
    }

    public Criterio getCriterio2() {
        return this.criterio2;
    }

    @Override
    public boolean buscar(Planta p) {
        return criterio1.buscar(p) && criterio2.buscar(p);
    }

}
