package com.sinensia.cajondesastre.constructores;

public class CuentaBancaria {

	String entidad;
	String oficina;
	String digitoControl;
	String cuenta;
	
	public CuentaBancaria() {
		
	}

	public CuentaBancaria(String ent, String of, String dc, String c) {
		entidad = ent;
		oficina = of;
		digitoControl = dc;
		cuenta = c;
	}
	
	public CuentaBancaria(String iban) {
		entidad = iban.substring(3,7);
		oficina = iban.substring(8,12);
		digitoControl = iban.substring(13,15);
		cuenta  = iban.substring(16,24);
	}
	
	
}
