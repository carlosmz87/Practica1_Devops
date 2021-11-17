package com.practica_devops.app.service;

import java.util.Optional;


import com.practica_devops.app.entity.Alumnos;

public interface AlumnosService {
	
	public Iterable<Alumnos> findAll();
	
	public Alumnos save(Alumnos alumno);
	
	public Optional<Alumnos> findById(int id);
	
	public void deleteById(int id);
	
}
