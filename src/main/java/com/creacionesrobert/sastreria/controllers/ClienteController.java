package com.creacionesrobert.sastreria.controllers;

import com.creacionesrobert.sastreria.model.entities.Cliente;
import com.creacionesrobert.sastreria.model.entities.MetodoPago;
import com.creacionesrobert.sastreria.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/clientes")
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteService clienteService;
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> getCliente(@PathVariable Long id){

        Optional<Cliente> cliente = clienteService.findById(id);
        if (cliente.isPresent()){
            return ResponseEntity.status(HttpStatus.OK).body(cliente.get());
        }

        return ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<List<Cliente>> getCLientes(){

        List<Cliente> clienteList = clienteService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(clienteList);
    }

    @PostMapping
    public ResponseEntity<Cliente> create(@RequestBody Cliente cliente) {
        return new ResponseEntity<>(clienteService.save(cliente), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        clienteService.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PutMapping
    public ResponseEntity<Cliente> update(@RequestBody Cliente cliente){
        Optional<Cliente> clienteOptional = clienteService.findById(cliente.getIdCliente());
        if (clienteOptional.isPresent()) {
            Cliente clienteExistente = clienteOptional.get();
            clienteExistente.setNombres(cliente.getNombres());
            clienteExistente.setIdentificacion(cliente.getIdentificacion());
            clienteExistente.setTelefono(cliente.getTelefono());
            clienteExistente.setEdad(cliente.getEdad());
            clienteExistente.setMetodoPago(MetodoPago.builder().idPago(cliente.getMetodoPago().getIdPago()).build());
            return ResponseEntity.status(HttpStatus.OK).body(clienteService.save(clienteExistente));
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
