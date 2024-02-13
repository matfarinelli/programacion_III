package practico_8.sitio_web.filtros;

import practico_8.sitio_web.Noticia;

public class CriterioAnd extends Criterio {

    private Criterio c1;
    private Criterio c2;

    public CriterioAnd(Criterio c1, Criterio c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(Noticia e) {
        return c1.cumple(e) && c2.cumple(e);
    }

}
