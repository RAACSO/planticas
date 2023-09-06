package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long codigoProducto;

    @NotEmpty(message = "La descripcion no puede estar vacio")
    @Column(nullable = true)
    private String nombreProducto;

    @NotEmpty(message = "El precio no puede estar vacio")
    @Column(nullable = true)
    private Float precioDia;


}
