package com.creacionesrobert.sastreria.service;

import com.creacionesrobert.sastreria.model.entities.Cliente;

import java.util.List;
import java.util.Optional;

public interface ClienteService {
    public List<Cliente> findAll();

    public Optional<Cliente> findById(Long id);

    public Cliente save(Cliente cliente);

    public void deleteById(Long id);
}
