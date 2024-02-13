package practico_8.sistema_archivos;

import java.time.LocalDate;
import java.util.ArrayList;

import practico_8.sistema_archivos.Filtros.Criterio;

public abstract class ElementoFS implements Comparable<ElementoFS> {

    protected String nombre;
    protected LocalDate fecha_creacion;
    protected LocalDate fecha_modificacion;

    public ElementoFS(String nombre) {
        this.nombre = nombre;
        this.fecha_creacion = LocalDate.now();
        this.fecha_modificacion = LocalDate.now();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        this.setFecha_modificacion();
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFecha_creacion() {
        return this.fecha_creacion;
    }

    public LocalDate getFecha_modificacion() {
        return this.fecha_modificacion;
    }

    private void setFecha_modificacion() {
        this.fecha_modificacion = LocalDate.now();
    }

    // no tiene sentido, solo para probar el filtro de fecha
    // public void setFecha_modificacion(LocalDate fecha) {
    // this.fecha_modificacion = fecha;
    // }

    @Override
    public String toString() {
        return this.getNombre();
    }

    @Override
    public int compareTo(ElementoFS o) {
        return this.getNombre().compareTo(o.getNombre());
    }

    public abstract double getTamano();

    public abstract int getCantidadElementos();

    public abstract ArrayList<ElementoFS> buscarElementos(Criterio criterio);

}
