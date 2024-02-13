package Final_intento_1;

import java.util.ArrayList;

import Final_intento_1.Criterio.Criterio;

public class ComandoSimple extends ComandoAbstracto {

    protected double gastoBateria;
    protected double unidadTiempo;

    public ComandoSimple(String id, double gastoBateria, double unidadTiempo) {
        this.id = id;
        this.gastoBateria = gastoBateria;
        this.unidadTiempo = unidadTiempo;
    }

    public void setGastoBateria(double gasto) {
        this.gastoBateria = gasto;
    }

    public void setUnidadTiempo(double tiempo) {
        this.unidadTiempo = tiempo;
    }

    public double getGastoBateria() {
        return this.gastoBateria * this.getTiempoEjecucion();
    }

    public double getTiempoEjecucion() {
        return this.unidadTiempo;
    }

    public ComandoAbstracto getCopia(Criterio filtro) {

        if (filtro.cumple(this)) {
            ComandoSimple copia = new ComandoSimple(this.id, this.gastoBateria, this.unidadTiempo);
            return copia;
        } else
            return null;

    }

    public int getCantidadElementos() {
        return 1;
    }

    public ArrayList<String> getComandos() {
        ArrayList<String> comandos = new ArrayList<>();
        comandos.add(this.getId());
        return comandos;
    }

}
