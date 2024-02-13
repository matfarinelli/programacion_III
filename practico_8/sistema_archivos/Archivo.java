package practico_8.sistema_archivos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

import practico_8.sistema_archivos.Filtros.Criterio;
import practico_8.sistema_archivos.Filtros.Ordenadores.Orden;

public class Archivo extends ElementoFS {

    private String extension;
    private double tamano;

    public Archivo(String nombre, String extension, double tamano) {
        super(nombre);
        this.extension = extension;
        this.tamano = tamano;
    }

    @Override
    public double getTamano() {
        return this.tamano;
    }

    public void setExtension(String extension) {
        this.extension = extension;
        this.fecha_modificacion = LocalDate.now();
    }

    public String getExtension() {
        return this.extension;
    }

    public boolean equals(Object o) {
        try {
            Archivo archivo = (Archivo) o;

            return this.getNombre().equals(archivo.getNombre()) &&
                    this.getTamano() == (archivo.getTamano()) &&
                    this.getExtension().equals(archivo.getExtension());

        } catch (Exception e) {
            return false;
        }

    }

    public int getCantidadElementos() {
        return 1;
    }

    public ArrayList<ElementoFS> buscarElementos(Criterio criterio) {
        ArrayList<ElementoFS> coincidencias = new ArrayList<>();

        if (criterio.coincide(this)) {
            coincidencias.add(this);
        }

        Collections.sort(coincidencias);

        return coincidencias;
    }

    public ArrayList<ElementoFS> buscarElementos(Criterio criterio, Orden ordenador) {
        ArrayList<ElementoFS> coincidencias = new ArrayList<>();

        if (criterio.coincide(this)) {
            coincidencias.add(this);
        }

        Collections.sort(coincidencias, ordenador);

        return coincidencias;
    }

}
