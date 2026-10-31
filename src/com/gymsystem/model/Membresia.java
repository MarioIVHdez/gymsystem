package com.gymsystem.model;

public class Membresia {
	private int idMembresia;
    private String nombrePlan;
    private float costo;
    private int duracionDias;
    
    public Membresia(int idMembresia, String nombrePlan, float costo, int duracionDias) {
        this.idMembresia = idMembresia;
        this.nombrePlan = nombrePlan;
        this.costo = costo;
        this.duracionDias = duracionDias;
    }
    
    public boolean registrarPlan() {
              return true;
    }
    
    public int getIdMembresia() { return idMembresia; }
    public void setIdMembresia(int idMembresia) { this.idMembresia = idMembresia; }
    public String getNombrePlan() { return nombrePlan; }
    public void setNombrePlan(String nombrePlan) { this.nombrePlan = nombrePlan; }
    public float getCosto() { return costo; }
    public void setCosto(float costo) { this.costo = costo; }
    public int getDuracionDias() { return duracionDias; }
    public void setDuracionDias(int duracionDias) { this.duracionDias = duracionDias; }
}
