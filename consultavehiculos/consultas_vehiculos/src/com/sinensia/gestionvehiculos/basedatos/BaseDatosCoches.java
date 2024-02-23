package com.sinensia.gestionvehiculos.basedatos;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.sinensia.gestionvehiculos.model.Coche;

public class BaseDatosCoches {

	private static Map<String, Coche> COCHES = new HashMap<>();

	public static Map<String, Coche> getMapaCoches(){
		return COCHES;
	}
	
	static {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Date fecha1 = null;
		Date fecha2 = null; 
		Date fecha3 = null; 
		Date fecha4 = null; 
		Date fecha5 = null;
		Date fecha6 = null; 
		Date fecha7 = null;
		Date fecha8 = null;
		Date fecha9 = null;
		Date fecha10 = null;
		
		try {
			fecha1 = sdf.parse("01/10/2010");
			fecha2 = sdf.parse("01/10/2010");
			fecha3 = sdf.parse("02/10/2010");
			fecha4 = sdf.parse("02/10/2010");
			fecha5 = sdf.parse("03/10/2010");
			fecha6 = sdf.parse("05/10/2010");
			fecha7 = sdf.parse("09/10/2010");
			fecha8 = sdf.parse("10/10/2010");
			fecha9 = sdf.parse("10/10/2010");
			fecha10 = sdf.parse("14/10/2010");
			
		} catch(Exception e) {
			
		}
		
		Coche c1 = new Coche("3445DKM", "Volkswagen", "Golf Plust TDI", 14500.0, fecha1);
		Coche c2 = new Coche("3788DKM", "SEAT", "Toledo TDI", 4600.0, fecha2);
		Coche c3 = new Coche("4445DKM", "Renault", "Clio", 3200.0, fecha3);
		Coche c4 = new Coche("4490DKM", "AUDI", "RS5", 3500.0, fecha4);
		Coche c5 = new Coche("5667DKM", "Skoda", "Octavia", 8980.0, fecha5);
		Coche c6 = new Coche("6789DKM", "SEAT", "Toledo TDI", 3800.0, fecha6);
		Coche c7 = new Coche("7765DKM", "Volkswagen", "Passat V8", 10500.0, fecha7);
		Coche c8 = new Coche("7889DKM", "FIAT", "Panda", 1999.0, fecha8);
		Coche c9 = new Coche("9778DKM", "Ferrari", "812 GTS", 57200.0, fecha9);
		Coche c10 = new Coche("0012DKN", "Mercedes", "SLK 200", 32600.0, fecha10);
		
		c1.setCapacidadMaletero(7);
		c2.setCapacidadMaletero(12);
		c3.setCapacidadMaletero(15);
		c4.setCapacidadMaletero(4);
		c5.setCapacidadMaletero(10);
		c6.setCapacidadMaletero(14);
		c7.setCapacidadMaletero(23);
		c8.setCapacidadMaletero(30);
		c9.setCapacidadMaletero(7);
		c10.setCapacidadMaletero(8);
		
		c4.setSiniestrado(true);

		c1.setNumeroPuertas(5);
		c2.setNumeroPuertas(5);
		c3.setNumeroPuertas(4);
		c4.setNumeroPuertas(2);
		c5.setNumeroPuertas(5);
		c6.setNumeroPuertas(5);
		c7.setNumeroPuertas(4);
		c8.setNumeroPuertas(4);
		c9.setNumeroPuertas(2);
		c10.setNumeroPuertas(2);
		
		COCHES.put(c1.getMatricula(), c1);
		COCHES.put(c2.getMatricula(), c2);
		COCHES.put(c3.getMatricula(), c3);
		COCHES.put(c4.getMatricula(), c4);
		COCHES.put(c5.getMatricula(), c5);
		COCHES.put(c6.getMatricula(), c6);
		COCHES.put(c7.getMatricula(), c7);
		COCHES.put(c8.getMatricula(), c8);
		COCHES.put(c9.getMatricula(), c9);
		COCHES.put(c10.getMatricula(), c10);
		
	}

}
