package com.creacionesrobert.sastreria.repository;

import com.creacionesrobert.sastreria.model.entities.Catalogo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatalogoJPARepository extends CrudRepository<Catalogo,Long> {
}
