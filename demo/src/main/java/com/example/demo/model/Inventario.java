package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotEmpty;

public class Inventario {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long codigoInventario;

    @NotEmpty
    @Column(nullable = true)
    private String tipo;

    @NotEmpty
    @Column(nullable = true)
    private String estado;

    @JoinColumn(name = "codigoProducto")
    @OneToOne(fetch = FetchType.LAZY)
    private Producto producto;
}
