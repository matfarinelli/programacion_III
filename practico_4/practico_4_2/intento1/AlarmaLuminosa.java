package practico_4_2.intento1;

public class AlarmaLuminosa extends Alarma {

    private Luz luz;

    public AlarmaLuminosa() {
        super();
        this.luz = new Luz();
    }

    // funciones

    @Override
    public void comprobar() {
        for (Sensor sensor : sensores) {
            if (sensor.isMovimiento()) {
                timbre.sonar();
                luz.encender();
            }
        }
    }

}
