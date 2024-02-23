package com.sinensia.cajondesastre.flotataxi.model;

public class TestClass {

	public static void main(String[] args) {
	
		Persona p1 = new Cliente();
		Persona p2 = new Taxista();
		
		p1.setNombre("Honorio");
		p1.setApellido1("Martín");
		
		p2.setNombre("Carlota");
		p2.setApellido1("Cifuentes");
		
		System.out.println(p1);
		System.out.println(p2);
		
	}
	
}
