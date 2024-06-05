package com.creacionesrobert.sastreria.repository;

import com.creacionesrobert.sastreria.model.entities.Cliente;
import com.creacionesrobert.sastreria.model.entities.Talla;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TallaJPARepository extends CrudRepository<Talla,Long> {

    public List<Talla> findByCliente(Cliente cliente);
}
