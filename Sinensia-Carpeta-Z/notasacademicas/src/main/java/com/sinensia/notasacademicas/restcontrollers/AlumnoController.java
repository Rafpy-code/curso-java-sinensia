package com.sinensia.notasacademicas.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.notasacademicas.model.Alumno;
import com.sinensia.notasacademicas.repositories.AlumnoRepository;

@RestController
public class AlumnoController {

	@Autowired
	private AlumnoRepository alumnoRepository;
	
	@GetMapping("/alumnos")
	public List<Alumno> getAll(){
		return alumnoRepository.findAll();
	}
}
