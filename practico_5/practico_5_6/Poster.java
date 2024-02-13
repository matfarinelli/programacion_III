package practico_5_6;

public class Poster extends Trabajo {

    public Poster(String nombre) {
        super(nombre);
    }

    // debe recibir un evaluador
    @Override
    public boolean isApto(Evaluador evaluador) {

        for (String tema : this.temas) {
            // consulto al evaluador si conoce sobre un tema específico
            if (evaluador.tieneConocimiento(tema)) {
                return true;
            }
        }

        return false;
    }

}
