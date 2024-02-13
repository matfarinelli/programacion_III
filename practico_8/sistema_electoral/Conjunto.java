package practico_8.sistema_electoral;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;

//elemento compuesto de composite
public class Conjunto extends ElementoElectoral {

    private String identificacion; // puede ser el nombre de localidad, mesa, etc.
    private ArrayList<ElementoElectoral> padron;

    public Conjunto(String identificacion) {
        this.identificacion = identificacion;
        this.padron = new ArrayList<>();
    }

    public String getIdentificacion() {
        return this.identificacion;
    }

    public void addElementoElectoral(ElementoElectoral elem) {
        this.padron.add(elem);
    }

    @Override
    public int getCantidadVotos() {
        int contador = 0;

        for (ElementoElectoral el : this.padron) {
            contador += el.getCantidadVotos();
        }

        return contador;
    }

    @Override
    public boolean contieneElemento(ElementoElectoral buscado) {

        for (ElementoElectoral e : this.padron) {
            return e.contieneElemento(buscado);
        }

        return false;

    }

    public int getCantidadVotosCandidato(Candidato buscado) {
        int sumatoria = 0;

        for (ElementoElectoral e : this.padron) {
            sumatoria += e.getCantidadVotosCandidato(buscado);
        }

        return sumatoria;
    }

    public double getPorcentajeCandidato(Candidato buscado) {
        double porcentaje = 0;
        int cantidadCandidato = 0;
        int cantidadVotos = 0;

        cantidadCandidato = this.getCantidadVotosCandidato(buscado);
        cantidadVotos = this.getCantidadVotos();

        porcentaje = (double) cantidadCandidato / cantidadVotos;

        return porcentaje * 100;

    }

    @Override
    public ArrayList<Voto> getVotos() {
        ArrayList<Voto> votos = new ArrayList<>();

        for (ElementoElectoral e : this.padron) {
            votos.addAll(e.getVotos());
        }

        return votos;
    }

    @Override
    public int getCantidadVotosBlanco() {
        int contador = 0;

        for (ElementoElectoral e : this.padron) {
            contador += e.getCantidadVotosBlanco();
        }

        return contador;
    }

    @Override
    public double getPorcentajeVotosBlanco() {
        return (double) this.getCantidadVotosBlanco() / this.getCantidadVotos() * 100;
    }

    @Override
    public int getCantidadVotosEnFranja(LocalTime inicio, LocalTime fin) {
        int cantidad = 0;

        for (ElementoElectoral e : this.padron) {
            cantidad += e.getCantidadVotosEnFranja(inicio, fin);
        }

        return cantidad;
    }

    @Override
    public double getPorcentajeVotosEnFranja(LocalTime inicio, LocalTime fin) {

        return (double) getCantidadVotosEnFranja(inicio, fin) / getCantidadVotos();

    }

}
