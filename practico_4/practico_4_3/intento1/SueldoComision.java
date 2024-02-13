package practico_4_3.intento1;

public class SueldoComision extends Sueldo {

    private double porcentajeComision;
    private double ventasRealizadas;
    
    public SueldoComision(double sumaFija, double porcentajeComision, double ventasRealizadas) {
        super(sumaFija);
        this.porcentajeComision = porcentajeComision;
        this.ventasRealizadas = ventasRealizadas;
    }

    public double getSueldo() {
        return super.getSueldo() + (porcentajeComision * ventasRealizadas);
    }
}
