package com.luzbarata.luzbarata.service;

import com.luzbarata.luzbarata.entity.Subscriber;
import com.luzbarata.luzbarata.repository.SubscriberRepository;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class SubscriberService {

    private final SubscriberRepository subscriberRepository;

    public SubscriberService(SubscriberRepository subscriberRepository) {
        this.subscriberRepository = subscriberRepository;
    }

    public boolean subscribe(String email) {
        String normalizedEmail = email.trim().toLowerCase(Locale.ROOT);

        if (subscriberRepository.existsByEmail(normalizedEmail)) {
            return false;
        }

        Subscriber subscriber = new Subscriber(normalizedEmail);
        subscriberRepository.save(subscriber);

        return true;
    }
}