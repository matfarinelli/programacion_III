package practico_8.sitio_web.filtros;

import practico_8.sitio_web.ElementoWeb;
import practico_8.sitio_web.Noticia;

public class CriterioLongitudTexto extends Criterio {

    private int longitud;

    public CriterioLongitudTexto(int longitud) {
        this.longitud = longitud;
    }

    public int getLongitud() {
        return this.longitud;
    }

    @Override
    public boolean cumple(Noticia e) {
        return e.getCantidadCaracteres() >= this.getLongitud();
    }

}
