package com.sinensia.cajondesastre.constructores;

class Producto {

	int codigo;				// 0
	String nombre;			// null
	double precio;			// 0.0
	boolean descatalogado;	// false
	
	Producto(){
		
	}
	
	Producto(int cod, String nom, double pre, boolean des){
		codigo = cod;
		nombre = nom;
		precio = pre;
		descatalogado = des;
	}
	
	Producto(int cod, String nom){
		codigo = cod;
		nombre = nom;
		// el resto de propiedades permanecen con sus valores por 
	}
	
}
