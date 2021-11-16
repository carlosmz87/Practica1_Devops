package com.practica_devops.app.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practica_devops.app.entity.Alumnos;
import com.practica_devops.app.service.AlumnosService;

@RestController
@RequestMapping("/api")
public class AlumnosController {

	@Autowired
	private AlumnosService alumnosService;
	
	@PostMapping("/add")
	public ResponseEntity<?> create(@RequestBody Alumnos alumno){
		return ResponseEntity.status(HttpStatus.CREATED).body(alumnosService.save(alumno));
	}

	@GetMapping("/alumno/{id}")
	public ResponseEntity<?> read(@PathVariable(value="id") int id){
		Optional<Alumnos> oAlumno = alumnosService.findById(id);
		if(!oAlumno.isPresent()) {
			return ResponseEntity.notFound().build();
		}else {
			return ResponseEntity.ok(oAlumno);
		}
	}
	
	@GetMapping("/alumnos")
	public List<Alumnos> readAll(){
		List<Alumnos> alumnos = StreamSupport.stream(alumnosService.findAll().spliterator(), false).collect(Collectors.toList());
		return alumnos;
	}
	
	@PutMapping("/modificar/{id}")
	public ResponseEntity<?> update(@RequestBody Alumnos alumno, @PathVariable(value="id") int id){
		Optional<Alumnos> oAlumno = alumnosService.findById(id);
		if(!oAlumno.isPresent()) {
			return ResponseEntity.notFound().build();
		}else {
			oAlumno.get().setTelefono(alumno.getTelefono());
			oAlumno.get().setCorreo(alumno.getCorreo());
			return ResponseEntity.status(HttpStatus.CREATED).body(alumnosService.save(oAlumno.get()));
		}
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> delete(@PathVariable(value="id") int id){
		if(!alumnosService.findById(id).isPresent()){
			return ResponseEntity.notFound().build();
		}else{
			alumnosService.deleteById(id);
			return ResponseEntity.ok().build();
		}
	}
	
	
}
