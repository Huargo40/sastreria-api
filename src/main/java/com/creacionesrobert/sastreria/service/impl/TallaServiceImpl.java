package com.creacionesrobert.sastreria.service.impl;

import com.creacionesrobert.sastreria.model.entities.Cliente;
import com.creacionesrobert.sastreria.model.entities.Talla;
import com.creacionesrobert.sastreria.presistence.TallaRepository;
import com.creacionesrobert.sastreria.service.TallaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TallaServiceImpl implements TallaService {

    private final TallaRepository tallaRepository;

    @Override
    public List<Talla> findAll() {
        return (List<Talla>) tallaRepository.findAll();
    }

    @Override
    public Optional<Talla> findById(Long id) {
        return tallaRepository.findById(id);
    }

    @Override
    public List<Talla> findByCliente(Cliente cliente) {
        return tallaRepository.findByCliente(cliente);
    }

    @Override
    public Talla save(Talla talla) {
        return tallaRepository.save(talla);
    }

    @Override
    public void deleteById(Long id){
        tallaRepository.deleteById(id);
    }
}
