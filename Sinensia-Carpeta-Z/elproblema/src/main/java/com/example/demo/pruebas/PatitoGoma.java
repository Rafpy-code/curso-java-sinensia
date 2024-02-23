package com.example.demo.pruebas;

public class PatitoGoma {
	
	private String nombre;
	private String color;
	private boolean suena;
	
	public PatitoGoma(String nombre, String color) {
		this.nombre = nombre;
		this.color = color;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isSuena() {
		return suena;
	}

	public void setSuena(boolean suena) {
		this.suena = suena;
	}
	
}
