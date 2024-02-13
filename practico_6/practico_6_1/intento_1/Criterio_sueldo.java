package practico_6.practico_6_1.intento_1;

public class Criterio_sueldo extends Criterio {

    private double sueldo;

    public Criterio_sueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public boolean evaluarContrato(Contrato ofertaLaboral){
        return this.sueldo <= ofertaLaboral.getSueldo();
    }

}
