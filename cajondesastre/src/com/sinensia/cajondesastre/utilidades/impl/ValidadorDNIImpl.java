package com.sinensia.cajondesastre.utilidades.impl;

import com.sinensia.cajondesastre.utilidades.ValidadorDNI;

public class ValidadorDNIImpl implements ValidadorDNI{

public boolean validar(String dni) {
		
		dni = dni.toUpperCase();
		
		if(dni.length() != 9) {
			return false;
		}
		
		for(int i = 0; i < 8; i++) {
			if(!Character.isDigit(dni.charAt(i))) {
				return false;
			}
		} 
		
		int numero = Integer.parseInt(dni.substring(0,8));
		int resto = numero % 23;
		char letra = dni.charAt(8);    
		char[] letras = new char[] {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		
		if(letras[resto] != letra) {
			return false;
		}
		
		return true;
	}
}
