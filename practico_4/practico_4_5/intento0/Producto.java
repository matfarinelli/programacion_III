package intento0;

import java.time.LocalDate;

public class Producto {

    private LocalDate fecha_vencimiento;
    private int nro_lote;
    private LocalDate fecha_envasado;
    private String granja_origen;

    public Producto(LocalDate fecha_vencimiento, int nro_lote, LocalDate fecha_envasado, String granja_origen) {
        this.fecha_vencimiento = fecha_vencimiento;
        this.nro_lote = nro_lote;
        this.fecha_envasado = fecha_envasado;
        this.granja_origen = granja_origen;
    }

    public LocalDate getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(LocalDate fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public int getNro_lote() {
        return nro_lote;
    }

    public void setNro_lote(int nro_lote) {
        this.nro_lote = nro_lote;
    }

    public LocalDate getFecha_envasado() {
        return fecha_envasado;
    }

    public void setFecha_envasado(LocalDate fecha_envasado) {
        this.fecha_envasado = fecha_envasado;
    }

    public String getGranja_origen() {
        return granja_origen;
    }

    public void setGranja_origen(String granja_origen) {
        this.granja_origen = granja_origen;
    }

    @Override
    public String toString() {
        return "Producto [fecha_envasado=" + fecha_envasado + ", fecha_vencimiento=" + fecha_vencimiento
                + ", granja_origen=" + granja_origen + ", nro_lote=" + nro_lote + "]";
    }

    public static void main(String[] args) {
        Congelamiento c1 = new Congelamiento("Aire");
        // Producto p1 = new Producto_Congelado(LocalDate.of(2023, 07, 15), 150,
        // LocalDate.of(2022, 04, 15), "Los pibes",
        // 40045, 22, c1);
        // p1.setCod_org_supervisor(555); // a proposito! es para demostrar el error por
        // el tipo de varibale, no puede acceder a los metodos del hijo

        // este si funciona!
        Producto_Congelado p1 = new Producto_Congelado(LocalDate.of(2023, 07, 15), 150, LocalDate.of(2022, 04, 15),
                "Los pibes",
                40045, 22, c1);
        p1.setCod_org_supervisor(555);
        System.out.println(p1.toString());
    }

}
