package com.creacionesrobert.sastreria.repository;

import com.creacionesrobert.sastreria.model.entities.DetallePedido;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetallePedidoJPARepository extends CrudRepository<DetallePedido,Long> {
}
