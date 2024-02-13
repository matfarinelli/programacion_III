
package practico_6.practico_6_2bis;

import java.util.ArrayList;
import java.util.Collections;

public class Sensor {

    private String nombre;
    private ArrayList<Double> registros;

    public Sensor(String nombre) {
        this.nombre = nombre;
        this.registros = new ArrayList<>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void addRegistro(double dato) {
        this.registros.add(dato);
    }

    public ArrayList<Double> getRegistros(int cantidad) {
        ArrayList<Double> registros_reverse = new ArrayList<>(this.registros);

        Collections.reverse(registros_reverse);

        // para no generar error
        int longitud = 0;
        if (cantidad < registros_reverse.size()) {
            longitud = cantidad;
        } else
            longitud = registros_reverse.size();

        ArrayList<Double> registros_cantidad = new ArrayList<>();

        for (int i = 0; i < longitud; i++) {
            double registro = registros_reverse.get(i);
            registros_cantidad.add(registro);
        }

        return registros_cantidad;

    }

    public double getMax() {
        return Collections.max(this.registros);
    }

    public double getMax(int cantidad_registros) {
        ArrayList<Double> registros_reverse = new ArrayList<>(this.registros);

        Collections.reverse(registros_reverse);

        if (this.registros.isEmpty()) {
            // Manejar el caso especial cuando no hay registros
            return 0.0; // O podrías lanzar una excepción, dependiendo del caso
        }

        // para no generar error
        int longitud = 0;
        if (cantidad_registros < registros_reverse.size()) {
            longitud = cantidad_registros;
        } else
            longitud = registros_reverse.size();

        ArrayList<Double> registros_cantidad = new ArrayList<>();

        for (int i = 0; i < longitud; i++) {
            double registro = registros_reverse.get(i);
            registros_cantidad.add(registro);
        }

        return Collections.max(registros_cantidad);
    }

    public double getMin() {
        return Collections.min(this.registros);
    }

    public double getMin(int cantidad_registros) {
        ArrayList<Double> registros_reverse = new ArrayList<>(this.registros);

        Collections.reverse(registros_reverse);

        // para no generar error
        int longitud = 0;
        if (cantidad_registros < registros_reverse.size()) {
            longitud = cantidad_registros;
        } else
            longitud = registros_reverse.size();

        ArrayList<Double> registros_cantidad = new ArrayList<>();

        for (int i = 0; i < longitud; i++) {
            double registro = registros_reverse.get(i);
            registros_cantidad.add(registro);
        }

        return Collections.min(registros_cantidad);
    }

    public double getLast() {
        return this.registros.get(this.registros.size() - 1);
    }

    public double getPromedio() {
        double suma = 0;

        for (double e : this.registros) {
            suma += e;
        }

        return suma / this.registros.size();

    }

    public double getPromedio(int cantidad_registros) {
        double suma = 0;
        ArrayList<Double> registros_reverse = new ArrayList<>(this.registros);

        Collections.reverse(registros_reverse);

        // para no generar error
        int longitud = 0;
        if (cantidad_registros < registros_reverse.size()) {
            longitud = cantidad_registros;
        } else
            longitud = registros_reverse.size();

        for (int i = 0; i < longitud; i++) {
            double e = registros_reverse.get(i);
            suma += e;
        }

        return suma / cantidad_registros;

    }
}
