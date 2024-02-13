package practico_8.sitio_web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

import practico_8.sitio_web.filtros.Criterio;

public class Noticia extends ElementoWeb {

    private String titulo;
    private String intro;
    private String cuerpo;
    private String autor;
    private String link;
    private Set<String> palabras_claves;

    public Noticia(String titulo, String intro, String cuerpo, String autor, String link) {
        this.titulo = titulo;
        this.intro = intro;
        this.cuerpo = cuerpo;
        this.autor = autor;
        this.link = link;
        this.palabras_claves = new HashSet<>();
    }

    public void addPalabraClave(String palabra) {
        this.palabras_claves.add(palabra);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIntro() {
        return intro;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public String getAutor() {
        return autor;
    }

    public String getLink() {
        return link;
    }

    // solo control
    public Set<String> getPalabras_claves() {
        return new HashSet<String>(this.palabras_claves);
    }

    @Override
    public int getCantidadNoticias() {
        return 1;
    }

    public int getCantidadPalabras() {
        StringTokenizer tokenizer = new StringTokenizer(this.getCuerpo());

        return tokenizer.countTokens();
    }

    public int getCantidadCaracteres() {
        return this.getCuerpo().length();
    }

    @Override
    public ArrayList<Noticia> buscar(Criterio criterio) {
        ArrayList<Noticia> coincidencias = new ArrayList<>();

        if (criterio.cumple(this)) {
            coincidencias.add(this);
        }

        return coincidencias;
    }

    public String toString() {
        return this.getTitulo() + " - " + this.getIntro();
    }

    @Override
    public ElementoWeb copia() {
        ElementoWeb copia = new Noticia(this.getTitulo(), this.getIntro(), this.getCuerpo(), this.getAutor(),
                this.getLink());

        return copia;
    }

    @Override
    public ElementoWeb copia(Criterio criterio) {

        if (criterio.cumple(this)) {
            return new Noticia(this.getTitulo(), this.getIntro(), this.getCuerpo(), this.getAutor(),
                    this.getLink());
        }

        else
            return null;

    }

    public ArrayList<String> getRutaCompleta() {
        ArrayList<String> respuesta = new ArrayList<>();
        respuesta.add(this.getLink());
        return respuesta;
    }
}
