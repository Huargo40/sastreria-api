package com.creacionesrobert.sastreria.presistence.Impl;

import com.creacionesrobert.sastreria.model.entities.Empleado;
import com.creacionesrobert.sastreria.presistence.EmpleadoRepository;
import com.creacionesrobert.sastreria.repository.EmpleadoJPARepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class EmpleadoRepositoryImpl implements EmpleadoRepository {

    private final EmpleadoJPARepository empleadoJPARepository;

    public List<Empleado> findAll(){
        return (List<Empleado>) empleadoJPARepository.findAll();
    }

    public Optional<Empleado> findById(Long id){
        return empleadoJPARepository.findById(id);
    }

    public Empleado save(Empleado empleado){
        return empleadoJPARepository.save(empleado);
    }

    public void deleteById(Long id){
        empleadoJPARepository.deleteById(id);
    }
}
