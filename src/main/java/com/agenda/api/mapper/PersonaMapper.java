package com.agenda.api.mapper;

import com.agenda.api.dto.PersonaDTO;
import com.agenda.api.entity.Persona;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {TipoIdentificacionMapper.class})
public interface PersonaMapper extends GenericMapper<Persona, PersonaDTO>{

    @Override
    @Mappings({
            @Mapping(source = "tipoIdentificacion", target = "tipoIdentificacion.id"),
            @Mapping(source = "tipoPersona", target = "tipoPersona.id")
    })
    Persona toEntity(PersonaDTO dto);

    @Override
    @Mappings({
            @Mapping(source = "tipoIdentificacion.id", target = "tipoIdentificacion"),
            @Mapping(source = "tipoPersona.id", target = "tipoPersona")
    })
    PersonaDTO toDto(Persona entity);
}
