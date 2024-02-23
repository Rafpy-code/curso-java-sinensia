package com.sinensia.cajondesastre.utilidades;

public class TestClass {

	public static void main(String[] args) {
	
		// *****************************************************
		//
		// Pruebas del vcapitalizador
		//
		// *****************************************************	
		
		ValidadorDNI validadorDNI = new ValidadorDNI();
		Capitalizador capitalizador = new Capitalizador();
		
		String resultado = capitalizador.capitalizador("    hoNorio prueba de lo que estamos repasando   ");
		
		System.out.println("Nombre propio: " + resultado);
		
		
		// *****************************************************
		//
		// Pruebas del validador de DNI
		//
		// *****************************************************
		
		String dni = "45R52792Q"; //  "75152792Q", "67441240L"
		
		boolean valido = validadorDNI.validar(dni);

		if(valido) {
			System.out.println("El DNI " + dni + " es válido.");
		} else {
			System.out.println("El DNI " + dni + " no es válido.");
		}
		
	}

}
