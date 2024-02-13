package practico_4_4.intento1;

public class Masajista extends Integrante {

    private String titulo;
    private int anosExperiencia;

    public Masajista(String nombre, String apellido, int pasaporte, String titulo, int anosExperiencia) {
        super(nombre, apellido, pasaporte);
        this.titulo = titulo;
        this.anosExperiencia = anosExperiencia;
    }

    //getters 
    
    public String getTitulo() {
        return titulo;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    //setters 

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

}
