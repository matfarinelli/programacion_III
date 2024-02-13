package practico_5_2;

public class Casa_linaje extends Casa {

    public Casa_linaje(String nombre, int maximo_alumnos) {
        super(nombre, maximo_alumnos);
    }

    @Override
    public boolean isAdmisible(Alumno alumno) {
        if (this.alumnos.size() < maximo_alumnos) {
            for (Alumno familiar : this.alumnos) {
                // si tiene uno al menos
                if (alumno.tieneFamiliar(familiar)) {
                    // en esta implementación se pide todas las cualidades para ingresar a la casa
                    if (alumno.getCualidades().containsAll(this.cualidades_requeridas)) {
                        this.addAlumno(alumno);
                        alumno.setCasa(this);
                        System.out.println(alumno.getNombre() + " agregado a " + this.getNombre());
                        return true;
                    }

                }
            }
        }
        System.out.println(alumno.getNombre() + " no admitido por " + this.getNombre());
        return false;
    }
}
