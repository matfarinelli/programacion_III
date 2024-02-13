package practico_5_3;

import java.util.ArrayList;

public class Cooperativa {

    private ArrayList<Lote> lotes;
    private ArrayList<Cereal> cereales;
    private ArrayList<String> minerales_especiales;

    public Cooperativa() {
        this.lotes = new ArrayList<>();
        this.cereales = new ArrayList<>();
        this.minerales_especiales = new ArrayList<>();
    }

    public void addCereal(Cereal cereal) {
        if (!this.cereales.contains(cereal)) {
            this.cereales.add(cereal);
        }
    }

    public void addLote(Lote lote) {
        if (!this.lotes.contains(lote)) {
            this.lotes.add(lote);
        }
    }

    public void addMineralEspecial(String mineral) {
        if (!this.minerales_especiales.contains(mineral)) {
            this.minerales_especiales.add(mineral);
        }
    }

    public ArrayList<Lote> getAptosPastura() {
        ArrayList<Lote> lotesAptos = new ArrayList<>();
        for (Lote lote : this.lotes) {
            if (lote.getHas() > 50) {
                lotesAptos.add(lote);
            }
        }
        return lotesAptos;
    }

    public boolean isLoteEspecial(Lote lote) {
        return lote.tieneMinerales(this.minerales_especiales);
    }

    // cereales aptos para ese lote dado
    public ArrayList<String> getCerealesAptos(Lote lote) {
        ArrayList<String> cerealesAptos = new ArrayList<>();

        for (Cereal cereal : this.cereales) {
            // le pregunto al lote si tiene los minerales que necesita el cereal dado
            if (lote.tieneMinerales(cereal.getMinerales())) {
                cerealesAptos.add(cereal.getNombre());
            }
        }

        return cerealesAptos;
    }

    // lotes aptos para un cereal dado
    public ArrayList<String> getLotesAptos(Cereal cereal) {
        ArrayList<String> lotesAptos = new ArrayList<>();

        for (Lote lote : this.lotes) {
            if (cereal.isLoteApto(lote.getMinerales())) {
                lotesAptos.add(String.valueOf(lote.getId()));
            }
        }
        return lotesAptos;
    }

    public ArrayList<Cereal> getCereales(){
        return new ArrayList<>(this.cereales);
    }

    public static void main(String[] args) {

        Cooperativa c1 = new Cooperativa();
        Cereal maiz = new Cereal("Maiz", "gruesa");
        maiz.addMineralRequerido("m1");
        maiz.addMineralRequerido("m2");
        maiz.addMineralRequerido("m3");

        Cereal trigo = new Cereal("trigo", "fina");
        Cereal sorgo = new Cereal("sorgo", "gruesa");
        Cereal girasol = new Cereal("girasol", "gruesa");
        Cereal soja = new Cereal("soja", "gruesa");
        Cereal soja2 = new Cereal("soja", "gruesa");

        c1.addMineralEspecial("m1");
        c1.addMineralEspecial("m3");

        Lote l1 = new Lote(1, 100);
        l1.addMineral("m4");
        l1.addMineral("m1");
        l1.addMineral("m2");

        Lote l2 = new Lote(2, 600);
        Lote l3 = new Lote(3, 20);
        Lote l4 = new Lote(4, 120);
        Lote l5 = new Lote(5, 35);
        Lote l6 = new Lote(6, 55);

        l2.addMineral("m2");
        l3.addMineral("m3");
        l4.addMineral("m1");
        l4.addMineral("m2");
        l5.addMineral("m1");
        l5.addMineral("m6");
        l6.addMineral("m1");
        l6.addMineral("m2");
        l6.addMineral("m3");

        c1.addLote(l1);
        c1.addLote(l2);
        c1.addLote(l3);
        c1.addLote(l4);
        c1.addLote(l5);
        c1.addLote(l6);

        c1.addCereal(trigo);
        c1.addCereal(sorgo);
        c1.addCereal(soja);
        c1.addCereal(girasol);
        c1.addCereal(soja2);
 
        // System.out.println(c1.getAptosPastura());

        c1.addMineralEspecial("m1");
        c1.addMineralEspecial("m6");

        soja.addMineralRequerido("m1");
        soja.addMineralRequerido("m6");
        trigo.addMineralRequerido("m2");
        trigo.addMineralRequerido("m5");
        girasol.addMineralRequerido("m3");

        // System.out.println(c1.getCerealesAptos(l3));

        // System.out.println(c1.getLotesAptos(soja));

        System.out.println(c1.getCereales());
    }
}