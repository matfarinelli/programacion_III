package practico_6.practico_6_1.intento_0;

public class Criterio_horas extends Criterio {

    private int horas_comparativas;

    @Override
    public boolean evaluarContrato(Contrato contrato) {
        return (contrato.getHoras_requeridas() < this.horas_comparativas);
    }

    public void setHoras(int horas){
        this.horas_comparativas = horas;
    }

}
