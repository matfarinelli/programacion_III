package practico_7.practico_7_4.Criterios;

import practico_7.practico_7_4.Planta;

public class Criterio_nombre extends Criterio {

    private String nombre_buscado;

    public Criterio_nombre(String nombre_buscado) {
        this.nombre_buscado = nombre_buscado;
    }

    public String getNombre(){
        return this.nombre_buscado;
    }

    public boolean buscar(Planta p){
        return p.getNombre().toLowerCase().contains(this.getNombre().toLowerCase());
    }
}
