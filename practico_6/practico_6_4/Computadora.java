package practico_6.practico_6_4;

public class Computadora {

    private String nombre;
    private int memoria;
    private boolean isDisponible;

    public Computadora(String nombre, int memoria) {
        this.nombre = nombre;
        this.memoria = memoria;
        this.isDisponible = true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public boolean isDisponible() {
        return isDisponible;
    }

    public void setDisponible(boolean isDisponible) {
        this.isDisponible = isDisponible;
    }

    public String toString() {
        return this.getNombre() + "-" + String.valueOf(this.getMemoria());
    }

    public boolean equals(Object o) {
        try {
            Computadora c = (Computadora) o;

            return c.getMemoria() == this.getMemoria() &&
                    c.getNombre().equals(this.getMemoria());

        } catch (Exception e) {
            return false;
        }
    }

    public void ejecutarProceso(Proceso p) {
        this.setDisponible(false);
        p.ejecutar();
        System.out.println("Ejecutado por computadora " + this.getNombre());
        this.setDisponible(true);
    }

}
