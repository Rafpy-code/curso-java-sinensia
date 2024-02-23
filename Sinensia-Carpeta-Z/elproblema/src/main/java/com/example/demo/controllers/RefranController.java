package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pruebas.PatitoGoma;
import com.example.demo.services.RefranGenerator;

@RestController
public class RefranController {
	
	@Autowired
	@Qualifier("elsegundo")
	private RefranGenerator refranGenerator;
	
	@Autowired
	private PatitoGoma patitoGoma;
	
	@GetMapping("/refranes/{cifra}")
	public String getRefran(@PathVariable  int cifra) {
		return refranGenerator.generate(cifra);
	}
	
	@GetMapping("/patito")
	public PatitoGoma getPatito() {
		return patitoGoma;
	}
	
}
