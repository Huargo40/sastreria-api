package com.creacionesrobert.sastreria.presistence;

import com.creacionesrobert.sastreria.model.entities.Cliente;
import java.util.List;
import java.util.Optional;

public interface ClienteRepository {
    public List<Cliente> findAll();

    public Optional<Cliente> findById(Long id);

    public Cliente save(Cliente cliente);

    public void deleteById(Long id);
}
