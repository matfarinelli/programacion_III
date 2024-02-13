package practico_6.practico_6_3;

public class Pelicula extends Producto {

    private String info;

    public Pelicula(String nombre, int stock) {
        super(nombre, stock);
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String toString() {
        return this.getNombre();
    }

    @Override
    protected void setStock(int stock) {
        this.stock = stock;
    }

}
