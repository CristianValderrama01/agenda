package com.agenda.api.service.impl;

import com.agenda.api.entity.TipoPersona;
import com.agenda.api.exceptions.ModeloNotFoundExeption;
import com.agenda.api.repository.TipoPersonaRepository;
import com.agenda.api.service.TipoPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoPersonaSerrviceImpl implements TipoPersonaService {

    @Autowired
    private TipoPersonaRepository repository;

    @Override
    public TipoPersona register(TipoPersona tipoPersona) {
        return repository.save(tipoPersona);
    }

    @Override
    public List<TipoPersona> getAll() {
        return repository.findAll();
    }

    @Override
    public TipoPersona update(TipoPersona tipoPersona) {
        return repository.save(tipoPersona);
    }

    @Override
    public TipoPersona getById(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new ModeloNotFoundExeption("ID NO ENCONTRADO " + id));
    }

    @Override
    public void delete(Integer id) {
        getById(id);
        repository.deleteById(id);
    }
}
