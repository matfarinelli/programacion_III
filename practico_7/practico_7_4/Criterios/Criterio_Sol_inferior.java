package practico_7.practico_7_4.Criterios;

import practico_7.practico_7_4.Planta;

public class Criterio_Sol_inferior extends Criterio {

    private int sol_requerido;

    public Criterio_Sol_inferior(int sol_requerido) {
        this.sol_requerido = sol_requerido;
    }

    public int getSol() {
        return this.sol_requerido;
    }

    @Override
    public boolean buscar(Planta p) {
        return p.getSol() <= this.getSol();
    }

}
