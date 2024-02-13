package practico_8.wbs;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

import practico_8.wbs.Criterios.Criterio;

public class TareaCompuesta extends TareaAbstracta {

    private ArrayList<TareaAbstracta> tareas;

    public TareaCompuesta(String descripcion) {
        this.tareas = new ArrayList<>();
        this.descripcion = descripcion;
    }

    public void addTarea(TareaAbstracta t) {
        this.tareas.add(t);
    }

    public String getEstado() {
        ArrayList<String> estados = new ArrayList<>();

        for (TareaAbstracta t : tareas) {
            estados.add(t.getEstado());
        }

        if ((estados.contains("en procesamiento"))
                || ((estados.contains("en espera")) && (estados.contains("completo"))))
            return "en procesamiento";
        else if (estados.contains("completo") && (!estados.contains("en espera"))) {
            return "completo";
        } else
            return "en espera";

    }

    // pesimo, arreglar
    @Override
    public ArrayList<TareaAbstracta> getTareas(Criterio criterio) {
        ArrayList<TareaAbstracta> result = new ArrayList<>();

        for (TareaAbstracta t : tareas) {

            result.addAll(t.getTareas(criterio));

        }

        return result;
    }

    // NO IMPLEMENTADO
    @Override
    public void setFechaInicio(LocalDate inicio) {
        this.fechaInicioEstimada = LocalDate.now();
    }

    @Override
    public ArrayList<TareaAbstracta> getTareasUsan(Recurso recurso) {
        ArrayList<TareaAbstracta> resultado = new ArrayList<>();

        for (TareaAbstracta t : this.tareas) {

            resultado.addAll(t.getTareasUsan(recurso));

        }

        return resultado;
    }

    @Override
    public HashSet<Recurso> getRecursos(TareaAbstracta t) {
        HashSet<Recurso> recursos = new HashSet<>();

        for (TareaAbstracta tarea : this.tareas) {
            recursos.addAll(tarea.getRecursos(t));
        }

        return recursos;
    }

}
