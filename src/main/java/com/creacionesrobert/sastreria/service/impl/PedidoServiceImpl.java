package com.creacionesrobert.sastreria.service.impl;

import com.creacionesrobert.sastreria.model.entities.MetodoPago;
import com.creacionesrobert.sastreria.model.entities.Pedido;
import com.creacionesrobert.sastreria.presistence.MetodoPagoRepository;
import com.creacionesrobert.sastreria.presistence.PedidoRepository;
import com.creacionesrobert.sastreria.service.PedidoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PedidoServiceImpl implements PedidoService {

    private final PedidoRepository pedidoRepository;

    @Override
    public List<Pedido> findAll() {
        return (List<Pedido>) pedidoRepository.findAll();
    }

    @Override
    public Optional<Pedido> findById(Long id) {
        return pedidoRepository.findById(id);
    }

    @Override
    public Pedido save(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    @Override
    public void deleteById(Long id){
        pedidoRepository.deleteById(id);
    }
}
