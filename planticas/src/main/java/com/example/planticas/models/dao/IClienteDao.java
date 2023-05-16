package com.example.planticas.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.planticas.models.entities.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long> {
    
}
