
package com.luzbarata.luzbarata.service;

import com.luzbarata.luzbarata.model.PrecioElectricidad;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrecioService {

    public PrecioElectricidad encontrarHoraMasBarata(List<PrecioElectricidad> precios) {

        if (precios == null || precios.isEmpty()) {
            throw new IllegalArgumentException("La lista de precios no puede estar vacía");
        }

        PrecioElectricidad masBarata = precios.get(0);

        for (PrecioElectricidad precio : precios) {
            if (precio.getPrecio().compareTo(masBarata.getPrecio()) < 0) {
                masBarata = precio;
            }
        }

        return masBarata;
    }
    public PrecioElectricidad encontrarHoraMasCara(List<PrecioElectricidad> precios) {

    if (precios == null || precios.isEmpty()) {
        throw new IllegalArgumentException("La lista de precios no puede estar vacía");
    }

    PrecioElectricidad masCara = precios.get(0);

    for (PrecioElectricidad precio : precios) {
        if (precio.getPrecio().compareTo(masCara.getPrecio()) > 0) {
            masCara = precio;
        }
    }

    return masCara;
}
}
