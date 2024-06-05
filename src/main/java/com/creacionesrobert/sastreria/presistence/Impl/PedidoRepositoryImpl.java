package com.creacionesrobert.sastreria.presistence.Impl;

import com.creacionesrobert.sastreria.model.entities.Pedido;
import com.creacionesrobert.sastreria.presistence.PedidoRepository;
import com.creacionesrobert.sastreria.repository.PedidoJPARepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class PedidoRepositoryImpl implements PedidoRepository {
    private final PedidoJPARepository pedidoJPARepository;

    public List<Pedido> findAll(){
        return (List<Pedido>) pedidoJPARepository.findAll();
    }

    public Optional<Pedido> findById(Long id){
        return pedidoJPARepository.findById(id);
    }

    public Pedido save(Pedido pedido){
        return pedidoJPARepository.save(pedido);
    }

    public void deleteById(Long id){
        pedidoJPARepository.deleteById(id);
    }
}
