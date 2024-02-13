package adicional_1;

import java.util.ArrayList;

// Del cliente se guarda su nombre y apellido, dni y dirección, una lista de autores favoritos y una lista de géneros que
// le gusta. También se guarda el listado de sus compras (sean libros o revistas).

/* Sugerencia:
 * En la clase Cliente, considera utilizar el tipo de datos HashSet en lugar de ArrayList para las listas de autores favoritos
 *  y géneros favoritos. El uso de HashSet elimina automáticamente duplicados y ofrece una búsqueda más eficiente cuando se 
 * verifica la presencia de un autor o género en la lista.
 */

public class Cliente {

    private String nombre;
    private String apellido;
    private int dni;
    private String domicilio;
    private ArrayList<String> autoresFavoritos;
    private ArrayList<String> generosFavoritos;
    private ArrayList<Producto> compras;
    private double descuento;

    public Cliente(String nombre, String apellido, int dni, double descuento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.descuento = descuento;
        this.autoresFavoritos = new ArrayList<>();
        this.generosFavoritos = new ArrayList<>();
        this.compras = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public ArrayList<String> getAutoresFavoritos() {
        return new ArrayList<String>(this.autoresFavoritos);
    }

    public void addAutoresFavoritos(String autor) {
        if (!this.autoresFavoritos.contains(autor)) {
            this.autoresFavoritos.add(autor);
        }
    }

    public ArrayList<String> getGenerosFavoritos() {
        return new ArrayList<String>(this.generosFavoritos);
    }

    public void addGenerosFavoritos(String genero) {
        if (!this.generosFavoritos.contains(genero)) {
            this.generosFavoritos.add(genero);
        }
    }

    public ArrayList<Producto> getCompras() {
        return new ArrayList<Producto>(this.compras);
    }

    public void addCompras(Producto compra) {
        this.compras.add(compra);
    }

    public boolean tieneProducto(Producto producto) {
        return this.compras.contains(producto);
    }

    public boolean leGustaLibro(Libro libro) {
        return this.autoresFavoritos.contains(libro.getAutor());
    }
}
