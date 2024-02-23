package com.example.demo.services.impl;

import org.springframework.stereotype.Service;

import com.example.demo.services.RefranGenerator;

@Service(value="elprimero")
public class RefranGeneratorImpl implements RefranGenerator{
	
	@Override
	public String generate(int cifra) {
		
		String refran = null;
		
		switch(cifra) {
			case 1: refran = "Que te cante un tuno"; break;
			case 2: refran = "Os vais los dos"; break;
			case 3: refran = "Ya lo ves"; break;
			case 4: refran = "Espera un rato"; break;
			case 5: refran = "Salta con ainco"; break;
			case 6: refran = "Ya lo veis"; break;
			case 7: refran = "Anda y vete"; break;
			case 8: refran = "Pan o bizcocho"; break;
			case 9: refran = "Ya llueve"; break;
			default: refran = "No hay refran"; break;
		}
		
		return refran;
		
	}
}
