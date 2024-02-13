package practico_4_3.intento1;

public class Main {
    public static void main(String[] args) {
        // Crear los objetos de sueldo para cada tipo de empleado
        Sueldo sueldoContratado = new Sueldo(5000.0);
        Sueldo sueldoHorasExtras = new SueldoHorasExtras(4000.0, 15, 100.0);
        Sueldo sueldoComision = new SueldoComision(3000.0, 0.05, 100000.0);

        // Crear los objetos de empleado con sus respectivos nombres, apellidos y DNIs
        Empleado empleado1 = new Empleado("Enzo", "Francescoli", 12345678);
        empleado1.setSueldo(sueldoContratado);

        Empleado empleado2 = new Empleado("Amadeo", "Carrizo", 23456789);
        empleado2.setSueldo(sueldoHorasExtras);

        Empleado empleado3 = new Empleado("Angel", "Labruna", 34567890);
        empleado3.setSueldo(sueldoComision);

        // Calcular y mostrar el sueldo de cada empleado
        System.out.println("Sueldo de " + empleado1.getNombre() + " " + empleado1.getApellido() + ": $" + empleado1.getSueldo().getSueldo());
        System.out.println("Sueldo de " + empleado2.getNombre() + " " + empleado2.getApellido() + ": $" + empleado2.getSueldo().getSueldo());
        System.out.println("Sueldo de " + empleado3.getNombre() + " " + empleado3.getApellido() + ": $" + empleado3.getSueldo().getSueldo());

        // sueldoHorasExtras.setSumaFija(10000);
        // System.out.println("Nuevo sueldo de " + empleado2.getNombre() + " " + empleado2.getApellido() + ": $" + empleado2.getSueldo().getSueldo());
    
        // #polimorfismo reverso
        // SueldoComision sueldoVersatil = (SueldoComision) new Sueldo(100);
        
    
    }
}

