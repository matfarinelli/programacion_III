package practico_6.practico_6_7;

import java.util.ArrayList;

public class CriterioTitulo extends Criterio {

    private String titulo;

    public CriterioTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean coincidencia(Documento documento) {
        return this.getTitulo().toLowerCase().equals(documento.getTitulo().toLowerCase());
    }
}
