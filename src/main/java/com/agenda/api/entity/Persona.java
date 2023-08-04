package com.agenda.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "personas")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona")
    private Integer id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "numero_identificacion")
    private Integer numeroIdentificacion;

    @Column(name = "fecha_nacimiento")
    private LocalDateTime fechaNacimiento;

    @ManyToOne
    @JoinColumn(name = "id_tipo_identificacion_fk", referencedColumnName = "id_tipo_identificacion")
    private TipoIdentificacion tipoIdentificacion;

    @ManyToOne
    @JoinColumn(name = "id_tipo_persona_fk", referencedColumnName = "id_tipo_persona")
    private TipoPersona tipoPersona;

}
