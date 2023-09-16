package com.utn.TP1JPA.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@MappedSuperclass //Trabaja en el dominio como superclase pero no lo crea en la bd
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseEntidad implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;
}
