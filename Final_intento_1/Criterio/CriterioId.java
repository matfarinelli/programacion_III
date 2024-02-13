package Final_intento_1.Criterio;

import Final_intento_1.ComandoSimple;

public class CriterioId extends Criterio {

    private String id;

    public CriterioId(String id) {
        this.id = id;
    }

    public String getIdComparativo() {
        return this.id;
    }

    public boolean cumple(ComandoSimple c) {
        return this.getIdComparativo().equals(c.getId());
    }

}
