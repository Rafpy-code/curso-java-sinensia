package com.example.demo.services.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.services.NumberFormatter;

@Service
public class NumberFormatterImpl implements NumberFormatter {

	private static final Map<Integer,String> UNIDADES = new HashMap<>();
	private static final Map<Integer,String> DECENAS = new HashMap<>();
	private static final Map<Integer,String> CENTENAS = new HashMap<>();
	private static final Map<Integer,String> EXCEPCIONES = new HashMap<>();
	
	static {
		
		UNIDADES.put(0,"");
		UNIDADES.put(1,"uno");
		UNIDADES.put(2,"dos");
		UNIDADES.put(3,"tres");
		UNIDADES.put(4,"cuatro");
		UNIDADES.put(5,"cinco");
		UNIDADES.put(6,"seis");
		UNIDADES.put(7,"siete");
		UNIDADES.put(8,"ocho");
		UNIDADES.put(9,"nueve");
		
		DECENAS.put(0,"");
		DECENAS.put(1,"diez");
		DECENAS.put(3,"treinta");
		DECENAS.put(4,"cuarenta");
		DECENAS.put(5,"cincuenta");
		DECENAS.put(6,"sesenta");
		DECENAS.put(7,"setenta");
		DECENAS.put(8,"ochenta");
		DECENAS.put(9,"noventa");
		
		CENTENAS.put(0, "");
		CENTENAS.put(1, "ciento");       	
		CENTENAS.put(2, "doscientos");		
		CENTENAS.put(3, "trescientos");		
		CENTENAS.put(4, "cuatrocientos");	
		CENTENAS.put(5, "quinientos");		
		CENTENAS.put(6, "seiscientos");		
		CENTENAS.put(7, "setecientos");		
		CENTENAS.put(8, "ochocientos");		
		CENTENAS.put(9, "novecientos");		
		
		EXCEPCIONES.put(10, "diez");
		EXCEPCIONES.put(11, "once");
		EXCEPCIONES.put(12, "doce");
		EXCEPCIONES.put(13, "trece");
		EXCEPCIONES.put(14, "catorce");
		EXCEPCIONES.put(15, "quince");
		EXCEPCIONES.put(16, "dieciséis");
		EXCEPCIONES.put(17, "diecisiete");
		EXCEPCIONES.put(18, "dieciocho");
		EXCEPCIONES.put(19, "diecinueve");
		EXCEPCIONES.put(20, "veinte");
		EXCEPCIONES.put(21, "veintiuno");  
		EXCEPCIONES.put(22, "veintidos");
		EXCEPCIONES.put(23, "veintitres");
		EXCEPCIONES.put(24, "veinticuatro");
		EXCEPCIONES.put(25, "veinticinco");
		EXCEPCIONES.put(26, "veintiséis");
		EXCEPCIONES.put(27, "veintisiete");
		EXCEPCIONES.put(28, "veintiocho");
		EXCEPCIONES.put(29, "veintinueve");
	
	}
	
	@Override
	public String convert(int number) {
		
		if (number < 0) {
			throw new IllegalArgumentException("El argumento " + number + " no es válido. Sólo se admiten valores positivos.");
		}
		
		if (number == 0) {
			return "cero";
		}
		
		/*
		 * 		  A   B   C   D
		 * 		 ---+---+---+---
		 * 		   2 456 421 349  <-- El número se trocea en cuatro partes
		 */
	
		final int A = number / 1000000000 % 1000;
		final int B = number / 1000000 % 1000;
		final int C = number / 1000 % 1000;
		final int D = number % 1000;
		
		String strA = "";
		String strB = "";
		String strC = "";
		
		if (A != 0) {
			
			if(A == 1) {
				strA = (B == 0) ? "mil millones " : " mil ";
			} else {
				strA = convertFrom0To999(A) + " mil ";
			}
			
		} 
		
		if(B != 0) {
			strB = (B == 1) ? "un millón " : convertFrom0To999(B) + " millones ";
		}
		
		if(C != 0) {
			strC = (C == 1) ? "mil " : convertFrom0To999(C) + " mil ";
		}
	
		return (strA + strB + strC + convertFrom0To999(D)).trim();
	}
	
	// ***************************************************************
	//
	// PRIVATE METHODS
	//
	// ***************************************************************
	
	private String convertFrom0To999(int numero) {
		
		if (numero == 100) {
			return "cien";
		}
		
		if (numero == 0) {
			return "";
		}
		
		String resultado = "";
		
		final int CENTENA =  numero / 100;
		final int DECENA = numero % 100 / 10;
		final int UNIDAD =  numero % 100 % 10;
		final int DECENA_UNIDAD = DECENA * 10 + UNIDAD;			
					
		resultado = CENTENAS.get(CENTENA) + " ";
		
		if (DECENA_UNIDAD > 10 && DECENA_UNIDAD < 30) {
			
			resultado = resultado + EXCEPCIONES.get(DECENA_UNIDAD);
			
		} else {
			
			String conjuncion = (DECENA == 0 || UNIDAD == 0) ? "" : " y ";
			
			resultado = resultado + DECENAS.get(DECENA) + conjuncion + UNIDADES.get(UNIDAD);
	
		}
		
		return resultado.trim();
	}

}
