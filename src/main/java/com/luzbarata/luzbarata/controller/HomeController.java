package com.luzbarata.luzbarata.controller;

import com.luzbarata.luzbarata.dto.SubscriberRequest;
import com.luzbarata.luzbarata.service.SubscriberService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    private final SubscriberService subscriberService;

    public HomeController(SubscriberService subscriberService) {
        this.subscriberService = subscriberService;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("subscriberRequest", new SubscriberRequest());
        return "index";
    }

    @PostMapping("/suscribirse")
    public String suscribirse(
            @Valid @ModelAttribute("subscriberRequest") SubscriberRequest subscriberRequest,
            BindingResult bindingResult,
            Model model) {

        if (bindingResult.hasErrors()) {
            return "index";
        }

        boolean suscripcionRealizada =
                subscriberService.subscribe(subscriberRequest.getEmail());

        String emailNormalizado =
                subscriberRequest.getEmail().trim().toLowerCase();

        model.addAttribute("email", emailNormalizado);

        if (suscripcionRealizada) {
            model.addAttribute(
                    "mensaje",
                    "Suscripción realizada correctamente."
            );
        } else {
            model.addAttribute(
                    "mensaje",
                    "Este email ya estaba suscrito."
            );
        }

        return "confirmacion";
    }
}