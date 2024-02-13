package practico_7.practico_7_5;

public class ImprimirEnPantalla implements AccionEjecutable {

    @Override
    public void ejecutarNodo(Nodo o, String direccion, Nodo padre)  {
        System.out.println("Insertando " + o + " a la " + direccion + " de " + padre.getValor());
    }

}
