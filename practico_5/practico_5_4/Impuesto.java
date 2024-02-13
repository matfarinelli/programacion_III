package practico_5_4;

public class Impuesto {

    protected String nombre;
    protected double fijo;

    public Impuesto(String nombre, double fijo) {
        this.nombre = nombre;
        this.fijo = fijo;
    }

    public void setFijo(double fijo) {
        this.fijo = fijo;
    }

    public double getImporte() {
        return this.fijo;
    }

    public String getNombre() {
        return this.nombre;
    }


    
}
