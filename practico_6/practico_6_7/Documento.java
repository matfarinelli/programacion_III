package practico_6.practico_6_7;

import java.util.ArrayList;

public class Documento {

    private String titulo;
    private ArrayList<String> autores;
    private String contenido;
    private ArrayList<String> palabrasClaves;

    public Documento(String titulo) {
        this.titulo = titulo;
        this.autores = new ArrayList<>();
        this.palabrasClaves = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<String> getAutores() {
        return new ArrayList<String>(this.autores);
    }

    public void addAutores(String autor) {
        if (!this.autores.contains(autor)) {
            this.autores.add(autor);
        }
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public ArrayList<String> getPalabrasClaves() {
        return new ArrayList<String>(this.palabrasClaves);
    }

    public void addPalabraClave(String palabra) {
        if (!this.palabrasClaves.contains(palabra)) {
            this.palabrasClaves.add(palabra);
        }
    }

    public boolean equals(Object o) {
        try {
            Documento d = (Documento) o;

            return d.getTitulo().toLowerCase().equals(this.getTitulo().toLowerCase()) &&
                    d.getAutores().equals(this.getAutores());

        } catch (Exception e) {
            return false;
        }
    }

    public String toString() {
        return this.getTitulo() + " - " + this.getAutores().toString();
    }
}
