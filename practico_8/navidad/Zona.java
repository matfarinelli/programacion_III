package practico_8.navidad;

import java.util.ArrayList;

public class Zona extends ElemantoNavideno {

    private ArrayList<ElemantoNavideno> conjunto;
    private String id;

    public Zona(String id) {
        this.conjunto = new ArrayList<>();
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public void addElementoNavideno(ElemantoNavideno e) {
        this.conjunto.add(e);
    }

    @Override
    public int getCantidadRegalosPedidos(String regalo) {
        int contador = 0;

        for (ElemantoNavideno e : this.conjunto) {
            contador += e.getCantidadRegalosPedidos(regalo);
        }

        return contador;
    }

    @Override
    public int getCantidadCartasRecibidas() {
        int contador = 0;

        for (ElemantoNavideno e : this.conjunto) {
            contador += e.getCantidadCartasRecibidas();
        }

        return contador;
    }

    public int getCantidadNinosMalos() {
        int contador = 0;

        for (ElemantoNavideno e : this.conjunto) {
            contador += e.getCantidadNinosMalos();
        }

        return contador;
    }

}
