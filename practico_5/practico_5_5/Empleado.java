package practico_5_5;

public class Empleado {

    protected String nombre;
    protected String apellido;
    protected int dni;
    protected double sueldo;

    public Empleado(String nombre, String apellido, int dni, double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public int getDni() {
        return this.dni;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public String toString() {
        return this.nombre + " " + this.apellido + " " + this.dni + " " + this.sueldo;
    }

    @Override
    public boolean equals(Object o) {
        try {
            int dni = ((Empleado) o).getDni();
            if (this.dni == (dni)) {
                return true;
            } else
                return false;

        } catch (Exception e) {
            return false;
        }
    }

}
