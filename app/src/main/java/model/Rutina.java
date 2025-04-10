package model;

public class Rutina {
    private int id;
    private Entrenador entrenador;
    private Cliente cliente;
    private String descripcion;

    public Rutina(){}

    public Rutina(int id, Entrenador entrenador, Cliente cliente, String descripcion) {
        this.id = id;
        this.entrenador = entrenador;
        this.cliente = cliente;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
