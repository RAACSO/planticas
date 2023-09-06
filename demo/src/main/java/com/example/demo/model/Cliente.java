package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import jakarta.validation.constraints.NotEmpty;





@Entity
@Table(name="cliente")
public class Cliente implements Serializable{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long codigoCliente;

    @NotEmpty(message = "El nombre no puede estar vacio")
    @Column(nullable = true)
    private String nombreCliente;

    @NotEmpty(message = "La direccion no puede estar vacio")
    @Column(nullable = true)
    private String direccionCliente;

    @NotEmpty(message = "El numero no puede estar vacio")
    @Column(nullable = true)
    private String celularCliente;

    @NotEmpty(message = "El numero de identidad no puede estar vacio")
    @Column(nullable = true)
    private String documentoIdentidadCliente;
   
    @Column(nullable = true)
    private String correoCliente;

    public Cliente(Long codigoCliente,String nombreCliente, String direccionCliente, String celularCliente, String documentoIdentidadCliente, String correoCliente) {
        super();
        this.codigoCliente = codigoCliente;
        this.nombreCliente = nombreCliente;
        this.direccionCliente = direccionCliente;
        this.celularCliente = celularCliente;
        this.documentoIdentidadCliente = documentoIdentidadCliente;
        this.correoCliente = correoCliente;
    }

    public Cliente() {
        super();
    }

    public long getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(Long codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getCelularCliente() {
        return celularCliente;
    }

    public void setCelularCliente(String celularCliente) {
        this.celularCliente = celularCliente;
    }

    public String getDocumentoIdentidadCliente() {
        return documentoIdentidadCliente;
    }

    public void setDocumentoIdentidadCliente(String documentoIdentidadCliente) {
        this.documentoIdentidadCliente = documentoIdentidadCliente;
    }

    public String getCorreoCliente() {
        return correoCliente;
    }

    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }

    private static final long serialVersionUID=1L;
}
