package model;

public class Membresia {
    private int id;
    private TipoMembresia tipoMembresia;
    private double costo;
    private int duracion;

    public Membresia(){}

    public Membresia(int id, TipoMembresia tipoMembresia, double costo, int duracion) {
        this.id = id;
        this.tipoMembresia = tipoMembresia;
        this.costo = costo;
        this.duracion = duracion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoMembresia getTipoMembresia() {
        return tipoMembresia;
    }

    public void setTipoMembresia(TipoMembresia tipoMembresia) {
        this.tipoMembresia = tipoMembresia;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
