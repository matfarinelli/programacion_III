package practico_6.practico_6_1.intento_1;

public class Contrato {

    private String empresa;
    private int horasRequeridas;
    private double sueldo;

    public Contrato(String empresa, int horasRequeridas, double sueldo) {
        this.empresa = empresa;
        this.horasRequeridas = horasRequeridas;
        this.sueldo = sueldo;
    }

    // getters
    public String getEmpresa() {
        return empresa;
    }

    public int getHorasRequeridas() {
        return horasRequeridas;
    }

    public double getSueldo() {
        return sueldo;
    }

    // setters
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void setHorasRequeridas(int horasRequeridas) {
        this.horasRequeridas = horasRequeridas;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean equals(Object o) {
        try {
            Contrato otro = (Contrato) o;

            return otro.getEmpresa().equals(this.getEmpresa()) &&
                    otro.getHorasRequeridas() == (this.getHorasRequeridas()) &&
                    otro.getSueldo() == (this.getSueldo());

        } catch (Exception e) {
            return false;
        }
    }

    public String toString(){
        return "Empresa: " + this.getEmpresa() + " - horas requeridas: " + this.getHorasRequeridas() + " - sueldo: " + this.getSueldo();
    }

}
