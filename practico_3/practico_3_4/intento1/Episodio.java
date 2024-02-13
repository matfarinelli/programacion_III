package practico_3_4.intento1;

public class Episodio {

    private String nombre;
    private String descripcion;
    private boolean visto;
    private int calificacion;

    public Episodio(String nombre) {
        this.nombre = nombre;
        this.visto = false;
        this.calificacion = -1;
    }

    // getters
    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isVisto() {
        return visto;
    }

    public int getCalificacion() {
        return calificacion;
    }

    // setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }

    public void setCalificacion(int calificacion) {
        if (calificacion >= 1 && calificacion <= 5) {
            this.calificacion = calificacion;
            System.out.println("La calificación: " + calificacion + " ha sido ingresada");
        } else {
            System.out.println("La calificación ingresada no es válida. Ingrese un número entre 1 y 5.");
        }
    }

    // public void setCalificacion(int calificacion) {
    // if (!isVisto()) {
    // this.calificacion = -1;
    // } else if (calificacion > 5) {
    // this.calificacion = 5;
    // } else if (calificacion < 1) {
    // this.calificacion = 1;
    // } else {
    // this.calificacion = calificacion;
    // }
    // }

    

}
