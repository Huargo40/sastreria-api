package com.creacionesrobert.sastreria.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "empleado")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmpleado;

    private String nombreEmpleado;
    private String DUI;
    private String tipoRol;

    @Temporal(TemporalType.DATE)
    private Date fecha;

    private String telefono;
    private String direccion;
    private String nick;
    private String pass;

    @JsonIgnore
    @OneToMany(mappedBy = "empleado", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private List<Pedido> pedidosList;

    @JsonIgnore
    @OneToMany(mappedBy = "empleado", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private List<Bitacora> bitacoraList;
}
