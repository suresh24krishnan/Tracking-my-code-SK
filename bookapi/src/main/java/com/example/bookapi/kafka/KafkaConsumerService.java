package com.example.bookapi.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "book-events", groupId = "book-group")
    public void listen(String message) {
        System.out.println("[Kafka Consumer] Received: " + message);
    }
}

