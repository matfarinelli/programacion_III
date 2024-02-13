package practico_8.gastos.Criterios;

import practico_8.gastos.ElementoAbsGasto;
import practico_8.gastos.GastoSimple;

public abstract class Criterio {

    // deberia trabajar con gastos abstractos para devolver categorías de gastos tambien
    public abstract boolean cumple(ElementoAbsGasto e);
    
}
