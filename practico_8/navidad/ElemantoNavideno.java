package practico_8.navidad;

public abstract class ElemantoNavideno {

    public abstract int getCantidadRegalosPedidos(String regalo);

    public abstract int getCantidadCartasRecibidas();

    public abstract int getCantidadNinosMalos();

    public double getPorcentajeRegaloPedido(String regalo) {
        return (double) this.getCantidadRegalosPedidos(regalo) / this.getCantidadCartasRecibidas() * 100;
    }

}
