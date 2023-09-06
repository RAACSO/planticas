package com.example.demo.model;

import java.io.Serializable;
import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "empleado")
public class Empleado implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String codigoEmpleado;
	@ManyToOne
	@JoinColumn(name = "codigoDistrito")
	private Distrito distrito;
	@ManyToOne
	@JoinColumn(name = "codigoEstado")
	private Estado estado;
	//@Column(nullable = false)
	@NotBlank // no null no vacion ""
	private String nombreEmpleado;
	@NotBlank
	private String direccionEmpleado;
	@NotBlank
    private String correoEmpleado;
	
	@NotBlank
	private String usuarioEmpleado;
	@NotBlank // cuando se codifica llega a 60 caracteres creo no se, mas o menos :D
	private String contrasenaEmpleado;

	@ManyToMany(fetch = FetchType.EAGER)//cascade = CascadeType.ALL
	@JoinTable(name = "empleado_rol", // Nombre de la tabla intermedia
			joinColumns = @JoinColumn(name = "cod_empleado", referencedColumnName = "cod_empleado"), // el primer cod_empleado hace referencia a la tabla intermedia, el segundo a esta tabla empleado
			inverseJoinColumns = @JoinColumn(name = "cod_rol", referencedColumnName = "cod_rol") // el 2do cod_rol hace referencia al pk de la tabla Rol
	)
	private Collection<Rol> roles; // este campo no esta realmente en la tabla

	
	// CONSTRUCTORES ------------------------------------------------------
	public Empleado() {
	}
	public Empleado(String codigoEmpleado, Distrito distrito, Estado estado, String nombreEmpleado, String direccionEmpleado, String correoEmpleado,
			 String usuarioEmpleado, String contrasenaEmpleado, Collection<Rol> roles) {
		super();
		this.codigoEmpleado = codigoEmpleado;
		this.distrito = distrito;
		this.estado = estado;
		this.nombreEmpleado = nombreEmpleado;
		this.direccionEmpleado = direccionEmpleado;
		this.correoEmpleado = correoEmpleado;
		this.usuarioEmpleado = usuarioEmpleado;
		this.contrasenaEmpleado = contrasenaEmpleado;
		this.roles = roles;
	}

	// --------------------------------------------------------------------

	public String getCodigoEmpleado() {
		return codigoEmpleado;
	}

	public void setCodigoEmpleado(String codigoEmpleado) {
		this.codigoEmpleado = codigoEmpleado;
	}

	public Distrito getDistrito() {
		return distrito;
	}

	public void setDistrito(Distrito distrito) {
		this.distrito = distrito;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
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

	public Collection<Rol> getRoles() {
		return roles;
	}

	public void setRoles(Collection<Rol> roles) {
		this.roles = roles;
	}
	
	@Override
	public String toString() {
		return "Empleado [cod_empleado=" + codigoEmpleado + ", distrito=" + distrito + ", estado=" + estado + ", nombre="
				+ nombreEmpleado + ", direccion=" + direccionEmpleado + ", email=" + correoEmpleado + ", usuario=" + usuarioEmpleado + ", contrasena=" + contrasenaEmpleado + ", roles=" + roles + "]";
	}
	
	
}
