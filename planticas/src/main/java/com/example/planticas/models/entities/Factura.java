package com.example.planticas.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "factura")
public class Factura {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "La descripcion no puede estar vacio")
    @Column(nullable = true)
    private String descripcion;

    @NotEmpty(message = "La descripcion no puede estar vacio")
    @Column(nullable = true)
    private Float total;

    @JoinColumn(name = "id_cliente")
    @OneToOne(fetch = FetchType.LAZY)
    private Cliente cliente;
}
