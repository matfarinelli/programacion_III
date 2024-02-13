package practico_4_4.intento1;

import java.time.LocalDate;

public class Integrante {

    private String nombre;
    private String apellido;
    private int pasaporte;
    private LocalDate fechaNacimiento;
    private String estado;

    public Integrante(String nombre, String apellido, int pasaporte) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pasaporte = pasaporte;
    }

    // getters
    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getPasaporte() {
        return pasaporte;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getEstado() {
        return estado;
    }

    // setters

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
