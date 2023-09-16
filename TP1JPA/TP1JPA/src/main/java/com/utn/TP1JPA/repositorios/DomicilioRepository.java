package com.utn.TP1JPA.repositorios;

import com.utn.TP1JPA.entidades.Domicilio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DomicilioRepository extends JpaRepository<Domicilio,Long> {
}
