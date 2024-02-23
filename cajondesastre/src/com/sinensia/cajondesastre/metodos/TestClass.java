package com.sinensia.cajondesastre.metodos;

public class TestClass {

	public static void main(String[] args) {
		
		NavajaSuiza navajaSuiza = new NavajaSuiza();
		
		String rima = navajaSuiza.getRima(1);
		String resultadoMoneda = navajaSuiza.getCaraOCruz();  
		boolean validezDNI = navajaSuiza.comprobarDNI("36544534K");
		boolean contieneSubtexto = navajaSuiza.comprobarTexto("Carlota", "zo");
		int resultadoAleatorio1 = navajaSuiza.getNumeroAleatorio(10);
		int resultadoAleatorio2 = navajaSuiza.getNumeroAleatorio(10, 20);
		
		System.out.println("Rima: " + rima);
		System.out.println("resultadoMoneda: " + resultadoMoneda);
		System.out.println("DNI válido: " + validezDNI);
		System.out.println("contiene subtexto: " + contieneSubtexto);
		System.out.println("resultado aletario 1: " + resultadoAleatorio1);
		System.out.println("resultado aletario 2: " + resultadoAleatorio2);
		
	}

}
