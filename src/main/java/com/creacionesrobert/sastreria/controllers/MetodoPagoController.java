package com.creacionesrobert.sastreria.controllers;

import com.creacionesrobert.sastreria.model.entities.Empleado;
import com.creacionesrobert.sastreria.model.entities.MetodoPago;
import com.creacionesrobert.sastreria.service.EmpleadoService;
import com.creacionesrobert.sastreria.service.MetodoPagoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class MetodoPagoController {

    private final MetodoPagoService metodoPagoService;
    @GetMapping("/metodos-pago/{id}")
    public ResponseEntity<MetodoPago> getMetodoPago(@PathVariable Long id){

        Optional<MetodoPago> metodoPago = metodoPagoService.findById(id);

        if (metodoPago.isPresent()){
            return ResponseEntity.status(HttpStatus.OK).body(metodoPago.get());
        }

        return ResponseEntity.notFound().build();
    }

    @GetMapping("/metodos-pago")
    public ResponseEntity<List<MetodoPago>> getMetodosPago(){

        List<MetodoPago> metodosPagoList = metodoPagoService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(metodosPagoList);
    }


    @PostMapping("/metodos-pago")
    public ResponseEntity<MetodoPago> create(@RequestBody MetodoPago metodoPago) {
        return new ResponseEntity<>(metodoPagoService.save(metodoPago), HttpStatus.CREATED);
    }

    @DeleteMapping("/metodos-pago/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        metodoPagoService.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PutMapping("/metodos-pago")
    public ResponseEntity<MetodoPago> update(@RequestBody MetodoPago metodoPago){
        Optional<MetodoPago> metodoPagoOptional = metodoPagoService.findById(metodoPago.getIdPago());
        if (metodoPagoOptional.isPresent()) {
            MetodoPago metodoPagoExistente = metodoPagoOptional.get();
            metodoPagoExistente.setEfectivo(metodoPago.getEfectivo());
            metodoPagoExistente.setTarjeta(metodoPago.getTarjeta());
            return ResponseEntity.status(HttpStatus.OK).body(metodoPagoService.save(metodoPagoExistente));
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
