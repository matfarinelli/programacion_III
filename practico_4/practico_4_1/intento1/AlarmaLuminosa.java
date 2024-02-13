package practico_4_1.intento1;

public class AlarmaLuminosa extends Alarma {

    private Luz luz;

    public AlarmaLuminosa() {
        super();
        this.luz = new Luz();
    }

    // funciones

    @Override
    public void comprobar() {
        if (super.getPuertaAbierta() || super.getVentanaAbierta() || super.getVidrioRoto()) {
            timbre.sonar();
            luz.encender();
        }
    }

}
