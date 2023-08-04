package com.agenda.api.dtosimple;

import com.agenda.api.entity.Persona;
import com.agenda.api.entity.TipoIdentificacion;
import com.agenda.api.entity.TipoPersona;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PersonaDTOsimple {

    private Integer id;
    private String nombre;
    private String apellido;
    //private Integer numeroIdentificacion;
    private LocalDateTime fechaNacimiento;
    private Integer IdTipoIdentificacion;
    private Integer IdTipoPersona;

    public PersonaDTOsimple() {
    }

    public PersonaDTOsimple toDto(Persona entidad){
        this.setId(entidad.getId());
        this.setNombre(entidad.getNombre());
        this.setApellido(entidad.getApellido());
        this.setFechaNacimiento(entidad.getFechaNacimiento());
        this.setIdTipoIdentificacion(entidad.getTipoIdentificacion().getId());
        this.setIdTipoPersona(entidad.getTipoPersona().getId());
        return this;
    }

    public Persona toEntity(PersonaDTOsimple dto) {
        Persona p = new Persona();
        p.setId(dto.getId());
        p.setNombre(dto.getNombre());
        p.setApellido(dto.getApellido());
        p.setFechaNacimiento(dto.getFechaNacimiento());

        TipoIdentificacion ti = new TipoIdentificacion();
        ti.setId(dto.getIdTipoIdentificacion());
        p.setTipoIdentificacion(ti);

        TipoPersona tp = new TipoPersona();
        tp.setId(dto.getIdTipoPersona());
        p.setTipoPersona(tp);

        return p;
    }
}
