package com.gymsystem.model;

import java.util.Date;

public class Transaccion {
	private int idTransaccion;
    private float montoCobrado;
    private Date fechaPago;
    private Date fechaVencimiento;
    private String metodoPago;
    private Membresia membresia;
    
    public Transaccion(int idTransaccion, float montoCobrado, Date fechaPago, int duracionDias, String metodoPago, Membresia membresia) {
        this.idTransaccion = idTransaccion;
        this.montoCobrado = montoCobrado;
        this.fechaPago = fechaPago;
        this.fechaVencimiento = calcularVencimiento(fechaPago, duracionDias);
        this.metodoPago = metodoPago;
        this.membresia = membresia;
    }
    
    public boolean procesarCobro() {
        return true;
    }

    public Date calcularVencimiento(Date fechaPago, int duracionDias) {
        // Lógica para sumar días a la fecha de pago y determinar la vigencia
        long millisPorDia = 24L * 60 * 60 * 1000;
        return new Date(fechaPago.getTime() + (duracionDias * millisPorDia));
    }

    public int getIdTransaccion() { return idTransaccion; }
    public void setIdTransaccion(int idTransaccion) { this.idTransaccion = idTransaccion; }
    public float getMontoCobrado() { return montoCobrado; }
    public void setMontoCobrado(float montoCobrado) { this.montoCobrado = montoCobrado; }
    public Date getFechaPago() { return fechaPago; }
    public Date getFechaVencimiento() { return fechaVencimiento; }
    public String getMetodoPago() { return metodoPago; }
    public void setMetodoPago(String metodoPago) { this.metodoPago = metodoPago; }
}
