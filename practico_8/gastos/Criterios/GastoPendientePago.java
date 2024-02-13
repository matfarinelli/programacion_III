package practico_8.gastos.Criterios;

import java.time.LocalDate;
import java.util.ArrayList;

import practico_8.gastos.ElementoAbsGasto;


//sin terminar

public class GastoPendientePago extends ElementoAbsGasto {

    private double porcentajeActualizacion;
    private int diasAtraso;
    private boolean pagado;

    public GastoPendientePago(String descripcion, LocalDate fecha, double monto, double porcentajeActualizacion) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.monto = monto;
        this.porcentajeActualizacion = porcentajeActualizacion;
        this.pagado = false;
    }

    public void informarPago() {
        this.pagado = true;
    }

    public boolean isPagado() {
        return this.pagado;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentajeActualizacion = porcentaje;
    }

    public double getPorcentajeActualizacion() {
        return this.porcentajeActualizacion;
    }

    @Override
    public double getGasto() {
        if (!this.pagado)
        return (this.monto * (1 + porcentajeActualizacion)));
        // else 
        // return
    }

}
