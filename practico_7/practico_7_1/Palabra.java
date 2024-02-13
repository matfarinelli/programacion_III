package practico_7.practico_7_1;

import java.util.ArrayList;

public class Palabra implements Comparable<Palabra> {

    private String nombre;
    private ArrayList<Palabra> sinonimos;
    private ArrayList<Palabra> antonimos;
    private ArrayList<String> definiciones;

    public Palabra(String nombre) {
        this.nombre = nombre;
        this.sinonimos = new ArrayList<>();
        this.antonimos = new ArrayList<>();
        this.definiciones = new ArrayList<>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void addSinonimo(Palabra sinonimo) {
        if (!this.sinonimos.contains(sinonimo)) {
            this.sinonimos.add(sinonimo);
            sinonimo.addSinonimo(this); // para alta en sinonimos reciproco
        }
    }

    public void addAntonimo(Palabra antonimo) {
        if (!this.antonimos.contains(antonimo)) {
            this.antonimos.add(antonimo);
            antonimo.addAntonimo(this);
        }
    }

    public void addDefinicion(String definicion) {
        if (!this.definiciones.contains(definicion)) {
            this.definiciones.add("\n - " + definicion);
        }
    }

    @Override
    public boolean equals(Object o) {
        try {
            Palabra p = (Palabra) o;
            return p.getNombre().toLowerCase().equals(this.getNombre().toLowerCase());
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public String toString() {
        return this.getNombre();
    }

    public ArrayList<String> getSinonimos() {
        ArrayList<String> sinonimos = new ArrayList<>();

        for (Palabra sinonimo : this.sinonimos) {
            sinonimos.add(sinonimo.getNombre());
        }

        return sinonimos;
    }

    public ArrayList<String> getAntonimos() {
        ArrayList<String> antonimos = new ArrayList<>();

        for (Palabra antonimo : this.antonimos) {
            antonimos.add(antonimo.getNombre());
        }

        return antonimos;
    }

    public ArrayList<String> getDefiniciones() {
        ArrayList<String> deficiones = new ArrayList<>();

        for (String definicion : this.definiciones) {
            deficiones.add(definicion);
        }

        return deficiones;
    }

    @Override
    public int compareTo(Palabra otraPalabra) {
        return this.getNombre().compareToIgnoreCase(otraPalabra.getNombre());
        // return 1;
    }
}
