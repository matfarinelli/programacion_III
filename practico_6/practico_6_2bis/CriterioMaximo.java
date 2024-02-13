package practico_6.practico_6_2bis;

public class CriterioMaximo extends Criterio {

    private int comparativo;
    private int cant_registros;

    public CriterioMaximo(int comparativo, int cant_registros) {
        this.comparativo = comparativo;
        this.cant_registros = cant_registros;
    }

    public int getComparativo() {
        return this.comparativo;
    }

    public int get_cant_registros() {
        return this.cant_registros;
    }

    public boolean comparar(Sensor registros) {
        return (registros.getMax(cant_registros)) > this.comparativo;
    }

}
