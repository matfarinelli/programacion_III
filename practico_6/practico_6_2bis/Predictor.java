package practico_6.practico_6_2bis;

public class Predictor {

    protected Criterio criterio1;

    public Predictor(Criterio criterio1) {
        this.criterio1 = criterio1;
    }

    public boolean predecirLluvia(Sensor s1) {
        return this.criterio1.comparar(s1);
    }

}
