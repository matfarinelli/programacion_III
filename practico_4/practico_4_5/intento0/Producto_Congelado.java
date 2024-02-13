package intento0;

import java.time.LocalDate;

public class Producto_Congelado extends Producto_Derivado {

    private Congelamiento tipo;

    public Producto_Congelado(LocalDate fecha_vencimiento, int nro_lote, LocalDate fecha_envasado, String granja_origen,
            int cod_org_supervisor, double temp_recomendada, Congelamiento tipo) {
        super(fecha_vencimiento, nro_lote, fecha_envasado, granja_origen, cod_org_supervisor, temp_recomendada);
        this.tipo = tipo;
    }

    public Congelamiento getTipo() {
        return tipo;
    }

    public void setTipo(Congelamiento tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "tipo=" + tipo + "]";
    }

}
