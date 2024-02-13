package practico_7.practico_7_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Diccionario {

    private ArrayList<Palabra> palabras;

    public Diccionario() {
        this.palabras = new ArrayList<>();
    }

    // requiere equals
    public void addPalabra(Palabra nuevaPalabra) {
        if (!this.palabras.contains(nuevaPalabra)) {
            this.palabras.add(nuevaPalabra);
        }
        // ordenarPalabras(palabras); es ineficiente. Conviene utilizarlo al imprimir el
        // diccionario directamente
    }

    public void removerPalabra(Palabra aEliminar) {
        if (this.palabras.contains(aEliminar)) {
            this.palabras.remove(aEliminar);
        }
    }

    @Override
    public String toString() {
        // mas eficiente
        // StringBuilder result = new StringBuilder("Palabras en el diccionario:\n");
        // for (Palabra palabra : palabras) {
        // result.append(palabra.toString()).append("\n");
        // }
        // return result.toString();

        String resultados = "Palabras en el diccionario:\n";
        for (Palabra palabra : palabras) {
            resultados += palabra.toString() + "\n";
        }
        return resultados;
    }

    public ArrayList<String> getSinonimos(Palabra palabra) {
        ArrayList<String> resultados = new ArrayList<>();

        if (this.palabras.contains(palabra)) {
            resultados.addAll(palabra.getSinonimos());
        }

        Collections.sort(resultados);
        return resultados;

    }

    public ArrayList<String> getAntonimos(Palabra palabra) {
        ArrayList<String> resultados = new ArrayList<>();

        if (this.palabras.contains(palabra)) {
            resultados.addAll(palabra.getAntonimos());
        }

        Collections.sort(resultados);
        return resultados;
    }

    public ArrayList<Palabra> getPalabras() {
        ArrayList<Palabra> resultados = new ArrayList<Palabra>(this.palabras);

        Collections.sort(resultados);
        return resultados;
    }

    public ArrayList<String> getDefiniciones(Palabra palabra) {
        ArrayList<String> resultados = new ArrayList<String>();

        if (this.palabras.contains(palabra)) {
            resultados.addAll(palabra.getDefiniciones());
        }

        Collections.sort(resultados);
        return resultados;
    }

    public List<Palabra> getPalabrasEntre(Palabra p1, Palabra p2) {
        // Obtén la lista de palabras del diccionario
        List<Palabra> palabras = this.getPalabras();

        // Encuentra los índices de p1 y p2 en la lista
        int indice_1 = palabras.indexOf(p1);
        int indice_2 = palabras.indexOf(p2);

        // Verifica si ambos índices se encontraron en la lista
        if (indice_1 != -1 && indice_2 != -1) {
            // Asegúrate de que indice_1 sea menor o igual que indice_2
            if (indice_1 > indice_2) {
                int temp = indice_1;
                indice_1 = indice_2;
                indice_2 = temp;
            }

            // Crea una sublista desde indice_1 (inclusive) hasta indice_2 + 1 (exclusivo)
            List<Palabra> resultados = palabras.subList(indice_1, indice_2 + 1);

            return resultados;
        } else {
            // Si p1 o p2 no se encontraron en la lista, devuelve una lista vacía 
            return new ArrayList<>();
        }
    }

    // public static void main(String[] args) {

    // Diccionario d = new Diccionario();

    // Palabra p1 = new Palabra("Futbol");
    // d.addPalabra(p1);

    // Palabra p2 = new Palabra("balonpie");
    // d.addPalabra(p2);

    // Palabra p3 = new Palabra("soccer");
    // d.addPalabra(p3);

    // // prueba para remover y añodir duplicado
    // // Palabra p0 = new Palabra("Futbol");
    // // d.addPalabra(p0);
    // // System.out.println(d.toString()); // no lo agrega
    // // d.removerPalabra(p1);
    // // System.out.println(d.toString()); // lo borra

    // // me gustaría que esto se haga de manera cruzada. que a la vez p2 y p3
    // agreguen
    // // como sinonimo a p1 y p2 -- resuelto!
    // p1.addSinonimo(p2);
    // p1.addSinonimo(p3);

    // System.out.println(d.getSinonimos(p1));

    // }
    public static void main(String[] args) {
        // Crear instancias de palabras relacionadas con el deporte
        Palabra balon = new Palabra("Balón");
        Palabra pelota = new Palabra("Pelota");
        Palabra atleta = new Palabra("Atleta");
        Palabra deportista = new Palabra("Deportista");
        Palabra equipo = new Palabra("Equipo");
        Palabra conjunto = new Palabra("Conjunto");
        Palabra grupo = new Palabra("Grupo");
        Palabra jugador_individual = new Palabra("Jugador Individual");
        Palabra maraton = new Palabra("Maratón");
        Palabra carrera_larga = new Palabra("Carrera Larga");
        Palabra carrera_corta = new Palabra("Carrera Corta");

        // Agregar definiciones a las palabras
        balon.addDefinicion("Objeto utilizado en deportes como fútbol, baloncesto o voleibol para jugar el juego.");
        pelota.addDefinicion("Objeto esférico utilizado en deportes y juegos, similar a un balón.");
        atleta.addDefinicion("Persona que compite en deportes y eventos atléticos.");
        atleta.addDefinicion(
                "Un atleta es una persona que participa en competiciones deportivas y se dedica al entrenamiento físico para alcanzar un alto rendimiento en su disciplina.");
        atleta.addDefinicion(
                "Un atleta es un deportista que compite en eventos atléticos, como carreras, saltos y lanzamientos, y busca superar sus propios límites físicos y mentales.");
        deportista.addDefinicion("Persona que practica deportes como parte de su estilo de vida.");
        equipo.addDefinicion("Grupo de personas que juegan juntas en un deporte o actividad competitiva.");
        conjunto.addDefinicion("Sinónimo de equipo en el contexto deportivo.");
        grupo.addDefinicion("Sinónimo de equipo en el contexto deportivo.");
        jugador_individual
                .addDefinicion("Persona que compite en deportes de manera individual sin formar parte de un equipo.");
        maraton.addDefinicion("Carrera de larga distancia, generalmente de 42.195 kilómetros (26.2 millas).");
        carrera_larga.addDefinicion("Competencia atlética que involucra distancias mayores, como una maratón.");
        carrera_corta.addDefinicion(
                "Competencia atlética que involucra distancias más cortas en comparación con una maratón.");

        // Agregar sinónimos y antónimos
        balon.addSinonimo(pelota);
        pelota.addSinonimo(balon);

        atleta.addSinonimo(deportista);
        deportista.addSinonimo(atleta);

        equipo.addSinonimo(conjunto);
        equipo.addSinonimo(grupo);
        equipo.addAntonimo(jugador_individual);

        maraton.addSinonimo(carrera_larga);
        maraton.addAntonimo(carrera_corta);

        Palabra competicion = new Palabra("Competicion");
        competicion.addDefinicion(
                "Una competición es un evento en el que los participantes compiten entre sí en una serie de pruebas o actividades para determinar un ganador.");

        Palabra torneo = new Palabra("Torneo");
        torneo.addDefinicion("Competencia deportiva o de juegos.");

        Palabra campeonato = new Palabra("Campeonato");
        campeonato.addDefinicion("Competencia para coronar un campeón.");

        Palabra contienda = new Palabra("Contienda");
        contienda.addDefinicion("Batalla o enfrentamiento.");

        Palabra competencia = new Palabra("Competencia");
        competencia.addDefinicion("Rivalidad en una actividad.");

        Palabra carrera = new Palabra("Carrera");
        carrera.addDefinicion("Competición de velocidad.");

        Palabra batalla = new Palabra("Batalla");
        batalla.addDefinicion("Lucha o enfrentamiento.");

        Palabra justa = new Palabra("Justa");
        justa.addDefinicion("Torneo o competencia justa.");

        competicion.addSinonimo(torneo);
        competicion.addSinonimo(campeonato);
        competicion.addSinonimo(contienda);
        competicion.addSinonimo(competencia);
        competicion.addSinonimo(carrera);
        competicion.addSinonimo(batalla);
        competicion.addSinonimo(justa);

        // Crear un diccionario y agregar palabras
        Diccionario diccionario = new Diccionario();
        diccionario.addPalabra(balon);
        diccionario.addPalabra(pelota);
        diccionario.addPalabra(atleta);
        diccionario.addPalabra(deportista);
        diccionario.addPalabra(equipo);
        diccionario.addPalabra(conjunto);
        diccionario.addPalabra(grupo);
        diccionario.addPalabra(jugador_individual);
        diccionario.addPalabra(maraton);
        diccionario.addPalabra(carrera_larga);
        diccionario.addPalabra(carrera_corta);
        diccionario.addPalabra(torneo);
        diccionario.addPalabra(campeonato);
        diccionario.addPalabra(contienda);
        diccionario.addPalabra(competicion);
        diccionario.addPalabra(competencia);
        diccionario.addPalabra(carrera);
        diccionario.addPalabra(batalla);
        diccionario.addPalabra(justa);

        // Imprimir el diccionario
        System.out.println("Palabras contenidas en el diccionario: " + diccionario.getPalabras());

        System.out.println("\nSinonimos de " + competicion.getNombre() + ": " + diccionario.getSinonimos(competicion));

        System.out.println("\nAntonimos de " + maraton.getNombre() + ": " + diccionario.getAntonimos(maraton));

        System.out.println("-------");

        System.out.println("\nDeficiones de " + atleta.getNombre() + ": " + diccionario.getDefiniciones(atleta));

        System.out.println("\nSublista de : " + diccionario.getPalabrasEntre(batalla, justa));
    }
}
