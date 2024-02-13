package practico_5_2;

public class Casa_enemiga extends Casa {

    private Casa enemiga;

    public Casa_enemiga(String nombre, int maximo_alumnos) {
        super(nombre, maximo_alumnos);
    }

    public void setEnemiga(Casa enemiga) {
        this.enemiga = enemiga;
    }

    public String getEnemiga() {
        return this.enemiga.getNombre();
    }

    @Override
    public boolean isAdmisible(Alumno alumno) {
        if (this.enemiga.isAdmisible(alumno)) {
            return false;
        } else
            return enemiga.isAdmisible(alumno);
    }

}
