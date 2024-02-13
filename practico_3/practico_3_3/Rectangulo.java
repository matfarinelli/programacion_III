package practico_3_3;

public class Rectangulo {

	private Punto_geometrico p1;
	private Punto_geometrico p2;
	private int lado1;
	private int lado2;

	public Rectangulo(Punto_geometrico p1, Punto_geometrico p2) {
		this.p1 = p1;
		this.p2 = p2;
		this.calcularLados();
	}

	public Rectangulo(int p1, int p2, int p3, int p4) {
		this.p1 = new Punto_geometrico(p1, p2);
		this.p2 = new Punto_geometrico(p3, p4);
		this.calcularLados();
	}

	public void desplazar(int x, int y) {
		p1.desplazarPunto(x, y);
		p2.desplazarPunto(x, y);
		this.calcularLados();
	}

	public String getDatos() {
		return "Punto X1,Y2: " + p1.getPuntos() + " Punto X2,Y1: " + p2.getPuntos();
	}

	private void calcularLados() {
		this.lado1 = Math.abs(p1.getX() - p2.getX());
		this.lado2 = Math.abs(p1.getY() - p2.getY());
	}

	public double getArea() {
		return lado1 * lado2;
	}

	// public boolean isMayorA(Rectangulo r) {
	// return this.getArea() > r.getArea();
	// }

	public int isMayorA(Rectangulo r) {
		if (this.getArea() > r.getArea()) {
			return 1;
		} else if (this.getArea() == r.getArea()) {
			return 0;
		} else
			return -1;
	}

	public boolean isCuadrado() {
		if (this.lado1 == this.lado2) {
			return true;
		} else
			return false;
	}

	public int getLadoMayor() {
		if (this.lado1 > this.lado2) {
			// System.out.println("LADO X");
			return this.lado1;
		} else
			// System.out.println("LADO Y");
			return this.lado2;
	}

	public String getPosicion() {
		if (this.lado1 > this.lado2) {
			return "Está acostado";
		} else if (this.lado1 == this.lado2) {
			return "Es un cuadrado";
		} else {
			return "Esta parado";
		}
	}

	public static void main(String[] args) {

		Rectangulo r1 = new Rectangulo(1, 5, 4, 13);
		Rectangulo r2 = new Rectangulo(5, 6, 12, 2);

		// r1.desplazar(2, 3);

		System.out.println(r1.getDatos());
		System.out.println(r2.getDatos());

		System.out.println("Area r1: " + r1.getArea());
		System.out.println("Area r2: " + r2.getArea());
		System.out.println("---------");
		// System.out.println("R1 es mayor a R2: " + r1.isMayorA(r2));
		// System.out.println("R2 es cuadrado: " + r2.isCuadrado());
		System.out.println("R1 ladoMayor : " + r1.getLadoMayor());
		System.out.println("R2 ladoMayor : " + r2.getLadoMayor());

		System.out.println(r1.getPosicion());
		System.out.println(r2.getPosicion());

	}
}
