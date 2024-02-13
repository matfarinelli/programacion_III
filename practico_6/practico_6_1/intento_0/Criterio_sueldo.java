package practico_6.practico_6_1.intento_0;

public class Criterio_sueldo extends Criterio {

    private double sueldo;

    @Override
    public boolean evaluarContrato(Contrato contrato) {
        return (this.sueldo < contrato.getSueldo_ofrecido());
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

}
