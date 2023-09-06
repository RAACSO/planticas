package com.example.demo.model;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

import jakarta.persistence.Temporal;

@Entity
@Table(name = "factura")
public class Factura {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long codigoFactura;

    @NotNull
    @Column(name="fechaFacturacion")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaFacturacion;

    @NotNull
    @Column(name="fechaInicioAlquiler")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaInicioAlquiler;

    @NotNull
    @Column(name="fechaFinAlquiler")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaFinAlquiler;
    
    @Column(nullable = true)
    private Float total;

    @JoinColumn(name = "codigoCliente")
    @OneToOne(fetch = FetchType.LAZY)
    private Cliente cliente;

    @JoinColumn(name = "codigoEmpleado")
    @OneToOne(fetch = FetchType.LAZY)
    private Empleado empleado;

    public Factura(Long codigoFactura,Date fechaFacturacion ,Date fechaInicioAlquiler ,Date fechaFinAlquiler, Float total, Cliente cliente,Empleado empleado) {
        super();
        this.codigoFactura = codigoFactura;
        this.fechaFacturacion = fechaFacturacion;
        this.fechaInicioAlquiler = fechaInicioAlquiler;
        this.fechaFinAlquiler = fechaFinAlquiler;
        this.total = total;
        this.cliente = cliente;
        this.empleado = empleado;
    }

    public Factura() {
            super();
    }


    public long getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(Long codigoFactura) {
        this.codigoFactura = codigoFactura;
    }


    public Date getFechaFacturacion() {
        return fechaFacturacion;
    }

    public void setFechaFacturacion(Date fechaFacturacion) {
        this.fechaFacturacion = fechaFacturacion;
    }

    public Date getFechaInicioAlquilern() {
        return fechaInicioAlquiler;
    }

    public void setFechaInicioAlquiler(Date fechaInicioAlquiler) {
        this.fechaInicioAlquiler = fechaInicioAlquiler;
    }

    public Date getFechaFinAlquiler() {
        return fechaFinAlquiler;
    }

    public void setFechaFinAlquiler(Date fechaFinAlquiler) {
        this.fechaFinAlquiler = fechaFinAlquiler;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

}
