package com.sinensia.cajondesastre.utilidades.test;

import com.sinensia.cajondesastre.utilidades.Capitalizador;
import com.sinensia.cajondesastre.utilidades.impl.CapitalizadorImpl;

public class CapitalizadorTest {

	// *****************************************************
	//
	// Pruebas del capitalizador
	//
	// *****************************************************	
	
	public static void main(String[] args) {
		
		Capitalizador capitalizador = new CapitalizadorImpl();
		
		String resultado = capitalizador.capitalizar("hoNorio mARTIN salVAdor");
		
		System.out.println("Nombre propio: " + resultado);

	}

}
