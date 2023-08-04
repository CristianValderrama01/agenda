package com.agenda.api.mapper;

import com.agenda.api.dto.ClaseDTO;
import com.agenda.api.entity.Clase;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClaseMapper extends GenericMapper<Clase, ClaseDTO>{
}
