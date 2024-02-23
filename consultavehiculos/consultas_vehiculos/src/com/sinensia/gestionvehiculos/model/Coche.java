package com.sinensia.gestionvehiculos.model;

import java.util.Date;

public class Coche {

	private String matricula;
	private String marca; 
	private String modelo;
	private double precio;
	private Date fechaMatriculacion;
	private boolean siniestrado;
	private int numeroPuertas;
	private double capacidadMaletero; // litros
	
	public Coche() {
		
	}

	public Coche(String matricula, String marca, String modelo, double precio, Date fechaMatriculacion) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.fechaMatriculacion = fechaMatriculacion;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Date getFechaMatriculacion() {
		return fechaMatriculacion;
	}

	public void setFechaMatriculacion(Date fechaMatriculacion) {
		this.fechaMatriculacion = fechaMatriculacion;
	}

	public boolean isSiniestrado() {
		return siniestrado;
	}

	public void setSiniestrado(boolean siniestrado) {
		this.siniestrado = siniestrado;
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	public double getCapacidadMaletero() {
		return capacidadMaletero;
	}

	public void setCapacidadMaletero(double capacidadMaletero) {
		this.capacidadMaletero = capacidadMaletero;
	}

	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", precio=" + precio
				+ ", fechaMatriculacion=" + fechaMatriculacion + ", siniestrado=" + siniestrado + ", numeroPuertas="
				+ numeroPuertas + ", capacidadMaletero=" + capacidadMaletero + "]";
	}
	
}
