package com.agenda.api.controller;

import com.agenda.api.entity.Clase;
import com.agenda.api.service.ClaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class ClaseController {

    @Autowired
    private ClaseService service;

    @PostMapping
    public ResponseEntity<Clase> register(@RequestBody Clase clase) {
        return new ResponseEntity<>(service.register(clase), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Clase>>  getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/{identidficador}")
    public ResponseEntity<Clase> getById(@PathVariable("identidficador") Integer id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @PutMapping
    public ResponseEntity<Clase> update(@RequestBody Clase clase) {
        return new ResponseEntity<Clase>(service.register(clase), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
