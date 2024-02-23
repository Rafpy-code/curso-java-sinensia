package com.sinensia.cajondesastre.utilidades.impl;

import com.sinensia.cajondesastre.utilidades.Capitalizador;

public class CapitalizadorImpl implements Capitalizador{

	public String capitalizar(String nombre) {
		
		String resultado = "";
		
		nombre = nombre.toLowerCase();
		
		String[] partes = nombre.split(" ");
		
		for(String parte: partes) {
			String primeraLetra = parte.substring(0, 1).toUpperCase();
			resultado += primeraLetra + parte.substring(1, parte.length()) + " ";
		}
		
		return resultado.trim();
	}
	
}
