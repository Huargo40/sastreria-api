package com.creacionesrobert.sastreria.presistence.Impl;

import com.creacionesrobert.sastreria.model.entities.Catalogo;
import com.creacionesrobert.sastreria.presistence.CatalogoRepository;
import com.creacionesrobert.sastreria.repository.CatalogoJPARepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class CatalogoRepositoryImpl implements CatalogoRepository {
    private final CatalogoJPARepository catalogoJPARepository;

    public List<Catalogo> findAll(){
        return (List<Catalogo>) catalogoJPARepository.findAll();
    }

    public Optional<Catalogo> findById(Long id){
        return catalogoJPARepository.findById(id);
    }

    public Catalogo save(Catalogo catalogo){
        return catalogoJPARepository.save(catalogo);
    }

    public void deleteById(Long id){
        catalogoJPARepository.deleteById(id);
    }
}
