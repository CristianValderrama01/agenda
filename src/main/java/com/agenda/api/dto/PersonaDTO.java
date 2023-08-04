package com.agenda.api.dto;

import com.agenda.api.entity.TipoIdentificacion;
import com.agenda.api.entity.TipoPersona;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PersonaDTO {

    private Integer id;
    private String nombre;
    private String apellido;
    private Integer numeroIdentificacion;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime fechaNacimiento;
    private Integer tipoIdentificacion;
    private Integer tipoPersona;
}
