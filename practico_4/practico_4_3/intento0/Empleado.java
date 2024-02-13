package practico_4_3.intento0;

public class Empleado {

    private String nombre;
    private Sueldo sueldo;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldo(Sueldo sueldo) {
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return this.sueldo.getSueldo();
    }

    public String getNombre() {
        return this.nombre;
    }

    public static void main(String[] args) {

        Empleado e1 = new Empleado("Matias");
        Sueldo s1 = new Sueldo_comision(1500, 0.25);
        // Sueldo s2 = new Sueldo(800);
        // Sueldo s3 = new Sueldo_hora(1000, 50, 15);
        e1.setSueldo(s1);

        System.out.println(e1.getSueldo());
        // System.out.println(e1.toString());  // para ver ToString, que devuelve por defecto

    }
}