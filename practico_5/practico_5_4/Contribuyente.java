package practico_5_4;

public class Contribuyente {

    private String nombre;
    private int cuit;
    private double ventas;
    private Impuesto impuesto;

    public Contribuyente(String nombre, int cuit, double ventas) {
        this.nombre = nombre;
        this.cuit = cuit;
        this.ventas = ventas;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getCuit() {
        return this.cuit;
    }

    public double getVentas() {
        return this.ventas;
    }

    @Override
    public boolean equals(Object o) {
        try {
            String otro = ((Contribuyente) o).getNombre();
            if (this.getNombre().equals(otro)) {
                return true;
            } else
                return false;
        } catch (Exception e) {
            return false;
        }
    }

    public void setImpuesto(Impuesto impuesto) {
        this.impuesto = impuesto;
    }

    public String getImpuesto() {
        return this.getNombre() + " paga " + this.impuesto.getNombre() + "= " + this.impuesto.getImporte();
    }

}
