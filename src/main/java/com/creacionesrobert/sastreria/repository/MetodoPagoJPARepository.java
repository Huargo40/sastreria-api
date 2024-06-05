package com.creacionesrobert.sastreria.repository;

import com.creacionesrobert.sastreria.model.entities.MetodoPago;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetodoPagoJPARepository extends CrudRepository<MetodoPago,Long> {
}
