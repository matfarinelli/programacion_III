package Cooperativa;

import java.util.ArrayList;

public class Lote {

    private int numero;
    private ArrayList<String> minerales;

    public Lote(int numero) {
        this.numero = numero;
        this.minerales = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public ArrayList<String> getMinerales() {
        return new ArrayList<>(this.minerales);
    }

    public void addMineral(String mineral) {
        if (!this.minerales.contains(mineral)) {
            this.minerales.add(mineral);
        }
    }

    public boolean tieneMineral(String mineral) {
        return this.minerales.contains(mineral);
    }

    public boolean tieneMinerales(ArrayList<String> minerales) {
        return this.minerales.containsAll(minerales);
    }

    public boolean equals(Object o) {
        try {
            Lote lote = (Lote) o;
            return this.getNumero() == (lote.getNumero());

        } catch (Exception e) {
            return false;
        }
    }

}
