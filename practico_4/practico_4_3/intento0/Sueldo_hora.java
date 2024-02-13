package practico_4_3.intento0;

public class Sueldo_hora extends Sueldo {

    private double horas;
    private double valor_hora;

    public Sueldo_hora(double importe, double valor_hora, double horas) {
        super(importe);
        this.valor_hora = valor_hora;
        this.horas = horas;
    }

    public double getSueldo() {
        double importe = super.getSueldo() + (this.horas * this.valor_hora);
        return importe;
    }
}
