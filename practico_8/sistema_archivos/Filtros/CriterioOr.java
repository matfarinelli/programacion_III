package practico_8.sistema_archivos.Filtros;

import practico_8.sistema_archivos.ElementoFS;

public class CriterioOr implements Criterio {

    Criterio c1;
    Criterio c2;

    public CriterioOr(Criterio c1, Criterio c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public boolean coincide(ElementoFS elem) {
        return this.c1.coincide(elem) ||
                this.c1.coincide(elem);
    }

}
