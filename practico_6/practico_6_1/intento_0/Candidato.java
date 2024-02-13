package practico_6.practico_6_1.intento_0;

public class Candidato {

    private String nombre;
    private String empresa;
    private double sueldo;
    private Criterio criterio;

    public Candidato(String nombre, String empresa, double sueldo) {
        this.nombre = nombre;
        this.empresa = empresa;
        this.sueldo = sueldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return this.empresa;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setCriterio(Criterio criterio) {
        this.criterio = criterio;
    }

    public boolean evaluarContrato(Contrato contrato){
        return criterio.evaluarContrato(contrato);
    }

    public boolean equals(Object o) {
        try {
            Candidato cand = (Candidato) o;
            if (this.getNombre().equals(cand.getNombre()) && this.getEmpresa().equals(cand.getEmpresa())) {
                return true;
            } else
                return false;
        } catch (Exception e) {
            return false;
        }
    }

    public String toString() {
        return this.nombre; // + "- empresa: " + this.empresa;
    }
}
