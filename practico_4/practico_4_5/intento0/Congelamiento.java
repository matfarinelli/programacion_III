package intento0;

public class Congelamiento {

    private String tipo;
    private String composicion;

    public Congelamiento(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getComposicion() {
        return composicion;
    }

    public void setComposicion(String composicion) {
        this.composicion = composicion;
    }

    @Override
    public String toString() {
        return "composicion=" + composicion + ", tipo=" + tipo + "]";
    }
}
