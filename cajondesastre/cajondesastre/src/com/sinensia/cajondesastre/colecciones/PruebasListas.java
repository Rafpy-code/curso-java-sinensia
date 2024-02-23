package com.sinensia.cajondesastre.colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class PruebasListas {

	public static void main(String[] args) {
		
		// 1.- Creamos una lista (vacía)
		
		List<String> nombres = new ArrayList<>();
		
		System.out.println("Número de elementos: " + nombres.size());
		
		// 2.- Añadimos elementos
		
		nombres.add("Pepín");
		nombres.add("Honorio");
		nombres.add("Carlota");
		nombres.add("Anna");
		
		System.out.println("Número de elementos: " + nombres.size());
		
		nombres.add("Anna");
		
		System.out.println("Número de elementos: " + nombres.size());
		
		// 3.- Vaciamos toda la lista
		
		nombres.clear();
		
		System.out.println("Número de elementos: " + nombres.size());
		
		nombres.add("Pepín");
		nombres.add("Honorio");
		nombres.add("Carlota");
		nombres.add("Anna");
		
		// 4.- Solicitamos el elementos i-esimo (por ej. el 2)
		
		String nombre2 = nombres.get(2);
		
		System.out.println("El elmento 2 es: " + nombre2);
		
		// 5.- "Pintamos" la lista de golpe
		
		System.out.println(nombres);
		
		// 6.- Reorganizamos los elementos de forma aleatoria
		
		Collections.shuffle(nombres);
		
		System.out.println(nombres);
		
		// 7.- Ordenamos la lista en orden "natural"
		
		Collections.sort(nombres);
		
		System.out.println(nombres);
		
		// 8.- Vamos a iterar (leer uno a uno) usando un índice
		
		for(int i = 0; i < nombres.size(); i++) {
			System.out.println(i + ": " + nombres.get(i));
		}
		
		// 9.- Vamos a iterar (leer uno a uno) sin que nos importe el indice
		
		for(String nombre: nombres) {
			System.out.println("------------> " + nombre);
		}
		
		// 10.- Vamos a iterar (leer uno a uno) con el aparato especial Iterator
		
		Iterator<String> iterador = nombres.iterator();
		
		while(iterador.hasNext()) {
			String nombre = iterador.next();
			System.out.println("= = = = = = = = = => " + nombre);
		}
		
		// iterador.next();  // qué pasara?
		
		
	}
}
