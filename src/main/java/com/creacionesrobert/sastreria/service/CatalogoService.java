package com.creacionesrobert.sastreria.service;

import com.creacionesrobert.sastreria.model.entities.Catalogo;

import java.util.List;
import java.util.Optional;

public interface CatalogoService {
    public List<Catalogo> findAll();

    public Optional<Catalogo> findById(Long id);

    public Catalogo save(Catalogo catalogo);

    public void deleteById(Long id);
}
