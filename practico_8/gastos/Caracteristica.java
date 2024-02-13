package practico_8.gastos;

public class Caracteristica {

    private String nombre;
    private Object valor;

    public Caracteristica(String nombre, Object valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Object getValor() {
        return this.valor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public boolean equals(Object o) {
        try {
            Caracteristica c = (Caracteristica) o;

            return this.getNombre().equals(c.getNombre());

        } catch (Exception e) {
            return false;
        }
    }
}
