package practico_6.practico_6_4;

import java.util.ArrayList;

public class Centro {

    private String nombre;
    private ArrayList<Computadora> computadoras;
    private ArrayList<Proceso> procesos;

    public Centro(String nombre) {
        this.nombre = nombre;
        this.computadoras = new ArrayList<>();
        this.procesos = new ArrayList<>();
    }

    public String getNombre() {
        return this.nombre;
    }

    // requieren equals
    public void addProceso(Proceso procesoNuevo) {
        if (!this.procesos.contains(procesoNuevo)) {
            // debe insertar ordenado
            if (this.procesos.isEmpty()) {
                this.procesos.add(procesoNuevo);
                return;
            }
            
            // proceso de ordenado
            boolean encontrado = false;
            int i = 0;

            while (!encontrado && i < this.procesos.size()) {
                Proceso proceso = this.procesos.get(i);

                // siempre se pondrá primero el que mas requiera
                if (proceso.getRequerimientoMemoria() < procesoNuevo.getRequerimientoMemoria()) {
                    this.procesos.add(i, procesoNuevo);
                    encontrado = true;
                    return; // creo que no es necesario xq con el encontrado en true, ya no se cumple el while
                }

                i++;
            }

            this.procesos.add(procesoNuevo);
        }
    }

    public void removerProceso(Proceso procesoEjecutado) {
        if (this.procesos.contains(procesoEjecutado)) {
            this.procesos.remove(procesoEjecutado);
        }
    }

    public void addComputadora(Computadora computadoraNueva) {

        if (this.computadoras.isEmpty()) {
            this.computadoras.add(computadoraNueva);
            return;
        }

        if (!this.computadoras.contains(computadoraNueva)) {

            boolean encontrado = false;
            int i = 0;

            while (!encontrado && i < this.computadoras.size()) {

                if (this.computadoras.get(i).getMemoria() < computadoraNueva.getMemoria()) {
                    this.computadoras.add(i, computadoraNueva);
                    encontrado = true;
                    return;
                }
                i++;
            }

            this.computadoras.add(computadoraNueva);
        }
    }

    public ArrayList<Proceso> getProcesos() {
        return new ArrayList<>(this.procesos);
    }

    public ArrayList<Computadora> getComputadoras() {
        return new ArrayList<>(this.computadoras);
    }

    public void ejecutarProcesos() {

        ArrayList<Proceso> procesosAEliminar = new ArrayList<>();

        for (Proceso p : this.procesos) {
            // recorro buscando compu disponibles que ya están ordenadas por rapidez
            for (Computadora c : this.computadoras) {

                if (c.isDisponible()) {
                    c.ejecutarProceso(p);
                    procesosAEliminar.add(p);
                    break; // necesito romper el bucle para iterar entre procesos
                }
            }

        }

        this.procesos.removeAll(procesosAEliminar);
    }

    public static void main(String[] args) {

        Centro centro_computos = new Centro("UNICEN");

        Proceso p1 = new Proceso(10);
        Proceso p2 = new Proceso(1);
        Proceso p3 = new Proceso(5);
        Proceso p4 = new Proceso(12);

        Proceso[] procesos = { p1, p2, p3, p4 };

        for (Proceso proceso : procesos) {
            centro_computos.addProceso(proceso);
        }

        System.out.println(centro_computos.getProcesos());

        Computadora c1 = new Computadora("Server", 1024);
        Computadora c2 = new Computadora("Contaduría", 2048);
        Computadora c3 = new Computadora("Secretaría", 512);

        Computadora[] Computadora = { c1, c2, c3 };

        for (Computadora computadora : Computadora) {
            centro_computos.addComputadora(computadora);
        }

        System.out.println(centro_computos.getComputadoras());

        // c2.setDisponible(false);
        centro_computos.ejecutarProcesos();

    }
}
