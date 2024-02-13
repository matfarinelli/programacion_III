package adicional_1;

import java.util.ArrayList;

public class Libreria {

    private String nombre;
    private ArrayList<Cliente> clientes;
    private ArrayList<Producto> productos;

    public Libreria(String nombre) {
        this.nombre = nombre;
        this.clientes = new ArrayList<>();
        this.productos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void addCliente(Cliente clienteNuevo) {
        this.clientes.add(clienteNuevo);
    }

    public void addProducto(Producto productoNuevo) {
        this.productos.add(productoNuevo);
    }

    // remove clientes y producto

    public ArrayList<Cliente> getClientes() {
        return new ArrayList<Cliente>(this.clientes);
    }

    public ArrayList<Producto> getProductos() {
        return new ArrayList<Producto>(this.productos);
    }

    /*
     * Implementar los siguientes servicios:
     */

    // * 1. conocer el precio de un libro o revista para un cliente determinado
    // * (considerando el
    // * descuento)
    public double getPrecio(Cliente cliente, Producto producto) {
        return producto.getPrecio() * (1 - cliente.getDescuento());
    }

    // * 2. conocer si un cliente ya compró un libro o revista determinado.
    public boolean comproClienteProducto(Cliente cliente, Producto producto) {
        return cliente.tieneProducto(producto);
    }

    // * 3. conocer si a un cliente le gusta un libro determinado. A algunos
    // clientes les gusta el libro solo si el autor del mismo está en su lista de
    // autores
    // favoritos. Pero hay clientes más exigentes que piden que el autor esté en su
    // lista de
    // favoritos y además que el género también este en su lista de géneros
    // favoritos

    
    // public boolean aClienteLeGustaLibro(Producto producto, Cliente cliente) {
    public boolean aClienteLeGustaLibro(Libro producto, Cliente cliente) {
        return cliente.leGustaLibro(producto);
    }
}
