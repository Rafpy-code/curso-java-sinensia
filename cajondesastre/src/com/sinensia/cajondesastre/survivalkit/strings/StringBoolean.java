package com.sinensia.cajondesastre.survivalkit.strings;

import java.util.Arrays;

public class StringBoolean {

	public static void main(String[] args) {
		
		System.out.println("Se inician las pruebas de la clase String");
		System.out.println("=========================================");
		System.out.println();
		
		// ***************** Conocer el tama�o de un String *****************************

		String nombre = "PeP�n G�lvEZ ridRuejo";
		
		int numeroCaracteres = nombre.length();
		
		System.out.println("numeroCaracteres: " + numeroCaracteres);
		
		// ***************** Poner en Mayusc o Minusc un String *****************************
		
		String nombreMayusc = nombre.toUpperCase();
		String nombreMinusc = nombre.toLowerCase();
	
		System.out.println("En may�scula: " + nombreMayusc);
		System.out.println("En min�scula: " + nombreMinusc);
		
		// ***************** Extraer un caracter de una determinada posici�n ****************
		
		char caracter = nombre.charAt(9);
		
		System.out.println("En la posici�n 9 hay el caracter: " + caracter);
		
		// ***************** Preguntar la posici�n que ocupa un determinado caracter ****************
		
		int posicion = nombre.indexOf("�");
		
		System.out.println("El caracter '�' est� en la posici�n: " + posicion);
		
		// ***************** Obtener un substring ****************
		
		String palabra1 = "tent�culo";
		String palabra2 = "cacahuete";
		//                 012345678
		
		// Para obtener un substring le he de decir desde d�nde hasta d�nde
		
		String substring1 = palabra1.substring(7);
		String substring2 = palabra2.substring(2,5);
		
		System.out.println("substring1: " + substring1);
		System.out.println("substring2: " + substring2);
		
		// ***************** Saber si un String contiene un sterminado substring ****************
		
		boolean test1 = palabra1.contains("t�c");
		boolean test2 = palabra1.contains("xxxx");
		
		System.out.println("La palabra1 contiene 't�c': " + test1);
		System.out.println("La palabra1 contiene 'xxxx': " + test2);
		
		// ***************** Saber si un String est� vac�o ****************
		
		String direccion = "";
		
		boolean vacio = direccion.isEmpty();
		
		System.out.println("Direcci�n vac�a: " + vacio);
		
		// ***************** Nos interesan 2 caracteres! Los de las posiciones 3 y 7 *******
		
		String mensaje = "Se ha producido un error muy grave!";
		
		// quiero que la respuesta sea "hr"? 
		// quiero que me devuelva una lista con esos dos car�cteres?
		
		char caracter1 = mensaje.charAt(3);
		char caracter2 = mensaje.charAt(7);
		
		char[] caracteres = new char[] {caracter1, caracter2};
		
		System.out.println("Los caracters 3 y 7 en un array: " + Arrays.toString(caracteres));
		
		// ***************** C�mo iterar un String *******
		
		String frase = "You talking to me?";
		
		for(int i = 0; i < frase.length(); i++) {
			System.out.println(frase.charAt(i));
		}
		
	}
}
