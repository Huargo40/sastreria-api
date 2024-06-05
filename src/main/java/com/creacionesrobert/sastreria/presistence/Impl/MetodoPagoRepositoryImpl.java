package com.creacionesrobert.sastreria.presistence.Impl;

import com.creacionesrobert.sastreria.model.entities.MetodoPago;
import com.creacionesrobert.sastreria.presistence.MetodoPagoRepository;
import com.creacionesrobert.sastreria.repository.MetodoPagoJPARepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class MetodoPagoRepositoryImpl implements MetodoPagoRepository {
    private final MetodoPagoJPARepository metodoPagoJPARepository;

    public List<MetodoPago> findAll(){
        return (List<MetodoPago>) metodoPagoJPARepository.findAll();
    }

    public Optional<MetodoPago> findById(Long id){
        return metodoPagoJPARepository.findById(id);
    }

    public MetodoPago save(MetodoPago metodoPago){
        return metodoPagoJPARepository.save(metodoPago);
    }

    public void deleteById(Long id){
        metodoPagoJPARepository.deleteById(id);
    }
}
