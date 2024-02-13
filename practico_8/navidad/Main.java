package practico_8.navidad;

public class Main {

    public static void main(String[] args) {

        Zona ciudad = new Zona("Tandil");

        Buzon b1 = new Buzon("buzon1");
        Buzon b2 = new Buzon("buzon2");
        Buzon b3 = new Buzon("buzon3");

        ciudad.addElementoNavideno(b1);
        ciudad.addElementoNavideno(b2);
        ciudad.addElementoNavideno(b3);

        b1.addNinoBueno(1);
        b1.addNinoBueno(2);
        b1.addNinoBueno(3);
        b1.addNinoBueno(4);
        b1.addNinoBueno(5);

        Carta carta1 = new Carta(1);
        carta1.addRegalo("Juego de construcción");
        carta1.addRegalo("Libro de cuentos");

        Carta carta2 = new Carta(2);
        carta2.addRegalo("Puzzle");
        carta2.addRegalo("Peluche");
        carta2.addRegalo("Pelota");

        Carta carta3 = new Carta(3);
        carta3.addRegalo("Bicicleta");
        carta3.addRegalo("Tabla de dibujo");

        Carta carta4 = new Carta(4);
        carta4.addRegalo("Videojuego");
        carta4.addRegalo("Patines");
        carta4.addRegalo("Pelota");

        Carta carta5 = new Carta(8); // niño malo
        carta5.addRegalo("Robot interactivo");
        carta5.addRegalo("Kit de experimentos");

        // Carta carta6 = new Carta(1); // no la carga, por el SET - carta repetida
        Carta carta6 = new Carta(9); // niño malo
        carta6.addRegalo("PS5");
        carta6.addRegalo("FIFA 2023");

        b2.addNinoBueno(20);
        b2.addNinoBueno(21);
        b2.addNinoBueno(22);
        b2.addNinoBueno(23);
        b2.addNinoBueno(24);

        Carta carta7 = new Carta(21);
        carta7.addRegalo("Caña de pesca");
        carta7.addRegalo("Tabla de dibujo");

        Carta carta8 = new Carta(22);
        carta8.addRegalo("Patines");
        carta8.addRegalo("Tabla de surf");
        carta8.addRegalo("Pelota");

        Carta carta9 = new Carta(23);
        carta9.addRegalo("Bicicleta");
        carta9.addRegalo("Rollers");

        Carta carta10 = new Carta(24);
        carta10.addRegalo("PS5");
        carta10.addRegalo("Patines");
        carta10.addRegalo("Pelota");

        Carta carta11 = new Carta(25); // niño malo
        carta11.addRegalo("Muñeco de policia");
        carta11.addRegalo("Kit de pintura");

        b3.addNinoBueno(31);
        b3.addNinoBueno(32);
        b3.addNinoBueno(33);
        b3.addNinoBueno(34);
        b3.addNinoBueno(35);

        Carta carta12 = new Carta(31);
        carta12.addRegalo("Tablet");
        carta12.addRegalo("Auriculares inalámbricos");
        carta12.addRegalo("Libro de aventuras");

        Carta carta13 = new Carta(32);
        carta13.addRegalo("Bolso elegante");
        carta13.addRegalo("Tarjeta de regalo");
        carta13.addRegalo("Bufanda suave de peLuche");

        Carta carta14 = new Carta(33);
        carta14.addRegalo("Zapatillas deportivas");
        carta14.addRegalo("Videojuego de aventuras");
        carta14.addRegalo("Gafas de sol");

        Carta carta15 = new Carta(34);
        carta15.addRegalo("Cámara digital");
        carta15.addRegalo("Set de pintura");
        carta15.addRegalo("Pelota de fútbol");

        Carta carta16 = new Carta(35);
        carta16.addRegalo("Maquillaje artístico");
        carta16.addRegalo("Caja de bombones");
        carta16.addRegalo("Peluche grande");

        // Agregar cartas a los buzones
        b1.addCarta(carta1);
        b1.addCarta(carta2);
        b1.addCarta(carta3);
        b1.addCarta(carta4);
        b1.addCarta(carta5);
        b1.addCarta(carta6);

        b2.addCarta(carta7);
        b2.addCarta(carta8);
        b2.addCarta(carta9);
        b2.addCarta(carta10);
        b2.addCarta(carta11);

        b3.addCarta(carta12);
        b3.addCarta(carta13);
        b3.addCarta(carta14);
        b3.addCarta(carta15);
        b3.addCarta(carta16);

        // Mostrar contenido de los buzones
        // System.out.println("Contenido del Buzon1:");

        // for (Carta carta : b1.getCartas()) {
        // System.out.println(carta);
        // }

        String pedido = "pelota";
        System.out.println("Cantidad de cartas que piden " + pedido);
        System.out.println(ciudad.getCantidadRegalosPedidos(pedido));
        System.out.println("Porcentaje de niños que piden " + pedido);
        System.out.println(ciudad.getPorcentajeRegaloPedido(pedido));
        System.out.println("Cantidad de cartas: ");
        System.out.println(ciudad.getCantidadCartasRecibidas());

        System.out.println("Niños malos que enviaron cartas: " + ciudad.getCantidadNinosMalos());

    }
}
