package com.creacionesrobert.sastreria.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;

    private String nombres;
    private String identificacion;
    private String telefono;
    private Integer edad;

    @ManyToOne
    @JoinColumn(name = "id_pago")
    private MetodoPago metodoPago;

    @JsonIgnore
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private List<DetallePedido> detallesPedidosList;

    @JsonIgnore
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private List<Talla> tallasList;
}
