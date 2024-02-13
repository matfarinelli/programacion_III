package practico_8.wbs;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

import practico_8.wbs.Criterios.Criterio;

public class TareaSimple extends TareaAbstracta {

    ArrayList<Recurso> materiales;
    ArrayList<Recurso> personas;

    public TareaSimple(String nombre) {
        this.descripcion = nombre;
        this.materiales = new ArrayList<>();
        this.personas = new ArrayList<>();
    }

    public void addRecursoMaterial(Recurso r) {
        if (!this.materiales.contains(r)) {
            this.materiales.add(r);
        }
    }

    public void addRecursoPersona(Recurso r) {
        if (!this.personas.contains(r)) {
            this.personas.add(r);
        }
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return this.estado;
    }

    @Override
    public ArrayList<TareaAbstracta> getTareas(Criterio criterio) {
        ArrayList<TareaAbstracta> tareas = new ArrayList<>();

        if (criterio.cumple(this)) {
            tareas.add(this);
        }

        return tareas;
    }

    public void setFechaInicio(LocalDate inicio) {
        this.fechaInicioReal = inicio;
    }

    @Override
    public String toString() {
        return this.getDescripcion();
    }

    private String getDescripcion() {
        return this.descripcion;
    }

    @Override
    public ArrayList<TareaAbstracta> getTareasUsan(Recurso recurso) {
        ArrayList<TareaAbstracta> resultado = new ArrayList<>();

        if ((this.materiales.contains(recurso)) || (this.personas.contains(recurso))) {
            resultado.add(this);
        }

        return resultado;
    }

    private ArrayList<Recurso> getRecursos() {
        ArrayList<Recurso> recursos = new ArrayList<>();

        recursos.addAll(this.materiales);
        recursos.addAll(this.personas);

        return recursos;
    }

    @Override
    public HashSet<Recurso> getRecursos(TareaAbstracta t) {
        HashSet<Recurso> recursos = new HashSet<>();

        recursos.addAll(this.getRecursos());

        return recursos;
    }

}
