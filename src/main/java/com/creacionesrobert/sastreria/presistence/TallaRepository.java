package com.creacionesrobert.sastreria.presistence;

import com.creacionesrobert.sastreria.model.entities.Cliente;
import com.creacionesrobert.sastreria.model.entities.Talla;
import java.util.List;
import java.util.Optional;

public interface TallaRepository {
    public List<Talla> findAll();

    public Optional<Talla> findById(Long id);

    public List<Talla> findByCliente(Cliente cliente);

    public Talla save(Talla talla);

    public void deleteById(Long id);
}
