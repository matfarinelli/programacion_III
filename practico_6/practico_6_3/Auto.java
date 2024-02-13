package practico_6.practico_6_3;

public class Auto extends Producto {

    private String marca;
    private int km;
    private String patente;
    private String tipo;

    public Auto(String nombre, int stock, String patente, int km, String tipo) {
        super(nombre, stock);
        this.patente = patente;
        this.km = km;
        this.tipo = tipo;
    }

    // stock siempre 1
    @Override
    protected void setStock(int stock) {
        this.stock = 1;
    }


}
