/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carritodecompras;

/**
 *
 * EQUIPO: Denisse Joya Ramírez
           Perla Susana Diaz Rios
           Evelyn Merari Medina Urdiana 
           Lesly Danai Osorio Bezares 
 */
public class Producto {
    private int id;
    private String nombre;
    private String descripcion;
    private float precio;
    private int stock;
    private String vendedor;

    public Producto(int id, String nombre, String descripcion, float precio, int stock, String vendedor) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.vendedor = vendedor;
    }

    public void verDetalle() {
        System.out.println(nombre + ": " + descripcion + " - $" + precio);
    }

    public void actualizarStock(int cantidadVendida) {
        this.stock -= cantidadVendida;
    }

    public float getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }
}
