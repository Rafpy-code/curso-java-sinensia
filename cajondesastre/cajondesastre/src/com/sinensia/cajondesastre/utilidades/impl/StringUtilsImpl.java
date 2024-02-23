package com.sinensia.cajondesastre.utilidades.impl;

import com.sinensia.cajondesastre.utilidades.StringUtils;

public class StringUtilsImpl implements StringUtils{

	public int contarPalabras(String frase) {
		return frase.split(" ").length;
	}

	public String limpiarEspacios(String frase) {
		
		frase = frase.trim();    	// Con esto quitamos espacios en blanco que pudieran haber al principio y/o final de la frase
		
		String resultado = "";
		
		boolean skipSiguientesEspacios = false;
		
		for(int i = 0; i < frase.length(); i++) {
			
			char caracter = frase.charAt(i);
			
			if (caracter != ' ') {
				resultado += caracter;
				skipSiguientesEspacios = false;
			} else {
				if(!skipSiguientesEspacios) {
					resultado += caracter;
					skipSiguientesEspacios = true;
				}
			}
		}
		
		return resultado;
	}
	
	public String insertarNombre(String frase, String nombre) {
		return frase.replace("{n}", nombre);
	}
	
	
}
