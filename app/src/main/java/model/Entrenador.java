package model;

public class Entrenador{
    private Usuario usuario;
    private String especialidad;
    public Entrenador(){}

    public Entrenador(Usuario usuario, String especialidad) {
        this.usuario = usuario;
        this.especialidad = especialidad;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
