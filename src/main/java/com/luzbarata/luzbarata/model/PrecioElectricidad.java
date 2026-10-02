package com.luzbarata.luzbarata.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PrecioElectricidad {

    private LocalDateTime fechaHora;
    private BigDecimal precio;

    public PrecioElectricidad(LocalDateTime fechaHora, BigDecimal precio) {
        this.fechaHora = fechaHora;
        this.precio = precio;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public BigDecimal getPrecio() {
        return precio;
    }
}