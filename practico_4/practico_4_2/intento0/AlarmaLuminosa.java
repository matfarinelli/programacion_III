package practico_4_2.intento0;

public class AlarmaLuminosa extends Alarma {

    private Luz luz;

    public AlarmaLuminosa() {
        super();
        this.luz = new Luz();
    }

    @Override
    public boolean comprobar() {
        if (super.comprobar()) {
            this.luz.encender();
            return true;
        } else
            return false;
    }
}
