package practico_8.gastos;

import java.time.LocalDate;
import java.util.ArrayList;

import practico_8.gastos.Criterios.Criterio;

public class GastoCompuesto extends ElementoAbsGasto {

    private ArrayList<ElementoAbsGasto> detalle;

    public GastoCompuesto(String descripcion, LocalDate fecha, double monto) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.monto = monto;
        this.detalle = new ArrayList<>();
        this.caracteristicas = new ArrayList<>();
    }

    public void addGasto(ElementoAbsGasto e) {
        if (!this.detalle.contains(e)) {
            detalle.add(e);
        }
    }

    @Override
    public double getGasto() {
        double sumatoria = this.monto;

        for (ElementoAbsGasto e : this.detalle) {
            sumatoria += e.getGasto();
        }

        return sumatoria;
    }

    @Override
    public double getGasto(Criterio filtro) {
        double sumatoria = this.monto;

        for (ElementoAbsGasto e : this.detalle) {
            sumatoria += e.getGasto(filtro);
        }

        return sumatoria;
    }

    @Override
    public ArrayList<ElementoAbsGasto> getListadoGastos(Criterio filtro) {
        ArrayList<ElementoAbsGasto> gastos = new ArrayList<>();
        // si cumple el gasto compuesto se devuelve el, sino
        // se evaluan los hijos y caso de machear, se devuelven ellos.
        if (filtro.cumple(this)) {
            gastos.add(this);
         
            return gastos;
        } else {

            for (ElementoAbsGasto e : this.detalle) {
                gastos.addAll(e.getListadoGastos(filtro));
            }

            return gastos;
        }
    }

    public String toString() {
        return "GC: " + this.descripcion + " - Total: " + this.getGasto();
    }

}