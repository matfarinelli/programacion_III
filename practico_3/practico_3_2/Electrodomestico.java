package practico_3_2;

public class Electrodomestico {

	private String nombre;
	private double precio_base;
	private String color;
	private double consumo_en;
	private double peso;

	// constructor completo
	public Electrodomestico(String nombre, double precio_base, String color, double consumo_en, double peso) {
		this.nombre = nombre;
		this.precio_base = precio_base;
		this.color = color;
		this.consumo_en = consumo_en;
		this.peso = peso;
	}

	// constructor con defaults
	public Electrodomestico(String nombre) {
		this.nombre = nombre;
		this.precio_base = 100;
		this.color = "Gris plata";
		this.consumo_en = 10;
		this.peso = 2;
	}

	// setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setPrecioBase(double precio_base) {
		this.precio_base = precio_base;
	}

	public void setConsumo(double consumo_en) {
		this.consumo_en = consumo_en;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	// getters
	public String getNombre() {
		return nombre;
	}

	public String getColor() {
		return color;
	}

	public double getConsumoEnergetico() {
		return consumo_en;
	}

	public double getPrecio() {
		return precio_base;
	}

	public double getPeso() {
		return peso;
	}

	// m�todos

	public boolean isBajoConsumo() {
		// if (consumo_en > 45) {
		// return false;
		// } else
		// return true;
		return consumo_en < 45;
	}

	public double getBalance() {
		return consumo_en / peso;
	}

	public boolean isAltaGama() {
		double balance  = this.getBalance();
		if (balance > 3) {
			return true;
		} else
			return false;
	}

	public String getCaracteristicas() {
		return "Nombre: " + this.getNombre() + "\nColor: " + this.getColor() + "\nConsumo Energetico: "
				+ this.getConsumoEnergetico() + "\nPeso: " + this.getPeso() + "\nPrecio: " + this.getPrecio();
	}

	// main
	public static void main(String[] args) {

		Electrodomestico e1 = new Electrodomestico("Lavarropas");
		e1.setConsumo(90);
		e1.setPeso(15.5);
		System.out.println((e1.isBajoConsumo()));
		System.out.println(e1.getBalance());
		System.out.println(e1.isAltaGama());
		System.out.println(e1.getCaracteristicas());
	}
}
