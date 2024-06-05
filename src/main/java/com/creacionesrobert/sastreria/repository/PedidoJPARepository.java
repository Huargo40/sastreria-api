package com.creacionesrobert.sastreria.repository;

import com.creacionesrobert.sastreria.model.entities.Pedido;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoJPARepository extends CrudRepository<Pedido,Long> {
}
