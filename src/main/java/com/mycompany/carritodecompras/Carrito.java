/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carritodecompras;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * EQUIPO: Denisse Joya Ramírez 
           Perla Susana Diaz Rios
           Evelyn Merari Medina Urdiana 
           Lesly Danai Osorio Bezares 
   
 */


public class Carrito {
    private int id;
    private List<ProductoCarrito> listaProductos;
    private float total;
    private boolean envioGratis;

    public Carrito(int id) {
        this.id = id;
        this.listaProductos = new ArrayList<>();
        this.total = 0;
        this.envioGratis = false;
    }

    public void agregarProducto(Producto producto, int cantidad) {
        ProductoCarrito pc = new ProductoCarrito(producto, cantidad);
        listaProductos.add(pc);
        calcularTotal();
    }

    public void calcularTotal() {
        total = 0;
        for (ProductoCarrito pc : listaProductos) {
            total += pc.getSubtotal();
        }
        envioGratis = total > 100;
    }

    public void mostrarResumen() {
        System.out.println("Resumen del carrito:");
        for (ProductoCarrito pc : listaProductos) {
            System.out.println(pc);
        }
        System.out.println("Total: $" + total);
        System.out.println("Envío gratis: " + (envioGratis ? "Sí" : "No"));
    }

    public float getTotal() {
        return total;
    }

    public List<ProductoCarrito> getListaProductos() {
        return listaProductos;
    }
}
