package com.practica_devops.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practica_devops.app.entity.Alumnos;

@Repository
public interface AlumnosRepository extends JpaRepository<Alumnos, Integer>{

}
