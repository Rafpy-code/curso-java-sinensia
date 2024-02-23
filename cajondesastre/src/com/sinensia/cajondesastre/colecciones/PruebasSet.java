package com.sinensia.cajondesastre.colecciones;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class PruebasSet {

	public static void main(String[] args) {
		
		Set<Integer> numeros = new HashSet<>();
		
		numeros.add(10);
		numeros.add(20);
		numeros.add(25);
		
		System.out.println(numeros);
		
		numeros.add(25);
		
		System.out.println("Número de elementos: " + numeros.size());
		
		System.out.println(numeros);
		
		// NOVEDADES!!!!!!!! Implementaciones interesantes de Set!!!!!!! NEW! NEW! NEW!
		
		Set<Integer> numerosOrdenados = new TreeSet<>();
		
		numerosOrdenados.add(10023);
		numerosOrdenados.add(-12);
		numerosOrdenados.add(0);
		numerosOrdenados.add(-4);
		numerosOrdenados.add(4655);
		numerosOrdenados.add(1243);
		numerosOrdenados.add(2546666);
		numerosOrdenados.add(33);
		numerosOrdenados.add(-35444);
		numerosOrdenados.add(-34);
		
		System.out.println(numerosOrdenados);
		
		// OTRA IMPLEMENTACION INTERESANTE DE Set<T>
		
		Set<Integer> mumerosLinkados = new LinkedHashSet<>();
		
		mumerosLinkados.add(10023);
		mumerosLinkados.add(-12);
		mumerosLinkados.add(0);
		mumerosLinkados.add(-4);
		mumerosLinkados.add(4655);
		mumerosLinkados.add(1243);
		mumerosLinkados.add(2546666);
		mumerosLinkados.add(33);
		mumerosLinkados.add(-35444);
		mumerosLinkados.add(-34);
		
		System.out.println(mumerosLinkados);
	}
}
