package com.sinensia.cajondesastre.model;

import java.util.Date;

public class TestClass {

	public static void main(String[] args) {

		Perro perro = new Perro();
		
		perro.setChip("5677Y5R");
		perro.setNombre("Baldrich");
		perro.setRaza("Tekel");
		perro.setPeso(7.3);
		perro.setAsegurado(true);
		perro.setFechaNacimiento(new Date());
		
		System.out.println(perro);
		
	
		
		System.out.println("La vida media de los perros es: " + Perro.ESPERANZA_VIDA);
		
		Producto p1 = new Producto();
		
		// Setear valors
		
		p1.setCodigo(1000);
		p1.setNombre("Impresora Laser HP 2p PLUS");
		p1.setFamilia(Familia.HARDWARE);
		p1.setFechaAlta(new Date());
		p1.setPrecio(350.0);
		p1.setDescatalogado(false);
		
		// Imprimir toString()
		
		System.out.println(p1);
		
		// Obtener valores
		
		System.out.println("El producto vale " + p1.getPrecio() + " euros.");
		
	}

}
