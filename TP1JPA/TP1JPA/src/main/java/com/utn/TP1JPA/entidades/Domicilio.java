package com.utn.TP1JPA.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "Domicilio") //Se llama igual que la clase
public class Domicilio extends BaseEntidad{
    private String calle;
    private String numero;
    private String localidad;
/*@OneToOne(mappedBy = "domicilio") //el atributo de domicilio que pertenece a la clase cliente*/
@ManyToOne()
@JoinColumn(name = "cliente_id")
    private Cliente cliente;

}
