package practico_4_3.intento1;

public class SueldoHorasExtras extends Sueldo {

    private double horasExtras;
    private double valorHoraExtra;

    public SueldoHorasExtras(double sumaFija, double horasExtras, double valorHoraExtra) {
        super(sumaFija);
        this.horasExtras = horasExtras;
        this.valorHoraExtra = valorHoraExtra;
    }

    public double getSueldo() {
        return super.getSueldo() + (valorHoraExtra * horasExtras);
    }
}
