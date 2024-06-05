package com.creacionesrobert.sastreria.presistence;

import com.creacionesrobert.sastreria.model.entities.MetodoPago;
import java.util.List;
import java.util.Optional;

public interface MetodoPagoRepository {
    public List<MetodoPago> findAll();

    public Optional<MetodoPago> findById(Long id);

    public MetodoPago save(MetodoPago metodoPago);

    public void deleteById(Long id);
}
