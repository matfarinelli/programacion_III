package Final_intento_1;

import java.util.ArrayList;

import Final_intento_1.Criterio.Criterio;

public abstract class ComandoAbstracto {

    protected String id; // o instruccion
    protected static final double extraFijo = 10; // no dice nada de poder setear

    public String toString() {
        return this.id + " - " + this.getGastoBateria() + " - " + this.getTiempoEjecucion();
    }

    // tengo la duda si va acá o en el ComandoBloque
    public double getExtraFijo() {
        return this.extraFijo;
    }

    public String getId() {
        return this.id;
    }

    public abstract double getGastoBateria();

    public abstract double getTiempoEjecucion();

    public abstract ComandoAbstracto getCopia(Criterio filtro);

    public abstract int getCantidadElementos();

    public abstract ArrayList<String> getComandos();
}
