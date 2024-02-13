package practico_5_4;

import java.util.ArrayList;

public class Ciudad {

    private String nombre;
    ArrayList<Contribuyente> contribuyentes;
    ArrayList<Impuesto> impuestos;

    public Ciudad(String nombre) {
        this.nombre = nombre;
        this.contribuyentes = new ArrayList<>();
        this.impuestos = new ArrayList<>();
    }

    public void addContribuyente(Contribuyente contribuyente) {
        if (!this.contribuyentes.contains(contribuyente)) {
            this.contribuyentes.add(contribuyente);
        }
    }

    public void addImpuesto(Impuesto impuesto) {
        if (!this.impuestos.contains(impuesto)) {
            this.impuestos.add(impuesto);
        }
    }

    public String getNombre() {
        return this.nombre;
    }

    public static void main(String[] args) {

        Ciudad tandil = new Ciudad("Tandil");

        Contribuyente c1 = new Contribuyente("Matias", 34296907, 5000);
        Contribuyente c2 = new Contribuyente("May", 34150151, 6000);
        // Contribuyente c3 = new Contribuyente("Juan", 35960099, 10000);

        Impuesto im1 = new Impuesto("Simple", 350);
        Impuesto im2 = new Impuesto_compuesto("Comerciante", 900, 0.5, 0.035);
        // Impuesto im3 = new Impuesto_compuesto("Programador", , ventas, alicuota)

        tandil.addContribuyente(c1);
        tandil.addContribuyente(c2);
        tandil.addImpuesto(im1);

        c1.setImpuesto(im1);
        c2.setImpuesto(im2);

        // im2.metodoPrueba(); // este metodo no funciona si im2 se crea como variable
        // "impuesto";

        System.out.println(c1.getImpuesto());
        System.out.println(c2.getImpuesto());

        // NO TERMINADO.

    }
}
