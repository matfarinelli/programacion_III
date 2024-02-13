package practico_3_4.intento0;

import java.util.ArrayList;

public class Temporada {

    private ArrayList<Episodio> episodios;
    private int numero;

    public Temporada(int numero) {
        this.numero = numero;
        this.episodios = new ArrayList<>();
    }

    public void addEpisodio(Episodio ep) {
        this.episodios.add(ep);
    }

    public void removeEpisodio(Episodio ep) {
        this.episodios.remove(ep);
    }

    public String getNumero() {
        return String.valueOf(this.numero);
    }

    public ArrayList<Episodio> getEpisodios() {
        return new ArrayList<>(this.episodios);
    }

    // devuelve titulos de ep. vistos
    public ArrayList<String> getEpisodiosVistos() {
        ArrayList<String> episodiosVistos = new ArrayList<>();

        for (Episodio episodio : this.episodios) {
            if (episodio.getVisto()) {
                episodiosVistos.add(episodio.getTitulo());
            }
        }

        return episodiosVistos;
    }

    // devuelve Episodios vistos
    public ArrayList<Episodio> getEpVistos() {
        ArrayList<Episodio> episodiosVistos = new ArrayList<>();

        for (Episodio episodio : this.episodios) {
            if (episodio.getVisto()) {
                episodiosVistos.add(episodio);
            }
        }

        return episodiosVistos;
    }

    // devuelve cantidad vistos
    public int getCantidadEpisodiosVistos() {
        ArrayList<Episodio> episodiosVistos = new ArrayList<>();
        episodiosVistos = this.getEpVistos();

        return episodiosVistos.size();
    }

    // cantidad episodios totales
    public int getCantidadEpisodios() {
        return this.episodios.size();
    }

    public double getPromedio() {
        int sumaCalificaciones = 0;
        double promedio = 0;

        ArrayList<Episodio> episodiosVistos = new ArrayList<>();
        episodiosVistos = this.getEpVistos();

        for (Episodio episodio : episodiosVistos) {
            sumaCalificaciones += episodio.getCalificacion();
        }

        promedio = (double) sumaCalificaciones / this.getCantidadEpisodiosVistos();

        return promedio;
    }

}
