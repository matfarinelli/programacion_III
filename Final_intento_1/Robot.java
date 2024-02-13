package Final_intento_1;

import java.util.ArrayList;

import Final_intento_1.Criterio.Criterio;

public class Robot {

    private String nombre;
    private double bateria;
    private ArrayList<ComandoAbstracto> tarjetas;
    private static Robot instancia;
    private double umbral;

    // constructor privado
    private Robot(String nombre, double umbral) {
        this.nombre = nombre;
        this.bateria = 0;
        this.tarjetas = new ArrayList<>();
        this.umbral = umbral;
    }

    // get Instancia
    public Robot getRobot() {

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
        if (this.getBateria() > this.umbral) {
            this.recargarBateria();
        }

        return this.bateria;
    }

    public double getConsumo(ComandoAbstracto c) {
        return c.getGastoBateria();
    }

    public double getTiempoEjecucion(ComandoAbstracto c){
        return c.getTiempoEjecucion();
    }

    public int getCantidadElementos(ComandoAbstracto c) {
        return c.getCantidadElementos();
    }

    public ArrayList<String> getComandos(ComandoAbstracto c){
        return c.getComandos();
    }

    public ComandoAbstracto getCopia(ComandoAbstracto c, Criterio filtro){
        return c.getCopia(filtro);
    }

}
