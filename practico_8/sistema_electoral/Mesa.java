package practico_8.sistema_electoral;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Mesa extends Conjunto {

    private ArrayList<Voto> votos;
    private ArrayList<Integer> votantes;

    public Mesa(String identificacion) {
        super(identificacion);
        this.votos = new ArrayList<>();
        this.votantes = new ArrayList<>();
    }

    public void addDni(int dni) {
        if (!this.votantes.contains(dni)) {
            this.votantes.add(dni);
        }

    }

    public void addVoto(Voto voto, int dni) {
        if (this.votantes.contains(dni)) {
            this.votos.add(voto);
            // System.out.println("Voto agregado");
            // System.out.println(this.votos.size());
        } else
            System.out
                    .println("El dni " + dni + " no se encuentra en el padrón de la mesa " + super.getIdentificacion());
    }

    @Override
    public int getCantidadVotosCandidato(Candidato buscado) {
        int sumatoria = 0;

        for (Voto v : this.votos) {
            if (v != null && v.getCanditato() != null &&
                    v.getCanditato().equals(buscado)) {
                sumatoria += 1;
            }

        }

        return sumatoria;
    }

    @Override
    public double getPorcentajeCandidato(Candidato buscado) {
        double porcentaje = 0;
        int cantidad = 0;

        try {
            cantidad = this.getCantidadVotosCandidato(buscado);
            System.out.println(cantidad);
            porcentaje = (double) cantidad / this.votos.size();
            System.out.println(porcentaje);

        } catch (Exception e) {
            porcentaje = 0;
        }

        return porcentaje * 100;

    }

    @Override
    public int getCantidadVotos() {
        return this.votos.size();
    }

    public String toString() {
        return this.getIdentificacion();
    }

    // mal! solo para control de carga
    public ArrayList<Voto> getVotos() {
        return new ArrayList<>(this.votos);
    }

    @Override
    public int getCantidadVotosBlanco() {
        int contador = 0;

        for (Voto v : this.votos) {
            if (v.getCanditato() == null) {
                contador += 1;
            }
        }

        return contador;
    }

    @Override
    public double getPorcentajeVotosBlanco() {

        return this.getCantidadVotosBlanco() / this.getCantidadVotos() * 100;

    }

    @Override
    public int getCantidadVotosEnFranja(LocalTime inicio, LocalTime fin) {
        int cantidad = 0;

        for (Voto v : this.votos) {
            if (v.getHora().isBefore(fin) && v.getHora().isAfter(inicio)) {
                cantidad++;
            }
        }

        return cantidad;
    }

    @Override
    public double getPorcentajeVotosEnFranja(LocalTime inicio, LocalTime fin) {

        return (double) this.getPorcentajeVotosEnFranja(inicio, fin) / this.getCantidadVotos();
    }

}
