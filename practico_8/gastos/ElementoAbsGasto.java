package practico_8.gastos;

import java.time.LocalDate;
import java.util.ArrayList;

import practico_8.gastos.Criterios.Criterio;

public abstract class ElementoAbsGasto {

    protected String descripcion;
    protected String calidad;
    protected double monto;
    protected LocalDate fecha;
    protected ArrayList<Caracteristica> caracteristicas;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public String getCalidad() {
        return this.calidad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public boolean tieneCaracteristica(String c) {
        // return this.caracteristicas.contains(c);
        for (Caracteristica caracteristica : this.caracteristicas) {
            if (caracteristica.getNombre().equalsIgnoreCase(c)) {
                return true;
            }
        }
        return false;
    }

    public abstract double getGasto();

    public abstract double getGasto(Criterio filtro);

    public abstract ArrayList<ElementoAbsGasto> getListadoGastos(Criterio filtro);

}
