package com.creacionesrobert.sastreria.model.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPedido;

    @ManyToOne
    @JoinColumn(name = "id_empleado",nullable = false)
    private Empleado empleado;

    private String nombreSolicitante;
    private String tipo;

    @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date fechaDeEntrega;

    private String telefono;
    private String descripcion;
    private Double montoTotal;

    @OneToMany(mappedBy = "pedido", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE}, fetch = FetchType.LAZY)
    @JsonManagedReference//Permite mapear la lista de lineaDocInv en documentoInv para insercion
    private List<DetallePedido> detallesPedidoList;
}
