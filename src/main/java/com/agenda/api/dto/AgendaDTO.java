package com.agenda.api.dto;

import com.agenda.api.entity.Clase;
import com.agenda.api.entity.Persona;
import lombok.Data;

@Data
public class AgendaDTO {

    private Integer id;
    private Persona profesor;
    private Persona estudiante;
    private Clase clase;
}
