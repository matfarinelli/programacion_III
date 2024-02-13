package practico_4_4.intento0;

public class Masajista extends Integrante {

    private int experiencia;
    private String titulo;

    public Masajista(String nombre, String apellido, String titulo) {
        super(nombre, apellido);
        this.titulo = titulo;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
