package com.sinensia.cajondesastre.utilidades;

public class CapitalizadorTest {

	// *****************************************************
	//
	// Pruebas del capitalizador
	//
	// *****************************************************	
	
	public static void main(String[] args) {
		
		Capitalizador capitalizador = new Capitalizador();
		
		String resultado = capitalizador.capitalizar("hoNorio mARTIN salVAdor");
		
		System.out.println("Nombre propio: " + resultado);

	}

}
