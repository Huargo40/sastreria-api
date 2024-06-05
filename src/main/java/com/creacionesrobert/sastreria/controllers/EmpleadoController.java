package com.creacionesrobert.sastreria.controllers;

import com.creacionesrobert.sastreria.model.entities.Cliente;
import com.creacionesrobert.sastreria.model.entities.Empleado;
import com.creacionesrobert.sastreria.model.entities.MetodoPago;
import com.creacionesrobert.sastreria.service.EmpleadoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/empleados")
@RequiredArgsConstructor
//@CrossOrigin(origins = "http://localhost")
public class EmpleadoController {

    private final EmpleadoService empleadoService;
    @GetMapping("/{id}")
    public ResponseEntity<Empleado> getEmpleado(@PathVariable Long id){

        Optional<Empleado> empleado = empleadoService.findById(id);

        if (empleado.isPresent()){
            return ResponseEntity.status(HttpStatus.OK).body(empleado.get());
        }

        return ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<List<Empleado>> getEmpleados(){

        List<Empleado> empleadosList = empleadoService.findAll();
            return ResponseEntity.status(HttpStatus.OK).body(empleadosList);
    }

    @PostMapping
    public ResponseEntity<Empleado> create(@RequestBody Empleado empleado) {
        return new ResponseEntity<>(empleadoService.save(empleado), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        empleadoService.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PutMapping
    public ResponseEntity<Empleado> update(@RequestBody Empleado empleado){
        Optional<Empleado> empleadoOptional = empleadoService.findById(empleado.getIdEmpleado());
        if (empleadoOptional.isPresent()) {
            Empleado empleadoExistente = empleadoOptional.get();
            empleadoExistente.setNombreEmpleado(empleado.getNombreEmpleado());
            empleadoExistente.setDUI(empleado.getDUI());
            empleadoExistente.setTipoRol(empleado.getTipoRol());
            empleadoExistente.setFecha(empleado.getFecha());
            empleadoExistente.setTelefono(empleado.getTelefono());
            empleadoExistente.setDireccion(empleado.getDireccion());
            empleadoExistente.setNick(empleado.getNick());
            empleadoExistente.setPass(empleado.getPass());
            return ResponseEntity.status(HttpStatus.OK).body(empleadoService.save(empleadoExistente));
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
