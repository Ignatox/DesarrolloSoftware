package com.utn.TP1JPA.entidades;

import com.utn.TP1JPA.enumeraciones.Tipo;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Producto extends BaseEntidad{
    public Tipo tipo;
    public int tiempoEstimadoCocina;
    public String denominacion;
    public double precioCompra;
    public double precioVenta;
    public int stockActual;
    public int stockMinimo;
    public String unidadMedida;
    public String receta;

}
