package practico_4_4.intento0;

public class Entrenador extends Integrante {

    private int id_federacion;

    public Entrenador(String nombre, String apellido, int id_federacion) {
        super(nombre, apellido);
        this.id_federacion = id_federacion;
    }

    public int getid_federacion() {
        return id_federacion;
    }

    public void setid_federacion(int id_federacion) {
        this.id_federacion = id_federacion;
    }

}
