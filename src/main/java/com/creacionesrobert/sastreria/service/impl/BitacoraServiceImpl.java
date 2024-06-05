package com.creacionesrobert.sastreria.service.impl;

import com.creacionesrobert.sastreria.model.entities.Bitacora;
import com.creacionesrobert.sastreria.presistence.BitacoraRepository;
import com.creacionesrobert.sastreria.service.BitacoraService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BitacoraServiceImpl implements BitacoraService {

    private final BitacoraRepository bitacoraRepository;

    @Override
    public List<Bitacora> findAll() {
        return (List<Bitacora>) bitacoraRepository.findAll();
    }

    @Override
    public Optional<Bitacora> findById(Long id) {
        return bitacoraRepository.findById(id);
    }

    @Override
    public Bitacora save(Bitacora bitacora) {
        return bitacoraRepository.save(bitacora);
    }

    @Override
    public void deleteById(Long id){
        bitacoraRepository.deleteById(id);
    }
}
