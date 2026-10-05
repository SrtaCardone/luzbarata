package com.luzbarata.luzbarata.controller;

import com.luzbarata.luzbarata.client.EsiosClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EsiosController {

    private final EsiosClient esiosClient;

    public EsiosController(EsiosClient esiosClient) {
        this.esiosClient = esiosClient;
    }

    @GetMapping("/esios/prueba")
    @ResponseBody
    public String probarEsios() {
        return esiosClient.obtenerIndicador();
    }
}