package practico_7.practico_7_3;

import java.util.Comparator;

public class Criterio_autor extends Criterio implements Comparator<Libro> {

    @Override
    public int compare(Libro o1, Libro o2) {
        return o1.getAutor().compareTo(o2.getAutor());
    }
}
