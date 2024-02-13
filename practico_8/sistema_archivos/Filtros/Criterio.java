package practico_8.sistema_archivos.Filtros;

import java.util.ArrayList;

import practico_8.sistema_archivos.ElementoFS;

public interface Criterio {

    public abstract boolean coincide(ElementoFS elemento);

}
