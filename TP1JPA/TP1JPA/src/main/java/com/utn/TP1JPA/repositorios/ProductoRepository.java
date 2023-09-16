package com.utn.TP1JPA.repositorios;

import com.utn.TP1JPA.entidades.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto,Long> {
}
