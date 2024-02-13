package practico_8.sitio_web.filtros;

import practico_8.sitio_web.Noticia;

public class CriterioTitulo extends Criterio {

    private String titulo;

    public CriterioTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    @Override
    public boolean cumple(Noticia n) {
        return this.getTitulo().equals(n.getTitulo());
        // return n.getTitulo().equals(this.getTitulo());
    }

}
