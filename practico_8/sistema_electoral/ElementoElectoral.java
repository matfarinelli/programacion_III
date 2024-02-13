package practico_8.sistema_electoral;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public abstract class ElementoElectoral {

    public abstract int getCantidadVotos();

    public abstract boolean contieneElemento(ElementoElectoral buscado);

    public abstract int getCantidadVotosCandidato(Candidato buscado);

    public abstract double getPorcentajeCandidato(Candidato buscado);

    public abstract ArrayList<Voto> getVotos();

    public abstract int getCantidadVotosBlanco();

    public abstract double getPorcentajeVotosBlanco();

    public abstract int getCantidadVotosEnFranja(LocalTime inicio, LocalTime fin);

    public abstract double getPorcentajeVotosEnFranja(LocalTime inicio, LocalTime fin);

}
