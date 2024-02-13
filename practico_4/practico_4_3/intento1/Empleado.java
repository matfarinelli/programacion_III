package practico_4_3.intento1;

public class Empleado {

    private String nombre;
    private String apellido;
    private int dni;
    private Sueldo sueldo;

    public Empleado(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public Sueldo getSueldo() {
		return sueldo;
	}

	public void setSueldo(Sueldo sueldo) {
		this.sueldo = sueldo;
	}

    

}
