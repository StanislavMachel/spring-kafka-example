package dev.stanislavmachel.spring.kafka.example.config;

import dev.stanislavmachel.spring.kafka.example.Message;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    private static final Logger logger = LogManager.getLogger(KafkaListeners.class);

    @KafkaListener(topics = "test", groupId = "test-1-kafka-listener",
            containerFactory = "concurrentMessageListenerContainerKafkaListenerContainerFactory")
    void listener(Message message) {
        logger.info("Listener received: {}", message);
    }

}
