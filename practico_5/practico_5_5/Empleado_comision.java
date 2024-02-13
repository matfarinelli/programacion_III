package practico_5_5;

public class Empleado_comision extends Empleado {

    private double ventas;
    private double comision;

    public Empleado_comision(String nombre, String apellido, int dni, double sueldo, double ventas, double comision) {
        super(nombre, apellido, dni, sueldo);
        this.ventas = ventas;
        this.comision = comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    public double getComision() {
        return this.comision;
    }

    @Override
    public double getSueldo() {
        return this.ventas * this.comision + super.getSueldo();
    }

}
