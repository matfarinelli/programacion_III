// package Final_intento_1;

// import java.util.ArrayList;

// import Final_intento_1.Criterio.Criterio;

// public class ComandoSimpleIterativo extends ComandoSimple {

//     private int iteraciones;

//     public ComandoSimpleIterativo(String id, double gastoBateria, double unidadTiempo, int iteraciones) {
//         super(id, gastoBateria, unidadTiempo);
//         this.iteraciones = iteraciones;
//     }

//     public ComandoAbstracto getCopia(Criterio filtro) {

//         if (filtro.cumple(this)) {
//             ComandoSimpleIterativo copia = new ComandoSimpleIterativo(this.getId(), this.getGastoBateria(),
//                     this.getTiempoEjecucion(),
//                     this.getIteraciones());
//             return copia;
//         } else
//             return null;

//     }

//     public int getIteraciones() {
//         return this.iteraciones;
//     }

//     public double getGastoBateria() {
//         return super.getGastoBateria(); // bateria del robot , ver como conseguir
//     }

//     public ArrayList<String> getComandos() {
//         ArrayList<String> comandos = new ArrayList<>();

//         for (int i = 0; i < iteraciones; i++) {
//             comandos.add(this.id);
//         }

//         return comandos;
//     }

// }
