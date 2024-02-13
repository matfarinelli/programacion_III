package practico_6.practico_6_3;

public abstract class Producto {

    private String nombre;
    protected int stock;
    protected int alquilados;

    public Producto(String nombre, int stock) {
        this.nombre = nombre;
        this.setStock(stock); // setea segun hijo
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getStock() {
        return this.stock;
    }

    public int getAlquilados() {
        return this.alquilados;
    }

    public boolean equals(Object o) {
        try {
            Producto otro = (Producto) o;
            return otro.getNombre().equals(this.getNombre());
        } catch (Exception e) {
            return false;
        }
    }

    public boolean esDisponible() {
        return this.getAlquilados() < this.getStock();
    }

    public void alquilar() {
        if (this.esDisponible()) {
            this.alquilados++;
        }
    }

    protected abstract void setStock(int stock);

}
