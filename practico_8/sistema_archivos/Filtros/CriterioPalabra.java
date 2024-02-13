package practico_8.sistema_archivos.Filtros;

import java.util.ArrayList;

import practico_8.sistema_archivos.ElementoFS;

public class CriterioPalabra implements Criterio {

    private String palabra;

    public CriterioPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String getpalabra() {
        return this.palabra;
    }

    @Override
    public boolean coincide(ElementoFS elemento) {
        return elemento.getNombre().toLowerCase().contains(this.getpalabra().toLowerCase());
    }

}
