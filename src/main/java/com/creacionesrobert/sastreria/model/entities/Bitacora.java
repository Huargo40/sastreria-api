package com.creacionesrobert.sastreria.model.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "bitacora")
public class Bitacora {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBitacora;

    @ManyToOne
    @JoinColumn(name = "id_empleado")
    private Empleado empleado;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

    private String descripcion;
}
