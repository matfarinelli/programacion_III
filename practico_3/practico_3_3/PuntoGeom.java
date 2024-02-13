package practico_3_3;

public class PuntoGeom {

    private int x;
    private int y;

    public PuntoGeom(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // constructor con defaults
    public PuntoGeom() {
        this.x = 0;
        this.y = 0;
    }

    // getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // setters
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // funcionalidades

    public void desplazarPunto(int desplazamientoX, int desplazamientoY) {
        int nuevaX = this.getX() + desplazamientoX;
        int nuevaY = this.getY() + desplazamientoY;

        this.setX(nuevaX);
        this.setY(nuevaY);
    }

    public double calcularDistanciaEuclidea(int x2, int y2) {
        double x = Math.pow((this.getX() - x2), 2);
        double y = Math.pow((this.getY() - y2), 2);

        double distanciaEuc = Math.sqrt(x + y);

        return distanciaEuc;
    }

        public static void main(String[] args) {
        // Crear un punto con coordenadas (2, 3)
        PuntoGeom punto = new PuntoGeom(2, 3);

        // Obtener las coordenadas del punto
        int x = punto.getX();
        int y = punto.getY();
        System.out.println("Coordenadas del punto: (" + x + ", " + y + ")");

        // Desplazar el punto en el plano
        punto.desplazarPunto(5,9);
        x = punto.getX();
        y = punto.getY();
        System.out.println("Nuevas coordenadas después de desplazar: (" + x + ", " + y + ")");

        // Calcular la distancia euclidiana entre dos puntos
        int x2 = 7;
        int y2 = 4;
        double distancia = punto.calcularDistanciaEuclidea(x2, y2);
        System.out.println("Distancia euclidiana entre el punto y (" + x2 + ", " + y2 + "): " + distancia);
    }
}
