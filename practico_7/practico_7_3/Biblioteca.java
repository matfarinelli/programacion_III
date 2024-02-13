package practico_7.practico_7_3;

import java.util.ArrayList;
import java.util.Collections;

public class Biblioteca {

    private String nombre;
    private ArrayList<Libro> libros;
    // private CriterioBusqueda criterio; // es necesario que tenga criterio?

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public void addLibro(Libro libro) {
        if (!this.libros.contains(libro)) {
            this.libros.add(libro);
        }
    }

    public void removeLibro(Libro libro) {
        if (this.libros.contains(libro)) {
            this.libros.remove(libro);
        }
    }

    public ArrayList<Libro> getLibros() {
        ArrayList<Libro> libros = new ArrayList<>();

        for (Libro libro : this.libros) {
            libros.add(libro);
        }

        Collections.sort(libros);
        return libros;
    }

    public ArrayList<Libro> getLibros(Criterio criterio_orden) {
        ArrayList<Libro> libros = new ArrayList<>();

        for (Libro libro : this.libros) {
            libros.add(libro);
        }

        libros.sort(criterio_orden);

        return libros;
    }

    public static void main(String[] args) {

        Biblioteca b1 = new Biblioteca("Santamarina");

        Libro libro1 = new Libro(15, "Cien años de soledad", "Gabriel García Márquez", "Ficción", 1967,
                "Una historia mágica en un pueblo ficticio.");
        Libro libro2 = new Libro(2, "1984", "George Orwell", "Ciencia ficción", 1949,
                "Un mundo distópico bajo vigilancia total.");
        Libro libro3 = new Libro(31, "Matar a un ruiseñor", "Harper Lee", "Ficción", 1960,
                "La lucha contra el racismo en el sur de Estados Unidos.");
        Libro libro4 = new Libro(4, "El Gran Gatsby", "F. Scott Fitzgerald", "Ficción", 1925,
                "Los excesos de la alta sociedad en los años 20.");
        Libro libro5 = new Libro(53, "Don Quijote de la Mancha", "Miguel de Cervantes", "Clásico", 1605,
                "Las aventuras de un caballero loco.");
        Libro libro6 = new Libro(16, "Harry Potter y la piedra filosofal", "J.K. Rowling", "Fantasía", 1997,
                "El inicio de las aventuras de Harry Potter.");
        Libro libro7 = new Libro(7, "Crimen y castigo", "Fyodor Dostoevsky", "Novela psicológica", 1866,
                "Un estudiante comete un asesinato.");
        Libro libro8 = new Libro(1, "El Señor de los Anillos", "J.R.R. Tolkien", "Fantasía épica", 1954,
                "La lucha por un anillo mágico.");
        Libro libro9 = new Libro(9, "Orgullo y prejuicio", "Jane Austen", "Clásico", 1813,
                "Las complejidades del amor y la sociedad.");
        Libro libro10 = new Libro(41, "Código Da Vinci", "Dan Brown", "Misterio", 2003,
                "La búsqueda de un secreto ancestral.");

        b1.addLibro(libro1);
        b1.addLibro(libro2);
        b1.addLibro(libro3);
        b1.addLibro(libro4);
        b1.addLibro(libro5);
        b1.addLibro(libro6);
        b1.addLibro(libro7);
        b1.addLibro(libro8);
        b1.addLibro(libro9);
        b1.addLibro(libro10);

        System.out.println("Orden por defecto: ISBN:");
        System.out.println(b1.getLibros());

        System.out.println("------------------------------");

        Criterio criterio1 = new Criterio_autor();

        System.out.println("Orden por autor:");
        System.out.println(b1.getLibros(criterio1));

        System.out.println("------------------------------");

        Criterio criterio2 = new Criterio_ano();
        System.out.println("Orden por año:");
        System.out.println(b1.getLibros(criterio2));

        Criterio criterio3 = new Criterio_genero();
        System.out.println("Orden por género:");
        System.out.println(b1.getLibros(criterio3));

    }

}
