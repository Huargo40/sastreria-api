package com.creacionesrobert.sastreria.service.impl;

import com.creacionesrobert.sastreria.model.entities.DetallePedido;
import com.creacionesrobert.sastreria.presistence.DetallePedidoRepository;
import com.creacionesrobert.sastreria.service.DetallePedidoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DetallePedidoServiceImpl implements DetallePedidoService {

    private final DetallePedidoRepository detallePedidoRepository;

    @Override
    public List<DetallePedido> findAll() {
        return (List<DetallePedido>) detallePedidoRepository.findAll();
    }

    @Override
    public Optional<DetallePedido> findById(Long id) {
        return detallePedidoRepository.findById(id);
    }

    @Override
    public DetallePedido save(DetallePedido detallePedido) {
        return detallePedidoRepository.save(detallePedido);
    }

    @Override
    public void deleteById(Long id){
        detallePedidoRepository.deleteById(id);
    }
}
