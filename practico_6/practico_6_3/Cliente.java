package practico_6.practico_6_3;

import java.util.ArrayList;

public class Cliente {

    private String nombre;
    private ArrayList<Alquiler> alquileres;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.alquileres = new ArrayList<>();
    }

    // alquilar
    public void addAlquiler(Alquiler alquiler) {
        if (!this.alquileres.contains(alquiler)) {
            this.alquileres.add(alquiler);
        }
    }

    // devolver
    public void devolverAlquiler(Alquiler alquiler) {
        this.alquileres.remove(alquiler);
        // avisar al comercio y recuperar stock
    }

    public ArrayList<Alquiler> getAlquileres() {
        return new ArrayList<>(this.alquileres);
    }

    public String getNombre() {
        return this.nombre;
    }

    // equals para controlar que no se repitan clientes
    @Override
    public boolean equals(Object o) {
        try {
            Cliente otro = (Cliente) o;
            if (otro.getNombre().equals(this.nombre)) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public String toString() {
        return this.getNombre();
    }
}
