package practico_3_1;

import java.time.LocalDate;

/*
 * 1 Persona
Implementar una clase llamada Persona con las siguientes características:
Atributos: nombre, edad, fecha de nacimiento, DNI, sexo, peso y altura
Valores por defecto:
● El DNI es un valor obligatorio, no posee valor por defecto.
● En caso de la fecha de nacimiento será el 1 de enero de 2000.
● Sexo será Femenino por defecto.
● El nombre por defecto es N y el apellido es N.
● El peso y la altura son 1 por defecto.
Acorde a lo anterior se deben crear los constructores. Con DNI, con DNI nombre y
apellido, con DNI nombre apellido y Fecha de nacimiento.....
La responsabilidad de la clase es la siguiente:
● Cálculo del índice de masa Corporal. Una persona sabe calcular cuál es su índice
de masa corporal el cual es peso / altura2
● Saber si está en forma. Está en forma si el índice de masa corporal se encuentra
entre 18,5 y 25 (esto es solo un ejemplo para probar la funcionalidad).
● Saber si está cumpliendo años.
● Saber si es mayor de edad. Una persona es mayor de edad si es mayor de 18
años
● Métodos set de cada parámetro, excepto de DNI.
● Saber si puede votar. Es necesario ser mayor de 16 años.
● Saber si es coherente. Que la fecha de nacimiento coincida con la edad.
● Mostrar toda la información del objeto. Es decir devolver un String con la
información del mismo.
 */

public class Persona_1 {

    private int dni;
    private String nombre;
    private String apellido;
    private LocalDate fecha_nacimiento;
    private String sexo;
    private double peso;
    private double altura;
    private int edad;

    public Persona_1(int dni) {
        this.dni = dni;
        this.nombre = "N";
        this.apellido = "N";
        this.sexo = "Femenino";
        this.peso = 1;
        this.altura = 1;
        this.fecha_nacimiento = LocalDate.of(2000, 1, 1);
    }

    public Persona_1(int dni, String nombre, String apellido) {
        this(dni);
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona_1(int dni, String nombre, String apellido, String sexo, double peso, double altura) {
        this(dni, nombre, apellido);
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona_1(int dni, String nombre, String apellido, int dia_nacimiento, int mes_nacimiento,
            int ano_nacimiento) {
        this(dni, nombre, apellido);
        this.fecha_nacimiento = LocalDate.of(ano_nacimiento, mes_nacimiento, dia_nacimiento);
    }

    // setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setFechaNac(int dia, int mes, int ano) {
        this.fecha_nacimiento = LocalDate.of(ano, mes, dia);
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // getters
    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public int getDni() {
        return this.dni;
    }

    public double getPeso() {
        return this.peso;
    }

    public double getAltura() {
        return this.altura;
    }

    public String getSexo() {
        return this.sexo;
    }

    public int getEdad() {
        return this.edad;
    }

    public LocalDate getFechaNac() {
        return this.fecha_nacimiento;
    }

    public String getDatosPrincipales() {
        return "nombre: " + this.nombre + "\napellido: " + this.apellido + "\ndni: " + this.dni +
                "\nsexo: " + this.sexo +
                "\nfecha de nacimiento: " + this.fecha_nacimiento +
                "\nedad: " + this.edad +
                "\npeso: " + this.peso + "\naltura: " + this.altura;
    }

    // responsabilidades

    public double getMasaCorporal() {
        if (altura > 0) {
            return this.peso / (this.altura * this.altura);
        } else {
            // para evitar división por 0
            return 0;
        }

    }

    public boolean isForma() {
        double IMC = this.getMasaCorporal();
        return ( IMC > 18.5) && (IMC < 25.0);
    }

    public boolean isCumpleanos() {
        return LocalDate.now().getDayOfMonth() == this.fecha_nacimiento.getDayOfMonth() &&
                LocalDate.now().getMonth() == this.fecha_nacimiento.getMonth();
    }

    public boolean isMayor() {
        return this.edad >= 18;
    }

    public boolean isVotante() {
        return this.edad >= 16;
    }

    public int calcularEdad() {
        // podría considerar el día también para hacerlo exacto
        LocalDate today = LocalDate.now();
       
        if (today.getMonthValue() > this.getFechaNac().getMonthValue()) {
        return today.getYear() - this.getFechaNac().getYear();
        } else {
        return today.getYear() - this.getFechaNac().getYear() - 1;
        }

        // return today.getMonth() == fecha_nacimiento.getMonth()
                // && today.getDayOfMonth() == fecha_nacimiento.getDayOfMonth();
    }

    public boolean isEdadCoherente() {
        return this.calcularEdad() == this.edad;
    }

    public static void main(String args[]) {

        Persona_1 p1 = new Persona_1(34150850, "Maite", "Gels");
        System.out.println(p1.getDatosPrincipales());
        // Persona_1 p2 = new Persona_1(34296907, "Matias", "Farinelli", 19, 1, 1989);
        // p2.setPeso(75);
        // p2.setAltura(1.69);
        // System.out.println(p2.getDatosPrincipales());

        p1.setApellido("Gelso");
        p1.setSexo("Mujer");
        // System.out.println(p1.getDatosPrincipales());
        // System.out.println(p1.getEdad());
        p1.setFechaNac(29, 06, 1963);
        p1.setPeso(50);
        p1.setAltura(1.55);
        System.out.println(p1.getDatosPrincipales());
        System.out.println(p1.getMasaCorporal());
        System.out.println("Esta en forma?: " + p1.isForma());
        p1.setEdad(59);
        System.out.println("Es la edad coherente?: " + p1.isEdadCoherente());
        System.out.println("Es mayor?: " + p1.isMayor());

        System.out.println("IMC: " + p1.getMasaCorporal());
        // System.out.println(p2.isForma());
        p1.setFechaNac(24, 6, 1989);
        System.out.println("Es su cumpleaños?: " + p1.isCumpleanos());

        System.out.println("Calculo de edad: " + p1.calcularEdad());

    }

}