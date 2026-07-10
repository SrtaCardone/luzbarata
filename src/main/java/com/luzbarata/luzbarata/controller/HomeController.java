package com.luzbarata.luzbarata.controller;
import com.luzbarata.luzbarata.entity.Subscriber;
import com.luzbarata.luzbarata.repository.SubscriberRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    private final SubscriberRepository subscriberRepository;

public HomeController(SubscriberRepository subscriberRepository) {
    this.subscriberRepository = subscriberRepository;
}

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/suscribirse")
    public String suscribirse(@RequestParam String email, Model model) {
        Subscriber subscriber = new Subscriber(email);
        subscriberRepository.save(subscriber);
        model.addAttribute("email", email);

        return "confirmacion";
    }
}