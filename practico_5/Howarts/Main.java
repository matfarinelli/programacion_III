package Howarts;

public class Main {
    public static void main(String[] args) {
        // Crear la escuela
        Escuela hogwarts = new Escuela("Hogwarts", new Sombrero());

        // Crear algunas casas de Hogwarts
        Casa hufflepuff = new Casa("Hufflepuff", 3);
        hufflepuff.addCualidad("Lealtad");
        hufflepuff.addCualidad("Paciencia");

        Casa ravenclaw = new Casa("Ravenclaw", 4);
        ravenclaw.addCualidad("Inteligencia");
        ravenclaw.addCualidad("Sabiduría");

        Casa slytherin = new Casa("Slytherin", 4);
        slytherin.addCualidad("Astucia");
        slytherin.addCualidad("Ambición");

        Casa gryffindor = new CasaEnemiga("Gryffindor", 5, slytherin);
        gryffindor.addCualidad("Valentía");
        gryffindor.addCualidad("Lealtad");

        // Agregar las casas a la escuela
        hogwarts.addCasa(gryffindor);
        hogwarts.addCasa(hufflepuff);
        hogwarts.addCasa(ravenclaw);
        hogwarts.addCasa(slytherin);

        // Crear algunos alumnos y asignarlos a las casas
        Alumno harry = new Alumno("Harry Potter");
        harry.addCualidad("Valentía");
        harry.addCualidad("Lealtad");
        harry.addFamiliar(new Alumno("Lily Potter")); // Lily Potter es un familiar en Gryffindor
        hogwarts.asignarAlumno(harry);

        Alumno hermione = new Alumno("Hermione Granger");
        hermione.addCualidad("Inteligencia");
        hermione.addCualidad("Sabiduría");
        hermione.addFamiliar(new Alumno("Jean Granger")); // Jean Granger es un familiar en Ravenclaw
        hogwarts.asignarAlumno(hermione);

        Alumno draco = new Alumno("Draco Malfoy");
        draco.addCualidad("Astucia");
        draco.addCualidad("Ambición");
        draco.addFamiliar(new Alumno("Lucius Malfoy")); // Lucius Malfoy es un familiar en Slytherin
        hogwarts.asignarAlumno(draco);

        // Intentar asignar a un alumno que no cumple con las cualidades requeridas de una casa
        Alumno ron = new Alumno("Ron Weasley");
        ron.addCualidad("Lealtad");
        ron.addFamiliar(new Alumno("Molly Weasley")); // Molly Weasley es un familiar en Hufflepuff
        hogwarts.asignarAlumno(ron);

        // Agregar más alumnos para probar asignación a otras casas y llenado de casas
        Alumno cedric = new Alumno("Cedric Diggory");
        cedric.addCualidad("Lealtad");
        cedric.addCualidad("Valentía");
        hogwarts.asignarAlumno(cedric);

        Alumno luna = new Alumno("Luna Lovegood");
        luna.addCualidad("Inteligencia");
        luna.addCualidad("Sabiduría");
        hogwarts.asignarAlumno(luna);

        Alumno narcissa = new Alumno("Narcissa Malfoy");
        narcissa.addCualidad("Ambición");
        narcissa.addFamiliar(new Alumno("Draco Malfoy")); // Draco Malfoy es un familiar en Slytherin
        hogwarts.asignarAlumno(narcissa);

        // Mostrar información de los alumnos y sus casas asignadas
        System.out.println("Alumnos de Hogwarts:");
        for (Alumno alumno : hogwarts.getAlumnos()) {
            System.out.println("Nombre: " + alumno.getNombre());
            System.out.println("Casa asignada: " + alumno.getCasaString());
            System.out.println();
        }

       // quedan alumnos sin asignar!!!!! ya sea por casa llena o por que no hacen match con todas las cualidades. Corregir!
       

    }
}
