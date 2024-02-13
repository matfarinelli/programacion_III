package practico_8.sistema_electoral.Comparadores;

import java.util.Comparator;

import practico_8.sistema_electoral.Candidato;

public class ComparadorCandidato implements Comparator<Candidato> {
    
    @Override
    public int compare(Candidato o1, Candidato o2) {

        int comparacionPorPartido = o1.getPartido().compareTo(o2.getPartido());
        if (comparacionPorPartido != 0) {
            return comparacionPorPartido;
        }

        int comparacionPorAgrupacion = o1.getAgrupacion().compareTo(o2.getAgrupacion());
        if (comparacionPorAgrupacion != 0) {
            return comparacionPorAgrupacion;
        }

        return o1.getNombre().compareTo(o2.getNombre());

    }
}
