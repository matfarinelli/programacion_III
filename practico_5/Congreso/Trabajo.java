package Congreso;

import java.util.ArrayList;

public abstract class Trabajo {

    private String nombre;
    protected ArrayList<String> requisitos;

    public Trabajo(String nombre) {
        this.nombre = nombre;
        this.requisitos = new ArrayList<>();
    }

    public void addRequisitos(String requisito) {
        if (!this.requisitos.contains(requisito)) {
            this.requisitos.add(requisito);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<String> getRequisitos() {
        return new ArrayList<>(this.requisitos);
    }

    public abstract boolean isEvaluadorApto(Evaluador evaluador);

    public String toString() {
        return this.getNombre();
    }

}
