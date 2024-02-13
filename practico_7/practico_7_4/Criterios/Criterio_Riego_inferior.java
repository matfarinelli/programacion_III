package practico_7.practico_7_4.Criterios;

import practico_7.practico_7_4.Planta;

public class Criterio_Riego_inferior extends Criterio {

    private int riego_requerido;

    public Criterio_Riego_inferior(int riego_requerido) {
        this.riego_requerido = riego_requerido;
    }

    public int getRiego() {
        return this.riego_requerido;
    }

    @Override
    public boolean buscar(Planta p) {
        return p.getRiego() <= this.getRiego();
    }

}
