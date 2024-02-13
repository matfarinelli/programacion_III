package practico_6.practico_6_7;

import java.util.ArrayList;

public class CriterioAutor extends Criterio {

    private String autor;

    public CriterioAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public boolean coincidencia(Documento documento) {

        for (String autor : documento.getAutores()) {
            if (autor.equals(this.getAutor())) {
                return true;
            }
        }
        return false;
    }
}
