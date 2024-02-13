package practico_8.navidad;

import java.util.ArrayList;

public class Carta {

    private int dniRemitente;
    private ArrayList<String> regalos;

    public Carta(int remitente) {
        this.dniRemitente = remitente;
        this.regalos = new ArrayList<>();
    }

    public void addRegalo(String regalo) {
        if (!this.regalos.contains(regalo)) {
            this.regalos.add(regalo);
        }
    }

    public int getRemitente() {
        return this.dniRemitente;
    }

    public void reemplazarRegalo() {
        this.regalos.clear();
        this.regalos.add("Trozo de carbón");
    }

    private ArrayList<String> getRegalos(){
        ArrayList<String> regalos = new ArrayList<>();
        
        for(String regalo : this.regalos){
            regalos.add(regalo);
        }

        return regalos;
    }

    public String toString(){
        return this.getRemitente() + " - Regalos: " + this.getRegalos();
    }

    public boolean contieneRegalo(String regalo) {
        
        for (String regaloPedido : this.regalos) {
            if (regaloPedido.toLowerCase().contains(regalo.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    // public double getPorcentajeRegaloPedido(String regalo){
    //     return (double) this.getCantidadRegalosPedidos(regalo) * 100;
    // }

    // public int getCantidadRegalosPedidos(String regalo){
    //     return this.contieneRegalo(regalo) ? 1 : 0;
    // }

    
}