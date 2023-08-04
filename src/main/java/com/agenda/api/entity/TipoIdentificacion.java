package com.agenda.api.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tipos_identificacion")
public class TipoIdentificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_identificacion")
    private Integer id;

    @Column(name = "nombre", unique = true)
    private String nombre;

    @Column(name = "descripcion", length = 20)
    private String descripcion;
}
