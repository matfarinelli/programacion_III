package practico_5_4;

public class Impuesto_compuesto extends Impuesto {

    private double alicuota_ventas;
    private double alicuota_especial;

    public Impuesto_compuesto(String nombre, double fijo, double alicuota_especial,
            double alicuota_ventas) {
        super(nombre, fijo);
        this.alicuota_especial = alicuota_especial;
        this.alicuota_ventas = alicuota_ventas;
    }

    public double getImporte(double ventas) {
        return ((super.fijo * this.alicuota_especial) + (ventas * this.alicuota_ventas));
    }

    public double getAlicuota_ventas() {
        return alicuota_ventas;
    }

    public void setAlicuota_ventas(double alicuota_ventas) {
        this.alicuota_ventas = alicuota_ventas;
    }

    public double getAlicuota_especial() {
        return alicuota_especial;
    }

    public void setAlicuota_especial(double alicuota_especial) {
        this.alicuota_especial = alicuota_especial;
    }

    // solo para prueba de variable
    public void metodoPrueba() {

    }
}
