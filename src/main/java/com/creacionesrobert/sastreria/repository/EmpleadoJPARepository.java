package com.creacionesrobert.sastreria.repository;

import com.creacionesrobert.sastreria.model.entities.Empleado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoJPARepository extends CrudRepository<Empleado,Long> {
}
