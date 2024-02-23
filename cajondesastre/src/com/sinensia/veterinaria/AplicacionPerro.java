package com.sinensia.veterinaria;



import java.util.Date;

import com.sinensia.veterinaria.modelo.Perro;
import com.sinensia.veterinaria.modelo.Raza;

public class AplicacionPerro {

	public static void main(String[] args) {
		
		Perro perro = new Perro();
		
		perro.setCodigoIdentificador("Cat000");
		perro.setNombre("Rufus");
		perro.setFechaNacimiento(new Date());
		perro.setRaza(Raza.COBRADORES);
		perro.setPeso(15.7);
		perro.setSeguro(true);
		
		Perro perro1 = new Perro("cat.001", "Furus", new Date(), Raza.SABUESO, 3.9, false,5);
		
		System.out.println("=====================Perro creado por set====================");
		System.out.println(perro);
		System.out.println("=====================Perro creado por constructor====================");
		System.out.println(perro1);
		System.out.println("=========================================");
	}
	
}
