package Howarts;

public class CasaEnemiga extends Casa {

    public Casa enemiga;

    public CasaEnemiga(String nombre, int maximoAlumnos, Casa enemiga) {
        super(nombre, maximoAlumnos);
        this.enemiga = enemiga;
    }

    @Override
    public boolean addAlumno(Alumno alumno) {
        if (!this.enemiga.isApto(alumno)) {
            if (super.addAlumno(alumno)) {
                return true;
            }
        }
        return false;
    }

}
