package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "estado")
public class Estado implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private String codigoEstado;
	private String descripcion;
	
	// -----
	public Estado() {
	}
	public Estado(String codigoEstado, String descripcion) {
		super();
		this.codigoEstado = codigoEstado;
		this.descripcion = descripcion;
	}

	// -----
	public String getCodigoEstado() {
		return codigoEstado;
	}

	public void setCodigoEstado(String codigoEstado) {
		this.codigoEstado = codigoEstado;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
