package adicional_1;

//Un libro se compone de un nombre, autor (solo uno),
// precio, cantidad de páginas, un resumen y el género literario que abarca (solo uno).

public class Libro extends Producto{

    private int cantidadPaginas;
    private String resumen;
    private String genero;

    public Libro(String nombre, String autor, double precio, String genero) {
        super(nombre,autor,precio);
        this.genero = genero;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    public void setCantidadPaginas(int cantidadPaginas) {
        this.cantidadPaginas = cantidadPaginas;
    }

    public String getResumen() {
        return resumen;
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

    

}
