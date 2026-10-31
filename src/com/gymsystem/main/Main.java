package com.gymsystem.main;

import com.gymsystem.model.Membresia;
import com.gymsystem.model.Rol;
import com.gymsystem.model.Socio;
import com.gymsystem.model.Transaccion;
import com.gymsystem.model.Usuario;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		System.out.println("=== INICIANDO SISTEMA GYMSYSTEM ===");

		Rol rolSocio = new Rol(1, "SOCIO");

        
        Usuario usuarioSocio = new Usuario(1, "carlos_gym", "hash12345", rolSocio);

        
        Socio socio = new Socio(1, "Carlos Pérez", "carlos@email.com", "555-1234-5678", true, usuarioSocio);

        
        Membresia membresiaAnual = new Membresia(1, "Plan Anual VIP", 3500.0f, 365);

        
        Transaccion transaccion = new Transaccion(1, 3500.0f, new Date(), membresiaAnual.getDuracionDias(), "Tarjeta de Crédito", membresiaAnual);

        
        System.out.println("Socio registrado: " + socio.getNombreCompleto());
        System.out.println("Correo: " + socio.getEmail());
        System.out.println("Plan adquirido: " + membresiaAnual.getNombrePlan());
        System.out.println("Monto pagado: $" + transaccion.getMontoCobrado());
        System.out.println("Fecha de vencimiento calculada: " + transaccion.getFechaVencimiento());
        
        System.out.println("=== PRUEBA EXITOSA ===");

	}

}
