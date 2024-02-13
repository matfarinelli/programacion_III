package adicional_1;

//Una revista posee un nombre, un autor, un precio, un número y un año

public class Revista extends Producto {
    
    private int numero;
    private int ano;

    
    public Revista(String nombre, String autor, double precio, int numero, int ano) {
        super(nombre, autor, precio);
        this.numero = numero;
        this.ano = ano;
    }

    

}
