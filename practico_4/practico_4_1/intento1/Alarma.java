package practico_4_1.intento1;

public class Alarma {

    private boolean vidrioRoto;
    private boolean puertaAbierta;
    private boolean ventanaAbierta;
    protected Timbre timbre;

    public Alarma() {
        this.vidrioRoto = false;
        this.puertaAbierta = false;
        this.ventanaAbierta = false;
        this.timbre = new Timbre();
    }

    // getters
    public boolean getVidrioRoto() {
        return this.vidrioRoto;
    }

    public boolean getPuertaAbierta() {
        return this.puertaAbierta;
    }

    public boolean getVentanaAbierta() {
        return this.ventanaAbierta;
    }

    // setters

    public void setVidrioRoto(boolean vidrioRoto) {
        this.vidrioRoto = vidrioRoto;
    }

    public void setPuertaAbierta(boolean puertaAbierta) {
        this.puertaAbierta = puertaAbierta;
    }

    public void setVentanaAbierta(boolean ventanaAbierta) {
        this.ventanaAbierta = ventanaAbierta;
    }

    // funcion

    public void comprobar() {
        if (this.puertaAbierta || this.ventanaAbierta || this.vidrioRoto) {
            timbre.sonar();
        }
    }

    public void restablecer() {
        this.vidrioRoto = false;
        this.puertaAbierta = false;
        this.ventanaAbierta = false;
    }
}
