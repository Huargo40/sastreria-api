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
@Table(name = "metodo_pago")
public class MetodoPago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPago;

    private String tarjeta;
    private String efectivo;

    @JsonIgnore
    @OneToMany(mappedBy = "metodoPago", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private List<Cliente> clientesPagoList;
}
