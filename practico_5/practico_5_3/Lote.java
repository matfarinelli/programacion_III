package practico_5_3;

import java.util.ArrayList;

public class Lote {

    private int id;
    private ArrayList<String> minerales;
    private int has;

    public Lote(int id, int has) {
        this.id = id;
        this.minerales = new ArrayList<>();
        this.has = has;
    }

    public int getId() {
        return this.id;
    }

    public int getHas() {
        return this.has;
    }

    public void addMineral(String mineral) {
        if (!this.minerales.contains(mineral)) {
            this.minerales.add(mineral);
        }
    }

    public boolean tieneMineral(String mineral) {
        return (this.minerales.contains(mineral));
    }

    // metodo exigente por "containsAll"
    public boolean tieneMinerales(ArrayList<String> minerales_requeridos) {
        return this.minerales.containsAll(minerales_requeridos);
    }

    public ArrayList<String> getMinerales() {
        return new ArrayList<>(this.minerales);
    }

    public String toString() {
        return "Lote " + this.getId() + " : " + this.getHas() + " has";
    }
}
