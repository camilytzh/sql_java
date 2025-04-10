package model;

public class Inscripcion {
    private int id;
    private Cliente cliente;
    private Clase clase;
    public Inscripcion(){}

    public Inscripcion(int id, Cliente cliente, Clase clase) {
        this.id = id;
        this.cliente = cliente;
        this.clase = clase;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }
}
