package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "rol")
public class Rol implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	private String codigoRol;
	private String nombre;
	
	
	
	// ----
	public Rol() {
		super();
	}
	public Rol(String codigoRol, String nombre) {
		super();
		this.codigoRol = codigoRol;
		this.nombre = nombre;
	}
	
	// ----
	public String getCodigoRol() {
		return codigoRol;
	}
	public void setCodigoRol(String codigoRol) {
		this.codigoRol = codigoRol;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	@Override
	public String toString() {
		return "Rol [cod_rol=" + codigoRol + ", nombre=" + nombre + "]";
	}
	
	
}
