package com.agenda.api.controller;

import com.agenda.api.entity.TipoIdentificacion;
import com.agenda.api.service.TipoIdentificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tipos-identificacion")
public class TipoIdentificacionController {

    @Autowired
    private TipoIdentificacionService service;

    @PostMapping("/save")
    public ResponseEntity<TipoIdentificacion> register(@RequestBody TipoIdentificacion tipoIdentificacion) {
        return new ResponseEntity<TipoIdentificacion>(service.register(tipoIdentificacion), HttpStatus.CREATED);
    }

    @GetMapping("/list")
    public ResponseEntity<List<TipoIdentificacion>>  getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/search/{identidficador}")
    public ResponseEntity<TipoIdentificacion> getById(@PathVariable("identidficador") Integer id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @PutMapping("/update")
    public ResponseEntity<TipoIdentificacion> update(@RequestBody TipoIdentificacion tipoIdentificacion) {
        return new ResponseEntity<TipoIdentificacion>(service.register(tipoIdentificacion), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
