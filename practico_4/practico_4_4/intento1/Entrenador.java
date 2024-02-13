package practico_4_4.intento1;

public class Entrenador extends Integrante {

    private int idFederacion;

    public Entrenador(String nombre, String apellido, int pasaporte, int idFederacion) {
        super(nombre, apellido, pasaporte);
        this.idFederacion = idFederacion;
    }

    // getters
    
    public int getIdFederacion() {
        return idFederacion;
    }

    // setters

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }

}
