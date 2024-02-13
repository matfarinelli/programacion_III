package practico_8.sitio_web.filtros;

import practico_8.sitio_web.Noticia;

public class CriterioNot extends Criterio {

    private Criterio c1;

    public CriterioNot(Criterio c1) {
        this.c1 = c1;
    }

    @Override
    public boolean cumple(Noticia e) {
        return !c1.cumple(e);
    }

}
