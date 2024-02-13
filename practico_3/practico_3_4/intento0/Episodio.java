package practico_3_4.intento0;

public class Episodio {

    private String titulo;
    private String descripcion;
    private boolean visto;
    private int calificacion;

    public Episodio(String titulo) {
        this.titulo = titulo;
        this.visto = false;
        this.calificacion = -1;
    }

    public Episodio(String titulo, String descripcion, boolean visto, int calificacion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.visto = visto;
        this.setCalificacion(calificacion);
    }

    // GETTERS

    public String getTitulo() {
        return this.titulo;
    }

    public boolean getVisto() {
        return this.visto;
    }

    public String getDatos() {
        return "Nombre : " + this.titulo + "\nDescripcion: " + this.descripcion + "\nVisto: " + this.visto
                + "\nCalificacion: " + this.calificacion;
    }

    public int getCalificacion() {
        return this.calificacion;
    }

    // SETTERS
    public void setVisto() {
        this.visto = true;
    }

    public void setVisto(int calificacion) {
        this.visto = true;
        this.setCalificacion(calificacion);;
    }

    public void setCalificacion(int calificacion) {
        if (!this.visto) {
            System.out.println(
                    "El episodio: '" + this.getTitulo() + "' aún no fue visto,no puede asignarle calificación");
            this.calificacion = -1;
        } else {
            if (calificacion > 0 && calificacion <= 5) {
                this.calificacion = calificacion;
            } else if (calificacion <= 0) {
                this.calificacion = 1;
            } else if (calificacion > 5) {
                this.calificacion = 5;
            }
        }
    }

    public String toString() {
        return this.titulo;
    }

}
