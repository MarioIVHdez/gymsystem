package com.gymsystem.main;

import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.List;
import com.gymsystem.model.Membresia;
import com.gymsystem.model.Rol;
import com.gymsystem.model.Socio;
import com.gymsystem.model.Transaccion;
import com.gymsystem.model.Usuario;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		System.out.println("=== INICIANDO SISTEMA GYMSYSTEM ===");

		Rol rolSocio = new Rol(1, "Socio");
        Usuario usuarioSocio = new Usuario(1, "carlos_perez", "hash_password_seguro", rolSocio);
		
        Socio socio = new Socio(1, "Carlos Pérez", "carlos@email.com", "555-1234-5678", true, usuarioSocio);        
        Membresia membresiaAnual = new Membresia(1, "Plan Anual VIP", 3500.0f, 365);
        
        Date fechaPago = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fechaPago);
        calendar.add(Calendar.DAY_OF_YEAR, membresiaAnual.getDuracionDias());
        Date fechaVencimiento = calendar.getTime();
        
        Transaccion transaccion = new Transaccion(5001, (float) membresiaAnual.getCosto(), fechaPago, membresiaAnual.getDuracionDias(), "Tarjeta de Crédito", membresiaAnual);
        
        System.out.println("Socio registrado: " + socio.getNombreCompleto());
        System.out.println("Correo: " + socio.getEmail());
        System.out.println("Plan adquirido: " + membresiaAnual.getNombrePlan());
        System.out.println("Monto pagado: $" + transaccion.getMontoCobrado());
        System.out.println("Fecha de vencimiento calculada: " + transaccion.getFechaVencimiento());
        
        List<String> historialAccesos = new ArrayList<>();
        historialAccesos.add("Acceso autorizado - Torniquete 1: " + socio.getNombreCompleto());
        System.out.println("Registro de acceso en tiempo real: " + historialAccesos.get(0));
        
        System.out.println("=== PRUEBA EXITOSA ===");

	}

}
