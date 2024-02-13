package practico_4_2.intento1;

public class Sensor {

    private String zona;
    private boolean movimiento;

    public Sensor(String zona) {
        this.zona = zona;
        movimiento = false;
    }

    // getters
    public String getZona() {
        return this.zona;
    }

    public boolean isMovimiento() {
        return this.movimiento;
    }

    // setters
    public void setZona(String zona) {
        this.zona = zona;
    }

    // funciones
    public void activarMovimiento() {
        this.movimiento = true;
    }

    public void restablecer() {
        this.movimiento = false;
    }

}
