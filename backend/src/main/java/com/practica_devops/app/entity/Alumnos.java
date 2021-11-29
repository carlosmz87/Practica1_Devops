package com.practica_devops.app.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="alumnos")
public class Alumnos implements Serializable{
	public Alumnos(){

	}
	public Alumnos(int id, String nombre, int telefono, String correo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
		this.correo = correo;
	}

	private static final long serialVersionUID = -9012238097867420379L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "nombre", length = 100)
	private String nombre;
	
	@Column(name = "telefono")
	private int telefono;
	
	@Column(name = "correo", length = 100)
	private String correo;

	public int getId() {
		return id;
	}

	public void setId(int uid) {
		id = uid;
	}

	public String getNombre() {
		return nombre; 
	}

	public void setNombre(String unombre) {
		nombre = unombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int utelefono) {
		telefono = utelefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String ucorreo) {
		correo = ucorreo;
	}
	
}
