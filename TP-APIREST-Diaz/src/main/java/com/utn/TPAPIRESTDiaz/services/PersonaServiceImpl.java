package com.utn.TPAPIRESTDiaz.services;

import com.utn.TPAPIRESTDiaz.entities.Persona;
import com.utn.TPAPIRESTDiaz.repositories.BaseRepository;
import com.utn.TPAPIRESTDiaz.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl extends BaseServiceImpl <Persona, Long> implements PersonaService {

    @Autowired
    private final PersonaRepository personaRepository;


    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository, PersonaRepository personaRepository) {
        super(baseRepository);
        this.personaRepository = personaRepository;
    }
}