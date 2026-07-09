package com.luzbarata.luzbarata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/suscribirse")
    public String suscribirse(@RequestParam String email, Model model) {

        model.addAttribute("email", email);

        return "confirmacion";
    }
}