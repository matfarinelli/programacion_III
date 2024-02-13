import practico_6.practico_6_2bis.Sensor;

public class EstacionLluviaYTemperatura extends Estacion {

    private Sensor lluvia;
    private int cant_registros_lluvia;
    private double promedio_precipitaciones;
    private Sensor temperatura;
    private int cant_registros_temperatura;
    private double max_temperatura;

    public EstacionLluviaYTemperatura(String nombre, int cant_registros_lluvia, double promedio_precipitaciones,
            int cant_registros_temperatura, double max_temperatura) {
        super(nombre);
        this.cant_registros_lluvia = cant_registros_lluvia;
        this.promedio_precipitaciones = promedio_precipitaciones;
        this.cant_registros_temperatura = cant_registros_temperatura;
        this.max_temperatura = max_temperatura;
    }

    public void setSensorLluvia(Sensor lluvia) {
        this.lluvia = lluvia;
    }

    public void setSensorTemperatura(Sensor temperatura) {
        this.temperatura = temperatura;
    }

    public int getCant_registros_lluvia() {
        return cant_registros_lluvia;
    }

    public void setCant_registros_lluvia(int cant_registros_lluvia) {
        this.cant_registros_lluvia = cant_registros_lluvia;
    }

    public double getPromedio_precipitaciones() {
        return promedio_precipitaciones;
    }

    public void setPromedio_precipitaciones(double promedio_precipitaciones) {
        this.promedio_precipitaciones = promedio_precipitaciones;
    }

    public int getCant_registros_temperatura() {
        return cant_registros_temperatura;
    }

    public void setCant_registros_temperatura(int cant_registros_temperatura) {
        this.cant_registros_temperatura = cant_registros_temperatura;
    }

    public double getMax_temperatura() {
        return max_temperatura;
    }

    public void setMax_temperatura(double max_temperatura) {
        this.max_temperatura = max_temperatura;
    }

    public boolean predecirLluvia() {

        return (this.getPromedio_precipitaciones() > lluvia.getPromedio(cant_registros_lluvia)
                && this.getMax_temperatura() < temperatura.getMax(cant_registros_temperatura));
    }

}
