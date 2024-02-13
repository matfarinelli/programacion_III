package practico_8.sitio_web;

import java.util.ArrayList;

import practico_8.sitio_web.filtros.Criterio;

public abstract class ElementoWeb {

    public abstract int getCantidadNoticias();

    public abstract ArrayList<Noticia> buscar(Criterio criterio);

    public abstract ElementoWeb copia();

    public abstract ElementoWeb copia(Criterio criterio);

    public abstract ArrayList<String> getRutaCompleta();

    

}
