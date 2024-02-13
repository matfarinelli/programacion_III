package practico_8.sitio_web.filtros;

import practico_8.sitio_web.Noticia;

public class CriterioAutor extends Criterio {

    private String autor;

    public CriterioAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return this.autor;
    }

    public boolean cumple(Noticia n) {
        return this.getAutor().equals(n.getAutor());
    }

}
