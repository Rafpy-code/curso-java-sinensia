package com.sinensia.empanafy.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.empanafy.backend.model.Equipo;
import com.sinensia.empanafy.backend.repositories.EquipoRepository;

@RestController
public class EquipoController {

	@Autowired
	private EquipoRepository equipoRepository;
	
	@GetMapping("/equipos")
	public List<Equipo> getAll(){
		return equipoRepository.findAll();
	}
	
}

