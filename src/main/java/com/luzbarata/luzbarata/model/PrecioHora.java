
package com.luzbarata.luzbarata.model;

import java.math.BigDecimal;

public class PrecioHora {

    private int hora;
    private BigDecimal precio;

    public PrecioHora(int hora, BigDecimal precio) {
        this.hora = hora;
        this.precio = precio;
    }

    public int getHora() {
        return hora;
    }

    public BigDecimal getPrecio() {
        return precio;
    }
}
