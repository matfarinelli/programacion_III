package practico_8.sistema_electoral;

import java.util.Comparator;

public class Candidato extends Votante  {

    private String partido;
    private String agrupacion;

    public Candidato(String nombre, int dni, String partido, String agrupacion) {
        super(nombre, dni);
        this.partido = partido;
        this.agrupacion = agrupacion;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public String getAgrupacion() {
        return agrupacion;
    }

    public void setAgrupacion(String agrupacion) {
        this.agrupacion = agrupacion;
    }

    public String toString() {
        return "Partido: " + this.getPartido() + " -Agrupacion: " + this.getAgrupacion() + " -Nombre: "
                + this.getNombre();
    }



    // @Override
    // public double getPorcentajeCandidato(Candidato buscado) {
    // if (this.equals(buscado)) {
    // return 1;
    // } else
    // return 0;
    // }

}
