package com.creacionesrobert.sastreria.service.impl;

import com.creacionesrobert.sastreria.model.entities.Catalogo;
import com.creacionesrobert.sastreria.presistence.CatalogoRepository;
import com.creacionesrobert.sastreria.service.CatalogoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CatalogoServiceImpl implements CatalogoService {

    private final CatalogoRepository catalogoRepository;

    @Override
    public List<Catalogo> findAll() {
        return (List<Catalogo>) catalogoRepository.findAll();
    }

    @Override
    public Optional<Catalogo> findById(Long id) {
        return catalogoRepository.findById(id);
    }

    @Override
    public Catalogo save(Catalogo catalogo) {
        return catalogoRepository.save(catalogo);
    }

    @Override
    public void deleteById(Long id){
        catalogoRepository.deleteById(id);
    }
}
