package com.sinensia.gestionvehiculos.consultas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.sinensia.gestionvehiculos.basedatos.BaseDatosCoches;
import com.sinensia.gestionvehiculos.model.Coche;

public class TestClass {

	public static void consulta1() {
		Map<String,Coche> COCHES = BaseDatosCoches.getMapaCoches();
		
		// Obtener un listado de coches de una marca determinada
		
		List<Coche> coches = new ArrayList<>();			// Creamos el resultado (vacío)
		
		Collection<Coche> coleccion_coches = COCHES.values();
		
		for(Coche coche: coleccion_coches) {				// Iteramos todos los coches del mapa
			if(coche.getMarca().equals("Volkswagen")) {		// Comprobamos si el coche cumple la condición
				coches.add(coche);							// Si cumple la condición lo "metemos en el saco"
			}
		}
		
		pintarResultado(coches);					// Aquí ya tenemos el resultado. Lo "pintamos"
		
	}
	
	public static void consulta2() {
		Map<String,Coche> COCHES = BaseDatosCoches.getMapaCoches();
		
		// Obtener un listado de coches de un precio inferior a un precio dado
		
		List<Coche> coches = new ArrayList<>();
		
		for(Coche coche: COCHES.values()) {
			if (coche.getPrecio() < 8000) {
				coches.add(coche);
			}
		}
		
		pintarResultado(coches);
	}
	
	public static void consulta3() {
		Map<String,Coche> COCHES = BaseDatosCoches.getMapaCoches();
		
		List<Coche> coches = new ArrayList<>();
		
		for(Coche coche: COCHES.values()) {
			if(coche.isSiniestrado()) {
				coches.add(coche);
			}
		}
		
		pintarResultado(coches);
		
	}
	
	public static void consulta4() {
		Map<String,Coche> COCHES = BaseDatosCoches.getMapaCoches();
		
		// Obtener un listado de coches con precio entre un minimo y un máximo dados
		
		List<Coche> coches = new ArrayList<Coche>();
		
		for(Coche coche: COCHES.values()) {
			if(coche.getPrecio() > 10000 && coche.getPrecio() < 1000000) {
				coches.add(coche);
			}
		}
		
		pintarResultado(coches);
		
	}
	
	public static void consulta5() {
		Map<String,Coche> COCHES = BaseDatosCoches.getMapaCoches();
		
		// Obtener un listado de coches matriculados antes de una fecha dada
		
		List<Coche> coches = new ArrayList<>();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Date fechaDada = null;
		
		try {
			fechaDada = sdf.parse("03/10/2010");
		} catch (ParseException e) {
			
		}
		
		for(Coche coche: COCHES.values()) {
			if(coche.getFechaMatriculacion().before(fechaDada)) {
				coches.add(coche);
			}
		}
		
		pintarResultado(coches);
		
	}
	
	public static void consulta6() {
		Map<String,Coche> COCHES = BaseDatosCoches.getMapaCoches();
		
		double precioAcumulado = 0.0;
		double numeroCoches = 0;
		
		for(Coche coche: COCHES.values()) {
			precioAcumulado += coche.getPrecio();
			numeroCoches += 1;
		}
		
		// Calculamos el precio medio...
		
		double precioMedio = precioAcumulado / numeroCoches;
		
		List<Coche> coches = new ArrayList<>();
		
		for(Coche coche: COCHES.values()) {
			if (coche.getPrecio() <= precioMedio) {
				coches.add(coche);
			}
		}

		System.out.println("Número de coches: " + numeroCoches);
		System.out.println("Precio medio: " + precioMedio);
		pintarResultado(coches);
		
	}
	
	public static void consulta7() {
		Map<String,Coche> COCHES = BaseDatosCoches.getMapaCoches();
		
		// Rebajar un 10% el precio de los vehiculos que tienen 4 o más puertas...
		
		System.out.println("LISTADO COCHES ANTES DE APLICAR LA REBAJA");
		System.out.println("=========================================\n");
		
		for(Coche coche: COCHES.values()) {
			System.out.println(coche.getMatricula() + " puertas: " + coche.getNumeroPuertas() + " precio: " + coche.getPrecio());
			if(coche.getNumeroPuertas() >= 4) {
				double precio = coche.getPrecio();
				coche.setPrecio(precio - (precio * 0.10));
			}
		}
		
		System.out.println("\nLISTADO COCHES DESPUÉS DE APLICAR LA REBAJA");
		System.out.println("=========================================\n");
		
		for(Coche coche: COCHES.values()) {
			System.out.println(coche.getMatricula() + " puertas: " + coche.getNumeroPuertas() + " precio: " + coche.getPrecio());
		}	
	}
	
	public static void consulta8() {
		Map<String,Coche> COCHES = BaseDatosCoches.getMapaCoches();
		
		// Listado de vehiculos que se matricularon un Martes!
		
		List<Coche> coches = new ArrayList<>();
		
		for(Coche coche: COCHES.values()){
			Calendar cal = Calendar.getInstance();			// NEW!!
			cal.setTime(coche.getFechaMatriculacion());     // NEW!!
			if(cal.get(Calendar.DAY_OF_WEEK) == 3) {        // El martes es el día 3   Domingo = 1, Lunes = 2, etc...
				coches.add(coche);
			}
		}
		
	    pintarResultado(coches);
	  
	}
	
	public static void consulta9() {
		Map<String,Coche> COCHES = BaseDatosCoches.getMapaCoches();
		
		// Vamos a iterar la coleccion de coches y vamos a sacar (sobre la marcha) los caros
		
		Collection<Coche> coches = COCHES.values();
		
		
		
		for(Coche coche:coches) {
			System.out.println(coche.getModelo());
			coches.remove(coche);
		}
	}
	
	
	public static void main(String[] args) {
		
	// Desde aquí "dispararemos" la consulta que nos interese.
		
	//	consulta1();
	//	consulta2();
	//	consulta3();
	//	consulta4();
	//	consulta5();
	//	consulta6();
	//	consulta7();
		consulta8();
	//	consulta9();
	}
	
	private static void pintarResultado(List<Coche> coleccion) {
		for(Coche c: coleccion) {
			System.out.println(c);
		}
	}
	

}
