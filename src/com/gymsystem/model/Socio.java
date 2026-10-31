package com.gymsystem.model;

public class Socio {
	private int idSocio;
    private String nombreCompleto;
    private String email;
    private String telefono;
    private boolean estatusActivo;
    private Usuario usuario;

    public Socio(int idSocio, String nombreCompleto, String email, String telefono, boolean estatusActivo, Usuario usuario) {
        this.idSocio = idSocio;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.telefono = telefono;
        this.estatusActivo = estatusActivo;
        this.usuario = usuario;
    }

    public boolean crearSocio() {
        return true;
    }

    public Socio obtenerDatosSocio() {
        return this;
    }

    public boolean actualizarSocio() {
        return true;
    }

    public int getIdSocio() { return idSocio; }
    public void setIdSocio(int idSocio) { this.idSocio = idSocio; }
    public String getNombreCompleto() { return nombreCompleto; }
    public void setNombreCompleto(String nombreCompleto) { this.nombreCompleto = nombreCompleto; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    public boolean isEstatusActivo() { return estatusActivo; }
    public void setEstatusActivo(boolean estatusActivo) { this.estatusActivo = estatusActivo; }
}
