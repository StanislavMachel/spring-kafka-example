package dev.stanislavmachel.spring.kafka.example;

import java.time.LocalDateTime;

public record Message(String message, LocalDateTime createdAt) {
}
