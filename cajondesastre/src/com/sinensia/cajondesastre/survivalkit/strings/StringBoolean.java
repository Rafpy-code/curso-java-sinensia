package com.sinensia.cajondesastre.survivalkit.strings;

import java.util.Arrays;

public class StringBoolean {

	public static void main(String[] args) {
		
		System.out.println("Se inician las pruebas de la clase String");
		System.out.println("=========================================");
		System.out.println();
		
		// ***************** Conocer el tamaño de un String *****************************

		String nombre = "PePín GálvEZ ridRuejo";
		
		int numeroCaracteres = nombre.length();
		
		System.out.println("numeroCaracteres: " + numeroCaracteres);
		
		// ***************** Poner en Mayusc o Minusc un String *****************************
		
		String nombreMayusc = nombre.toUpperCase();
		String nombreMinusc = nombre.toLowerCase();
	
		System.out.println("En mayúscula: " + nombreMayusc);
		System.out.println("En minúscula: " + nombreMinusc);
		
		// ***************** Extraer un caracter de una determinada posición ****************
		
		char caracter = nombre.charAt(9);
		
		System.out.println("En la posición 9 hay el caracter: " + caracter);
		
		// ***************** Preguntar la posición que ocupa un determinado caracter ****************
		
		int posicion = nombre.indexOf("í");
		
		System.out.println("El caracter 'í' está en la posición: " + posicion);
		
		// ***************** Obtener un substring ****************
		
		String palabra1 = "tentáculo";
		String palabra2 = "cacahuete";
		//                 012345678
		
		// Para obtener un substring le he de decir desde dónde hasta dónde
		
		String substring1 = palabra1.substring(7);
		String substring2 = palabra2.substring(2,5);
		
		System.out.println("substring1: " + substring1);
		System.out.println("substring2: " + substring2);
		
		// ***************** Saber si un String contiene un sterminado substring ****************
		
		boolean test1 = palabra1.contains("tác");
		boolean test2 = palabra1.contains("xxxx");
		
		System.out.println("La palabra1 contiene 'tác': " + test1);
		System.out.println("La palabra1 contiene 'xxxx': " + test2);
		
		// ***************** Saber si un String está vacío ****************
		
		String direccion = "";
		
		boolean vacio = direccion.isEmpty();
		
		System.out.println("Dirección vacía: " + vacio);
		
		// ***************** Nos interesan 2 caracteres! Los de las posiciones 3 y 7 *******
		
		String mensaje = "Se ha producido un error muy grave!";
		
		// quiero que la respuesta sea "hr"? 
		// quiero que me devuelva una lista con esos dos carácteres?
		
		char caracter1 = mensaje.charAt(3);
		char caracter2 = mensaje.charAt(7);
		
		char[] caracteres = new char[] {caracter1, caracter2};
		
		System.out.println("Los caracters 3 y 7 en un array: " + Arrays.toString(caracteres));
		
		// ***************** Cómo iterar un String *******
		
		String frase = "You talking to me?";
		
		for(int i = 0; i < frase.length(); i++) {
			System.out.println(frase.charAt(i));
		}
		
	}
}
