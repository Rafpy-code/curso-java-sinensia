package com.sinensia.cajondesastre.constructores;

public class TestClass {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Producto p1 = new Producto(); // Producto() ==> método constructor

		p1.codigo = 534554;
		p1.nombre = "Impresora Laser HP";
		p1.precio = 470.5;
		p1.descatalogado = true;
		
		Producto p2 = new Producto(70565,"Ordenador Portatil", 1500.0, false);
		
		Producto p3 = new Producto(835343,"Alfombrilla Mouse CR7");
		
		CuentaBancaria c1 = new CuentaBancaria();
		
		c1.entidad = "0892";
		c1.oficina = "0092";
		c1.digitoControl = "89";
		c1.cuenta = "00092334";
		
		CuentaBancaria c2 = new CuentaBancaria("0892","0092","89","00092334");
		
		String iban = "ES 0892-0092-89-00092334";
		
		CuentaBancaria c3 = new CuentaBancaria(iban);
		
	}

}
