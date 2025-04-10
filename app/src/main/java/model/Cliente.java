package model;

import java.time.LocalDate;

public class Cliente{
    private Usuario usuario;
    private Membresia membresia;
    private EstadoMembresia estadoMembresia;
    private LocalDate fechaInicioMembresia;
    private LocalDate fechaFinMembresia;
    public Cliente(){}

    public Cliente(Usuario usuario, Membresia membresia, EstadoMembresia estadoMembresia, LocalDate fechaInicioMembresia, LocalDate fechaFinMembresia) {
        this.usuario = usuario;
        this.membresia = membresia;
        this.estadoMembresia = estadoMembresia;
        this.fechaInicioMembresia = fechaInicioMembresia;
        this.fechaFinMembresia = fechaFinMembresia;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Membresia getMembresia() {
        return membresia;
    }

    public void setMembresia(Membresia membresia) {
        this.membresia = membresia;
    }

    public EstadoMembresia getEstadoMembresia() {
        return estadoMembresia;
    }

    public void setEstadoMembresia(EstadoMembresia estadoMembresia) {
        this.estadoMembresia = estadoMembresia;
    }

    public LocalDate getFechaInicioMembresia() {
        return fechaInicioMembresia;
    }

    public void setFechaInicioMembresia(LocalDate fechaInicioMembresia) {
        this.fechaInicioMembresia = fechaInicioMembresia;
    }

    public LocalDate getFechaFinMembresia() {
        return fechaFinMembresia;
    }

    public void setFechaFinMembresia(LocalDate fechaFinMembresia) {
        this.fechaFinMembresia = fechaFinMembresia;
    }
}
