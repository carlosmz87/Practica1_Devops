package com.practica_devops.app.service;

import com.practica_devops.app.entity.Alumnos;
import com.practica_devops.app.repository.AlumnosRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class AlumnosServiceImpTest {

    @Mock
    private AlumnosRepository alumnosRepository;

    @InjectMocks
    private AlumnosServiceImp alumnosServiceImp;

    private Alumnos alumno;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        alumno = new Alumnos(0, "Alumno de prueba", 11111111, "prueba@correo.com");

    }

    @Test
    void findAll() {
        when(alumnosRepository.findAll()).thenReturn(List.of(alumno));
        assertNotNull(alumnosServiceImp.findAll());
    }

    @Test
    void save() {
        when(alumnosRepository.save(alumno)).thenReturn(alumno);
        assertNotNull(alumnosServiceImp.save(alumno));
    }

    @Test
    void deleteById() {
        alumnosServiceImp.deleteById(alumno.getId());
        alumnosServiceImp.deleteById(alumno.getId());
        verify(alumnosRepository, times(2)).deleteById(alumno.getId());
    }

    @Test
    void findById() {
        when(alumnosRepository.findById(alumno.getId())).thenReturn(Optional.of(alumno));
        assertNotNull(alumnosServiceImp.findById(alumno.getId()));
    }
}