/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carritodecompras;

/**
 *
 * EQUIPO: Denisse Joya
           Perla Susana Diaz Rios
           Evelyn Merari Medina Urdiana 
           Lesly Danai Osorio Bezares 
 */
public class ProductoCarrito {
    private Producto producto;
    private int cantidad;
    private float subtotal;

    public ProductoCarrito(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        actualizarSubtotal();
    }

    public void actualizarCantidad(int cantidad) {
        this.cantidad = cantidad;
        actualizarSubtotal();
    }

    private void actualizarSubtotal() {
        this.subtotal = producto.getPrecio() * cantidad;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return cantidad + " x " + producto.getNombre() + " = $" + subtotal;
    }
}
