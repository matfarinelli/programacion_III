package practico_3_1;

import java.time.LocalDate;
import java.time.Month;

public class Persona {

	private int dni;
	private String nombre;
	private String apellido;
	private String sexo;
	private LocalDate fecha_nac;
	private int edad;
	private int peso;
	private double altura;

	public Persona(int dni) {
		this.dni = dni;
		this.nombre = "N";
		this.apellido = "N";
		this.sexo = "Femenino";
		this.fecha_nac = LocalDate.of(2001, Month.JANUARY, 1);
		this.peso = 1;
		this.altura = 1;
	}

	public Persona(int dni, String nombre, String apellido) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fecha_nac = LocalDate.of(2001, Month.JANUARY, 1);
		this.sexo = "Femenino";
		this.peso = 1;
		this.altura = 1;
	}

	public Persona(int dni, String nombre, String apellido, LocalDate fecha_nac) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fecha_nac = fecha_nac;
		this.sexo = "Femenino";
		this.peso = 1;
		this.altura = 1;
	}

	public Persona(int dni, String nombre, String apellido, LocalDate fecha_nac, String sexo) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fecha_nac = fecha_nac;
		this.sexo = sexo;
		this.peso = 1;
		this.altura = 1;
	}

	// setter
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setFechaNac(int dia, int mes, int ano) {
		this.fecha_nac = LocalDate.of(ano, mes, dia);
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	// getter
	public int getDni() {
		return this.dni;
	}

	public int getPeso() {
		return peso;
	}

	public double getAltura() {
		return altura;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getSexo() {
		return sexo;
	}

	public LocalDate getFecha_nac() {
		return fecha_nac;
	}

	public int getEdad() {
		return edad;
	}

	// metodos
	public String getDatosCompletos() {
		return "DNI:" + this.dni + "\nNombre y apellido:" + this.nombre + " " + this.apellido + " \nSexo: " + this.sexo
				+ "\nFecha de nacimiento:" + this.fecha_nac + "\nAltura:" + this.altura + " Peso:" + this.peso;
	}

	public double getIMC() {
		return (double) (peso / (altura * altura));
	}

	public String getEstaEnForma() {
		double imc = 0;
		imc = this.getIMC();

		if (imc >= 25) {
			return "Ta gordito";
		}

		else if (imc <= 18.5) {
			return "Deber�as comer mas";
		}

		else {
			return "Estas flama!";
		}
	}

	public boolean isCumpleanos() {
		if ((this.getFecha_nac().getDayOfMonth() == LocalDate.now().getDayOfMonth())
				&& (this.getFecha_nac().getMonthValue() == LocalDate.now().getMonthValue())) {
			return true;
		} else
			return false;
	}

	public boolean isMayor() {
		if (LocalDate.now().getYear() - this.getFecha_nac().getYear() >= 18) {
			return true;
		}

		else
			return false;
	}

	public boolean puedeVotar() {
		if (this.getEdad() >= 16) {

			return true;
		} else
			return false;
	}

	public boolean edadRazonable() {

		int edad_calculada = LocalDate.now().getYear() - this.getFecha_nac().getYear();

		if (edad_calculada == edad) {
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {

		Persona p1 = new Persona(34296907);
		p1.setSexo("Masculino");
		p1.setFechaNac(19, 01, 1989);
		// p1.setFechaNac(19, 01, 2005);
		// p1.setFechaNac(03, 03, 1989); para que sea el cumpla�ito!
		p1.setEdad(33);

		p1.setPeso(70);
		p1.setAltura(1.68);
		System.out.println(p1.getDatosCompletos());
		// System.out.println(p1.getIMC());
		// System.out.println(p1.getEstaEnForma());
		// System.out.println(p1.isCumpleanos());
		// System.out.println(p1.isMayor());
		// System.out.println(p1.getEdad());
		// System.out.println(p1.puedeVotar());
		System.out.println(p1.edadRazonable());

		LocalDate fn1 = LocalDate.of(1988, 11, 16);
		Persona p2 = new Persona(34150850, "Maite", "Gelso", fn1);

		System.out.println("-----------");
		System.out.println(p2.getFecha_nac());
		System.out.println(p2.getDatosCompletos());

	}

}
