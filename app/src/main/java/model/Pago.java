package model;

import java.util.Date;

public class Pago {
    private int id;
    private double monto;
    private Date fecha;
    private Cliente cliente;
    private Membresia membresia;

    public Pago(){}

    public Pago(int id, double monto, Date fecha, Cliente cliente, Membresia membresia) {
        this.id = id;
        this.monto = monto;
        this.fecha = fecha;
        this.cliente = cliente;
        this.membresia = membresia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Membresia getMembresia() {
        return membresia;
    }

    public void setMembresia(Membresia membresia) {
        this.membresia = membresia;
    }
}
