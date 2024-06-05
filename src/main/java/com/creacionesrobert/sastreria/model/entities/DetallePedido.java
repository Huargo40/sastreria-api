package com.creacionesrobert.sastreria.model.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "detalle_pedido")
public class DetallePedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetallePedido;

    @ManyToOne
    @JoinColumn(name = "id_pedido",nullable = false)
    @JsonBackReference//Permite mapear la lista de lineaDocInv en documentoInv para insercion
    private Pedido pedido;

    private Double monto;

    @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date fechaDeTomaDeTalla;

    @ManyToOne
    @JoinColumn(name = "id_cliente",nullable = false)
    private Cliente cliente;
}