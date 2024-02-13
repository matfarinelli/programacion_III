package practico_8.sistema_electoral;

//elemento simple del composite
// public class Votante extends ElementoElectoral {
public class Votante {
    private String nombre;
    private int dni;
    private Voto voto;

    public Votante(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public Voto getVoto() {
        return this.voto;
    }

    public void votar(Candidato candidato, Mesa lugar) {
        this.voto = new Voto(candidato);
        System.out.println("Voto a agregar: " + dni + " - " + lugar);
        lugar.addVoto(voto, this.dni);
    }

    // @Override
    public int getCantidadVotos() {
        return this.voto != null ? 1 : 0;
    }

    // @Override // requiere equals
    public boolean contieneElemento(ElementoElectoral buscado) {
        return this.equals(buscado);
    }

    public boolean equals(Object o) {
        try {
            Votante votante = (Votante) o;

            return this.getDni() == votante.getDni();

        } catch (Exception e) {
            return false;
        }
    }

}
