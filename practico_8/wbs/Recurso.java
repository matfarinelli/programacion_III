package practico_8.wbs;

public class Recurso {

    private String nombre;
    private boolean exclusivo;

    public Recurso(String nombre, boolean exclusivo) {
        this.nombre = nombre;
        this.exclusivo = exclusivo;
    }

    @Override
    public String toString() {
        return this.nombre;
    }

}
