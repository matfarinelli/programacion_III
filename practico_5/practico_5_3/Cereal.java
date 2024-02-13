package practico_5_3;

import java.util.ArrayList;

public class Cereal {

    private String nombre;
    private String tipo;
    private ArrayList<String> minerales_requeridos;

    public Cereal(String nombre, String tipo) {
        this.nombre = nombre.toLowerCase();
        this.tipo = tipo.toLowerCase();
        this.minerales_requeridos = new ArrayList<>();
    }

    public void addMineralRequerido(String mineral) {
        if (!this.minerales_requeridos.contains(mineral)) {
            this.minerales_requeridos.add(mineral);
        }
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getTipo() {
        return this.tipo;
    }

    public ArrayList<String> getMinerales() {
        return new ArrayList<>(this.minerales_requeridos);
    }

    public boolean isLoteApto(ArrayList<String> minerales_requeridos) {
        return this.getMinerales().containsAll(minerales_requeridos);
    }

    public String toString() {
        return this.getNombre();
    }

    @Override
    public boolean equals(Object o) {
        try {
            String otro = ((Cereal) o).getNombre();
            if (this.getNombre().equals(otro)) {
                return true;
            } else
                return false;
        } catch (Exception e) {
            return false;
        }
    }

}
