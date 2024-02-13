package adicional_1;

public class Main {
    public static void main(String[] args) {
        Libreria libreria = new Libreria("Mi Librería");

        // Crear clientes
        Cliente cliente1 = new Cliente("Juan", "Pérez", 12345678, 0.1);
        Cliente cliente2 = new Cliente("María", "Gómez", 98765432, 0.15);
        Cliente cliente3 = new Cliente("Pedro", "López", 54321678, 0.3);

        // Agregar clientes a la librería
        libreria.addCliente(cliente1);
        libreria.addCliente(cliente2);
        libreria.addCliente(cliente3);

        // Crear libros y revistas
        Libro libro1 = new Libro("El código Da Vinci", "Dan Brown", 15.99, "Suspenso");
        libro1.setCantidadPaginas(480);
        libro1.setResumen("Un misterioso asesinato en el Louvre");
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", 12.99, "Realismo mágico");
        libro2.setCantidadPaginas(432);
        libro2.setResumen("La historia de la familia Buendía");
        Revista revista1 = new Revista("National Geographic", "Varios", 5.99, 123, 2023);
        Revista revista2 = new Revista("Time", "Varios", 4.99, 456, 2023);

        // Agregar libros y revistas a la librería
        libreria.addProducto(libro1);
        libreria.addProducto(libro2);
        libreria.addProducto(revista1);
        libreria.addProducto(revista2);

        // Realizar compras de los clientes
        cliente1.addCompras(libro1);
        cliente1.addCompras(revista1);
        cliente2.addCompras(libro2);
        cliente3.addCompras(revista2);

        // Obtener precio de un libro para un cliente determinado
        double precioLibroCliente1 = libreria.getPrecio(cliente1, libro1);
        System.out.println("Precio del libro \"" + libro1.getNombre() + "\" para el cliente " + cliente1.getNombre()
                + ": $" + precioLibroCliente1);

        double precioLibroCliente3 = libreria.getPrecio(cliente3, libro1);
        System.out.println("Precio del libro \"" + libro1.getNombre() + "\" para el cliente " + cliente3.getNombre()
                + ": $" + precioLibroCliente3);

        // Verificar si un cliente compró un libro o revista determinada
        boolean cliente1ComproLibro1 = libreria.comproClienteProducto(cliente1, libro1);
        boolean cliente2ComproRevista1 = libreria.comproClienteProducto(cliente2, revista1);
        boolean cliente3ComproRevista2 = libreria.comproClienteProducto(cliente3, revista2);
        System.out.println("El cliente " + cliente1.getNombre() + " compró el libro \"" + libro1.getNombre() + "\": "
                + cliente1ComproLibro1);
        System.out.println("El cliente " + cliente2.getNombre() + " compró la revista \"" + revista1.getNombre()
                + "\": " + cliente2ComproRevista1);
        System.out.println("El cliente " + cliente3.getNombre() + " compró la revista \"" + revista2.getNombre()
                + "\": " + cliente3ComproRevista2);

        // Agregar autores favoritos a los clientes
        cliente1.addAutoresFavoritos("Autor 1");
        cliente1.addAutoresFavoritos("Autor 3");
        cliente2.addAutoresFavoritos("Autor 2");
        cliente2.addAutoresFavoritos("Autor 3");
        cliente3.addAutoresFavoritos("Autor 1");
        cliente3.addAutoresFavoritos("Autor 4");

        // seteo de autores para dar match
        libro1.setAutor("Autor 1");
        libro2.setAutor("Autor 2");
        
        
        // Consultar si a un cliente le gusta el libro
        boolean cliente1LeGustaLibro = cliente1.leGustaLibro(libro1);
        boolean cliente2LeGustaLibro = cliente2.leGustaLibro(libro1);
        boolean cliente3LeGustaLibro = cliente3.leGustaLibro(libro1);

        // Imprimir resultados
        System.out.println("¿A " + cliente1.getNombre() + " le gusta el libro " + libro1.getNombre() + "? "
                + cliente1LeGustaLibro);
        System.out.println("¿A " + cliente2.getNombre() + " le gusta el libro " + libro1.getNombre() + "? "
                + cliente2LeGustaLibro);
        System.out.println("¿A " + cliente3.getNombre() + " le gusta el libro " + libro1.getNombre() + "? "
                + cliente3LeGustaLibro);

    }
}
