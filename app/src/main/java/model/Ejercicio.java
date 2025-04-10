package model;

public class Ejercicio {
    private int id;
    private String nombre;
    private String grupo_muscular;
    private int repeticiones;
    private int series;

    public Ejercicio(){}
    public Ejercicio(int id, String nombre, String grupo_muscular, int repeticiones, int series) {
        this.id = id;
        this.nombre = nombre;
        this.grupo_muscular = grupo_muscular;
        this.repeticiones = repeticiones;
        this.series = series;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrupo_muscular() {
        return grupo_muscular;
    }

    public void setGrupo_muscular(String grupo_muscular) {
        this.grupo_muscular = grupo_muscular;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }
}
