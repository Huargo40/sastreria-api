package com.creacionesrobert.sastreria.repository;

import com.creacionesrobert.sastreria.model.entities.Bitacora;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BitacoraJPARespository extends CrudRepository<Bitacora,Long> {
}
