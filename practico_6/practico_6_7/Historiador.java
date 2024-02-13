package practico_6.practico_6_7;

import java.util.ArrayList;

public class Historiador {

    private String nombre;
    private ArrayList<Documento> documentos;
    private Criterio criterioBusqueda;

    public Historiador(String nombre) {
        this.nombre = nombre;
        this.documentos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public Criterio getCriterioBusqueda() {
        return criterioBusqueda;
    }

    public void setCriterioBusqueda(Criterio criterioBusqueda) {
        this.criterioBusqueda = criterioBusqueda;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Documento> getDocumentos() {
        return new ArrayList<>(this.documentos);
    }

    public void addDocumentos(Documento documento) {
        if (!this.documentos.contains(documento)) {
            this.documentos.add(documento);
        }
    }

    public ArrayList<Documento> buscarDocumentos() {
        ArrayList<Documento> coincidencias = new ArrayList<>();

        for (Documento documento : this.documentos) {
            if (criterioBusqueda.coincidencia(documento)) {
                coincidencias.add(documento);
            }
        }

        return coincidencias;
    }

    public static void main(String[] args) {

        Historiador h = new Historiador("Jorge Pendorcho");

        Documento d1 = new Documento("Titulo1");
        Documento d2 = new Documento("Titulo2");
        Documento d3 = new Documento("Titulo3");
        Documento d4 = new Documento("Titulo4");
        Documento d5 = new Documento("Titulo5");
        Documento d6 = new Documento("Titulo6");

        Documento[] documentos = { d1, d2, d3, d4, d5, d6 };

        d1.addAutores("Autor1");
        d1.addAutores("Autor2");
        d1.addPalabraClave("humor");
        d1.addPalabraClave("argentina");
        d1.addPalabraClave("politica");

        d2.addAutores("Autor3");
        d2.addPalabraClave("comedia");
        d2.addPalabraClave("humor");
        d2.addPalabraClave("amor");

        d3.addAutores("Autor4");
        d3.addAutores("Autor5");
        d3.addPalabraClave("comedia");
        d3.addPalabraClave("politica");
        d3.addPalabraClave("fantasia");

        d4.addAutores("Autor2");
        d4.addPalabraClave("thriller");
        d4.addPalabraClave("romance");
        d4.addPalabraClave("corrupcion");

        d5.addAutores("Autor1");
        d5.addAutores("Autor6");
        d5.addPalabraClave("politica");
        d5.addPalabraClave("corrupcion");
        d5.addPalabraClave("latinoamerica");

        d6.addAutores("Autor2");
        d6.addAutores("Autor3");
        d6.addPalabraClave("fantasia");
        d6.addPalabraClave("viajes");
        d6.addPalabraClave("latinoamerica");

        d1.setContenido(
                "Si bien hasta el momento no hay datos oficiales, su equipo de campaña tiene la informacion de que podria ser el candidato mas votado de manera individual");
        d2.setContenido(
                "Los canales tuvieron un gran despliegue en la jornada electoral, con moviles en los diferentes puntos del pais");
        d3.setContenido(
                "Habia una vez un pequeno perro llamado Max. Max era un perrito River jugueton y curioso que siempre estaba en busca de nuevas aventuras. Un dia soleado, mientras exploraba la casa, Max noto un aroma delicioso flotando en el aire. Siguio el olor con su nariz y lo llevo hasta la cocina.");
        d4.setContenido(
                "Decidio que la mejor manera de obtener un bocado de esa deliciosa comida era esperar pacientemente debajo de la mesa. Se deslizo bajo la mesa, encontrando un lugar comodo y escondido. Desde alli, podia ver las piernas de las personas moviendose arriba, pero el estaba seguro de que nadie lo descubriria.");
        d5.setContenido(
                "Mientras estaba debajo de la mesa River, Max escucho risas y conversaciones alegres. La familia estaba disfrutando de una comida juntos. Max se sentia emocionado y nervioso al mismo tiempo. Sabia que tenia que ser paciente y esperar el momento adecuado para actuar.");
        d6.setContenido(
                "Desde ese dia en adelante, cada vez que la familia se sentaba a la mesa para una comida, Max esperaba pacientemente debajo de la mesa, listo para disfrutar de su pequeno placer culinario secreto. Y asi, Max continuo siendo el perrito curioso y jugueton que siempre buscaba la emocion, incluso si eso significaba esconderse bajo la mesa para disfrutar de un sabor delicioso.");

        for (Documento d : documentos) {
            h.addDocumentos(d);
        }

        // System.out.println(h.getDocumentos());

        Criterio criterioAutor = new CriterioAutor("Autor1");
        h.setCriterioBusqueda(criterioAutor);

        System.out.println(("Busqueda por autor1:" + h.buscarDocumentos()));

        Criterio criterioContenido = new CriterioContenido("cada vez");
        h.setCriterioBusqueda(criterioContenido);

        System.out.println(("Busqueda por contenido 'cada vez':" + h.buscarDocumentos()));

        Criterio criterioTitulo = new CriterioTitulo("titulo3");
        h.setCriterioBusqueda(criterioTitulo);

        System.out.println(("Busqueda por titulo 'titulo3':" + h.buscarDocumentos()));

    }

}
