package Final_intento_1.Criterio;

import Final_intento_1.ComandoSimple;

public class CriterioTiempo extends Criterio {

    private double tiempoComparativo;

    public CriterioTiempo(double tiempoComparativo){
        this.tiempoComparativo = tiempoComparativo;
    }

    public double getTiempoComparativo(){
        return this.tiempoComparativo;
    }

    public boolean cumple(ComandoSimple c){
        return c.getTiempoEjecucion() < this.getTiempoComparativo();
    }

}
