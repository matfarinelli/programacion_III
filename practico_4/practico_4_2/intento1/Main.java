package practico_4_2.intento1;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la alarma
        Alarma alarma = new Alarma();
        AlarmaLuminosa alarmaLuminosa = new AlarmaLuminosa();

        Sensor s1 = new Sensor("Cocina");
        Sensor s2 = new Sensor("Baño");
        Sensor s3 = new Sensor("Altillo");
        Sensor s4 = new Sensor("Cochera");

        alarma.addSensor(s1);
        alarma.addSensor(s2);
        alarma.addSensor(s3);
        alarmaLuminosa.addSensor(s4);

        System.out.println("Prueba 1:");
        s2.activarMovimiento();
        s1.activarMovimiento();
        alarma.comprobar();
        alarma.restablecer();
        System.out.println("Prueba 2:");
        alarma.comprobar();

        System.out.println("Prueba 3:");
        s4.activarMovimiento();
        alarmaLuminosa.comprobar();
    }
}
