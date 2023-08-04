package com.agenda.api.controller;

import com.agenda.api.entity.TipoPersona;
import com.agenda.api.service.TipoPersonaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tipos-persona")
public class TipoPersonaController {

    private static final Logger log = LoggerFactory.getLogger(TipoPersonaController.class);

    @Autowired
    private TipoPersonaService service;

    @PostMapping
    public ResponseEntity<TipoPersona> register(@RequestBody TipoPersona tipoPersona) {
        log.info("REST for register, Request: {}, {}", tipoPersona);
        return new ResponseEntity<>(service.register(tipoPersona), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<TipoPersona>>  getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/{identidficador}")
    public ResponseEntity<TipoPersona> getById(@PathVariable("identidficador") Integer id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @PutMapping
    public ResponseEntity<TipoPersona> update(@RequestBody TipoPersona tipoPersona) {
        return new ResponseEntity<TipoPersona>(service.register(tipoPersona), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
