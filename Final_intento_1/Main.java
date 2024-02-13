package Final_intento_1;

import Final_intento_1.Criterio.CriterioConsumo;
import Final_intento_1.Criterio.CriterioId;
import Final_intento_1.Criterio.CriterioTiempo;

public class Main {

    public static void main(String[] args) {

        // Crear comandos simples
        ComandoSimple comando1 = new ComandoSimple("avanzar", 2.0, 1.5);
        ComandoSimple comando2 = new ComandoSimple("saltar", 1.5, 2.0);

        // Crear bloque interno
        ComandoBloque bloqueInterno = new ComandoBloque("BloqueInterno");
        ComandoSimple comando3 = new ComandoSimple("caminar despacio", 1.0, 1.0);
        bloqueInterno.addComando(comando3);

        // Crear bloque principal
        ComandoBloque bloquePrincipal = new ComandoBloque("BloquePrincipal");
        bloquePrincipal.addComando(comando1);
        bloquePrincipal.addComando(comando2);
        bloquePrincipal.addComando(bloqueInterno); // Agregar el bloque interno al bloque principal

        // Crear bloques compuestos
        ComandoBloque bloqueCompuesto1 = new ComandoBloque("BloqueCompuesto1");
        ComandoSimple comando4 = new ComandoSimple("sonreir", 0.8, 5.5);
        bloqueCompuesto1.addComando(comando4);

        BloqueIterativo bloqueCompuesto2 = new BloqueIterativo("BloqueCompuesto2", 10, 0.1);
        ComandoSimple comando5 = new ComandoSimple("estudiar", 1.2, 1.0);
        ComandoSimple comando6 = new ComandoSimple("practicar", 0.7, 2.8);
        bloqueCompuesto2.addComando(comando5);
        bloqueCompuesto2.addComando(comando6);

        // Agregar los bloques compuestos al bloque interno
        bloqueInterno.addComando(bloqueCompuesto1);
        bloqueInterno.addComando(bloqueCompuesto2);

        ComandoSimple comando7 = new ComandoSimple("aprobar", 0.1, 1.8);

        bloquePrincipal.addComando(comando7);

        // Calcular el gasto total de batería
        double gastoTotal = bloquePrincipal.getGastoBateria();
        double gastoTiempoTotal = bloquePrincipal.getTiempoEjecucion();

        // Mostrar resultados
        System.out.println("El gasto total de batería es: " + gastoTotal + " unidades.");
        System.out.println("El tiempo total de ejecucion es: " + gastoTiempoTotal + " unidades.");

        // copiar
        CriterioTiempo c1 = new CriterioTiempo(1.6);
        CriterioConsumo c2 = new CriterioConsumo(1);
        CriterioId c3 = new CriterioId("sonreir");

        // control de filtro
        ComandoAbstracto copia = bloquePrincipal.getCopia(c3);
        System.out.println("Cantidad de elementos con unidades de tiempo menores a " + c1.getTiempoComparativo()
                + " UDT: " + copia.getCantidadElementos());
        System.out.println("Cantidad de elementos con consumo de bateria menores a " + c2.getConsumoComparativo()
                + " mAh: " + copia.getCantidadElementos());

        // ComandoIterativo comandoI1 = new ComandoIterativo("Aprobar", 5, 20, 10);
        // bloqueCompuesto2.addComando(comandoI1);

        System.out.println(bloquePrincipal.getComandos());

    }

}
