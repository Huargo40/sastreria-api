package com.creacionesrobert.sastreria.presistence.Impl;

import com.creacionesrobert.sastreria.model.entities.Bitacora;
import com.creacionesrobert.sastreria.presistence.BitacoraRepository;
import com.creacionesrobert.sastreria.repository.BitacoraJPARespository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
@Component
@RequiredArgsConstructor
public class BitacoraRepositoryImpl implements BitacoraRepository {
    private final BitacoraJPARespository bitacoraJPARespository;

    public List<Bitacora> findAll(){
        return (List<Bitacora>) bitacoraJPARespository.findAll();
    }

    public Optional<Bitacora> findById(Long id){
        return bitacoraJPARespository.findById(id);
    }

    public Bitacora save(Bitacora bitacora){
        return bitacoraJPARespository.save(bitacora);
    }

    @Override
    public void deleteById(Long id) {
        bitacoraJPARespository.deleteById(id);
    }
}
