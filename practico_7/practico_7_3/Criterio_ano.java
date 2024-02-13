package practico_7.practico_7_3;

import java.util.Comparator;

public class Criterio_ano extends Criterio implements Comparator<Libro> {

@Override
public int compare(Libro l1, Libro l2){
    return Integer.compare(l1.getAno(), l2.getAno());
}


}
