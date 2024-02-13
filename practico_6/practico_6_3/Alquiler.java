package practico_6.practico_6_3;

import java.time.LocalDate;

public class Alquiler {

    public Producto producto;
    public Cliente cliente;
    public LocalDate alquilada;
    public LocalDate vencimiento;

    public Alquiler(Producto producto, Cliente cliente, LocalDate vencimiento) {
        this.producto = producto;
        this.alquilada = LocalDate.now();
        this.cliente = cliente;
        this.vencimiento = vencimiento;
    }

    public Producto getProducto() {
        return this.producto;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public LocalDate getAlquiler() {
        return this.alquilada;
    }

    public LocalDate getVencimiento() {
        return this.vencimiento;
    }

    public boolean isVencido() {
        return this.getVencimiento().isBefore(LocalDate.now());
    }

    public boolean equals(Object o) {
        try {
            Alquiler otro = (Alquiler) o;
            return this.getCliente().equals(otro.getCliente()) && this.getProducto().equals(otro.getProducto())
                    && this.getVencimiento().equals(otro.getVencimiento());
        } catch (Exception e) {
            return false;
        }
    }

    public String toString() {
        // return this.getCliente() + " " + this.getProducto() + " " +
        // this.getVencimiento();
        return String.valueOf(this.getProducto()) + "/" + this.getVencimiento();
    }

}
