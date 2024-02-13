package practico_8.sistema_electoral;

import java.time.LocalTime;
import java.util.concurrent.ThreadLocalRandom;

public class Voto implements Comparable<Voto> {

    private Candidato candidato;
    private LocalTime hora;

    public Voto(Candidato candidato) {
        this.candidato = candidato;
        // this.hora = LocalTime.now(); // sería lo correcto que se genere al momento
        // del voto
        this.hora = generarHorarioAleatorio();
    }

    private LocalTime generarHorarioAleatorio() {
        int hour = ThreadLocalRandom.current().nextInt(8, 19);
        int minute = ThreadLocalRandom.current().nextInt(0, 60);
        int second = ThreadLocalRandom.current().nextInt(0, 60);

        return LocalTime.of(hour, minute, second);
    }

    public Candidato getCanditato() {
        return candidato;
    }

    public LocalTime getHora() {
        return hora;
    }

    public String toString() {
        if (this.candidato != null) {
            return this.candidato.getNombre() + " - " + this.getHora();
        } else {
            return "Voto en blanco - " + this.getHora();
        }
    }

    @Override
    public int compareTo(Voto v) {
        if (this.getHora().isAfter(v.getHora())) {
            return 1;
        } else if (this.getHora().isBefore(v.getHora())) {
            return -1;
        } else
            return 0;
    }

}
