package com.example.planticas.services;

import java.util.List;

import com.example.planticas.models.entities.Cliente;

public interface IClienteService {
    public List<Cliente> findAll();

    public void save(Cliente cliente);

    public Cliente findById(Long id);

    public void delete(Long id);
}
