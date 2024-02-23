package com.sinensia.cajondesastre.survivalkit.flowcontrol;

public class IfElseTernario {

	public static void main(String[] args) {
		
		// Ejemplo de "if" b�sico
		
		int nota = 4;
		String resultado = null;
		
		if(nota >= 5) {
			//
			//
			resultado = "APROBADO";
		} else {
			//
			resultado = "SUSPENDIDO";
			//
		}
		
		System.out.println("Con la nota " + nota + " el resultado es: " + resultado);
		
		// ***************************************************************************
		
		// Mala pr�ctica con el if (lo he visto en gente que lleva tiempo programando)
		
		boolean tienePermiso = true;
		
	//	if(tienePermiso == true) {						// As� NO!
		
		if(tienePermiso) {
			
			System.out.println("Tiene permiso!");
			
		} else {
			
			System.out.println("NO tiene permiso.");
		}
		
		// ***************************************************************************
		// Para establecer el valor de una variable en funci�n de una condici�n se utiliza el operador ternario
		//
		//
		// La sintaxis es:    condicion ? valor que se retorna cuando se cumple : valor que se retorna cuando no se cumple
		
		int nivelCalidad = 6;
		
		String certificacion = (nivelCalidad >= 5) ? "PASS" : "FAIL"; 
		
		System.out.println("Cerficaci�n: " + certificacion);

		// ***************************************************************************
		
		// Nunca hacer lo siguiente!!!!!! El if, aunque s�lo tenga una sentencia debe estar con llaves
		
		boolean mostrarTexto = false;
		
		if (mostrarTexto) System.out.println("*********** HOLA! *********");
		
		/*
		 *  Operadores l�gicos
		 * 
		 *  a > b        mayor que     
		 *    ==         igual
		 *    >=         mayor o igual
		 *    <=         menor o igual
		 *    <          menor que
		 *    !=         diferente a 
		 *    &&         AND
		 *    ||         OR
		 */

		// ***************************************************************************
		// Ejemplo de expresi�n con operadores l�gicos    Voy al futbol?
		
		boolean tengoEntradas = false;
		boolean tengoTrabajo = false;
		boolean miPrimoMeDejaCarnets = false;
		boolean miMujerMeDejaIr = true;
		
		boolean voyAlFutbol = (miPrimoMeDejaCarnets || tengoEntradas) && !tengoTrabajo && miMujerMeDejaIr;
		
		System.out.println(voyAlFutbol ? "VOY" : "NO VOY");
		
		
	}

}
