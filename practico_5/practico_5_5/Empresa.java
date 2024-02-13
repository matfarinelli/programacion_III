package practico_5_5;

import java.util.ArrayList;

public class Empresa {

    private String nombre;
    private ArrayList<Empleado> empleados;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public void addEmpleado(Empleado empleado) {
        if (!this.empleados.contains(empleado)) {
            this.empleados.add(empleado);
        }
    }

    public String getNombre() {
        return this.nombre;
    }

    public ArrayList<Empleado> getEmpleados() {
        return new ArrayList<Empleado>(this.empleados);
    }

    public int getSueldosPagados() {
        int sueldos = 0;

        for (Empleado empleado : this.empleados) {
            sueldos += empleado.getSueldo();
        }

        return sueldos;
    }

    public static void main(String[] args) {

        Empleado e1 = new Empleado("Matias", "Farinelli", 34296907, 10000);
        System.out.println(e1.getSueldo());

        // gracias al binding dinamico la variable "empleado" nos devuelve el getSueldo
        // pero del tipo comision
        Empleado e2 = new Empleado_comision("Maite", "Gelso", 34150800, 10000, 5900, 0.10);
        System.out.println(e2.getSueldo());

        Empleado_bono e3 = new Empleado_bono("Juan", "Apellido", 15923601, 12000, 20, 5000);
        e3.setCantidadVentas(30);
        System.out.println(e3.getSueldo());

        Empleado e4 = new Empleado("Matias", "Farinelli", 34296907, 10000);

        Empresa empresa = new Empresa("Globant");
        empresa.addEmpleado(e1);
        empresa.addEmpleado(e2);
        empresa.addEmpleado(e3);
        empresa.addEmpleado(e4);

        System.out.println(empresa.getEmpleados());
        System.out.println(empresa.getSueldosPagados());
    }
}
