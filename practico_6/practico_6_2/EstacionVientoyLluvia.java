import practico_6.practico_6_2bis.Sensor;

public class EstacionVientoyLluvia extends Estacion {

    private Sensor viento;
    private double velocidad_viento;
    private Sensor lluvia;
    private double comparativo_lluvia;

    public EstacionVientoyLluvia(String nombre, double velocidad_viento, double comparativo_lluvia) {
        super(nombre);
        this.velocidad_viento = velocidad_viento;
        this.comparativo_lluvia = comparativo_lluvia;
    }

    public void setSensorViento(Sensor viento) {
        this.viento = viento;
    }

    public void setSensorLluvia(Sensor lluvia) {
        this.lluvia = lluvia;
    }

    public void setVelocidadViento(double velocidad_viento) {
        this.velocidad_viento = velocidad_viento;
    }

    public void setComparativoLluvia(double comparativo_lluvia) {
        this.comparativo_lluvia = comparativo_lluvia;
    }

    public double getVelocidad_viento() {
        return velocidad_viento;
    }

    public double getComparativo_lluvia() {
        return comparativo_lluvia;
    }

    public boolean predecirLluvia() {
        return this.getVelocidad_viento() < viento.getLast() && this.getComparativo_lluvia() > lluvia.getLast();
    }
}
