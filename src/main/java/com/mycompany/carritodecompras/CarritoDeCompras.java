/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.carritodecompras;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Denisse Joya
 */


public class CarritoDeCompras extends JFrame {
    private Carrito carrito;
    private DefaultListModel<String> modeloLista;
    private JLabel lblTotal;

    public CarritoDeCompras() {
        setTitle("Carrito de Compras");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        carrito = new Carrito(1);
        modeloLista = new DefaultListModel<>();

        // Panel de productos
        JPanel panelProductos = new JPanel();
        panelProductos.setLayout(new GridLayout(0, 1));

        Producto p1 = new Producto(1, "Teclado", "Teclado mecánico", 50.0f, 20, "Logitech");
        Producto p2 = new Producto(2, "Monitor", "Monitor 24''", 150.0f, 10, "Samsung");

        JButton btnAgregar1 = new JButton("Agregar Teclado ($50)");
        JButton btnAgregar2 = new JButton("Agregar Monitor ($150)");

        btnAgregar1.addActionListener(e -> agregarProducto(p1, 1));
        btnAgregar2.addActionListener(e -> agregarProducto(p2, 1));

        panelProductos.add(btnAgregar1);
        panelProductos.add(btnAgregar2);

        add(panelProductos, BorderLayout.NORTH);

        // Lista de productos en el carrito
        JList<String> lista = new JList<>(modeloLista);
        JScrollPane scroll = new JScrollPane(lista);
        add(scroll, BorderLayout.CENTER);

        // Panel inferior con total
        JPanel panelInferior = new JPanel(new BorderLayout());
        lblTotal = new JLabel("Total: $0.0");
        panelInferior.add(lblTotal, BorderLayout.WEST);

        JButton btnResumen = new JButton("Ver Resumen");
        btnResumen.addActionListener(e -> mostrarResumen());
        panelInferior.add(btnResumen, BorderLayout.EAST);

        add(panelInferior, BorderLayout.SOUTH);
    }

    private void agregarProducto(Producto producto, int cantidad) {
        carrito.agregarProducto(producto, cantidad);
        modeloLista.addElement(cantidad + " x " + producto.getNombre());
        lblTotal.setText("Total: $" + carrito.getTotal());
    }

    private void mostrarResumen() {
        JOptionPane.showMessageDialog(this, "Total del carrito: $" + carrito.getTotal());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CarritoDeCompras ventana = new CarritoDeCompras();
            ventana.setVisible(true);
        });
    }
}
