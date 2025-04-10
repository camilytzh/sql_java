package model;

public class Clase {
    private int id;
    private String nombre;
    private Entrenador entrenador;
    private String horario;
    private int cupo;
    public Clase(){}

    public Clase(int id, String nombre, Entrenador entrenador, String horario, int cupo) {
        this.id = id;
        this.nombre = nombre;
        this.entrenador = entrenador;
        this.horario = horario;
        this.cupo = cupo;
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

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }
}
