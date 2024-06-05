package com.creacionesrobert.sastreria.repository;

import com.creacionesrobert.sastreria.model.entities.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteJPARepository extends CrudRepository<Cliente,Long> {
}
