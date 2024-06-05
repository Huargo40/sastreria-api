package com.creacionesrobert.sastreria.presistence.Impl;

import com.creacionesrobert.sastreria.model.entities.Cliente;
import com.creacionesrobert.sastreria.model.entities.Pedido;
import com.creacionesrobert.sastreria.model.entities.Talla;
import com.creacionesrobert.sastreria.presistence.TallaRepository;
import com.creacionesrobert.sastreria.repository.PedidoJPARepository;
import com.creacionesrobert.sastreria.repository.TallaJPARepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class TallaRepositoryImpl implements TallaRepository {
    private final TallaJPARepository tallaJPARepository;

    public List<Talla> findAll(){
        return (List<Talla>) tallaJPARepository.findAll();
    }

    public Optional<Talla> findById(Long id){
        return tallaJPARepository.findById(id);
    }

    public List<Talla> findByCliente(Cliente cliente){
        return tallaJPARepository.findByCliente(cliente);
    };

    public Talla save(Talla talla){
        return tallaJPARepository.save(talla);
    }

    public void deleteById(Long id){
        tallaJPARepository.deleteById(id);
    }
}
