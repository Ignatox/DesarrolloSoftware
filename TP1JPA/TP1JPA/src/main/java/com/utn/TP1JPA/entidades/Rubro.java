package com.utn.TP1JPA.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Rubro extends BaseEntidad{
    public String denominacion;

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.EAGER)
    @JoinColumn(name = "rubro-id")
    @Builder.Default
    private List<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto prod){

        productos.add(prod);
    }

    public void mostrarProductos() {
        System.out.println("Los productos de este rubro son: ");
        for (Producto producto : productos) {
            System.out.println("Denominacion: " + producto.getDenominacion() + ", Receta: " + producto.getReceta()
                    +  ", Precio Compra: " + producto.getPrecioCompra()
                    + ", Stock Actual: " + producto.getStockActual()
                    + ", Tiempo Estimado Cocina: " + producto.getTiempoEstimadoCocina()
                    + ", Tipo: " + producto.getTipo());
        }
    }


}
