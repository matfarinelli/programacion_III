package practico_3_4.intento1;

import java.util.ArrayList;

public class Temporada {

    private int numero;
    private ArrayList<Episodio> episodios;

    public Temporada(int numero) {
        this.numero = numero;
        this.episodios = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<Episodio> getEpisodios() {
        return new ArrayList<Episodio>(this.episodios);
    }

    public int getCantidadEpisodios() {
        return this.episodios.size();
    }

    public void addEpisodio(Episodio episodio) {
        this.episodios.add(episodio);
    }

    // episodios vistos -- nombre del episodio
    public ArrayList<String> getEpisodiosVistos() {
        ArrayList<String> episodiosVistos = new ArrayList<>();

        for (Episodio episodio : episodios) {
            if (episodio.isVisto()) {
                episodiosVistos.add(episodio.getNombre());
            }
        }
        return episodiosVistos;
    }

    // episodios vistos -- total en número
    public int getNumeroEpisodiosVistos() {
        int episodiosVistos = 0;

        for (Episodio episodio : episodios) {
            if (episodio.isVisto()) {
                episodiosVistos++;
            }
        }

        return episodiosVistos;
    }

    // promedio calificaciones
    public double getPromedio() {

        double sumatoria = 0;
        int contador = this.getNumeroEpisodiosVistos();

        for (Episodio episodio : episodios) {
            if (episodio.isVisto()) {
                sumatoria += episodio.getCalificacion();
            }
        }

        return sumatoria / contador;

    }
}
