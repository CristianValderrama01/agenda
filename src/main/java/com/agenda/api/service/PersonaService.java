package com.agenda.api.service;

import com.agenda.api.dto.PersonaDTO;
import com.agenda.api.dtosimple.PersonaDTOsimple;
import com.agenda.api.entity.Persona;

public interface PersonaService extends CRUD<Persona, Integer>{

    PersonaDTO registerDto(PersonaDTO persona);
}
