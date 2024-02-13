package practico_7.practico_7_3;

import java.util.Comparator;

public class Criterio_genero extends Criterio implements Comparator<Libro> {

    @Override
    public int compare(Libro l1, Libro l2) {
        return l1.getGenero().compareTo(l2.getGenero());
    }

}
