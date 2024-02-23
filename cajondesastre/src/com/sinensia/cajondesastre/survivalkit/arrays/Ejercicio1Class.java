package com.sinensia.cajondesastre.survivalkit.arrays;

public class Ejercicio1Class {

	public static void main(String[] args) {
		
		String nombre = "12345";
		String nombreInvertido = "";
		
		int longitud = nombre.length();							// la longitud es 3
															    // i = -1
		for (int i = longitud -1; i >= 0; i--) {				// nombreInvertido = "dcba"
			
			nombreInvertido = nombreInvertido + nombre.charAt(i); 
			
		}
		
		System.out.println(nombre);
		System.out.println(nombreInvertido);
	}
	
}