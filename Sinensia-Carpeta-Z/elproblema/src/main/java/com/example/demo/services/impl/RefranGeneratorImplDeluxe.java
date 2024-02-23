package com.example.demo.services.impl;

import org.springframework.stereotype.Service;

import com.example.demo.services.RefranGenerator;

@Service(value="elsegundo")
public class RefranGeneratorImplDeluxe implements RefranGenerator{
	
	public RefranGeneratorImplDeluxe() {
		
	}
	
	@Override
	public String generate(int cifra) {
		
		String refran = null;
		
		switch(cifra) {
			case 1: refran = "DELUXE - Que te cante un tuno"; break;
			case 2: refran = "DELUXE - Os vais los dos"; break;
			case 3: refran = "DELUXE - Ya lo ves"; break;
			case 4: refran = "DELUXE - Espera un rato"; break;
			case 5: refran = "DELUXE - Salta con ainco"; break;
			case 6: refran = "DELUXE - Ya lo veis"; break;
			case 7: refran = "DELUXE - Anda y vete"; break;
			case 8: refran = "DELUXE - Pan o bizcocho"; break;
			case 9: refran = "DELUXE - Ya llueve"; break;
			default: refran = "DELUXE - No hay refran"; break;
		}
		
		return refran;
		
	}
}
