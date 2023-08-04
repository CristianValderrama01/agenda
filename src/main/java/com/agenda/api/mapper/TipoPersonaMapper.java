package com.agenda.api.mapper;

import com.agenda.api.dto.TipoPersonaDTO;
import com.agenda.api.entity.TipoPersona;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TipoPersonaMapper extends GenericMapper<TipoPersona, TipoPersonaDTO>{
}
