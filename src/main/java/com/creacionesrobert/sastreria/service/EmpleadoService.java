package com.creacionesrobert.sastreria.service;

import com.creacionesrobert.sastreria.model.entities.Empleado;

import java.util.List;
import java.util.Optional;

public interface EmpleadoService {
    public List<Empleado> findAll();

    public Optional<Empleado> findById(Long id);
    public Empleado save(Empleado empleado);

    public void deleteById(Long id);
}
