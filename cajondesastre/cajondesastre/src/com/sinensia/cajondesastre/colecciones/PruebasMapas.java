package com.sinensia.cajondesastre.colecciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PruebasMapas {

	public static void main(String[] args) {
		
		Map<String,String> diccionario = new HashMap<>();
		
		diccionario.put("martes", "terça feira");
		diccionario.put("ordenador", "computador");
		diccionario.put("fiesta", "festa");
		
		System.out.println("Número de palabras: " + diccionario.size());
		System.out.println("Martes en portugués: " + diccionario.get("martes"));
		
		// Vamos a iterar todo el mapa...
		
		// 1.- Necesitamos la "bolsa" con las llaves. Cuando tengamos la bolsa, iteraremos la bolsa y con cada llave recuperaremos el valor.
		
		Set<String> claves = diccionario.keySet();
		
		for(String clave: claves) {
			System.out.println(clave + " ----> " + diccionario.get(clave));
		}
		
		// 2.- Iteramos directamente la colección de valores, prescindiendo de las llaves
		
		for(String value: diccionario.values()) {
			System.out.println("VALUE: " + value);
		}

	}
}
