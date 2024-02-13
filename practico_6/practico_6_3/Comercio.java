package practico_6.practico_6_3;

import java.time.LocalDate;
import java.util.ArrayList;

public class Comercio {

    private String nombre;
    private ArrayList<Alquiler> alquileres;
    private ArrayList<Producto> productos;
    private ArrayList<Cliente> clientes;

    public Comercio(String nombre) {
        this.nombre = nombre;
        this.alquileres = new ArrayList<>();
        this.productos = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public void addAlquiler(Alquiler alquiler) {
        if (!this.alquileres.contains(alquiler)) {
            this.alquileres.add(alquiler);
        }
    }

    public void addProducto(Producto producto) {
        if (!this.productos.contains(producto)) {
            this.productos.add(producto);
        }
    }

    public void addCliente(Cliente cliente) {
        if (!this.clientes.contains(cliente)) {
            this.clientes.add(cliente);
        }
    }

    // control de equals , no agrega si estan repetidos los nombres
    public ArrayList<Cliente> getClientes() {
        return new ArrayList<Cliente>(this.clientes);
    }

    // control de equals , no agrega si estan repetidos los nombres
    public ArrayList<Producto> getProductos() {
        return new ArrayList<Producto>(this.productos);
    }

    // control de equals, no agrega si se repite producto, cliente y vto.
    public ArrayList<Alquiler> getAlquileres() {
        return new ArrayList<Alquiler>(this.alquileres);
    }

    
    // public boolean alquilar(Alquiler alquiler) {
    //     if (alquiler.getProducto().esDisponible()) {
    //         this.addAlquiler(alquiler);
    //         alquiler.getCliente().addAlquiler(alquiler);
    //         return true;
    //     } else
    //         return false;
    // }

    public void alquilar(Cliente cliente, Producto producto, LocalDate vto) {
        if (producto.esDisponible()) {
            Alquiler nuevo_alq = new Alquiler(producto, cliente, vto);
            this.addAlquiler(nuevo_alq);
            cliente.addAlquiler(nuevo_alq);
        }
    }

    public void devolucionAlquiler(Alquiler alquiler) {
        if(this.alquileres.contains(alquiler){
            this.alquileres.remove(alquiler);
            alquiler.getCliente().devolverAlquiler(alquiler);
            alquiler.getProducto().esDisponible(); //RARO!
        }
    }

    public ArrayList<Alquiler> getVencidos() {
        ArrayList<Alquiler> alquileres_vencidos = new ArrayList<>();

        for (Alquiler alq : this.alquileres) {
            if (alq.isVencido()) {
                alquileres_vencidos.add(alq);
            }
        }

        return alquileres_vencidos;
    }

    public static void main(String[] args) {
        Comercio block = new Comercio("Blockbuster");

        Cliente c1 = new Cliente("Juan");
        Cliente c2 = new Cliente("Lucas");
        Cliente c3 = new Cliente("Juan");// repetido
        Cliente c4 = new Cliente("Cristobal");

        block.addCliente(c1);
        block.addCliente(c2);
        block.addCliente(c3);
        block.addCliente(c4);

        // System.out.println(block.getClientes());

        Producto p1 = new Pelicula("Peli1", 2);
        Producto p2 = new Pelicula("Peli2", 3);
        Producto p3 = new Pelicula("Peli3", 4);
        Producto p4 = new Pelicula("Peli4", 2);
        Producto p5 = new Pelicula("Peli5", 1);
        Producto p6 = new Pelicula("Peli5", 1); // repetida
        Producto a1 = new Auto("Renault", 5, "AA027HE", 30000, "Normal");
        Producto a2 = new Auto("Peugeot", 5, "AB520II", 1000, "Normal");

        block.addProducto(p1);
        block.addProducto(p2);
        block.addProducto(p3);
        block.addProducto(p4);
        block.addProducto(p5);
        block.addProducto(p6);

        block.addProducto(a1);
        block.addProducto(a2);

        block.alquilar(c1, p1, LocalDate.of(2023, 9, 5));
        block.alquilar(c1, p3, LocalDate.of(2023, 9, 17));
        block.alquilar(c1, p2, LocalDate.of(2022, 9, 5));
        block.alquilar(c1, p4, LocalDate.of(2022, 9, 5));

        // block.devolucionAlquiler(alquiler);
        // block.alquilar(c2, p2, LocalDate.of(2022, 9, 8));
        // block.alquilar(c2, p3, LocalDate.of(2022, 9, 13));
        // block.alquilar(c2, p1, LocalDate.of(2022, 9, 16));
        // block.alquilar(c3, p4, LocalDate.of(2022, 9, 16));
        // block.alquilar(c3, p5, LocalDate.of(2022, 9, 19));
        // block.alquilar(c3, p4, LocalDate.of(2022, 9, 16));

        // para control de equals
        // System.out.println(block.getAlquileres());
        // System.out.println(block.getClientes());
        // System.out.println(block.getProductos());

        System.out.println(block.getVencidos());
    }

}
