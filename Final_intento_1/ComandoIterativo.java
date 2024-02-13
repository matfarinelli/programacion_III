package Final_intento_1;

import java.util.ArrayList;

import Final_intento_1.Criterio.Criterio;

public class ComandoIterativo extends ComandoBloque {

    private int iteraciones;
    private double porcentajeExtra;

    public ComandoIterativo(String id, int iteraciones, double porcentajeExtra) {
        super(id);
        this.iteraciones = iteraciones;
        this.porcentajeExtra = porcentajeExtra;
    }

    public int getIteraciones() {
        return this.iteraciones;
    }

    public ComandoAbstracto getCopia(Criterio filtro) {
        ComandoIterativo copia = new ComandoIterativo(this.getId(), this.getIteraciones(), this.getPorcentajeExtra());

        for (ComandoAbstracto c : this.comandos) {
            ComandoAbstracto copiaHija = c.getCopia(filtro);

            if (copiaHija != null) {
                copia.addComando(copiaHija);
            }
        }
        return copia;
    }

    public ArrayList<String> getComandos() {
        ArrayList<String> comandos = new ArrayList<>();

        for (int i = 0; i < iteraciones; i++) {

            for (ComandoAbstracto c : this.comandos) {
                comandos.addAll(c.getComandos());
            }

        }
        return comandos;
    }

    // el método es llamado por el robot y se pasa el mismo como parámetro, pero es una nueva signatura. MAL!
    public double getGastoBateria(Robot r) {
        return super.getGastoBateria() + this.getPorcentajeExtra() * r.getBateria();
    }

    private double getPorcentajeExtra() {
        return this.porcentajeExtra;
    }

}
