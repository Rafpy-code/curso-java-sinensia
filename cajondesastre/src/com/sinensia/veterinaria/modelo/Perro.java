package com.sinensia.veterinaria.modelo;

import java.util.Date;

public class Perro {

	//Si es una constante la ponemos public.
	public static final double ESPERANZA_DE_VIDA = 14.5;
	
	private String codigoIdentificador;
	private String nombre;
	private Date fechaNacimiento; 
	private double edad;
	private Raza raza; //Enum
	private double peso;
	private boolean seguro;  
	
	
	public Perro() {
		
	}
	
	public Perro(String codigoIdentificador, String nombre, Date fechaNacimiento, Raza raza, double peso, boolean seguro,
			double mediaDeVida) {
		super();
		this.codigoIdentificador = codigoIdentificador;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.raza = raza;
		this.peso = peso;
		this.seguro = seguro;
	}
	
	public String getCodigoIdentificador() {
		return codigoIdentificador;
	}
	
	public void setCodigoIdentificador(String codigoIdentificador) {
		this.codigoIdentificador = codigoIdentificador;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(java.util.Date date) {
		this.fechaNacimiento = date;
	}

	public double getEdad() {
		return edad;
	}
	public void setEdad(double d) {
		this.edad = d;
	}
	
	public Raza getRaza() {
		return raza;
	}
	public void setRaza(Raza raza) {
		this.raza = raza;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public boolean isSeguro() {
		return seguro;
	}
	public void setSeguro(boolean seguro) {
		this.seguro = seguro;
	}
	
	@Override
	public String toString() {
		return "Perro:" +
				"\nCodigo Identificador: " + codigoIdentificador + 
				"\nNombre: " + nombre + 
				"\nFecha de nacimiento: " + fechaNacimiento +
				//"\nEdad: " + edad + 
				"\nRaza: " + raza + 
				"\nPeso: " + peso + 
				"\nSeguro: " + seguro + 
				"\nMedia de Vida: " + ESPERANZA_DE_VIDA;
	}
	
}
