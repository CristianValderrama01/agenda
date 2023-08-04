package com.agenda.api.service.impl;

import com.agenda.api.dto.PersonaDTO;
import com.agenda.api.dtosimple.PersonaDTOsimple;
import com.agenda.api.entity.Persona;
import com.agenda.api.exceptions.ModeloNotFoundExeption;
import com.agenda.api.mapper.PersonaMapper;
import com.agenda.api.repository.PersonaRepository;
import com.agenda.api.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository repository;

    @Autowired
    private PersonaMapper mapper;


    @Override
    public PersonaDTO registerDto(PersonaDTO persona) {
        Persona p = repository.save( mapper.toEntity(persona) );
        return mapper.toDto( p ) ;
    }

    @Override
    public Persona register(Persona persona) {
        return repository.save(persona);
    }

    @Override
    public List<Persona> getAll() {
        return repository.findAll();
    }

    @Override
    public Persona update(Persona persona) {
        return repository.save(persona);
    }

    @Override
    public Persona getById(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new ModeloNotFoundExeption("ID NO ENCONTRADO " + id));
    }

    @Override
    public void delete(Integer id){
        repository.deleteById(id);
    }
}
