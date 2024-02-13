package Congreso;

public class TrabajoExigente extends Trabajo {

    public TrabajoExigente(String nombre) {
        super(nombre);
    }

    @Override
    public boolean isEvaluadorApto(Evaluador evaluador) {
        return evaluador.tieneConocimientos(this);
    }

}
