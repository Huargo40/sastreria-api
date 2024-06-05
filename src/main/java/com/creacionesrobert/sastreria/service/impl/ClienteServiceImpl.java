package com.creacionesrobert.sastreria.service.impl;

import com.creacionesrobert.sastreria.model.entities.Cliente;
import com.creacionesrobert.sastreria.presistence.ClienteRepository;
import com.creacionesrobert.sastreria.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository clienteRepository;

    @Override
    public List<Cliente> findAll() {
        return (List<Cliente>) clienteRepository.findAll();
    }

    @Override
    public Optional<Cliente> findById(Long id) {
        return clienteRepository.findById(id);
    }

    @Override
    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public void deleteById(Long id){
        clienteRepository.deleteById(id);
    }
}
