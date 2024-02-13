package practico_8.sitio_web;

import java.util.ArrayList;

import practico_8.sitio_web.filtros.Criterio;

public class Categoria extends ElementoWeb {
    private ArrayList<ElementoWeb> sitio;
    private String descripcion;
    private String imagen;

    public Categoria(String descripcion, String imagen) {
        this.sitio = new ArrayList<>();
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    public void addElementoWeb(ElementoWeb e) {
        this.sitio.add(e);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public ArrayList<ElementoWeb> getSitio() {
        return new ArrayList<>(this.sitio);
    }

    @Override
    public int getCantidadNoticias() {
        int contador = 0;

        for (ElementoWeb e : this.sitio) {
            contador += e.getCantidadNoticias();
        }

        return contador;
    }

    @Override
    public ArrayList<Noticia> buscar(Criterio criterio) {
        ArrayList<Noticia> coincidencias = new ArrayList<>();

        for (ElementoWeb e : this.sitio) {
            coincidencias.addAll(e.buscar(criterio));
        }

        return coincidencias;

    }

    @Override
    public ElementoWeb copia() {
        ElementoWeb copia = new Categoria(this.getDescripcion(), this.getImagen());

        for (ElementoWeb e : this.sitio) {
            this.addElementoWeb(e.copia());
        }

        return copia;
    }

    @Override
    public ElementoWeb copia(Criterio criterio) {
        Categoria copia = new Categoria(this.getDescripcion(), this.getImagen());

        for (ElementoWeb e : this.sitio) {
            ElementoWeb copiaHijo = e.copia(criterio);

            if (copiaHijo != null) {
                copia.addElementoWeb(copiaHijo);
            }
        }

        return copia;
    }

    @Override
    public ArrayList<String> getRutaCompleta() {
        ArrayList<String> resultado = new ArrayList<>();

        resultado.add(this.getDescripcion() + "\\");

        for (ElementoWeb e : sitio) {
            ArrayList<String> resultadoHijo = e.getRutaCompleta();

            for (String s : resultadoHijo) {
                resultado.add(this.getDescripcion() + "\\" + s);
            }

            // resultado.addAll(e.getRutaCompleta());

        }

        return resultado;
    }

}
