package practico3;

import java.util.HashMap;
import java.util.Iterator;

public class Vertice<T> {

    private int id;
    private HashMap<Integer, Arco<T>> arcos;

    public Vertice(int id) {
        this.id = id;
        this.arcos = new HashMap<Integer, Arco<T>>();
    }

    public int getId() {
        return this.id;
    }

    protected void agregarArco(int destino, T etiqueta) {
        Arco<T> arco = new Arco<T>(this.getId(), destino, etiqueta);
        this.arcos.put(destino, arco);
    }

    protected void borrarArco(int destino){
        this.arcos.remove(destino);
    }

    protected Iterator<Arco<T>> getArcos() {
        Iterator<Arco<T>> ItArcos = this.arcos.values().iterator();
        return ItArcos;
    }

}
