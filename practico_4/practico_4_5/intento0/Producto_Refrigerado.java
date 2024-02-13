package intento0;

import java.time.LocalDate;

public class Producto_Refrigerado extends Producto {

    private int organismo_supervisor;
    private double temp_mantenimiento;

    public Producto_Refrigerado(LocalDate fecha_vencimiento, int nro_lote, LocalDate fecha_envasado,
            String granja_origen, int organismo_supervisor, double temp_mantenimiento) {
        super(fecha_vencimiento, nro_lote, fecha_envasado, granja_origen);
        this.organismo_supervisor = organismo_supervisor;
        this.temp_mantenimiento = temp_mantenimiento;
    }

    public int getOrganismo_supervisor() {
        return organismo_supervisor;
    }

    public void setOrganismo_supervisor(int organismo_supervisor) {
        this.organismo_supervisor = organismo_supervisor;
    }

    public double getTemp_mantenimiento() {
        return temp_mantenimiento;
    }

    public void setTemp_mantenimiento(double temp_mantenimiento) {
        this.temp_mantenimiento = temp_mantenimiento;
    }

    @Override
    public String toString() {
        return "organismo_supervisor=" + organismo_supervisor + ", temp_mantenimiento="
                + temp_mantenimiento + "]";
    }

}
