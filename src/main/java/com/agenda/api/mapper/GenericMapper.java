package com.agenda.api.mapper;

import java.util.List;

public interface GenericMapper<T, D> {

    T toEntity(D dto);
    D toDto(T entity);
    List<T> toEntitities(List<D> dtos);
    List<D> toDtos(List<T> entities);
}
