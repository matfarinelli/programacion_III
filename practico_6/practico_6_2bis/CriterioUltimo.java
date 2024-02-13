package practico_6.practico_6_2bis;

public class CriterioUltimo extends Criterio {

    private int comparativo;
    

    public CriterioUltimo(int comparativo) {
        this.comparativo = comparativo;
    }

    public int getComparativo() {
        return this.comparativo;
    }


    public boolean comparar(Sensor registros) {
        return (registros.getLast()) > this.comparativo;
    }

}
