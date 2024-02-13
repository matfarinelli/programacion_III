package practico_8.wbs;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

import practico_8.wbs.Criterios.Criterio;

public abstract class TareaAbstracta {

    protected String descripcion;
    protected LocalDate fechaInicioEstimada;
    protected LocalDate fechaInicioReal;
    protected LocalDate fechaFinEstimada;
    protected LocalDate fechaFinReal;
    protected String estado;

    public abstract String getEstado();

    public abstract ArrayList<TareaAbstracta> getTareas(Criterio criterio);

    public abstract ArrayList<TareaAbstracta> getTareasUsan(Recurso recurso);

    public abstract void setFechaInicio(LocalDate inicio);

    public abstract HashSet<Recurso> getRecursos(TareaAbstracta t);

    public LocalDate getFechaFinalizacionEstimada() {
        return this.fechaFinEstimada;
    }

    public LocalDate getFechaFinalizacionReal() {
        return this.fechaFinReal;
    }

    public void setFechaInicioEstimada(LocalDate inicio) {
        this.fechaInicioEstimada = inicio;
    }

    public void setFechaFinEstimada(LocalDate fin) {
        this.fechaFinEstimada = fin;
    }



}
