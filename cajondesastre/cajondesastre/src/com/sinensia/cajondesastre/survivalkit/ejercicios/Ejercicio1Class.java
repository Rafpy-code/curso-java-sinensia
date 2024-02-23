package com.sinensia.cajondesastre.survivalkit.ejercicios;

public class Ejercicio1Class {

	public static void main(String[] args) {
		
		// Invertir un texto!
		
		//               0123
		String nombre = "Cualquier texto es invertido!";
		
		String resultado = "";
		
		for(int i = nombre.length() -1 ; i >= 0 ; i--) {
			
			resultado = resultado + nombre.charAt(i);
			
			System.out.println(resultado);
		}
		
		System.out.println("Resultado final: " + resultado);
	}
	
}