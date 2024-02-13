package practico_6.practico_6_1.intento_0;

public class Contrato {

    private int horas_requeridas;
    private String empresa;
    private double sueldo_ofrecido;

    public Contrato(String empresa, int horas_requeridas, double sueldo_ofrecido) {
        this.empresa = empresa;
        this.horas_requeridas = horas_requeridas;
        this.sueldo_ofrecido = sueldo_ofrecido;
    }

    public int getHoras_requeridas() {
        return horas_requeridas;
    }

    public String getEmpresa() {
        return this.empresa;
    }

    public double getSueldo_ofrecido() {
        return sueldo_ofrecido;
    }

}
