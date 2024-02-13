package practico_3_4.intento1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear episodios de Lost
        Episodio episodio1 = new Episodio("Pilot");
        episodio1.setVisto(true);
        episodio1.setCalificacion(4);

        Episodio episodio2 = new Episodio("Tabula Rasa");
        episodio2.setVisto(true);
        episodio2.setCalificacion(3);

        Episodio episodio3 = new Episodio("Walkabout");
        episodio3.setVisto(true);
        episodio3.setCalificacion(5);

        Episodio episodio4 = new Episodio("The Others");
        episodio4.setVisto(false);

        Episodio episodio5 = new Episodio("The 23rd Psalm");
        episodio5.setVisto(false);

        // Crear temporadas de Lost
        Temporada temporada1 = new Temporada(1);
        temporada1.addEpisodio(episodio1);
        temporada1.addEpisodio(episodio2);

        Temporada temporada2 = new Temporada(2);
        temporada2.addEpisodio(episodio3);
        temporada2.addEpisodio(episodio4);
        temporada2.addEpisodio(episodio5);

        // Crear la serie Lost
        Serie lost = new Serie("Lost", "Drama", "J.J. Abrams");
        lost.setDescripcion("Misterio en una isla desierta");
        lost.addTemporada(temporada1);
        lost.addTemporada(temporada2);

        // Obtener el número de episodios vistos de Lost
        int episodiosVistos = lost.getNumeroEpisodiosVistos();
        System.out.println("Número de episodios vistos de Lost: " + episodiosVistos);

        // Obtener los nombres de los episodios vistos de Lost
        ArrayList<String> episodiosVistosNombres = lost.getEpisodiosVistos();
        System.out.println("Episodios vistos de Lost: " + episodiosVistosNombres);

        System.out.println("Promedio de temporada 1: " + temporada1.getPromedio());
        System.out.println("Promedio de temporada 2: " + temporada2.getPromedio());
        
        System.out.println("Episodios vistos de Lost: " + episodiosVistos);
        System.out.println("Promedio de la serie: " + lost.getPromedio());

        System.out.println("Se vió la serie completa?: " + lost.serieCompleta());



        
    }
}
