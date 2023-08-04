package com.agenda.api.controller;

import com.agenda.api.entity.Agenda;
import com.agenda.api.service.AgendaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("agendas")
public class AgendaController {

    private static final Logger log = LoggerFactory.getLogger(AgendaController.class);

    @Autowired
    private AgendaService service;

    @PostMapping
    public ResponseEntity<Agenda> register(@RequestBody Agenda agenda) {
        return new ResponseEntity<Agenda>(service.register(agenda), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Agenda>>  getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/{identidficador}")
    public ResponseEntity<Agenda> getById(@PathVariable("identidficador") Integer id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @PutMapping
    public ResponseEntity<Agenda> update(@RequestBody Agenda agenda) {
        return new ResponseEntity<Agenda>(service.register(agenda), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
