package com.sinensia.cajondesastre.utilidades;

public class ValidadorDNITest {

	// *****************************************************
	//
	// Pruebas del validador de DNI
	//
	// *****************************************************
	
	public static void main(String[] args) {
			
		ValidadorDNI validadorDNI = new ValidadorDNI();
				
		String dni = "75152792Q"; //  "75152792Q", "67441240L"
				
		boolean valido = validadorDNI.validar(dni);

		if(valido) {
			System.out.println("El DNI " + dni + " es válido.");
		} else {
			System.out.println("El DNI " + dni + " no es válido.");
		}
	}

}
