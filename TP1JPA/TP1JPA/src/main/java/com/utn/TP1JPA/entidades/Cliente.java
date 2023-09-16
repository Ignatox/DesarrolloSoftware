package com.utn.TP1JPA.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "Cliente") //Se llama igual que la clase
public class Cliente extends BaseEntidad {
    @Column(name = "nombre")
    private String nombre;

    private String apellido;
    private String telefono;
    private String email;

    @OneToMany(mappedBy = "cliente", cascade =
            CascadeType.ALL, orphanRemoval = true,fetch =
            FetchType.EAGER)
    // OJO ES IMPORTANTE COLOCAR ESTA ANOTACIÓN SINO
    //ME DA ERROR
    @Builder.Default
    private List<Domicilio> domicilios = new
            ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true,fetch = FetchType.EAGER)
    @JoinColumn(name = "cliente-id")
    @Builder.Default
    private List<Pedido> pedidos = new ArrayList<>();
    public void agregarDomicilio(Domicilio domi){
        domicilios.add(domi);
    }
    public void mostrarDomicilios() {
        System.out.println("Domicilios de " + nombre + " " + apellido +
                ":");
        for (Domicilio domicilio : domicilios) {
            System.out.println("Calle: " + domicilio.getCalle() + "Numero:" + domicilio.getNumero());
        }
    }
    public void agregarPedido(Pedido ped){

        pedidos.add(ped);
    }

    public void mostrarPedidos() {
        System.out.println("Pedidos de " + nombre + " " + apellido + ":");
        for (Pedido pedido : pedidos) {
            System.out.println("Fecha: " + pedido.getFecha() + ", Total: " + pedido.getTotal());
            int counter = 0;
            for (DetallePedido detalle: pedido.getDetallePedidos()){
                counter += 1;
                System.out.println("Producto "+counter+": "+detalle.getProducto().getDenominacion()+"  cantidad: "+detalle.getCantidad()+"  subtotal: "+detalle.getSubtotal());
            }
        }
    }


}
