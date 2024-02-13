package practico_8.sitio_web.filtros;

import practico_8.sitio_web.ElementoWeb;
import practico_8.sitio_web.Noticia;

public abstract class Criterio {

    public abstract boolean cumple(Noticia e);
}
