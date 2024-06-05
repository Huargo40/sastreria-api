package com.creacionesrobert.sastreria.model.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "catalogo")
public class Catalogo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCatalogo;

    private String clave;
    private String valor;
    private String descripcion;
}