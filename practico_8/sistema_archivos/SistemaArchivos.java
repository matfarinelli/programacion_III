package practico_8.sistema_archivos;

import java.util.ArrayList;

import practico_8.sistema_archivos.Filtros.Criterio;

public class SistemaArchivos {

    private Carpeta root;
    private Criterio buscador;

    public SistemaArchivos() {
        this.root = new Carpeta("Root");
    }

    public void addElemento(ElementoFS elemento) {
        this.root.addElemento(elemento);
    }

    public void setCriterioBusqueda(Criterio criterio) {
        this.buscador = criterio;
    }

}
