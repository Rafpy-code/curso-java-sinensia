package com.sinensia.cajondesastre.survivalkit.arrays;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		
		int[] numeros = new int[3];
		
		// 1.- C�mo extraer los valores del array
		
		System.out.println("primero: " + numeros[0]);
		System.out.println("segundos: " + numeros[1]);
		System.out.println("tercero: " + numeros[2]);
	//	System.out.println("cuarto: " + numeros[56]);      <--- esto causa exception
		
		// 2.- C�mo setear los valores del array
		
		numeros[0] = -7;
		numeros[1] = 50;
		numeros[2] = 3 * 5;
		
		System.out.println("primero: " + numeros[0]);
		System.out.println("segundos: " + numeros[1]);
		System.out.println("tercero: " + numeros[2]);
		
		// 3.- C�mo crear un array con valores iniciales

		double[] salarios = new double[] {4300.0, 5200.0, 3800.0};
		
		System.out.println("primer salario: " + salarios[0]);
		System.out.println("segundo salario: " + salarios[1]);
		System.out.println("tercer salario: " + salarios[2]);
		
		// 4.- C�mo conocer el tama�o (n�mero de elementos) de un array
		
		int numeroSalarios = salarios.length;
		
		System.out.println("Hay " + numeroSalarios + " salarios!");
		
		// 5.- C�mo iterar un array de la forma "cl�sica"
		
		for(int i = 0; i < salarios.length; i++) {
			System.out.println(i + ": " + salarios[i]);
		}
		
		// 5.- C�mo iterar un array con "for each"
		
		for(double salario: salarios) {
			System.out.println("----> " + salario);
		}
		
		// 6.- C�mo mostrar "de un plumazo" un array
		
		System.out.println(salarios); 						// no me pinta el array :-(
		System.out.println(Arrays.toString(salarios));		// Cuesti�n de fe
		System.out.println(Arrays.toString(numeros));		// Cuesti�n de fe
		
		String[] nombres = new String[] {"Pep�n","Honorio","Carlota","Anna"};
		
		System.out.println(Arrays.toString(nombres));
		
		//C�mo convertir un String a n�mero
		
		String importeStr = "358.25";
		double importeDou = Double.parseDouble(importeStr);
		
		System.out.println("importeStr = " + importeStr);
		System.out.println("importeDou = " + importeDou);
		
		
		
	}

}
