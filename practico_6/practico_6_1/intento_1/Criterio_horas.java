package practico_6.practico_6_1.intento_1;

public class Criterio_horas extends Criterio {

    private int horasRequeridas;

    public Criterio_horas(int horasRequeridas) {
        this.horasRequeridas = horasRequeridas;
    }

    @Override
    public boolean evaluarContrato(Contrato ofertaLaboral) {
        return this.horasRequeridas > (ofertaLaboral.getHorasRequeridas());
    }

}
