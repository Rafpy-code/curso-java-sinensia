package com.sinensia.notasacademicas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sinensia.notasacademicas.model.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, String>{

}
