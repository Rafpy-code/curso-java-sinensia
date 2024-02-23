package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.NumberFormatter;
import com.example.demo.services.UtilidadesMatematicas;

@RestController
public class TestController {

	@Autowired
	private UtilidadesMatematicas utilidadesMatematicas;
	
	@Autowired
	private NumberFormatter numberFormatter;
	
	@GetMapping("/test")
	public String test() {
		
		System.out.println(1 + " es par: " + utilidadesMatematicas.espar(1));
		System.out.println(3 + " es par: " + utilidadesMatematicas.espar(3));
		System.out.println(2 + " es par: " + utilidadesMatematicas.espar(2));		
		System.out.println(0 + " es par: " + utilidadesMatematicas.espar(0));		
		
		return "pruebas finalizadas. mirar la consola....";
	}
	
	@GetMapping("nombre/{number}")
	public String testNumberFormatter(@PathVariable Integer number) {
		String nombre = numberFormatter.convert(number);
		return number + ": " + nombre;
	}
	
}
