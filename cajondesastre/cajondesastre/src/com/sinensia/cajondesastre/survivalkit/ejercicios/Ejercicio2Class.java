package com.sinensia.cajondesastre.survivalkit.ejercicios;

public class Ejercicio2Class {

	public static void main(String[] args) {
		
		String dni = "74952578V";  // "88436436X", "75152792Q", "67441240L"
	
		boolean valido = validarDni(dni);
		
		System.out.println("El DNI " + dni + " es válido: " + valido);
		
	}
	
	
	public static boolean validarDni(String dni) {
		
		// 1.- Comprobar que la longitud es la correcta
		
		boolean longitudTotalOK = dni.length() == 9;
			
		
		
		
		// 2.- Validar que la primera parte sean números
				
		String strNumero = dni.substring(0, 8);
		boolean primaraParteSonNumeros = true;
				
		for(int i = 0; i < strNumero.length() -1; i++) {
					
			char caracter = strNumero.charAt(i);
					
			if (!Character.isDigit(caracter)) {
				primaraParteSonNumeros = false;
			}
		}
				
				
							
		// 3.- Validar que la ultima parte (el último caracter) sea una letra
				
		char letra = dni.charAt(8);
				
		boolean ultimoCaracterEsLetra = Character.isLetter(letra);
		
		
		
		
		
		// 4.- Si todo lo anterior es correcto, validar que la letra de control sea la correcta
		
		char[] letras = new char[] {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		
		int numero = Integer.parseInt(strNumero);
		int restoDivision = numero % 23;
		
		boolean valido = false;
		
		if (letra == letras[restoDivision]) {
			valido = true;
		}
		
		
		
				
				
		// **************************************************************************
		//
		// Mostramos por consola el resultado de las pruebas y retornamo el veredicto
		//
		// **************************************************************************
				 
				
		System.out.println("Longitud es 9: " + longitudTotalOK);
		System.out.println("La primera parte son números: " + primaraParteSonNumeros);
		System.out.println("El último caracter es una letra: " + ultimoCaracterEsLetra);
		System.out.println("Valido: " + valido);
		
		return valido;
	}
	
}