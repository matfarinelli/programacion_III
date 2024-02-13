package practico_4_4.intento0;

import java.time.LocalDate;

public class Integrante {

    private String nombre;
    private String apellido;
    private int pasaporte;
    private LocalDate fecha_nac;
    private Estado estado;

    public Integrante(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(int pasaporte) {
        this.pasaporte = pasaporte;
    }

    public LocalDate getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(int dia, int mes, int ano) {
        this.fecha_nac = LocalDate.of(ano, mes, dia);
    }

    public boolean isDisponible() {
        return this.estado.isDisponible();
    }

    public static void main(String[] args) {

        Integrante i1 = new Integrante("Pepe", "Pimpollo");
        i1.setFecha_nac(19, 1, 1989);

        Estado e1 = new Estado();
        e1.setEn_pais_origen();
        e1.setEn_concentracion(false);
        i1.setEstado(e1);

        System.out.println(i1.isDisponible());

    }

}
