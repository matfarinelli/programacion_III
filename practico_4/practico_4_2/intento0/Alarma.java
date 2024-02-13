package practico_4_2.intento0;

import java.util.ArrayList;

public class Alarma {

    private Timbre timbre;
    private ArrayList<Sensor> sensores;

    public Alarma() {
        this.timbre = new Timbre();
        this.sensores = new ArrayList<>();
    }

    public void addSensor(Sensor sensor) {
        this.sensores.add(sensor);
    }

    public boolean comprobar() {
        for (Sensor sensor : this.sensores) {
            if (sensor.isActivado()) {
                this.timbre.hacerSonar();
                System.out.println(sensor.getZona());
                return true;
            }
        }
        System.out.println("Todo en orden");
        return false;
    }

    
    public static void main(String[] args) {
        Alarma al = new AlarmaLuminosa();
        Sensor s1 = new Sensor("1", "Sotano");
        Sensor s2 = new Sensor("2", "Cocina");
        Sensor s3 = new Sensor("3", "Habitación alta");
        Sensor s4 = new Sensor("4", "Comedor");

        al.addSensor(s1);
        al.addSensor(s2);
        al.addSensor(s3);
        al.addSensor(s4);

        s3.setMovimiento(true);

        System.out.println(al.comprobar());
    }
}
