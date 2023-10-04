package com.utn.TPAPIRESTDiaz.repositories;

import com.utn.TPAPIRESTDiaz.entities.Libro;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends BaseRepository<Libro,Long> {
}
