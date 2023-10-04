package com.utn.TPAPIRESTDiaz.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "libro")
public class Libro extends Base {

    @NotNull
    @Column(name = "autor")
    private String autor;

    @NotNull
    @Column(name = "fecha")
    private int fecha;

    @NotNull
    @Column(name = "genero")
    private String genero;

    @NotNull
    @Column(name = "paginas")
    private int paginas;

    @NotNull
    @Column(name = "titulo")
    private String titulo;

    @ManyToMany(cascade = CascadeType.REFRESH)
    private List<Autor> autores = new ArrayList<>();

}