package intento0;

import java.time.LocalDate;

public class Producto_Derivado extends Producto {

    private int cod_org_supervisor;
    private double temp_recomendada;

    public Producto_Derivado(LocalDate fecha_vencimiento, int nro_lote, LocalDate fecha_envasado, String granja_origen,
            int cod_org_supervisor, double temp_recomendada) {
        super(fecha_vencimiento, nro_lote, fecha_envasado, granja_origen);
        this.cod_org_supervisor = cod_org_supervisor;
        this.temp_recomendada = temp_recomendada;
    }

    public int getCod_org_supervisor() {
        return cod_org_supervisor;
    }

    public void setCod_org_supervisor(int cod_org_supervisor) {
        this.cod_org_supervisor = cod_org_supervisor;
    }

    public double getTemp_recomendada() {
        return temp_recomendada;
    }

    @Override
    public String toString() {
        return super.toString() +  "cod_org_supervisor=" + cod_org_supervisor + ", temp_recomendada=" + temp_recomendada
                + "]";
    }

    public void setTemp_recomendada(double temp_recomendada) {
        this.temp_recomendada = temp_recomendada;
    }

}