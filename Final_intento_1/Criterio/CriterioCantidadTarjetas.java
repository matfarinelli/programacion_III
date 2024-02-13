package Final_intento_1.Criterio;

import Final_intento_1.ComandoSimple;

public class CriterioCantidadTarjetas extends Criterio {

    public int cantidad;

    public CriterioCantidadTarjetas(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidadRequerida() {
        return this.cantidad;
    }

    public boolean cumple(ComandoSimple c) {
        return c.getCantidadElementos() < this.getCantidadRequerida();
    }

}
