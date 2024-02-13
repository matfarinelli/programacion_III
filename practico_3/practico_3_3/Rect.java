package practico_3_3;

public class Rect {

    private PuntoGeom p1;
    private PuntoGeom p2;
    private double largo;
    private double alto;

    public Rect(PuntoGeom p1, PuntoGeom p2) {
        this.p1 = p1;
        this.p2 = p2;
        calcularLargosLados();
    }

    // setters
    public void setP1(PuntoGeom p1) {
        this.p1 = p1;
        calcularLargosLados();
    }

    public void setP2(PuntoGeom p2) {
        this.p2 = p2;
        calcularLargosLados();
    }

    // getters
    public PuntoGeom getP1() {
        return p1;
    }

    public PuntoGeom getP2() {
        return p2;
    }

    // funcionalidades
    public void desplazar(int desplazamientoX, int desplazamientoY) {
        this.p1.desplazarPunto(desplazamientoX, desplazamientoY);
        this.p2.desplazarPunto(desplazamientoX, desplazamientoY);
    }

    private void calcularLargosLados() {
        this.largo = Math.abs(this.p1.getX() - this.p2.getX());
        this.alto = Math.abs(this.p1.getY() - this.p2.getY());
    }

    public double getArea() {
        double lado1 = 0;
        double lado2 = 0;

        lado1 = Math.abs(this.p1.getX() - this.p2.getX());
        lado2 = Math.abs(this.p1.getY() - this.p2.getY());

        return lado1 * lado2;
    }

    public String getVertices() {
        return "Vertice 1: " + p1.getX() + " " + p1.getY() + " " +
                "\nVertice 2 : " + p1.getX() + " " + p2.getY() + " " +
                "\nVertice 3 : " + p2.getX() + " " + p1.getY() + " " +
                "\nVertice 4 : " + p2.getX() + " " + p2.getY();
    }

    public int comparar(Rect rectanguloComparativo) {
        if (this.getArea() < rectanguloComparativo.getArea()) {
            return -1;
        } else if (this.getArea() > rectanguloComparativo.getArea()) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean isCuadrado() {
        return this.largo == this.alto;
    }

    public double getLargoSuperior() {
        return Math.max(largo, alto);
    }

    public String formaCuadrado() {
        if (isCuadrado()) {
            return "Es un cuadrado";
        } else if (this.largo > this.alto) {
            return "Está acostado";
        } else {
            return "Está parado";
        }
    }

    public static void main(String[] args) {

        PuntoGeom punto1 = new PuntoGeom(2, 3);
        PuntoGeom punto2 = new PuntoGeom(7, 4);

        // Crear rectángulo
        Rect r1 = new Rect(punto1, punto2);
        System.out.println(r1.getVertices());
        System.out.println("Area: " + r1.getArea());

        // r1.desplazar(2, 6);
        // System.out.println(r1.getVertices());

        // Crear rectángulo comparativo
        PuntoGeom punto3 = new PuntoGeom(9, 1);
        PuntoGeom punto4 = new PuntoGeom(2, 5);

        Rect r2 = new Rect(punto3, punto4);
        // System.out.println(r2.getVertices());

        System.out.println("Area: " + r2.getArea());
        System.out.println(r1.comparar(r2));

        //////////////////////////////

        // // Crear puntos para definir los rectángulos
        // PuntoGeom punto1 = new PuntoGeom(0, 0);
        // PuntoGeom punto2 = new PuntoGeom(3, 4);
        // PuntoGeom punto3 = new PuntoGeom(0, 0);
        // PuntoGeom punto4 = new PuntoGeom(5, 5);

        // // Crear dos rectángulos
        // Rect rectangulo1 = new Rect(punto1, punto2);
        // Rect rectangulo2 = new Rect(punto3, punto4);

        // // Desplazar el primer rectángulo
        // rectangulo1.desplazar(2, 3);

        // // Calcular el área de los rectángulos
        // double areaRectangulo1 = rectangulo1.getArea();
        // double areaRectangulo2 = rectangulo2.getArea();

        // System.out.println("Área del rectángulo 1: " + areaRectangulo1);
        // System.out.println("Área del rectángulo 2: " + areaRectangulo2);

        // // Comparar los rectángulos
        // int comparacion = rectangulo1.comparar(rectangulo2);
        // if (comparacion == 1) {
        // System.out.println("El rectángulo 1 es mayor");
        // } else if (comparacion == -1) {
        // System.out.println("El rectángulo 2 es mayor");
        // } else {
        // System.out.println("Los rectángulos son iguales en área");
        // }

        // // Verificar si los rectángulos son cuadrados
        // boolean esCuadrado1 = rectangulo1.isCuadrado();
        // boolean esCuadrado2 = rectangulo2.isCuadrado();

        // System.out.println("¿El rectángulo 1 es un cuadrado? " + esCuadrado1);
        // System.out.println("¿El rectángulo 2 es un cuadrado? " + esCuadrado2);

        // // Obtener el largo superior de los rectángulos
        // double largoSuperior1 = rectangulo1.getLargoSuperior();
        // double largoSuperior2 = rectangulo2.getLargoSuperior();

        // System.out.println("Largo superior del rectángulo 1: " + largoSuperior1);
        // System.out.println("Largo superior del rectángulo 2: " + largoSuperior2);

        // // Determinar la forma de los rectángulos
        // String forma1 = rectangulo1.formaCuadrado();
        // String forma2 = rectangulo2.formaCuadrado();

        // System.out.println("Forma del rectángulo 1: " + forma1);
        // System.out.println("Forma del rectángulo 2: " + forma2);
    }

}
