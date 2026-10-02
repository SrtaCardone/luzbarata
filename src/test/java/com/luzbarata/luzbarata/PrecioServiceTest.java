
package com.luzbarata.luzbarata;

import com.luzbarata.luzbarata.model.PrecioHora;
import com.luzbarata.luzbarata.service.PrecioService;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PrecioServiceTest {

    @Test
    void encontrarHoraMasBarataDevuelveElPrecioMinimo() {

        PrecioService servicio = new PrecioService();

        List<PrecioHora> precios = List.of(
            new PrecioHora(10, new BigDecimal("0.15")),
            new PrecioHora(11, new BigDecimal("0.09")),
            new PrecioHora(12, new BigDecimal("0.12"))
        );

        PrecioHora resultado = servicio.encontrarHoraMasBarata(precios);

        assertEquals(11, resultado.getHora());
        assertEquals(0, resultado.getPrecio().compareTo(new BigDecimal("0.09")));
    }
    @Test
void encontrarHoraMasCaraDevuelveElPrecioMaximo() {

    PrecioService servicio = new PrecioService();

    List<PrecioHora> precios = List.of(
        new PrecioHora(14, new BigDecimal("0.18")),
        new PrecioHora(15, new BigDecimal("0.25")),
        new PrecioHora(16, new BigDecimal("0.21"))
    );

    PrecioHora resultado = servicio.encontrarHoraMasCara(precios);

    assertEquals(15, resultado.getHora());
    assertEquals(0, resultado.getPrecio().compareTo(new BigDecimal("0.25")));
}
@Test
void encontrarHoraMasBarataLanzaExcepcionSiLaListaEstaVacia() {

    PrecioService servicio = new PrecioService();

    List<PrecioHora> precios = List.of();

    assertThrows(
        IllegalArgumentException.class,
        () -> servicio.encontrarHoraMasBarata(precios)
    );
}
@Test
void encontrarHoraMasCaraLanzaExcepcionSiLaListaEstaVacia() {

    PrecioService servicio = new PrecioService();

    List<PrecioHora> precios = List.of();

    assertThrows(
        IllegalArgumentException.class,
        () -> servicio.encontrarHoraMasCara(precios)
    );
}
}
