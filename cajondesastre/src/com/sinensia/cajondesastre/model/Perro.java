package com.sinensia.cajondesastre.model;

import java.util.Date;

public class Perro {

	public static final double ESPERANZA_VIDA = 14.5;
	
	private String chip;
	private String nombre;
	private Date fechaNacimiento;
	private String raza;
	private boolean asegurado;
	private double peso;
	
	public Perro() {
		
	}

	public String getChip() {
		return chip;
	}

	public void setChip(String chip) {
		this.chip = chip;
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

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public boolean isAsegurado() {
		return asegurado;
	}

	public void setAsegurado(boolean asegurado) {
		this.asegurado = asegurado;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Perro [chip=" + chip + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", raza=" + raza
				+ ", asegurado=" + asegurado + ", peso=" + peso + "]";
	}

}
