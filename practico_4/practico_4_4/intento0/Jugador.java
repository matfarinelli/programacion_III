package practico_4_4.intento0;

public class Jugador extends Integrante {

    private String posicion;
    private boolean isZurdo;
    private int golesConvertidos;

    public Jugador(String nombre, String apellido, String posicion) {
        super(nombre, apellido);
        this.posicion = posicion;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public boolean isZurdo() {
        return isZurdo;
    }

    public void setZurdo(boolean isZurdo) {
        this.isZurdo = isZurdo;
    }

    public int getGolesConvertidos() {
        return golesConvertidos;
    }

    public void setGolesConvertidos(int golesConvertidos) {
        this.golesConvertidos = golesConvertidos;
    }

}
