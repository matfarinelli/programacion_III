package practico_8.sistema_archivos;

import java.util.ArrayList;

import practico_8.sistema_archivos.Filtros.Criterio;

public class Comprimido extends Carpeta {

    private double tasa_compresion; // pensado como porcentaje

    public Comprimido(String nombre, double tasa_compresion) {
        super(nombre);
        this.tasa_compresion = tasa_compresion;
    }

    @Override
    public String getNombre() {
        return super.getNombre() + ".zip";
    }

    public double getTasaCompresion() {
        return this.tasa_compresion;
    }

    public void setTasaCompresion(double tasa_compresion) {
        this.tasa_compresion = tasa_compresion;
    }

    @Override
    public double getTamano() {
        return super.getTamano() * this.getTasaCompresion();
    }

    @Override
    public ArrayList<ElementoFS> buscarElementos(Criterio criterio) {
        ArrayList<ElementoFS> coincidencias = new ArrayList<>();

        if (!super.buscarElementos(criterio).isEmpty()) {
            coincidencias.add(this);
        }

        return coincidencias;
    }
}
