package practico_3_4.intento0;

import java.util.ArrayList;

public class Serie {

    private String nombre;
    private String creador;
    private String genero;
    private ArrayList<Temporada> temporadas;

    public Serie(String nombre) {
        this.nombre = nombre;
        this.temporadas = new ArrayList<>();
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void addTemporada(Temporada temporada) {
        this.temporadas.add(temporada);
    }

    public String getCreador() {
        return this.creador;
    }

    public String getGenero() {
        return this.genero;
    }

    public String getNombre() {
        return this.nombre;
    }

    public ArrayList<Temporada> getTemporadas() {
        return new ArrayList<Temporada>(this.temporadas);
    }

    public ArrayList<Episodio> getEpVistos() {
        ArrayList<Episodio> episodiosVistos = new ArrayList<>();

        for (Temporada temporada : this.temporadas) {
            episodiosVistos.addAll(temporada.getEpVistos());
        }

        return episodiosVistos;
    }

    public ArrayList<String> getEpisodiosVistos() {
        ArrayList<String> episodiosVistos = new ArrayList<>();

        for (Temporada temporada : this.temporadas) {
            episodiosVistos.addAll(temporada.getEpisodiosVistos());
        }

        return episodiosVistos;
    }

    public double getPromedio() {
        double promedio = 0;
        int sumaCalificaciones = 0;

        for (Temporada temporada : this.temporadas) {
            sumaCalificaciones += temporada.getPromedio();
        }

        promedio = (double) sumaCalificaciones / this.temporadas.size();

        return promedio;
    }

    public int getCantidadEpisodiosVistos() {
        ArrayList<String> episodiosVistos = new ArrayList<>();
        episodiosVistos = this.getEpisodiosVistos();

        return episodiosVistos.size();
    }

    public int getCantidadEpisodios() {
        int epTotales = 0;

        for (Temporada temporada : this.temporadas) {
            epTotales += temporada.getCantidadEpisodios();
        }

        return epTotales;
    }

    public boolean serieVistaCompleta() {
        return this.getCantidadEpisodios() == this.getCantidadEpisodiosVistos();
    }

    public static void main(String[] args) {

        Episodio e1 = new Episodio("E1");
        Episodio e2 = new Episodio("E2");
        Episodio e3 = new Episodio("E3");
        Episodio e4 = new Episodio("E4");
        Episodio e5 = new Episodio("E5");
        Episodio e6 = new Episodio("E6");
        Episodio e7 = new Episodio("E7");
        Episodio e8 = new Episodio("E8");
        Episodio e9 = new Episodio("E9");
        Episodio e10 = new Episodio("E10");

        e1.setVisto(3);
        e2.setVisto(2);
        e5.setVisto(8);
        e6.setVisto(5);
        e9.setVisto(4);
        e10.setVisto(3);
        // e7.setVisto();
        // e8.setVisto();
        // e3.setVisto();
        // e4.setVisto();

        Temporada t1 = new Temporada(1);
        Temporada t2 = new Temporada(2);
        Temporada t3 = new Temporada(3);
        Serie s1 = new Serie("Lost");

        s1.addTemporada(t1);
        s1.addTemporada(t2);
        s1.addTemporada(t3);
        t1.addEpisodio(e1);
        t1.addEpisodio(e2);
        t1.addEpisodio(e3);
        t1.addEpisodio(e4);
        t1.addEpisodio(e5);
        t2.addEpisodio(e6);
        t2.addEpisodio(e7);
        t2.addEpisodio(e8);
        t3.addEpisodio(e9);
        t3.addEpisodio(e10);

        // System.out.println(t1.getEpisodios());
        // System.out.println(s1.getEpisodiosVistos());

        // System.out.println(t1.getCantidadEpisodiosVistos());
        // System.out.println(s1.getCantidadEpisodiosVistos());

        // System.out.println(t1.getPromedio());

        System.out.println(t1.getEpVistos());
        System.out.println(t1.getCantidadEpisodiosVistos());
        System.out.println(t1.getCantidadEpisodios());
        System.out.println(t1.getPromedio());
        System.out.println("-------------");
        System.out.println(s1.getEpVistos());
        System.out.println(s1.getCantidadEpisodiosVistos());
        System.out.println(s1.getCantidadEpisodios());
        System.out.println(s1.getPromedio());

        System.out.println(s1.serieVistaCompleta());

    }

}
