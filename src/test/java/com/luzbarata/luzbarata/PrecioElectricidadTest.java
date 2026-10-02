package com.luzbarata.luzbarata;

import com.luzbarata.luzbarata.model.PrecioElectricidad;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrecioElectricidadTest {

    @Test
    void creaPrecioElectricidadConFechaYPrecio() {

        LocalDateTime fechaHora = LocalDateTime.of(2026, 10, 2, 15, 0);
        BigDecimal precio = new BigDecimal("0.12");

        PrecioElectricidad precioElectricidad =
                new PrecioElectricidad(fechaHora, precio);

        assertEquals(fechaHora, precioElectricidad.getFechaHora());
        assertEquals(precio, precioElectricidad.getPrecio());
    }
}