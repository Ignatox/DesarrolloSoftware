package com.utn.TPAPIRESTDiaz.services;

import com.utn.TPAPIRESTDiaz.entities.Persona;
import com.utn.TPAPIRESTDiaz.repositories.BaseRepository;
import com.utn.TPAPIRESTDiaz.repositories.PersonaRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService implements BaseService<Persona>{
    private PersonaRepository personaRepository;

    public PersonaService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    @Override
    @Transactional
    public List<Persona> findALL() throws Exception {
        try {
            List<Persona> entities = personaRepository.findAll();
            return entities;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Persona findById(Long id) throws Exception {
        try{
            Optional<Persona> entityOptional = personaRepository.findById(id);
            return entityOptional.get();
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Persona save(Persona entity) throws Exception {
        try{
            entity = personaRepository.save(entity);
            return entity;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Persona update(Long id, Persona entity) throws Exception {
        try{
            Optional<Persona> entityOptional = personaRepository.findById(id);
            Persona entityUpdate = entityOptional.get();
            entityUpdate = personaRepository.save(entity);
            return entityUpdate;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(Long id) throws Exception {
        try{
            if(personaRepository.existsById(id)){
                personaRepository.deleteById(id);
                return true;
            } else {
                throw new Exception();
            }
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
