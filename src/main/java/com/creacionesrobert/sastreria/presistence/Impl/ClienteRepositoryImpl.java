package com.creacionesrobert.sastreria.presistence.Impl;

import com.creacionesrobert.sastreria.model.entities.Cliente;
import com.creacionesrobert.sastreria.presistence.ClienteRepository;
import com.creacionesrobert.sastreria.repository.ClienteJPARepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class ClienteRepositoryImpl implements ClienteRepository {
    private final ClienteJPARepository clienteJPARepository;

    public List<Cliente> findAll(){
        return (List<Cliente>) clienteJPARepository.findAll();
    }

    public Optional<Cliente> findById(Long id){
        return clienteJPARepository.findById(id);
    }

    public Cliente save(Cliente cliente){
        return clienteJPARepository.save(cliente);
    }

    public void deleteById(Long id){
        clienteJPARepository.deleteById(id);
    }
}
