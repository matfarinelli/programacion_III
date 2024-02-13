package practico_5_5;

public class Empleado_bono extends Empleado {

    private int cantidadVentas;
    private int meta_ventas;
    private double bono;

    public Empleado_bono(String nombre, String apellido, int dni, double sueldo, int meta_ventas, int bono) {
        super(nombre, apellido, dni, sueldo);
        this.bono = bono;
        this.meta_ventas = meta_ventas;
    }

    public void setCantidadVentas(int cantidadVentas) {
        this.cantidadVentas = cantidadVentas;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    public void setMetaVentas(int meta) {
        this.meta_ventas = meta;
    }

    public double getSueldo() {
        if (cantidadVentas >= meta_ventas) {
            return super.getSueldo() + this.bono;
        } else
            return super.getSueldo();
    }

}
