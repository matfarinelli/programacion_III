package practico_8.sistema_archivos;

import java.util.ArrayList;
import java.util.Collections;

import practico_8.sistema_archivos.Filtros.Criterio;
import practico_8.sistema_archivos.Filtros.Ordenadores.Orden;

public class Carpeta extends ElementoFS {

    protected ArrayList<ElementoFS> contenido;

    public Carpeta(String nombre) {
        super(nombre);
        this.contenido = new ArrayList<>();
    }

    public void addElemento(ElementoFS elemento) {
        this.contenido.add(elemento);
    }

    public double getTamano() {
        double tamano = 0;

        for (ElementoFS elem : this.contenido) {
            tamano += elem.getTamano();
        }

        return tamano;
    }

    public int getCantidadElementos() {
        int contadorElementos = 0;

        for (ElementoFS elem : this.contenido) {
            contadorElementos += elem.getCantidadElementos();
        }

        return contadorElementos;
    }

    public ArrayList<ElementoFS> buscarElementos(Criterio criterio) {
        ArrayList<ElementoFS> coincidencias = new ArrayList<>();

        for (ElementoFS elem : this.contenido) {

            ArrayList<ElementoFS> coincidencia_interna = elem.buscarElementos(criterio);
            coincidencias.addAll(coincidencia_interna);

        }

        Collections.sort(coincidencias);

        return coincidencias;
    }

    public ArrayList<ElementoFS> buscarElementos(Criterio criterio, Orden ordenador) {
        ArrayList<ElementoFS> coincidencias = new ArrayList<>();

        for (ElementoFS elem : this.contenido) {

            ArrayList<ElementoFS> coincidencia_interna = elem.buscarElementos(criterio);
            coincidencias.addAll(coincidencia_interna);

        }

        Collections.sort(coincidencias, ordenador);

        return coincidencias;
    }

}
