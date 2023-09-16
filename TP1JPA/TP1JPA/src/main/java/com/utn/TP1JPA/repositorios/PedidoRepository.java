package com.utn.TP1JPA.repositorios;

import com.utn.TP1JPA.entidades.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido,Long> {
}
