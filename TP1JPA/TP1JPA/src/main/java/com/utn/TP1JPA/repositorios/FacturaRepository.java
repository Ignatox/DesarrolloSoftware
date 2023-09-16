package com.utn.TP1JPA.repositorios;

import com.utn.TP1JPA.entidades.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaRepository extends JpaRepository<Factura,Long> {
}
