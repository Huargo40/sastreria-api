package com.creacionesrobert.sastreria.service.impl;

import com.creacionesrobert.sastreria.model.entities.MetodoPago;
import com.creacionesrobert.sastreria.presistence.MetodoPagoRepository;
import com.creacionesrobert.sastreria.service.MetodoPagoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MetodoPagoServiceImpl implements MetodoPagoService {

    private final MetodoPagoRepository metodoPagoRepository;

    @Override
    public List<MetodoPago> findAll() {
        return (List<MetodoPago>) metodoPagoRepository.findAll();
    }

    @Override
    public Optional<MetodoPago> findById(Long id) {
        return metodoPagoRepository.findById(id);
    }

    @Override
    public MetodoPago save(MetodoPago metodoPago) {
        return metodoPagoRepository.save(metodoPago);
    }

    @Override
    public void deleteById(Long id){
        metodoPagoRepository.deleteById(id);
    }
}
