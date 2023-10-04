package com.utn.TPAPIRESTDiaz.repositories;

import com.utn.TPAPIRESTDiaz.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository<Persona,Long> {
}
