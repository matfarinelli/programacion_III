package practico_8.sistema_archivos;

import java.time.LocalDate;

import practico_6.practico_6_1.intento_0.Criterio;
import practico_8.sistema_archivos.Filtros.CriterioFModificacionDespues;
import practico_8.sistema_archivos.Filtros.CriterioPalabra;
import practico_8.sistema_archivos.Filtros.Ordenadores.Orden;
import practico_8.sistema_archivos.Filtros.Ordenadores.OrdenFechaCreacion;

public class Main {

    public static void main(String[] args) {

        SistemaArchivos windows = new SistemaArchivos();

        Carpeta c = new Carpeta("C");
        Carpeta archivos = new Carpeta("Archivos de programa");
        Carpeta fotos = new Carpeta("Fotos");
        Carpeta facultad = new Carpeta("Facultad");
        Carpeta primero = new Carpeta("Primer año");
        Carpeta segundo = new Carpeta("Segundo año");

        windows.addElemento(c);
        c.addElemento(archivos);
        c.addElemento(fotos);
        c.addElemento(facultad);

        facultad.addElemento(primero);
        facultad.addElemento(segundo);

        Archivo a1 = new Archivo("examen vacio", "doc", 1.0);
        Archivo a2 = new Archivo("examen recuperatorio", "doc", 1.9);
        Archivo a3 = new Archivo("examen fisica", "doc", 2.0);
        Archivo a4 = new Archivo("examen matematica", "doc", 2.4);
        Archivo a5 = new Archivo("examen1", "doc", 0.2);

        Archivo a6 = new Archivo("a fotocopiar", "ppt", 1.2);
        Archivo a7 = new Archivo("contrasena", "txt", 0.01);
        Archivo a8 = new Archivo("reunion", "doc", 5.5);

        Archivo a9 = new Archivo("foto con los primos", "jpg", 105.2);
        Archivo a10 = new Archivo("foto monumental", "jpg", 225.01);
        Archivo a11 = new Archivo("foto cascada", "jpg", 569.5);

        facultad.addElemento(a1);
        facultad.addElemento(a2);
        facultad.addElemento(a3);
        facultad.addElemento(a4);
        facultad.addElemento(a5);

        archivos.addElemento(a6);
        archivos.addElemento(a7);
        c.addElemento(a8);

        fotos.addElemento(a9);
        fotos.addElemento(a10);
        fotos.addElemento(a11);

        System.out.println(facultad.getTamano());

        System.out.println(c.getCantidadElementos());

        // creacion del criterio
        CriterioPalabra criterio = new CriterioPalabra("foto");

        // seteo fechas de modificacion para probar filtro
        // LocalDate fecha_1 = LocalDate.of(2023,1,1);
        // a9.setFecha_modificacion(fecha_1);
        // a10.setFecha_modificacion(fecha_1);
        // a5.setFecha_modificacion(fecha_1);

        // LocalDate fecha_buscada = LocalDate.of(2023,9,1);
        // CriterioFModificacionDespues criterioFechaModificacion = new
        // CriterioFModificacionDespues(fecha_buscada);

        Comprimido c1 = new Comprimido("Porquerias", .10);
        c1.addElemento(a10);
        c1.addElemento(a2);
        c1.addElemento(a3);
        c1.addElemento(a4);

        c.addElemento(c1);

        
        Orden orden = new OrdenFechaCreacion();
        
        //por fecha de creación
        System.out.println(c.buscarElementos(criterio,orden));

        // default devuelve por orden alfabético
        System.out.println(c.buscarElementos(criterio));
        

    }

}
