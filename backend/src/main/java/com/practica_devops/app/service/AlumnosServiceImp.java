package com.practica_devops.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.practica_devops.app.entity.Alumnos;
import com.practica_devops.app.repository.AlumnosRepository;

@Service 
public class AlumnosServiceImp implements AlumnosService{
	@Autowired
	private AlumnosRepository alumnosRepository;

	@Override
	@Transactional(readOnly = true)
	public Iterable<Alumnos> findAll() {
		return alumnosRepository.findAll();
	}

	
	@Override
	@Transactional
	public Alumnos save(Alumnos alumno) {
		return alumnosRepository.save(alumno);
	}

	
	@Override
	@Transactional
	public void deleteById(int id) {
		alumnosRepository.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Alumnos> findById(int id) {
		return alumnosRepository.findById(id);
	}

}
