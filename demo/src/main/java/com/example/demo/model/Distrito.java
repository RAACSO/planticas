package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "distrito")
public class Distrito implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private String codigoDistrito;
	private String descripcion;
	
	// Constructores
	public Distrito() {
	}

	public Distrito(String codigoDistrito, String descripcion) {
		super();
		this.codigoDistrito = codigoDistrito;
		this.descripcion = descripcion;
	}
	
	// GET - SET
	public String getCodigoDistrito() {
		return codigoDistrito;
	}

	public void setCodigoDistrito(String codigoDistrito) {
		this.codigoDistrito = codigoDistrito;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
