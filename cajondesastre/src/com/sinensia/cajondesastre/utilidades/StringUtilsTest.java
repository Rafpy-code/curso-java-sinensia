package com.sinensia.cajondesastre.utilidades;

public class StringUtilsTest {

	public static void main(String[] args) {
		
		StringUtils stringUtils = new StringUtils();
		
		int numeroPalabras = stringUtils.contarPalabras("Quien madruga Dios le ayuda.");
		String fraseOK = stringUtils.limpiarEspacios("  Esto     es un desastre      .");
		String frase = stringUtils.insertarNombre("Nuesto amigo {n} es muy agradable.", "Pepín");
		
		System.out.println("numero de palabras: " + numeroPalabras);
		System.out.println("frase sin espacios: " + fraseOK);
		System.out.println("frase con nombre insertado: " + frase);
		
	}

}
