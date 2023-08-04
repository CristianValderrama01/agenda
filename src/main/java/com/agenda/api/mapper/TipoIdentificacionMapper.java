package com.agenda.api.mapper;

import com.agenda.api.dto.TipoIdentificacionDTO;
import com.agenda.api.entity.TipoIdentificacion;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface TipoIdentificacionMapper extends GenericMapper<TipoIdentificacion, TipoIdentificacionDTO>{

    @Override
    @Mappings({
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "descripcion", target = "description")
    })
    TipoIdentificacionDTO toDto(TipoIdentificacion entity);

}
