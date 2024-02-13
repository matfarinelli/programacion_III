package Final_intento_1.Criterio;

import Final_intento_1.ComandoAbstracto;
import Final_intento_1.ComandoSimple;

public class CriterioConsumo extends Criterio {

    private double consumoComparativo;

    public CriterioConsumo(double consumoComparativo) {
        this.consumoComparativo = consumoComparativo;
    }

    public double getConsumoComparativo() {
        return this.consumoComparativo;
    }

    public boolean cumple(ComandoSimple c) {
        return this.getConsumoComparativo() > c.getGastoBateria();
    }

}
