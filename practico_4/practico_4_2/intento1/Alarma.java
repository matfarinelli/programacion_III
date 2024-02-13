package practico_4_2.intento1;

import java.util.ArrayList;

public class Alarma {

    protected ArrayList<Sensor> sensores;
    protected Timbre timbre;

    public Alarma() {
        this.sensores = new ArrayList<>();
        this.timbre = new Timbre();
    }

    // getters

    // devolver nombre de sensores
    public ArrayList<String> getNombreSensores() {
        ArrayList<String> nombreSensores = new ArrayList<>();

        for (Sensor sensor : sensores) {
            nombreSensores.add(sensor.getZona());
        }

        return nombreSensores;
    }

    // devolver cantidad de sensores

    public int getCantidadSensores() {
        return this.sensores.size();
    }

    // setters

    // funcion

    // agregar timbre
    // quitar timbre

    // agregar sensor
    public void addSensor(Sensor sensor) {
        this.sensores.add(sensor);
    }

    // quitar sensor
    public void removeSensor(Sensor sensor) {
        this.sensores.remove(sensor);
    }

    // chequear
    public void comprobar() {
        ArrayList<String> zonasEnConflicto = new ArrayList<>();

        for (Sensor sensor : sensores) {
            if (sensor.isMovimiento()) {
                zonasEnConflicto.add(sensor.getZona());
            }
        }

        if (!zonasEnConflicto.isEmpty()) {
            timbre.sonar();
            System.out.println("Zonas en conflicto: " + zonasEnConflicto.toString());
        }
    }

    // restablecer alarma
    public void restablecer() {
        for (Sensor sensor : sensores) {
            sensor.restablecer();
        }
    }
}
