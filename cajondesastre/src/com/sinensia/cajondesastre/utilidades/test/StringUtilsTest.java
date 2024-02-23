package com.sinensia.cajondesastre.utilidades.test;

import com.sinensia.cajondesastre.utilidades.StringUtils;
import com.sinensia.cajondesastre.utilidades.impl.StringUtilsImpl;

public class StringUtilsTest {

	public static void main(String[] args) {
		
		StringUtils stringUtils = new StringUtilsImpl();
		
		int numeroPalabras = stringUtils.contarPalabras("Quien madruga Dios le ayuda.");
		String fraseOK = stringUtils.limpiarEspacios("  Esto     es un  auténtico       desastre    de    ejercicio         ");
		String frase1 = stringUtils.insertarNombre("Nuesto amigo {n} es muy agradable.", "Pepín");
		String frase2 = stringUtils.insertarNombre("Nuesto gran amigo {n} es muy agradable. Y se llama {n}", "Pepín");
		String frase3 = stringUtils.insertarNombre("{n} es ciertamente pesado.", "Pepín");
		
		
		System.out.println("numero de palabras: " + numeroPalabras);
		System.out.println("frase sin espacios: ->" + fraseOK + "<-");
		System.out.println("frase con nombre insertado: " + frase1);
		System.out.println("frase con nombre insertado: " + frase2);
		System.out.println("frase con nombre insertado: " + frase3);
		
	}

}
