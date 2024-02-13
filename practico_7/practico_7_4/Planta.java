package practico_7.practico_7_4;

import java.util.HashSet;

public class Planta implements Comparable<Planta>{

    private String nombre;
    private HashSet<String> nombres_vulgares;
    private String clasificacion;
    private String familia;
    private String clase;
    private Boolean isInterior;
    private int riego;
    private int sol;

    public Planta(String nombre, String clasificacion, String familia, String clase,
            Boolean isInterior, int riego, int sol) {
        this.nombre = nombre;
        this.nombres_vulgares = new HashSet<>();
        this.clasificacion = clasificacion;
        this.familia = familia;
        this.clase = clase;
        this.isInterior = isInterior;
        this.setRiego(riego);
        this.setSol(sol);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<String> getNombres_vulgares() {
        return nombres_vulgares;
    }

    public void setNombres_vulgares(HashSet<String> nombres_vulgares) {
        this.nombres_vulgares = nombres_vulgares;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public Boolean getIsInterior() {
        return isInterior;
    }

    public void setIsInterior(Boolean isInterior) {
        this.isInterior = isInterior;
    }

    public int getRiego() {
        return riego;
    }

    public void setRiego(int riego) {
        if (riego > 9) {
            this.riego = 9;
        } else if (riego < 1) {
            this.riego = 1;
        } else
            this.riego = riego;

    }

    public int getSol() {
        return sol;
    }

    public void setSol(int sol) {
        if (sol > 9) {
            this.sol = 9;
        } else if (sol < 1) {
            this.sol = 1;
        } else
            this.sol = sol;
    }

    @Override
    public boolean equals(Object o) {
        try {
            Planta p = (Planta) o;

            return this.getNombre().equals(p.getNombre()) &&
                    this.getClasificacion().equals(p.getClasificacion()) &&
                    this.getClase().equals(p.getClase()) &&
                    this.getFamilia().equals(p.getFamilia());

        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public String toString() {
        return this.nombre;
    }

    @Override
    public int compareTo(Planta o) {
        return this.nombre.compareTo(o.getNombre());
    }

}
