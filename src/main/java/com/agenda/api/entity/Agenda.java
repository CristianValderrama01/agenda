package com.agenda.api.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Agendas")
public class Agenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_agenda")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_profesor_fk", referencedColumnName = "id_persona")
    private Persona profesor;

    @ManyToOne
    @JoinColumn(name = "id_estudiante_fk", referencedColumnName = "id_persona")
    private Persona estudiante;

    @ManyToOne
    @JoinColumn(name = "id_clase_fk", referencedColumnName = "id_clase")
    private Clase clase;
}
