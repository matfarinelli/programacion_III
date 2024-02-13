package adicional_1;

public class ClienteExigente extends Cliente {

    public ClienteExigente(String nombre, String apellido, int dni, double descuento) {
        super(nombre, apellido, dni, descuento);
    }

    @Override
    public boolean leGustaLibro(Libro libro) {
        // Libro libro = (Libro) producto;
        return super.leGustaLibro(libro)
                && super.getGenerosFavoritos().contains(libro.getGenero());
    }

}
