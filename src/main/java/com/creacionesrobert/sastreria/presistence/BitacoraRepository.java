package com.creacionesrobert.sastreria.presistence;

import com.creacionesrobert.sastreria.model.entities.Bitacora;
import java.util.List;
import java.util.Optional;

public interface BitacoraRepository {
    public List<Bitacora> findAll();

    public Optional<Bitacora> findById(Long id);

    public Bitacora save(Bitacora bitacora);

    public void deleteById(Long id);
}
