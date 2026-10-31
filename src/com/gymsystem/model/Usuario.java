package com.gymsystem.model;

public class Usuario {
	private int idUsuario;
    private String username;
    private String contrasenia;
    private Rol rol;
    
    public Usuario(int idUsuario, String username, String contrasenia, Rol rol) {
        this.idUsuario = idUsuario;
        this.username = username;
        this.contrasenia = contrasenia;
        this.rol = rol;
    }

    public boolean iniciarSesion(String user, String pass) {
        return this.username.equals(user) && this.contrasenia.equals(pass);
    }

    public int getIdUsuario() { return idUsuario; }
    public void setIdUsuario(int idUsuario) { this.idUsuario = idUsuario; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public Rol getRol() { return rol; }
    public void setRol(Rol rol) { this.rol = rol; }
}
