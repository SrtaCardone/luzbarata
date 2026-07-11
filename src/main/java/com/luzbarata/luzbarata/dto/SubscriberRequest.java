package com.luzbarata.luzbarata.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class SubscriberRequest {

    @NotBlank(message = "El email es obligatorio.")
    @Email(message = "Introduce un email válido.")
    @Size(max = 255, message = "El email no puede superar los 255 caracteres.")
    private String email;

    public SubscriberRequest() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}