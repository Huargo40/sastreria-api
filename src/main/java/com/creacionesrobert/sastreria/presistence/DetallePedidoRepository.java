package com.creacionesrobert.sastreria.presistence;

import com.creacionesrobert.sastreria.model.entities.DetallePedido;
import java.util.List;
import java.util.Optional;

public interface DetallePedidoRepository {
    public List<DetallePedido> findAll();

    public Optional<DetallePedido> findById(Long id);

    public DetallePedido save(DetallePedido detallePedido);

    public void deleteById(Long id);
}
