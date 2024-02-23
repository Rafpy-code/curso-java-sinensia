package com.sinensia.cajondesastre.validardni;

public class DniMain {
	
	public static void main(String[] args) {
		ValidadorDni validadorDni = new ValidadorDni("48777760d");
		
		System.out.println(validadorDni.validar());
		
	}
	
}
