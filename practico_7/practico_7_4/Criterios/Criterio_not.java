package practico_7.practico_7_4.Criterios;

import practico_7.practico_7_4.Planta;

public class Criterio_not extends Criterio{
    
    private Criterio criterio;

    public Criterio_not(Criterio criterio){
        this.criterio = criterio;
    }

    @Override
    public boolean buscar(Planta p){
        return !this.criterio.buscar(p);
    }

}
