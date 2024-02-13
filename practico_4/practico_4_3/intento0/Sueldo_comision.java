package practico_4_3.intento0;

public class Sueldo_comision extends Sueldo {

    private double porc_comision;

    public Sueldo_comision(double importe, double porc_comision) {
        super(importe);
        this.porc_comision = porc_comision;
    }

    public double getSueldo() {
        return (super.getSueldo() * (1 + this.porc_comision));
    }
}
