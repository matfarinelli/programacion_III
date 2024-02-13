package Final_intento_1;

import java.util.ArrayList;

import Final_intento_1.Criterio.Criterio;

public class ComandoBloque extends ComandoAbstracto {

    protected ArrayList<ComandoAbstracto> comandos;

    public ComandoBloque(String id) {
        this.id = id;
        this.comandos = new ArrayList<>();
    }

    public void addComando(ComandoAbstracto c) {
        this.comandos.add(c);
    }

    public double getGastoBateria() {
        double sumatoria = 0;

        for (ComandoAbstracto c : this.comandos) {
            sumatoria += c.getGastoBateria();
        }

        return sumatoria + this.getExtraFijo();
    }

    public double getTiempoEjecucion() {
        double sumatoria = 0;

        for (ComandoAbstracto c : this.comandos) {
            sumatoria += c.getTiempoEjecucion();
        }

        return sumatoria;
    }

    // falta establecer criterio para copiar
    public ComandoAbstracto getCopia(Criterio filtro) {
        ComandoBloque copia = new ComandoBloque(this.id);

        for (ComandoAbstracto c : this.comandos) {
            ComandoAbstracto copiaHija = c.getCopia(filtro);

            if (copiaHija != null) {
                copia.addComando(copiaHija);
            }

        }

        return copia;
    }

    public int getCantidadElementos() {
        int sumatoria = 0;

        for (ComandoAbstracto c : this.comandos) {
            sumatoria += c.getCantidadElementos();
        }

        return sumatoria;
    }

    public ArrayList<String> getComandos() {
        ArrayList<String> comandos = new ArrayList<>();

        for (ComandoAbstracto c : this.comandos) {
            comandos.addAll(c.getComandos());
        }

        return comandos;
    }
}
