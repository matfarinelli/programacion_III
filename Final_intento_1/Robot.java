package Final_intento_1;

import java.util.ArrayList;

import Final_intento_1.Criterio.Criterio;

public class Robot {

    private String nombre;
    private double bateria;
    private ArrayList<ComandoAbstracto> tarjetas;
    private static Robot instancia; // propio del singleton ?
    private double umbral;

    // constructor privado
    private Robot(String nombre, double umbral) {
        this.nombre = nombre;
        this.bateria = 0;
        this.tarjetas = new ArrayList<>();
        this.umbral = umbral;
    }

    // get Instancia
    public static Robot getRobot() {

        if (instancia == null) {
            instancia = new Robot("kiko", 50);
            return instancia;
        } else
            return instancia;
    }

    // podria tambien remover.
    // public void removeTarjeta(ComandoAbstracto c) {
    // this.tarjetas.remove(c);
    // }

    public void addTarjeta(ComandoAbstracto c) {
        this.tarjetas.add(c);
    }

    // no lo entiendo.
    // la bateria es del robot, las tarjetas consumen bateria. Cuando indica "se
    // cambia para todos los bloques", cual es el impacto en la tarjeta?
    public void recargarBateria() {
        bateria = this.getBateria() * 2;
        // for (ComandoAbstracto c : this.tarjetas){
        // c.setBateria()
        // }

    }

    public double getBateria() {
        if (this.bateria > this.umbral) {
            this.recargarBateria();
        }

        return this.bateria;
    }

    public double getConsumo(ComandoAbstracto c) {
        return c.getGastoBateria();
    }

    public double getTiempoEjecucion(ComandoAbstracto c) {
        return c.getTiempoEjecucion();
    }

    public int getCantidadElementos(ComandoAbstracto c) {
        return c.getCantidadElementos();
    }

    public ArrayList<String> getComandos(ComandoAbstracto c) {
        return c.getComandos();
    }

    public ComandoAbstracto getCopia(ComandoAbstracto c, Criterio filtro) {
        return c.getCopia(filtro);
    }

    public static void main(String[] args) {

        Robot kiko = instancia.getRobot();
        // getRobot(); // si no genera null pointer

        ComandoSimple comando1 = new ComandoSimple("avanzar", 2.0, 1.5);
        ComandoSimple comando2 = new ComandoSimple("saltar", 1.5, 2.0);

        ComandoBloque bloqueInterno = new ComandoBloque("BloqueInterno");
        ComandoSimple comando3 = new ComandoSimple("caminar despacio", 1.0, 1.0);
        bloqueInterno.addComando(comando3);

        ComandoBloque bloquePrincipal = new ComandoBloque("BloquePrincipal");
        bloquePrincipal.addComando(comando1);
        bloquePrincipal.addComando(comando2);
        bloquePrincipal.addComando(bloqueInterno);

        ComandoBloque bloqueCompuesto1 = new ComandoBloque("BloqueCompuesto1");
        ComandoSimple comando4 = new ComandoSimple("sonreir", 0.8, 5.5);
        bloqueCompuesto1.addComando(comando4);

        BloqueIterativo bloqueCompuesto2 = new BloqueIterativo("BloqueCompuesto2", 10, 0.1);
        ComandoSimple comando5 = new ComandoSimple("estudiar", 1.2, 1.0);
        ComandoSimple comando6 = new ComandoSimple("practicar", 0.7, 2.8);
        bloqueCompuesto2.addComando(comando5);
        bloqueCompuesto2.addComando(comando6);

        bloqueInterno.addComando(bloqueCompuesto1);
        bloqueInterno.addComando(bloqueCompuesto2);

        ComandoSimple comando7 = new ComandoSimple("aprobar", 0.1, 1.8);

        bloquePrincipal.addComando(comando7);

        kiko.addTarjeta(bloquePrincipal);

        // Calcular el gasto total de batería
        double gastoTotal = kiko.getConsumo(bloquePrincipal);
        double gastoTiempoTotal = kiko.getTiempoEjecucion(bloquePrincipal);

        System.out.println("El gasto total de batería es: " + gastoTotal + " unidades.");
        System.out.println("El tiempo total de ejecucion es: " + gastoTiempoTotal + " unidades.");

        System.out.println(kiko.getComandos(bloquePrincipal));

        System.out.println(
                "El gasto de batería del bloque iterativo es: " + kiko.getTiempoEjecucion(bloqueCompuesto2));

        // solo para comparar los tiempos del iterativo con un compuesto normal:
        ComandoBloque bloqueCompuesto3 = new ComandoBloque("BloqueCompuesto3");
        bloqueCompuesto3.addComando(comando5);
        bloqueCompuesto3.addComando(comando6);

        System.out.println(
                "El gasto de batería del bloque compuesto3 es: " + kiko.getTiempoEjecucion(bloqueCompuesto3));

        // debería haber un método que vaya gastando batería , según lo que consuma cada
        // tarjeta y eso ir actualizando la variable bateria?

    }

}
