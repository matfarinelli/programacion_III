package practico_6.practico_6_7;

import java.util.ArrayList;

public class CriterioContenido extends Criterio {

    private String contenido;

    public CriterioContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public boolean coincidencia(Documento documento) {

        return documento.getContenido().contains(contenido);

    }
}
