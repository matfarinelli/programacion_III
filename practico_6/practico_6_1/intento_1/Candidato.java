package practico_6.practico_6_1.intento_1;

public class Candidato {

    private String nombre;
    private String apellido;
    private int edad;
    private Contrato situacionLaboral;
    private Criterio criterio;

    public Candidato(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    // getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public Boolean isContratadoBoolean() {
        return situacionLaboral != null;
    }

    // setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSituacionLaboral(Contrato situacionLaboral) {
        this.situacionLaboral = situacionLaboral;
    }

    public void setCriterio(Criterio criterio) {
        this.criterio = criterio;
    }

    // funciones

    public boolean equals(Object o) {
        try {
            Candidato otro = (Candidato) o;

            return otro.getNombre().equals(this.getNombre()) &&
                    otro.getApellido().equals(this.getApellido());

        } catch (Exception e) {
            return false;
        }
    }

    public boolean evaluarContrato(Contrato contrato){
        return this.criterio.evaluarContrato(contrato);
    }
}
