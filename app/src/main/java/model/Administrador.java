package model;

public class Administrador{
    private Usuario usuario;
    private String cargo;
    public Administrador(){}

    public Administrador(Usuario usuario, String cargo) {
        this.usuario = usuario;
        this.cargo = cargo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
