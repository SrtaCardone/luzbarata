
package com.luzbarata.luzbarata.service;

import com.luzbarata.luzbarata.model.PrecioHora;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrecioService {

    public PrecioHora encontrarHoraMasBarata(List<PrecioHora> precios) {

        if (precios == null || precios.isEmpty()) {
            throw new IllegalArgumentException("La lista de precios no puede estar vacía");
        }

        PrecioHora masBarata = precios.get(0);

        for (PrecioHora precio : precios) {
            if (precio.getPrecio().compareTo(masBarata.getPrecio()) < 0) {
                masBarata = precio;
            }
        }

        return masBarata;
    }
    public PrecioHora encontrarHoraMasCara(List<PrecioHora> precios) {

    if (precios == null || precios.isEmpty()) {
        throw new IllegalArgumentException("La lista de precios no puede estar vacía");
    }

    PrecioHora masCara = precios.get(0);

    for (PrecioHora precio : precios) {
        if (precio.getPrecio().compareTo(masCara.getPrecio()) > 0) {
            masCara = precio;
        }
    }

    return masCara;
}
}
