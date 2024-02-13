package practico_6.practico_6_2bis;

public class PredictorDoble extends Predictor {

    private Criterio criterio2;

    public PredictorDoble(Criterio criterio1, Criterio criterio2) {
        super(criterio1);
        this.criterio2 = criterio2;
    }

    public boolean predecirLluvia(Sensor s1, Sensor s2) {
        return super.predecirLluvia(s1) &&
                this.criterio2.comparar(s2);
    }

}
