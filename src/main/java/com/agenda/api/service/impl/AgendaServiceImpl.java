package com.agenda.api.service.impl;

import com.agenda.api.entity.Agenda;
import com.agenda.api.exceptions.ModeloNotFoundExeption;
import com.agenda.api.repository.AgendaRepository;
import com.agenda.api.repository.ClaseRepository;
import com.agenda.api.service.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgendaServiceImpl implements AgendaService {

    @Autowired
    private AgendaRepository repository;


    @Override
    public Agenda register(Agenda agenda) {
        return repository.save(agenda);
    }

    @Override
    public List<Agenda> getAll() {
        return repository.findAll();
    }

    @Override
    public Agenda update(Agenda agenda) {
        return repository.save(agenda);
    }

    @Override
    public Agenda getById(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new ModeloNotFoundExeption("ID NO ENCONTRADO " + id));
    }

    @Override
    public void delete(Integer id) {
        getById(id);
        repository.deleteById(id);
    }
}
