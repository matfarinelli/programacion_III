package Cooperativa;

import java.util.ArrayList;

public class Cereal {

    private String nombre;
    private ArrayList<String> mineralesRequeridos;

    public Cereal(String nombre) {
        this.nombre = nombre;
        this.mineralesRequeridos = new ArrayList<>();
    }

    public void addMineral(String mineral){
        if (!this.mineralesRequeridos.contains(mineral)){
            this.mineralesRequeridos.add(mineral);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public boolean equals(Object o) {
        try {
            Cereal cereal = (Cereal) o;
            return this.getNombre().equals(cereal.getNombre());

        } catch (Exception e) {
            return false;
        }
    }

    public ArrayList<String> getMineralesRequeridos() {
        return new ArrayList<>(this.mineralesRequeridos);
    }

    //metodo mas permisivo - no resuelve enunciado
    public boolean requiereMineral(String mineral) {
        return this.mineralesRequeridos.contains(mineral);
    }

    public boolean requiereMinerales(ArrayList<String> minerales) {
        return this.mineralesRequeridos.containsAll(minerales);
    }
}
