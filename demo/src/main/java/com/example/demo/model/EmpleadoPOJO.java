package com.example.demo.model;

import jakarta.validation.constraints.NotBlank;

public class EmpleadoPOJO {

	private String codigoEmpleado;
	private String codigoDistrito;
	private String codigoEstado;
	@NotBlank
	private String nombreEmpleado;
	private String direccionEmpleado;
	private String correoEmpleado;
	private String usuarioEmpleado;
	private String contrasenaEmpleado;
	
	
	// --------------------------------------------------
	public EmpleadoPOJO() {
	}
	
	public EmpleadoPOJO(String codigoEmpleado, String codigoDistrito, String codigoEstado, String nombreEmpleado, String direccionEmpleado,
			String correoEmpleado, String usuarioEmpleado, String contrasenaEmpleado) {
		super();
		this.codigoEmpleado = codigoEmpleado;
		this.codigoDistrito = codigoDistrito;
		this.codigoEstado = codigoEstado;
		this.nombreEmpleado = nombreEmpleado;
		this.direccionEmpleado = direccionEmpleado;
		this.correoEmpleado = correoEmpleado;
		this.usuarioEmpleado = usuarioEmpleado;
		this.contrasenaEmpleado = contrasenaEmpleado;
	}

	
	// ---------------------------------------------------
	public String getCodigoEmpleado() {
		return codigoEmpleado;
	}

	public void setCodigoEmpleado(String codigoEmpleado) {
		this.codigoEmpleado = codigoEmpleado;
	}

	public String getCodigoDistrito() {
		return codigoDistrito;
	}

	public void setCodigoDistritoo(String codigoDistrito) {
		this.codigoDistrito = codigoDistrito;
	}

	public String getCodigoEstado() {
		return codigoEstado;
	}

	public void setCodigoEstado(String codigoEstado) {
		this.codigoEstado = codigoEstado;
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

	@Override
	public String toString() {
		return "EmpleadoPOJO [cod_empleado=" + codigoEmpleado + ", cod_distrito=" + codigoDistrito + ", cod_estado="
				+ codigoEstado + ", nombre=" + nombreEmpleado + ", direccion="
				+ direccionEmpleado + ", email=" + correoEmpleado + ", usuario=" + usuarioEmpleado + ", contrasena="
				+ contrasenaEmpleado + "]";
	}
	
}
