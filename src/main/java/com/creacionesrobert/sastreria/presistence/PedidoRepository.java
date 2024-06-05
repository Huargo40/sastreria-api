package com.creacionesrobert.sastreria.presistence;

import com.creacionesrobert.sastreria.model.entities.Pedido;
import java.util.List;
import java.util.Optional;

public interface PedidoRepository {
    public List<Pedido> findAll();

    public Optional<Pedido> findById(Long id);

    public Pedido save(Pedido pedido);

    public void deleteById(Long id);
}
