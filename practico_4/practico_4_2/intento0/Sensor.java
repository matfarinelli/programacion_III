package practico_4_2.intento0;

public class Sensor {

    private String nombre;
    private String zona;
    private boolean vidrioRoto;
    private boolean aberturas;
    private boolean movimiento;

    public Sensor(String nombre, String zona) {
        this.nombre = nombre;
        this.zona = zona;
    }

    public String getNombre() {
        return nombre;
    }

    public String getZona() {
        return zona;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public void setVidrioRoto(boolean situacion) {
        this.vidrioRoto = situacion;
    }

    public void setAberturas(boolean situacion) {
        this.aberturas = situacion;
    }

    public void setMovimiento(boolean situacion) {
        this.movimiento = situacion;
    }

    public boolean isActivado() {
        if (vidrioRoto || aberturas || movimiento) {
            return true;
        } else
            return false;
    }

}
