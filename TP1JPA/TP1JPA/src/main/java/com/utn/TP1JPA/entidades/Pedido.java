package com.utn.TP1JPA.entidades;

import com.utn.TP1JPA.enumeraciones.*;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "Pedido") //Se llama igual que la clase

public class Pedido extends BaseEntidad{
    @Temporal(TemporalType.DATE) //Anoto la fecha para que se guarde como date
    private Date fecha;
    private double total;
    private TipoEnvio tipoEnvio;
    private Estado estado;

    @OneToOne(cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name = "factura-id")
    private Factura factura;

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true, fetch = FetchType.EAGER) //Es necesario agregar el parametro de "FetchType.EAGER"
    @JoinColumn(name = "Pedido-id")
    @Builder.Default
    private List<DetallePedido> detallePedidos = new ArrayList<>();

    public void agregarDetallePedido(DetallePedido detallePedidoed){

        detallePedidos.add(detallePedidoed);
    }


}
