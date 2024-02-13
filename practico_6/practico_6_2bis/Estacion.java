package practico_6.practico_6_2bis;

public class Estacion {

    private String nombre;
    private Sensor lluvia;
    private Sensor temperatura;
    private Sensor viento;
    private Sensor humedad;
    private Predictor predictor;

    public Estacion(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void addSensorLluvia(Sensor sensor) {
        this.lluvia = sensor;
    }

    public void addSensorTemperatura(Sensor sensor) {
        this.temperatura = sensor;
    }

    public void addSensorHumedad(Sensor sensor) {
        this.humedad = sensor;
    }

    public void addSensorViento(Sensor sensor) {
        this.viento = sensor;
    }

    public void addPredictor(Predictor predictor) {
        this.predictor = predictor;
    }

    // public void addPrediccion(Prediccion prediccion) {
    // this.prediccion = prediccion;
    // }

    public boolean predecirLluvia(Sensor s1, Sensor s2) {
        return predictor.predecirLluvia(s1, s2);
    }

    // podria enviar la estación y que según el criterio analice el sensor que
    // necesite.
    // MAIL LUIS
    // En realidad por la forma en que lo estas haciendo el criterio puede variar de
    // una estacion a otra, es decir la forma de calcular la prediccion. Como no
    // podes hacer que para unos pase dos y optros tres podes hacer que se mande la
    // estacion
    // criterio.predecir(this) de esa forma el criterio pide a la estacion lo que
    // necesita, sensor de viento de humedad....

    // public boolean prediccionLluvia(Sensor sensor1, Sensor sensor2) {
    // return predictor.predecir(sensor1) &
    // }

    /*
     * MAIN
     */

    public static void main(String[] args) {

        Estacion tandil = new Estacion("Tandil");

        Sensor lluvia = new Sensor("Lluvia");
        Sensor humedad = new Sensor("Humedad");
        Sensor viento = new Sensor("Viento");
        Sensor temperatura = new Sensor("Temperatura");

        tandil.addSensorLluvia(lluvia);
        tandil.addSensorHumedad(humedad);
        tandil.addSensorViento(viento);
        tandil.addSensorTemperatura(temperatura);

        lluvia.addRegistro(55);
        lluvia.addRegistro(10);
        lluvia.addRegistro(25);
        lluvia.addRegistro(16);
        lluvia.addRegistro(4);
        lluvia.addRegistro(17.5);
        lluvia.addRegistro(3);
        lluvia.addRegistro(11.2);

        temperatura.addRegistro(15);
        temperatura.addRegistro(19);
        temperatura.addRegistro(28);
        temperatura.addRegistro(29);
        temperatura.addRegistro(35);
        temperatura.addRegistro(35);
        temperatura.addRegistro(37);
        temperatura.addRegistro(38);
        temperatura.addRegistro(33);
        temperatura.addRegistro(34);

        Criterio promedio_lluvia = new CriterioPromedio(110, 8);
        Criterio max_temperatura = new CriterioMaximo(12, 12);

        Predictor predictorTandil = new PredictorDoble(promedio_lluvia, max_temperatura);
        tandil.addPredictor(predictorTandil);

        System.out.println("Promedio últimos 8 registros : " +
                lluvia.getPromedio(8) + "mm");
        System.out.println("Temperatura máxima últimos 12 registros : " +
                temperatura.getMax(12) + "º");
        System.out.println("Lloverá en Tandil en la próxima hora? : " +
                tandil.predecirLluvia(lluvia, temperatura));

        // VELA

        Estacion vela = new Estacion("Vela");

        Sensor humedadVela = new Sensor("Humedad");

        vela.addSensorHumedad(humedadVela);

        humedadVela.addRegistro(66);
        humedadVela.addRegistro(19);
        humedadVela.addRegistro(38);

        Criterio criterioHumedadVela = new CriterioUltimo(54);

        Predictor predictorVela = new Predictor(criterioHumedadVela);

        vela.addPredictor(predictorVela);

        System.out.println("Ultimo registro humedad Vela : " +
                humedadVela.getLast() + "%");
        // System.out.println("Lloverá en Vela en la próxima hora? : " +
                // vela.predecirLluvia(humedad));

    }
}
