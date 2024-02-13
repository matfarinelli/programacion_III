package practico_4_4.intento0;

public class Estado {

    private boolean en_pais_origen;
    private boolean viajando;
    private boolean en_concentracion;

    public Estado() {
    }

    public boolean isEn_pais_origen() {
        return en_pais_origen;
    }

    public void setEn_pais_origen() {
        this.en_pais_origen = true;
        this.viajando = false;
    }

    public boolean isViajando() {
        return viajando;
    }

    public void setViajando() {
        this.en_pais_origen = false;
        this.viajando = true;
    }

    public boolean isEn_concentracion() {
        return en_concentracion;
    }

    public void setEn_concentracion(boolean estado) {
        if (estado) {
            this.viajando = false;
        }

        this.en_concentracion = estado;
    }

    public boolean isDisponible() {
        return (this.en_pais_origen && !this.en_concentracion);
    }

}
