package com.creacionesrobert.sastreria.service.impl;

import com.creacionesrobert.sastreria.model.entities.Empleado;
import com.creacionesrobert.sastreria.presistence.EmpleadoRepository;
import com.creacionesrobert.sastreria.service.EmpleadoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmpleadoServiceImpl implements EmpleadoService {

    private final EmpleadoRepository empleadoRepository;

    @Override
    public List<Empleado> findAll() {
        return (List<Empleado>) empleadoRepository.findAll();
    }

    @Override
    public Optional<Empleado> findById(Long id) {
        return empleadoRepository.findById(id);
    }

    @Override
    public Empleado save(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    @Override
    public void deleteById(Long id){
        empleadoRepository.deleteById(id);
    }


}
