package practico_8.gastos;

import java.time.LocalDate;
import java.util.ArrayList;

import practico_8.gastos.Criterios.Criterio;

public class GastoSimple extends ElementoAbsGasto {

    

    public GastoSimple(String descripcion, LocalDate fecha, double monto) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.monto = monto;
        this.caracteristicas = new ArrayList<>();
    }


    public void addCaracteristica(Caracteristica c) {
        if (!this.caracteristicas.contains(c)) {
            caracteristicas.add(c);
        }
    }

    @Override
    public double getGasto(Criterio filtro) {
        if (filtro.cumple(this)) {
            return this.monto;
        } else
            return 0;
    }

    @Override
    public double getGasto() {
        return monto;
    }

    @Override
    public ArrayList<ElementoAbsGasto> getListadoGastos(Criterio filtro) {
        ArrayList<ElementoAbsGasto> gastos = new ArrayList<>();

        if (filtro.cumple(this)) {
            gastos.add(this);
        }

        return gastos;
    }

    public String toString() {
        return "GS:" + this.getDescripcion() + " : $" + this.getGasto();
    }

    public ArrayList<String> getCaracteristicas() {
        ArrayList<String> result = new ArrayList<>();

        for (Caracteristica c : this.caracteristicas) {
            result.add(c.getNombre() + ": " + c.getValor() + "\n");
        }

        return result;
    }

}
