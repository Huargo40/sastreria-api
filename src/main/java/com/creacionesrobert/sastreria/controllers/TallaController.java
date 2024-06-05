package com.creacionesrobert.sastreria.controllers;

import com.creacionesrobert.sastreria.model.entities.Cliente;
import com.creacionesrobert.sastreria.model.entities.Pedido;
import com.creacionesrobert.sastreria.model.entities.Talla;
import com.creacionesrobert.sastreria.service.TallaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class TallaController {

    private final TallaService tallaService;
    @GetMapping("/tallas/{id}")
    public ResponseEntity<Talla> getTalla(@PathVariable Long id){

        Optional<Talla> talla = tallaService.findById(id);

        if (talla.isPresent()){
            return ResponseEntity.status(HttpStatus.OK).body(talla.get());
        }

        return ResponseEntity.notFound().build();
    }

    @GetMapping("/clientes/{id}/tallas")
    public ResponseEntity<List<Talla>> getTallas(@PathVariable Long id){
        List<Talla> tallasList = tallaService.findByCliente(Cliente.builder().idCliente(id).build());
        return ResponseEntity.status(HttpStatus.OK).body(tallasList);
    }


    @PostMapping("/clientes/{id}/tallas")
    public ResponseEntity<Talla> create(@PathVariable Long id,@RequestBody Talla talla) {
        talla.setCliente(Cliente.builder().idCliente(id).build());
        talla.getCliente().setIdCliente(id);
        return new ResponseEntity<>(tallaService.save(talla), HttpStatus.CREATED);
    }

    @DeleteMapping("/tallas/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        tallaService.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PutMapping("/clientes/{id}/tallas")
    public ResponseEntity<Talla> update(@PathVariable Long id,@RequestBody Talla talla){
        talla.setCliente(Cliente.builder().idCliente(id).build());
        Optional<Talla> tallaOptional = tallaService.findById(talla.getIdTalla());
        if (tallaOptional.isPresent()) {
            Talla tallaExistente = tallaOptional.get();
            return ResponseEntity.status(HttpStatus.OK).body(tallaService.save(talla));
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
