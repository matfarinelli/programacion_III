package practico_4_1.intento1;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la alarma
        Alarma alarma = new Alarma();

        // Establecer el estado de la alarma
        alarma.setVidrioRoto(true);
        alarma.setPuertaAbierta(false);
        alarma.setVentanaAbierta(false);

        // Comprobar la alarma
        System.out.println("Intento 1:");
        alarma.comprobar(); // Se espera que suene la alarma

        // Cambiar el estado de la alarma
        alarma.setVidrioRoto(false);
        alarma.setPuertaAbierta(true);
        alarma.setVentanaAbierta(false);

        // Comprobar la alarma nuevamente
        System.out.println("Intento 2:");
        alarma.comprobar(); // Se espera que suene la alarma

        // Cambiar el estado de la alarma
        alarma.setVidrioRoto(false);
        alarma.setPuertaAbierta(false);
        alarma.setVentanaAbierta(false);

        // Comprobar la alarma una vez más
        System.out.println("Intento 3:");
        alarma.comprobar(); // No se espera que suene la alarma


        AlarmaLuminosa alarmaLuminosa = new AlarmaLuminosa();

        // Cambiar el estado de la alarma
        alarmaLuminosa.setVidrioRoto(false);
        alarmaLuminosa.setPuertaAbierta(true);
        alarmaLuminosa.setVentanaAbierta(false);

        // Comprobar la alarma nuevamente
        System.out.println("Intento 4:");
        alarmaLuminosa.comprobar(); // Se espera que suene la alarma
        alarmaLuminosa.restablecer();


        // Comprobar la alarma nuevamente
        System.out.println("Intento 5:");
        alarmaLuminosa.comprobar(); // Se espera que suene la alarma


       
    }
}
