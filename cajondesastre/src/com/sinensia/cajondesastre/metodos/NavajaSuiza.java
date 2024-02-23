package com.sinensia.cajondesastre.metodos;

public class NavajaSuiza {

	int getNumeroAleatorio(int maximo) {
		
		//TODO
		
		return 0;
	}
	
	int getNumeroAleatorio(int minimo, int maximo) {
		
		//TODO
		
		return 0;
	}
	
	String getCaraOCruz() {
		
		String resultado = null;
		
		double numeroAleatorio = Math.random(); // devuelve numero ente [0..1)
		
		if(numeroAleatorio > 0.8) {
			resultado = "CARA";
		} else {
			resultado = "CRUZ";
		}
		
		return resultado;
	}
	
	String getRima(int cifra) {
		
		String rima = null;
		
		switch(cifra) {
			case 1: rima = "Toca la guitarra un tuno"; break;
			case 2: rima = "Toca el piano como Dios"; break;
			case 3: rima = "Ya lo vés"; break;
			case 4: rima = "Espera un rato"; break;
			case 5: rima = "Salta y da un brinco"; break;
			case 6: rima = "EYa lo veis"; break;
			case 7: rima = "Anda y vete"; break;
			case 8: rima = "Come bizcocho"; break;
			case 9: rima = "A ver si se mueve"; break;
		}
		
		return rima;
	}
	
	boolean comprobarTexto(String texto, String subtexto) {
		
		//TODO
		
		return true;
	}
	
	boolean comprobarDNI(String DNI) {
		
		//TODO
		
		return true;
	}
}
