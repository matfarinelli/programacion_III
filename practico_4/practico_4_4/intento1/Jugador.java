package practico_4_4.intento1;

public class Jugador extends Integrante {

    private String posicion;
    private String piernaHabil;
    private int golesConvertidos;

    public Jugador(String nombre, String apellido, int pasaporte, String posicion, String piernaHabil) {
        super(nombre, apellido, pasaporte);
        this.posicion = posicion;
        this.piernaHabil = piernaHabil;
    }

    // getters
    
    public String getPosicion() {
        return posicion;
    }

    public String getPiernaHabil() {
        return piernaHabil;
    }

    public int getGolesConvertidos() {
        return golesConvertidos;
    }

    // setters

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setPiernaHabil(String piernaHabil) {
        this.piernaHabil = piernaHabil;
    }

    public void setGolesConvertidos(int golesConvertidos) {
        this.golesConvertidos = golesConvertidos;
    }

}
