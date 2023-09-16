package com.utn.TP1JPA.entidades;

import com.utn.TP1JPA.enumeraciones.FormaPago;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Factura extends BaseEntidad{
    public FormaPago formapago;
    public int numero;
    public Date fecha;
    public double descuento;
    public int total;


}
