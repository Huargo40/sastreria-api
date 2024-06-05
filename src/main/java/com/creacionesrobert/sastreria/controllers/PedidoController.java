package com.creacionesrobert.sastreria.controllers;

import com.creacionesrobert.sastreria.model.entities.Empleado;
import com.creacionesrobert.sastreria.model.entities.MetodoPago;
import com.creacionesrobert.sastreria.model.entities.Pedido;
import com.creacionesrobert.sastreria.service.EmpleadoService;
import com.creacionesrobert.sastreria.service.PedidoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class PedidoController {

    private final PedidoService pedidoService;
    @GetMapping("/pedidos/{id}")
    public ResponseEntity<Pedido> getPedido(@PathVariable Long id){

        Optional<Pedido> pedido = pedidoService.findById(id);

        if (pedido.isPresent()){
            return ResponseEntity.status(HttpStatus.OK).body(pedido.get());
        }

        return ResponseEntity.notFound().build();
    }

    @GetMapping("/pedidos")
    public ResponseEntity<List<Pedido>> getPedidos(){

        List<Pedido> pedidosList = pedidoService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(pedidosList);
    }


    @PostMapping("/pedidos")
    public ResponseEntity<Pedido> create(@RequestBody Pedido pedido) {
        return new ResponseEntity<>(pedidoService.save(pedido), HttpStatus.CREATED);
    }

    @DeleteMapping("/pedidos/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        pedidoService.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PutMapping("/pedidos")
    public ResponseEntity<Pedido> update(@RequestBody Pedido pedido){
        Optional<Pedido> pedidoOptional = pedidoService.findById(pedido.getIdPedido());
        if (pedidoOptional.isPresent()) {
            Pedido pedidoExistente = pedidoOptional.get();
            return ResponseEntity.status(HttpStatus.OK).body(pedidoService.save(pedido));
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
