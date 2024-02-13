package practico_6.practico_6_2bis;

public class CriterioPromedio extends Criterio {

    private int promedio_comparativo;
    private int cant_registros;

    public CriterioPromedio(int promedio_comparativo, int cant_registros) {
        this.promedio_comparativo = promedio_comparativo;
        this.cant_registros = cant_registros;
    }

    public int promedio_comparativo() {
        return this.promedio_comparativo;
    }

    public int get_cant_registros() {
        return this.cant_registros;
    }

    public boolean comparar(Sensor registros) {
        return (registros.getPromedio(cant_registros)) < this.promedio_comparativo;
    }

}
