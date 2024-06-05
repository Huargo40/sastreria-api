package com.creacionesrobert.sastreria.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tallas")
public class Talla {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTalla;

    private String tallaSolicitada;
    private String medidas;
    private String genero;
    private String tipo;
    private String estilo;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
}
