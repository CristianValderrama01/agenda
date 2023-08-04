package com.agenda.api.service.impl;

import com.agenda.api.entity.TipoIdentificacion;
import com.agenda.api.exceptions.ModeloNotFoundExeption;
import com.agenda.api.repository.TipoIdentificacionRepository;
import com.agenda.api.service.CRUD;
import com.agenda.api.service.TipoIdentificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoIdentificacionServiceImpl implements TipoIdentificacionService {

    @Autowired
    private TipoIdentificacionRepository repository;


    @Override
    public TipoIdentificacion register(TipoIdentificacion tipoIdentificacion) {
        return repository.save(tipoIdentificacion);
    }

    @Override
    public List<TipoIdentificacion> getAll() {
        return repository.findAll();
    }

    @Override
    public TipoIdentificacion update(TipoIdentificacion tipoIdentificacion) {
        return repository.save(tipoIdentificacion);
    }

    @Override
    public TipoIdentificacion getById(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new ModeloNotFoundExeption("ID NO ENCONTRADO " + id));
    }

    @Override
    public void delete(Integer id) {
        getById(id);
        repository.deleteById(id);
    }
}
