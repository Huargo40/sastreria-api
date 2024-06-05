package com.creacionesrobert.sastreria.presistence.Impl;

import com.creacionesrobert.sastreria.model.entities.DetallePedido;
import com.creacionesrobert.sastreria.presistence.DetallePedidoRepository;
import com.creacionesrobert.sastreria.repository.DetallePedidoJPARepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class DetallePedidoRepositoryImpl implements DetallePedidoRepository {
    private final DetallePedidoJPARepository detallePedidoJPARepository;

    public List<DetallePedido> findAll(){
        return (List<DetallePedido>) detallePedidoJPARepository.findAll();
    }

    public Optional<DetallePedido> findById(Long id){
        return detallePedidoJPARepository.findById(id);
    }

    public DetallePedido save(DetallePedido detallePedido){
        return detallePedidoJPARepository.save(detallePedido);
    }

    public void deleteById(Long id){
        detallePedidoJPARepository.deleteById(id);
    }
}
