package Cooperativa;

import java.util.ArrayList;

public class Cooperativa {

    private String nombre;
    private ArrayList<Cereal> cereales;
    private ArrayList<Lote> lotes;
    private ArrayList<String> mineralesEspeciales;

    public Cooperativa(String nombre) {
        this.nombre = nombre;
        this.cereales = new ArrayList<>();
        this.lotes = new ArrayList<>();
        this.mineralesEspeciales = new ArrayList<>();
    }

    // metodos para agregar lotes y cereales

    // requiere de equals para evaluar si son iguales
    public void addLote(Lote lote) {
        if (!this.lotes.contains(lote)) {
            this.lotes.add(lote);
        }
    }

    public void addCereal(Cereal cereal) {
        if (!this.cereales.contains(cereal)) {
            this.cereales.add(cereal);
        }
    }

    public void addMineralEspecial(String mineral) {
        if (!this.mineralesEspeciales.contains(mineral)) {
            this.mineralesEspeciales.add(mineral);
        }
    }
    // lotes aptos para determinado cereal

    public ArrayList<Integer> getLotesAptosParaCereal(Cereal cereal) {
        ArrayList<Integer> lotesAptos = new ArrayList<>();

        for (Lote lote : this.lotes) {
            //le pregunto al lote si tiene los minerales que necesita dado cereal
            if (lote.tieneMinerales(cereal.getMineralesRequeridos())) {
                lotesAptos.add(lote.getNumero());
            }
        }

        return lotesAptos;
    }

    public ArrayList<String> getCerealesAptosParaLote(Lote lote) {
        ArrayList<String> cerealesAptos = new ArrayList<>();

        for (Cereal cereal : this.cereales) {
            if (lote.tieneMinerales(cereal.getMineralesRequeridos())) {
                cerealesAptos.add(cereal.getNombre());
            }
        }

        return cerealesAptos;
    }

    public ArrayList<String> getMineralesEspeciales() {
        return new ArrayList<>(this.mineralesEspeciales);
    }

    public ArrayList<Integer> getLotesEspeciales() {
        ArrayList<Integer> lotesEspeciales = new ArrayList<>();

        for (Lote lote : this.lotes) {
            if (lote.tieneMinerales(this.getMineralesEspeciales())) {
                lotesEspeciales.add(lote.getNumero());
            }
        }

        return lotesEspeciales;
    }

    // main

    public static void main(String[] args) {
        // Crear la cooperativa
        Cooperativa cooperativa = new Cooperativa("Cooperativa Agrícola");

        // Crear algunos cereales
        Cereal girasol = new Cereal("Girasol");
        girasol.addMineral("Fósforo");
        girasol.addMineral("Nitrógeno");

        Cereal trigo = new Cereal("Trigo");
        trigo.addMineral("Nitrógeno");
        trigo.addMineral("Potasio");
        // trigo.addMineral("Hidrógeno");

        // Crear algunos lotes
        Lote lote1 = new Lote(1);
        lote1.addMineral("Fósforo");
        lote1.addMineral("Nitrógeno");
        lote1.addMineral("Potasio");
        Lote lote2 = new Lote(2);
        lote2.addMineral("Nitrógeno");
        lote2.addMineral("Potasio");
        Lote lote3 = new Lote(3);
        lote3.addMineral("Fósforo");
        lote3.addMineral("Nitrógeno");
        Lote lote4 = new Lote(4);
        lote4.addMineral("Nitrógeno");
        lote4.addMineral("Potasio");
        lote4.addMineral("Calcio");

        // Agregar cereales y lotes a la cooperativa
        cooperativa.addCereal(girasol);
        cooperativa.addCereal(trigo);
        cooperativa.addLote(lote1);
        cooperativa.addLote(lote2);
        cooperativa.addLote(lote3);
        cooperativa.addLote(lote4);

        // Obtener los lotes aptos para sembrar el cereal "Girasol"
        System.out.println("Lotes aptos para sembrar Girasol:");
        System.out.println(cooperativa.getLotesAptosParaCereal(girasol));

        // Obtener los cereales aptos para sembrar en el lote 1
        System.out.println("Cereales aptos para sembrar en el Lote #1:");
        System.out.println(cooperativa.getCerealesAptosParaLote(lote1));

        // Agregar un mineral especial a la cooperativa
        cooperativa.addMineralEspecial("Calcio");

        // Obtener los lotes especiales que contienen el mineral "Calcio"
        System.out.println("Lotes especiales que contienen el mineral Calcio:");
        System.out.println(cooperativa.getLotesEspeciales());
    }
}
