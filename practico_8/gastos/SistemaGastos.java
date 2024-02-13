package practico_8.gastos;

import java.time.LocalDate;

import practico_8.gastos.Criterios.CriterioCaracteristica;
import practico_8.gastos.Criterios.CriterioFecha;
import practico_8.gastos.Criterios.CriterioImporteMayor;
import practico_8.gastos.Criterios.CriterioRubro;

public class SistemaGastos {

    public static void main(String[] args) {

        GastoCompuesto sistema = new GastoCompuesto("UNICEN", LocalDate.of(2023, 9, 1), 0);
        GastoCompuesto exactas = new GastoCompuesto("Exactas", LocalDate.of(2023, 9, 1), 0);
        GastoCompuesto economicas = new GastoCompuesto("Economicas", LocalDate.of(2023, 9, 1), 0);
        GastoCompuesto veterinarias = new GastoCompuesto("Veterinarias", LocalDate.of(2023, 9, 1), 0);

        GastoSimple g1 = new GastoSimple("Materiales", LocalDate.of(2023, 10, 1), 100000);
        GastoSimple g2 = new GastoSimple("Pintura", LocalDate.of(2023, 12, 12), 45000.35);

        Caracteristica c1 = new Caracteristica("Color", "Rojo");
        Caracteristica c2 = new Caracteristica("Metros", 50);
        Caracteristica c3 = new Caracteristica("Marca", "Sharwin Williams");

        GastoSimple g3 = new GastoSimple("Mano de obra", LocalDate.of(2023, 10, 1), 90000);
        GastoCompuesto g4 = new GastoCompuesto("Terminaciones", LocalDate.of(2023, 12, 12), 0);

        GastoSimple g5 = new GastoSimple("Plomeria", LocalDate.of(2023, 12, 12), 123110.65);
        GastoSimple g6 = new GastoSimple("Techista", LocalDate.of(2023, 12, 1), 37500.25);
        GastoSimple g7 = new GastoSimple("Electricista", LocalDate.of(2023, 11, 30), 210005);

        exactas.addGasto(g1);
        exactas.addGasto(g2);
        exactas.addGasto(g3);
        exactas.addGasto(g4);

        g4.addGasto(g5);
        g4.addGasto(g6);
        g4.addGasto(g7);

        GastoCompuesto g8 = new GastoCompuesto("Aulas comunes", LocalDate.of(2023, 12, 12), 0);
        GastoSimple g10 = new GastoSimple("Pintura", LocalDate.of(2023, 12, 13), 77555.10);
        c1.setValor("Azul");
        g10.addCaracteristica(c1);

        g8.addGasto(g10);

        GastoCompuesto g9 = new GastoCompuesto("Baños", LocalDate.of(2023, 11, 5), 5053.37);
        GastoSimple g11 = new GastoSimple("Pintura", LocalDate.of(2023, 12, 12), 18000);

        g9.addGasto(g11);

        veterinarias.addGasto(g8);
        veterinarias.addGasto(g9);

        sistema.addGasto(exactas);
        sistema.addGasto(veterinarias);
        sistema.addGasto(economicas);

        g2.addCaracteristica(c1);
        g2.addCaracteristica(c2);
        g2.addCaracteristica(c3);

        Caracteristica c4 = new Caracteristica("Pintor", "Romero Lucas");
        Caracteristica c5 = new Caracteristica("Maestro mayor de obras", "Pedro Albin");

        g3.addCaracteristica(c4);
        g3.addCaracteristica(c5);

        System.out.println(sistema.getGasto());

        CriterioFecha busqueda_fecha = new CriterioFecha(LocalDate.of(2023, 12, 12));
        CriterioRubro busqueda_rubro = new CriterioRubro("terminaciones");
        CriterioImporteMayor busqueda_importe = new CriterioImporteMayor(100000);
        CriterioCaracteristica busqueda_caracteristica = new CriterioCaracteristica("rojo");

        System.out.println(sistema.getListadoGastos(busqueda_caracteristica));

    }

}
