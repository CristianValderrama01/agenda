package com.agenda.api.controller;

import com.agenda.api.dto.PersonaDTO;
import com.agenda.api.dtosimple.PersonaDTOsimple;
import com.agenda.api.entity.Persona;
import com.agenda.api.service.PersonaService;
import com.agenda.api.service.impl.PersonaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonaController {

    @Autowired
    private PersonaServiceImpl service;

    @PostMapping
    public ResponseEntity<PersonaDTO> register(@RequestBody PersonaDTO persona) {
        return new ResponseEntity<>(service.registerDto(persona), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Persona>>  getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/{identidficador}")
    public ResponseEntity<Persona> getById(@PathVariable("identidficador") Integer id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @PutMapping
    public ResponseEntity<Persona> update(@RequestBody Persona persona) {
        return new ResponseEntity<Persona>(service.register(persona), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
