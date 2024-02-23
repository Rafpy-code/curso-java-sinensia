package com.sinensia.cajondesastre.survivalkit.arrays;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		
		int[] numeros = new int[3];
		
		// 1.- Cómo extraer los valores del array
		
		System.out.println("primero: " + numeros[0]);
		System.out.println("segundos: " + numeros[1]);
		System.out.println("tercero: " + numeros[2]);
	//	System.out.println("cuarto: " + numeros[56]);      <--- esto causa exception
		
		// 2.- Cómo setear los valores del array
		
		numeros[0] = -7;
		numeros[1] = 50;
		numeros[2] = 3 * 5;
		
		System.out.println("primero: " + numeros[0]);
		System.out.println("segundos: " + numeros[1]);
		System.out.println("tercero: " + numeros[2]);
		
		// 3.- Cómo crear un array con valores iniciales

		double[] salarios = new double[] {4300.0, 5200.0, 3800.0};
		
		System.out.println("primer salario: " + salarios[0]);
		System.out.println("segundo salario: " + salarios[1]);
		System.out.println("tercer salario: " + salarios[2]);
		
		// 4.- Cómo conocer el tamaño (número de elementos) de un array
		
		int numeroSalarios = salarios.length;
		
		System.out.println("Hay " + numeroSalarios + " salarios!");
		
		// 5.- Cómo iterar un array de la forma "clásica"
		
		for(int i = 0; i < salarios.length; i++) {
			System.out.println(i + ": " + salarios[i]);
		}
		
		// 5.- Cómo iterar un array con "for each"
		
		for(double salario: salarios) {
			System.out.println("----> " + salario);
		}
		
		// 6.- Cómo mostrar "de un plumazo" un array
		
		System.out.println(salarios); 						// no me pinta el array :-(
		System.out.println(Arrays.toString(salarios));		// Cuestión de fe
		System.out.println(Arrays.toString(numeros));		// Cuestión de fe
		
		String[] nombres = new String[] {"Pepín","Honorio","Carlota","Anna"};
		
		System.out.println(Arrays.toString(nombres));
		
		//Cómo convertir un String a número
		
		String importeStr = "358.25";
		double importeDou = Double.parseDouble(importeStr);
		
		System.out.println("importeStr = " + importeStr);
		System.out.println("importeDou = " + importeDou);
		
		
		
	}

}
