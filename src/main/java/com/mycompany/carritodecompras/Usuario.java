/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carritodecompras;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Denisse Joya
 */

public class Usuario {
    private int id;
    private String nombre;
    private String email;
    private List<Carrito> carritos;

    public Usuario(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.carritos = new ArrayList<>();
    }

    public void iniciarSesion() {
        System.out.println("Sesión iniciada para: " + nombre);
    }

    public void agregarAlCarrito(Carrito carrito) {
        carritos.add(carrito);
    }
}

