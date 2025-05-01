/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Date;

/**
 *
 * @author Denisse Joya
 */

public class CodigoDescuento {
    private String codigo;
    private float descuento;
    private float porcentaje;
    private Date fechaExpiracion;
    private boolean esValido;

    public CodigoDescuento(String codigo, float descuento, float porcentaje, Date fechaExpiracion) {
        this.codigo = codigo;
        this.descuento = descuento;
        this.porcentaje = porcentaje;
        this.fechaExpiracion = fechaExpiracion;
        this.esValido = new Date().before(fechaExpiracion);
    }

    public boolean esValido() {
        return esValido;
    }

    public float aplicarDescuento(float total) {
        if (!esValido) return total;
        float descuentoTotal = descuento + (total * porcentaje);
        return total - descuentoTotal;
    }
}

