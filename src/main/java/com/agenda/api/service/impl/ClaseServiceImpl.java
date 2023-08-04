package com.agenda.api.service.impl;

import com.agenda.api.entity.Clase;
import com.agenda.api.exceptions.ModeloNotFoundExeption;
import com.agenda.api.repository.ClaseRepository;
import com.agenda.api.repository.TipoIdentificacionRepository;
import com.agenda.api.service.ClaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClaseServiceImpl  implements ClaseService {

    @Autowired
    private ClaseRepository repository;


    @Override
    public Clase register(Clase clase) {
        return repository.save(clase);
    }

    @Override
    public List<Clase> getAll() {
        return repository.findAll();
    }

    @Override
    public Clase update(Clase clase) {
        return repository.save(clase);
    }

    @Override
    public Clase getById(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new ModeloNotFoundExeption("ID NO ENCONTRADO " + id));
    }

    @Override
    public void delete(Integer id) {
        getById(id);
        repository.deleteById(id);
    }
}
