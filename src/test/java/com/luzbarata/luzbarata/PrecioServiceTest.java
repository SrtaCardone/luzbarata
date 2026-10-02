
package com.luzbarata.luzbarata;

import com.luzbarata.luzbarata.model.PrecioElectricidad;
import com.luzbarata.luzbarata.service.PrecioService;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PrecioServiceTest {

    @Test
    void encontrarHoraMasBarataDevuelveElPrecioMinimo() {

        PrecioService servicio = new PrecioService();

        List<PrecioElectricidad> precios = List.of(
                new PrecioElectricidad(
                        LocalDateTime.of(2026, 10, 2, 10, 0),
                        new BigDecimal("0.15")
                ),
                new PrecioElectricidad(
                        LocalDateTime.of(2026, 10, 2, 11, 0),
                        new BigDecimal("0.09")
                ),
                new PrecioElectricidad(
                        LocalDateTime.of(2026, 10, 2, 12, 0),
                        new BigDecimal("0.12")
                )
        );

        PrecioElectricidad resultado =
                servicio.encontrarHoraMasBarata(precios);

        assertEquals(
                LocalDateTime.of(2026, 10, 2, 11, 0),
                resultado.getFechaHora()
        );

        assertEquals(
                0,
                resultado.getPrecio().compareTo(new BigDecimal("0.09"))
        );
    }

    @Test
    void encontrarHoraMasCaraDevuelveElPrecioMaximo() {

        PrecioService servicio = new PrecioService();

        List<PrecioElectricidad> precios = List.of(
                new PrecioElectricidad(
                        LocalDateTime.of(2026, 10, 2, 14, 0),
                        new BigDecimal("0.18")
                ),
                new PrecioElectricidad(
                        LocalDateTime.of(2026, 10, 2, 15, 0),
                        new BigDecimal("0.25")
                ),
                new PrecioElectricidad(
                        LocalDateTime.of(2026, 10, 2, 16, 0),
                        new BigDecimal("0.21")
                )
        );

        PrecioElectricidad resultado =
                servicio.encontrarHoraMasCara(precios);

        assertEquals(
                LocalDateTime.of(2026, 10, 2, 15, 0),
                resultado.getFechaHora()
        );

        assertEquals(
                0,
                resultado.getPrecio().compareTo(new BigDecimal("0.25"))
        );
    }

    @Test
    void encontrarHoraMasBarataLanzaExcepcionSiLaListaEstaVacia() {

        PrecioService servicio = new PrecioService();

        List<PrecioElectricidad> precios = List.of();

        assertThrows(
                IllegalArgumentException.class,
                () -> servicio.encontrarHoraMasBarata(precios)
        );
    }

    @Test
    void encontrarHoraMasCaraLanzaExcepcionSiLaListaEstaVacia() {

        PrecioService servicio = new PrecioService();

        List<PrecioElectricidad> precios = List.of();

        assertThrows(
                IllegalArgumentException.class,
                () -> servicio.encontrarHoraMasCara(precios)
        );
    }
}