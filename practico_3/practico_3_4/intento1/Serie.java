package practico_3_4.intento1;

import java.util.ArrayList;

public class Serie {

    private String titulo;
    private String descripcion;
    private String creador;
    private String genero;
    private ArrayList<Temporada> temporadas;

    public Serie(String titulo) {
        this.titulo = titulo;
        this.temporadas = new ArrayList<>();
    }

    public Serie(String titulo, String genero, String creador) {
        this(titulo);
        this.genero = genero;
        this.creador = creador;
    }

    // getters
    public String getTitulo() {
        return titulo;
    }

    public String getCreador() {
        return creador;
    }

    public String getGenero() {
        return genero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    // setters
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    // funcionalidades

    public void addTemporada(Temporada temporada) {
        this.temporadas.add(temporada);
    }

    // contar episodios vistos

    public int getNumeroEpisodiosVistos() {
        int episodiosVistos = 0;

        for (Temporada temporada : temporadas) {
            episodiosVistos += temporada.getNumeroEpisodiosVistos();
        }

        return episodiosVistos;
    }

    // nombre de episodios vistos

    public ArrayList<String> getEpisodiosVistos() {
        ArrayList<String> episodiosVistos = new ArrayList<>();

        for (Temporada temporada : temporadas) {
            episodiosVistos.addAll(temporada.getEpisodiosVistos());
        }

        return episodiosVistos;
    }

    // promedio serie

    public double getPromedio() {
        double sumatoria = 0;
        int contador = this.temporadas.size();

        for (Temporada temporada : temporadas) {
            sumatoria += temporada.getPromedio();
        }

        return sumatoria / contador;
    }

    public int getTotalEpisodios(){
        int sumatoriaEpisodios = 0 ;

        for (Temporada temporada : temporadas){
            sumatoriaEpisodios += temporada.getCantidadEpisodios();
        }

        return sumatoriaEpisodios;
    }

    // serie vista completa

    public boolean serieCompleta(){
        return this.getNumeroEpisodiosVistos() == this.getTotalEpisodios();
    }

}
