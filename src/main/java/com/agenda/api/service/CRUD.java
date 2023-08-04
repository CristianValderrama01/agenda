package com.agenda.api.service;

import java.util.List;

public interface CRUD<T, ID> {

    T register(T t);
    List<T> getAll();
    T update(T t);
    T getById(ID id);
    void delete(ID id);
}
