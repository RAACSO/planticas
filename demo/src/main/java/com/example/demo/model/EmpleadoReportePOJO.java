package com.example.demo.model;

import jakarta.validation.constraints.NotBlank;

public class EmpleadoReportePOJO {

	private String codigoEmpleado;
	private String distrito;
	private String estado;
	@NotBlank
	private String nombreEmpleado;
	private String direccionEmpleado;
	private String correoEmpleado;
	private String usuarioEmpleado;
	private String contrasenaEmpleado;
	
	
	// ----------------------------------------------
	public EmpleadoReportePOJO() {
	}
	
	public EmpleadoReportePOJO(String codigoEmpleado, String distrito, String estado, String nombreEmpleado, String direccionEmpleado,
	String correoEmpleado, String usuarioEmpleado, String contrasenaEmpleado) {
		super();
		this.codigoEmpleado = codigoEmpleado;
		this.distrito = distrito;
		this.estado = estado;
		this.nombreEmpleado = nombreEmpleado;
		this.direccionEmpleado = direccionEmpleado;
		this.correoEmpleado = correoEmpleado;
		this.usuarioEmpleado = usuarioEmpleado;
		this.contrasenaEmpleado = contrasenaEmpleado;
	}

	// -----------------------------------------------
	public String getCodigoEmpleado() {
		return codigoEmpleado;
	}

	public void setCodigoEmpleado(String codigoEmpleado) {
		this.codigoEmpleado = codigoEmpleado;
	}

	public String getDistrito() {
		return distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public String getDireccionEmpleado() {
		return direccionEmpleado;
	}

	public void setDireccionEmpleado(String direccionEmpleado) {
		this.direccionEmpleado = direccionEmpleado;
	}

	public String getCorreoEmpleado() {
		return correoEmpleado;
	}

	public void setCorreoEmpleado(String correoEmpleado) {
		this.correoEmpleado = correoEmpleado;
	}

	public String getUsuarioEmpleado() {
		return usuarioEmpleado;
	}

	public void setUsuarioEmpleado(String usuarioEmpleado) {
		this.usuarioEmpleado = usuarioEmpleado;
	}

	public String getContrasenaEmpleado() {
		return contrasenaEmpleado;
	}

	public void setContrasenaEmpleado(String contrasenaEmpleado) {
		this.contrasenaEmpleado = contrasenaEmpleado;
	}	
	
}
