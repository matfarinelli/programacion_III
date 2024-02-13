package Congreso;

public class Poster extends Trabajo {

    public Poster(String nombre) {
        super(nombre);
    }

    @Override
    public boolean isEvaluadorApto(Evaluador evaluador) {
        for (String requisito : this.requisitos) {
            if (evaluador.tieneConocimiento(requisito)) {
                return true;
            }
        }
        return false;
    }
}
