package practico_8.navidad;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Buzon extends ElemantoNavideno {
    private Set<Carta> cartas;
    private Set<Integer> ninosBuenos;
    private String id;

    public Buzon(String id) {
        this.id = id;
        this.cartas = new HashSet<>();
        this.ninosBuenos = new HashSet<>();
    }

    public void addCarta(Carta pedido) {
        if (this.ninosBuenos.contains(pedido.getRemitente())) {
            this.cartas.add(pedido);
            System.out.println("Carta añadida de: " + pedido.getRemitente());
        } else {
            pedido.reemplazarRegalo();
            this.cartas.add(pedido);
            System.out.println("Carta añadida de: " + pedido.getRemitente() + " como niño malo");
        }
    }

    public void addNinoBueno(int dniNinoBueno) {
        this.ninosBuenos.add(dniNinoBueno);
    }

    public ArrayList<Carta> getCartas() {
        return new ArrayList<>(this.cartas);
    }

    // 2
    public int getCantidadRegalosPedidos(String regalo) {
        int contador = 0;

        for (Carta c : this.cartas) {
            if (c.contieneRegalo(regalo)) {
                contador++;
            }
        }

        return contador;
    }

    public int getCantidadNinosMalos() {
        int contador = 0;

        for (Carta carta : this.cartas) {
            if (!this.ninosBuenos.contains(carta.getRemitente())) {
                contador++;
            }
        }

        return contador;
    }

    // 4
    public int getCantidadCartasRecibidas() {
        return this.cartas.size();
    }

}
