package practico_8.sitio_web;

import java.util.ArrayList;

import practico_8.sitio_web.filtros.Criterio;
import practico_8.sitio_web.filtros.CriterioAutor;
import practico_8.sitio_web.filtros.CriterioLongitudTexto;

public class SitioWeb {

        private String dominio;
        private Categoria root;

        public SitioWeb(String dominio) {
                this.dominio = dominio;
                this.root = new Categoria("Raiz", "");
        }

        public static void main(String[] args) {
                // Crear sitio web
                Categoria sitio = new Categoria("Sitio", "imagen1");

                // Crear noticias
                Noticia noticia1 = new Noticia("Descubrimiento Extraterrestre",
                                "Emocionante hallazgo en la exploración espacial",
                                "Científicos rusos revelan nuevas evidencias de vida extraterrestre en un lejano exoplaneta. Observaciones telescópicas sugieren condiciones habitables. Emoción y especulación crecen en la comunidad científica mundial.",
                                "Dr. Astrónomo", "www.descubrimientoextraterrestre.com");
                noticia1.addPalabraClave("Extraterrestre");
                noticia1.addPalabraClave("Exploración Espacial");

                Noticia noticia2 = new Noticia("Avances Tecnológicos", "Innovaciones que están cambiando el mundo",
                                "Empresas líderes en tecnología presentan sus últimos avances. Desde inteligencia artificial hasta dispositivos revolucionarios, conoce las tendencias que están transformando la forma en que vivimos y trabajamos.",
                                "Ing. Innovador", "www.avancestecnologicos.com");
                noticia2.addPalabraClave("Tecnología");
                noticia2.addPalabraClave("Innovación");

                Noticia noticia3 = new Noticia("Campeonato de Fútbol", "Emoción y rivalidad en la cancha",
                                "Equipos de todo el país compiten por el título en un emocionante campeonato de fútbol. Jugadas sorprendentes y momentos inolvidables marcan el torneo.",
                                "Narrador Apasionado", "www.campeonatodefutbol.com");
                noticia3.addPalabraClave("Deportes");
                noticia3.addPalabraClave("Fútbol");

                // Crear categorías
                Categoria tecnologia = new Categoria("Tecnología", "imagen_tecnologia.jpg");
                tecnologia.addElementoWeb(noticia1);
                tecnologia.addElementoWeb(noticia2);

                Categoria deportes = new Categoria("Deportes", "imagen_deportes.jpg");
                deportes.addElementoWeb(noticia3);

                // Subcategorías y noticias adicionales
                Noticia noticia4 = new Noticia("Innovaciones Médicas", "Avances que transforman la salud",
                                "Descubre cómo la tecnología está revolucionando el campo de la medicina. Desde diagnósticos más precisos hasta tratamientos innovadores, la salud se beneficia de estas increíbles innovaciones.",
                                "Dr. Saludable", "www.innovacionesmedicas.com");
                noticia4.addPalabraClave("Medicina");
                noticia4.addPalabraClave("Salud");

                Noticia noticia5 = new Noticia("Ciclismo Extremo", "Aventuras en dos ruedas",
                                "Explora el emocionante mundo del ciclismo extremo. Desde descensos vertiginosos hasta acrobacias impresionantes, los amantes de la adrenalina encontrarán su dosis de emoción en cada competición.",
                                "Ing. Innovador", "www.ciclismoextremo.com");
                noticia5.addPalabraClave("Deportes");
                noticia5.addPalabraClave("Ciclismo");

                Categoria salud = new Categoria("Salud", "imagen_salud.jpg");
                salud.addElementoWeb(noticia4);

                Categoria deportesExtremos = new Categoria("Deportes Extremos", "imagen_deportesextremos.jpg");
                deportesExtremos.addElementoWeb(noticia5);

                // Agregar subcategorías al sitio web
                tecnologia.addElementoWeb(salud);
                deportes.addElementoWeb(deportesExtremos);

                sitio.addElementoWeb(tecnologia);
                sitio.addElementoWeb(deportes);

                // Buscar por autor
                Criterio c1 = new CriterioAutor("Ing. Innovador");
                System.out.println(sitio.buscar(c1));

                System.out.println("Cantidad de noticias en el sitio: " + sitio.getCantidadNoticias());

                ElementoWeb copia = sitio.copia(c1);

                System.out.println(copia.getCantidadNoticias());

                System.out.println(sitio.getRutaCompleta());

        }
}
