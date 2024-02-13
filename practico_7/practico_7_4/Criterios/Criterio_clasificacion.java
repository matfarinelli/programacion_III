package practico_7.practico_7_4.Criterios;

import practico_7.practico_7_4.Planta;

public class Criterio_clasificacion extends Criterio {

    private String clasificacion_buscada;

    public Criterio_clasificacion(String clasificacion_buscada) {
        this.clasificacion_buscada = clasificacion_buscada;
    }

    public String getClasificacion(){
        return this.clasificacion_buscada;
    }

    public boolean buscar(Planta p){
        return p.getClasificacion().toLowerCase().contains(this.getClasificacion().toLowerCase());
    }
}
