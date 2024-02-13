package practico_3_3;

public class Punto_geometrico {
	
	private int x;
	private int y;
	
	public Punto_geometrico(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Punto_geometrico() {
		this.x = 0;
		this.y = 0;
	}

	//setters
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	//getters
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public String getPuntos() {
		// return "X: " + this.getX() + " Y: " + this.getY();
		return "(" + this.getX() + "," + this.getY() + ")"; 
	}
	
	//metodos
	
	public void desplazarPunto(int desplazamiento) {
		this.x = x + desplazamiento;
		this.y = y + desplazamiento;
	}
	
	public void desplazarPunto(int desplazamientoX , int desplazamientoY) {
		this.x = x + desplazamientoX;
		this.y = y + desplazamientoY;
	}
	
	public double calcularDistanciaEuclidea(int x2 , int y2) {
		double distanciaEuc = 0;
		
		double x = Math.pow((this.getX()- x2), 2); 
		double y = Math.pow((this.getY()- y2), 2);
		
		distanciaEuc = Math.sqrt((x+y));
		
		return distanciaEuc;
	}
	
	//main
	public static void main (String [] args) {
		
		Punto_geometrico pg1 = new Punto_geometrico(5,15);
		System.out.println(pg1.getPuntos());
		System.out.println("---------");
		pg1.desplazarPunto(2);
		System.out.println(pg1.getPuntos());
		System.out.println("---------");
		pg1.desplazarPunto(8, 3);
		System.out.println(pg1.getPuntos());
		System.out.println("---------");
		System.out.println("Distancia Euclidea : " + pg1.calcularDistanciaEuclidea(7,8));
		
	}
	
}
