package com.luzbarata.luzbarata.repository;

import com.luzbarata.luzbarata.entity.Subscriber;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriberRepository extends JpaRepository<Subscriber, Long> {

    boolean existsByEmail(String email);
    Optional<Subscriber> findByEmail(String email);
}