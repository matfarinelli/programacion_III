import practico_6.practico_6_2bis.Sensor;

public class EstacionHumedad extends Estacion {

    private Sensor humedad;
    private double humedad_comparativa;

    public EstacionHumedad(String nombre, double humedad_comparativa) {
        super(nombre);
        this.humedad_comparativa = humedad_comparativa;
    }

    public void setSensorhumedad(Sensor humedad) {
        this.humedad = humedad;
    }

    public boolean predecirLluvia() {
        return this.humedad_comparativa < humedad.getLast();
    }

}
