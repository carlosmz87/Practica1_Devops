package com.practica_devops.app.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="ALUMNOS")
public class Alumnos implements Serializable{
	
	private static final long serialVersionUID = -9012238097867420379L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	@Column(name = "NOMBRE",nullable=false, length = 100)
	private String Nombre;
	
	@Column(name = "TELEFONO", nullable=false)
	private int Telefono;
	
	@Column(name = "CORREO",nullable=false, length = 100)
	private String Correo;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNombre() {
		return Nombre; 
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getTelefono() {
		return Telefono;
	}

	public void setTelefono(int telefono) {
		Telefono = telefono;
	}

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo) {
		Correo = correo;
	}
	
}
