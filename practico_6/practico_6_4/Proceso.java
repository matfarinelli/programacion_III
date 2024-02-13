package practico_6.practico_6_4;

public class Proceso {

    private int requerimientoMemoria;

    public Proceso(int requerimientoMemoria) {
        this.requerimientoMemoria = requerimientoMemoria;
    }

    public int getRequerimientoMemoria() {
        return requerimientoMemoria;
    }

    public void setRequerimientoMemoria(int requerimientoMemoria) {
        this.requerimientoMemoria = requerimientoMemoria;
    }

    public boolean equals(Object o) {
        try {
            Proceso p = (Proceso) o;

            return p.getRequerimientoMemoria() == this.getRequerimientoMemoria();

        } catch (Exception e) {
            return false;
        }
    }

    public String toString() {
        return String.valueOf(this.getRequerimientoMemoria());
    }

    // ejecución

    public void ejecutar() {
        System.out.println("Proceso ejecutado - " + this.getRequerimientoMemoria());
    }
}
