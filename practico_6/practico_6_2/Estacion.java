import practico_6.practico_6_2bis.Sensor;

public abstract class Estacion {

    private String nombre;

    public Estacion(String nombre) {
        this.nombre = nombre;
    }

    public abstract boolean predecirLluvia();

    public static void main(String[] args) {

        EstacionLluviaYTemperatura tandil = new EstacionLluviaYTemperatura("Tandil", 8, 110, 12, 25);

        Sensor lluvia = new Sensor("Lluvia");
        Sensor temperatura = new Sensor("Temperatura");

        tandil.setSensorLluvia(lluvia);
        tandil.setSensorTemperatura(temperatura);

        lluvia.addRegistro(55);
        lluvia.addRegistro(100);
        lluvia.addRegistro(25);
        lluvia.addRegistro(100);
        lluvia.addRegistro(45);
        lluvia.addRegistro(10.5);
        lluvia.addRegistro(200);
        lluvia.addRegistro(110.2);

        temperatura.addRegistro(15);
        temperatura.addRegistro(20);
        temperatura.addRegistro(25);
        temperatura.addRegistro(32);
        temperatura.addRegistro(35);
        temperatura.addRegistro(37.5);
        temperatura.addRegistro(33.8);
        temperatura.addRegistro(36.2);
        temperatura.addRegistro(31.7);
        temperatura.addRegistro(30.4);
        temperatura.addRegistro(31.9);
        temperatura.addRegistro(26.2);
        temperatura.addRegistro(30.5);

        // System.out.println(lluvia.getRegistros(2));
        // System.out.println(lluvia.getMax());
        // System.out.println(lluvia.getMin());
        // System.out.println(lluvia.getLast());
        // System.out.println(lluvia.getPromedio());
        System.out.println(lluvia.getPromedio(8));
        // System.out.println(lluvia.getMax(5));
        // System.out.println(lluvia.getMin(3));

        System.out.println(tandil.predecirLluvia());

        EstacionHumedad vela = new EstacionHumedad("Vela", 54);
        Sensor humedad = new Sensor("Humedad");
        vela.setSensorhumedad(humedad);

        humedad.addRegistro(15);
        humedad.addRegistro(5);
        humedad.addRegistro(45);
        humedad.addRegistro(59);

        System.out.println(humedad.getLast());
        System.out.println(vela.predecirLluvia());

        EstacionVientoyLluvia bahia = new EstacionVientoyLluvia("Bahia", 35, 29);
        Sensor viento = new Sensor("Viento");
        // para testear uso datos del sensor anterior
        bahia.setSensorLluvia(lluvia);
        bahia.setSensorViento(viento);

        viento.addRegistro(19);
        viento.addRegistro(22);
        viento.addRegistro(36);
        lluvia.addRegistro(11);

        System.out.println(bahia.predecirLluvia());

    }
}
