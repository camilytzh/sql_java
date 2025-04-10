package model;

public class EjericioRutina {
    private int id;
    private Rutina rutina;
    private Ejercicio ejercicio;
    public EjericioRutina(){}

    public EjericioRutina(int id, Rutina rutina, Ejercicio ejercicio) {
        this.id = id;
        this.rutina = rutina;
        this.ejercicio = ejercicio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Rutina getRutina() {
        return rutina;
    }

    public void setRutina(Rutina rutina) {
        this.rutina = rutina;
    }

    public Ejercicio getEjercicio() {
        return ejercicio;
    }

    public void setEjercicio(Ejercicio ejercicio) {
        this.ejercicio = ejercicio;
    }
}
