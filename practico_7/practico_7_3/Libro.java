package practico_7.practico_7_3;

public class Libro implements Comparable<Libro> {

    private int isbn;
    private String nombre;
    private String autor;
    private String genero;
    private String resumen;
    private int ano;

    public Libro(int isbn, String nombre, String autor, String genero, int ano, String resumen) {
        this.isbn = isbn;
        this.nombre = nombre;
        this.autor = autor;
        this.genero = genero;
        this.ano = ano;
        this.resumen = resumen;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getResumen() {
        return resumen;
    }

    public int getAno() {
        return ano;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean equals(Object o) {
        try {
            Libro l_nuevo = (Libro) o;

            return l_nuevo.getNombre().equals(this.getNombre()) &&
                    l_nuevo.getAutor().equals(this.getAutor());

        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public int compareTo(Libro o) {
        return Integer.compare(this.getIsbn(), o.getIsbn());
    }

    @Override
    public String toString() {
        return this.getIsbn() + " - " + this.getNombre() + " - " + this.getAutor() + " - " + this.getGenero() + " - ("
                + this.getAno() + ")\n";
    }
}
