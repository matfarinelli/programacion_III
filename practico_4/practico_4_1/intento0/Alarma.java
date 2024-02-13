package practico_4_1.intento0;

public class Alarma {

    private Timbre timbre;
    private boolean vidrioRoto;
    private boolean aberturas;
    private boolean movimiento;

    public Alarma() {
        this.timbre = new Timbre();
        this.vidrioRoto = false;
        this.aberturas = false;
        this.movimiento = false;
    }

    public void setVidrioRoto(boolean situacion) {
        this.vidrioRoto = situacion;
    }

    public void setAberturas(boolean situacion) {
        this.aberturas = situacion;
    }

    public void setMovimiento(boolean situacion) {
        this.movimiento = situacion;
    }

    public boolean comprobar() {
        if (vidrioRoto || aberturas || movimiento) {
            this.timbre.hacerSonar();
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {

        Alarma a1 = new Alarma();
        a1.setAberturas(true);
        System.out.println(a1.comprobar());

        AlarmaLuminosa al1 = new AlarmaLuminosa();
        al1.comprobar();
        al1.setAberturas(true);
        System.out.println(al1.comprobar());

    }
}
