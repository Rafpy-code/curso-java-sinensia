package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.pruebas.PatitoGoma;

@Configuration
public class Tululu {

	@Bean
	PatitoGoma xxxxx() {
		
		PatitoGoma patitoGoma = new PatitoGoma("Pepín","rosa");
		
		patitoGoma.setSuena(true);
		
		return patitoGoma;
	}
	
}
